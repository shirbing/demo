package com.qy;

import com.qy.domain.City;
import com.qy.domain.Province;
import com.qy.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestOneToMany {
    /*一对多的级联查询*/
    @Test
    public void list(){
        Session session=HibernateUtil.openSession();
        List<Province> provinceslist=session.createQuery("from Province").list();
        HibernateUtil.close(session);
    }
    /*级联新增*/
    @Test
    public void save(){
        Session session=HibernateUtil.openSession();
        session.beginTransaction();

        Province p=new Province();
        p.setName("东胜神洲");
        p.setCode("900000");

        City city1=new City();
        city1.setName("傲来国");
        city1.setCode("900100");

        City city2=new City();
        city2.setName("女儿国");
        city2.setCode("900200");

        p.getCities().add(city1);
        p.getCities().add(city2);

        session.save(p);
        session.getTransaction().commit();
        HibernateUtil.close(session);
    }

    /*
    级联更新 cascade=save-update
     */
    @org.junit.Test
    public void update(){
        Session session = HibernateUtil.openSession();
        session.beginTransaction();
        Province pro=session.get(Province.class,41);
        pro.setName("东胜神洲");
        Set set=pro.getCities();
        Iterator it=set.iterator();
        int i=1;
        while (it.hasNext()){
            City city=(City)it.next();
            city.setName("傲来国"+i++);
        }

        session.update(pro);
        session.getTransaction().commit();
        HibernateUtil.close(session);
    }
    /*级联删除*/
    @Test
    public void delete(){
        Session session=HibernateUtil.openSession();
        session.beginTransaction();

        Province p = session.get(Province.class,41);
        session.delete(p);

        session.getTransaction().commit();
        HibernateUtil.close(session);

    }






}
