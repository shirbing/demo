package com.qy;

import com.qy.domain.AreaEntity;
import com.qy.domain.CityEntity;
import com.qy.mapper.AreaEntityMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    @Test
    public void selectOne() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            CityEntity cityEntity = (CityEntity) session.selectOne("mapper.CityEntityMapper.selectCityEntity", 1);
            System.out.println(cityEntity.getName());
        } finally {
            session.close();
        }
    }
    @Test
    public void selectAreaEntity() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

           /*
           Question question = (Question) session.selectOne("mapper.QuestionMapper.selectQuestion", 1);
            */

            AreaEntityMapper mapper = session.getMapper(AreaEntityMapper.class);
            AreaEntity areaEntity = mapper.selectAreaEntity(1);
            System.out.println(areaEntity.getName());

            session.close();

    }
    @Test
    public void selectAreaEntityAll() throws IOException {
        String resource ="mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();
        AreaEntityMapper mapper=session.getMapper(AreaEntityMapper.class);
        List<AreaEntity> areaEntityList=mapper.selectAll();
        session.close();
    }
    @Test
    public void testSave() throws IOException {
        String resource="mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();

        AreaEntityMapper mapper=session.getMapper(AreaEntityMapper.class);
        AreaEntity areaEntity=new AreaEntity();
        areaEntity.setId(8888);
        areaEntity.setCitycode("90000");
        areaEntity.setCode("90001");
        areaEntity.setName("青云");
        mapper.insertAreaEntity(areaEntity);
        session.commit();

        session.close();
    }

    //更新
    @Test
    public void testUpdate() throws IOException {
        String resource="mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();

        AreaEntityMapper mapper=session.getMapper(AreaEntityMapper.class);

        AreaEntity areaEntity=mapper.selectAreaEntity(8888);
        areaEntity.setName("小青云");
        mapper.updateAreaEntity(areaEntity);
        session.commit();
        session.close();
    }

    @Test
    public void testDelete() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        AreaEntityMapper mapper=session.getMapper(AreaEntityMapper.class);
        mapper.deleteAreaEntity(8888);
        session.commit();
        session.close();

    }


}
