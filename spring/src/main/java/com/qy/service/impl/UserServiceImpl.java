package com.qy.service.impl;

import com.qy.dao.UserDao;
import com.qy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/11/22 0022.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
     /*
    @Resource
    默认情况下通过属性名称查找 id = userDao  的bean
    如果通过名称找到，直接返回对应的bean
    如果通过名称没找到，然后通过类型查找 UserDao  UserDaoImpl
    @Resource(name = "userDao0") 只能通过名称查找，如果找不到报错
     */
/*    @Resource(name = "userDao0")
    private UserDao userDao;
    */

    /*
     @Autowired
     自动装配
     先找class，如果一个接口只有一个实现类，直接找到对应的实现类，
     如果一个接口有多个实现类  ，再通过名称查找

    @Autowired
    @Qualifier(value = "userDao0")
    只能通过名称查找  byName
     */
    @Autowired
    @Qualifier(value = "userDao")
    private UserDao userDao;
    @Override
    public void find() {
        userDao.find();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
