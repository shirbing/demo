package com.qy;

import com.qy.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

public class Testjoin {
    @Test
    public void test(){
        Session session=HibernateUtil.openSession();
        //统计各个省对应的市总数
        /*
        * group 统计函数
        * select 后面跟的列  只能是group by 分组的列  + 统计函数
        *
        * */
//        List<Object[]> list=session.createQuery("select c.province.name,count(c.id) from City c group by c.province.name").list();
//        for (Object[] ob:list) {
//            System.out.println(ob[0]+"   "+ob[1]);
//        }

        //查询市  名称  ，对应的省名称
        List<Object[]> list1=session.createQuery("select c.name,p.name from City c join c.province as p").list();
        for (Object[] ob:list1) {
            System.out.println(ob[0]+"   "+ob[1]);
        }

        System.out.println("--------------------------------------------");
        List<Object[]> list2=session.createQuery("select c.name,p.name from City c inner join c.province as p").list();
        for (Object[] ob:list2) {
            System.out.println(ob[0]+"   "+ob[1]);
        }



















        HibernateUtil.close(session);

    }
}
