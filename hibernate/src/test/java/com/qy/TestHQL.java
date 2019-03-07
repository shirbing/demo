package com.qy;

import com.qy.domain.City;
import com.qy.domain.Province;
import com.qy.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import java.text.CharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TestHQL {
    @Test
    public void hqlselect(){
        Session session=HibernateUtil.openSession();
        List<City> cities=session.createQuery("select id,name,code from City order by code desc,name asc").list();
        //条件查询 查询id>30的所有province
        List<Province> provinces=session.createQuery("select p from Province p where id > ?").setInteger(0,30).list();

        //条件查询多条件查询
        String hql="select p from Province p where id > ? and id < ? ";
        Query query=session.createQuery(hql);
        query.setParameter(0,20);
        query.setParameter(1,30);
        List<Province> p =query.list();

       /*  //条件查询批量赋值
        String hql1="select p from Province p where id > ? and id < ? and code=? ";
        Query query1=session.createQuery(hql);

       List list =new ArrayList();
        list .add(20);
        list .add(30);
        list.add("250000");*/

        //命名参数占位符
        String hql1="select p from Province p where id > :i1 and id < :i2 and code=:i3 ";
        List<Province> provinces1=session.createQuery(hql1).setParameter("i1",20).setParameter("i2",30).setParameter("i3","250000").list();

        //查询第10条至13条的数据
        List<Province> provinces2=session.createQuery("from Province ").setFirstResult(9).setMaxResults(4).list();






        HibernateUtil.close(session);


























    }
}
