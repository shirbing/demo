package com.qy.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    static SessionFactory factory=null;
    static{
        //创建configuration对象
        Configuration cfg=new Configuration();
        //加载hibernate.cfg.xml
        cfg.configure("/hibernate.cfg.xml");
        //通过cfg创建会话工厂
        factory=cfg.buildSessionFactory();
    }

    public static Session openSession(){
        //从工厂中获取session连接
        Session session=factory.openSession();
        return session;

    }

    public static void close(Session session){
        if(session!=null){
            session.close();
        }
    }
}
