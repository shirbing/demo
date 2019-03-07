package com.qy;

import com.qy.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/11/22 0022.
 */
public class Test {
    @org.junit.Test
    public void test(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("/applicationContext.xml");

        UserService userService = beanFactory.getBean("userService",UserService.class);

        userService.find();
    }
}
