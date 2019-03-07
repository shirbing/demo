package com.qy;

import com.qy.domain.City;
import com.qy.domain.Province;
import com.qy.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class Test {
    /*
    * 多对一关联查询
    * */
    @org.junit.Test
  public void list(){
        Session session=HibernateUtil.openSession();
        List<City> list=session.createQuery("from City").list();

        HibernateUtil.close(session);
    }

    /*
     级联新增  cascade=save-update
    * */
    @org.junit.Test
    public void save(){
        Session session=HibernateUtil.openSession();
        session.beginTransaction();
        //台北直辖市
        Province province=new Province();
        province.setName("台北市");
        province.setCode("90000");

        //台北市
        City city=new City();
        city.setName("台北市");
        city.setCode("900100");
        city.setProvince(province);

        session.save(city);


        session.getTransaction().commit();
        HibernateUtil.close(session);
    }

    /*级联更新  cascade=save-update*/
    @org.junit.Test
    public void update(){
        Session session=HibernateUtil.openSession();
        session.beginTransaction();
        //台北直辖市
        City city=session.get(City.class,343);
        Province p=city.getProvince();
        p.setName("台台省");
        city.setName("台台直辖市");
        session.save(city);
        session.getTransaction().commit();
        HibernateUtil.close(session);
    }
    /*
    * 级联删除  cascade="delete"
    * */
    @org.junit.Test
    public void delete(){
        Session session=HibernateUtil.openSession();
        session.beginTransaction();
        City city=session.get(City.class,343);
        session.delete(city);
        session.getTransaction().commit();
        HibernateUtil.close(session);


    }




}
