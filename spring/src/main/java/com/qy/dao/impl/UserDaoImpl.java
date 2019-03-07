package com.qy.dao.impl;

import com.qy.dao.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/11/22 0022.
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init(){
        System.out.println("init----------");
    }

    @Override
    public void find() {
        System.out.println("----userDao find----------");
        //spring 中使用jdbc连接数据库，执行操作
       /* DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/news");
        ds.setUsername("root");
        ds.setPassword("hnqy");

        JdbcTemplate jt = new JdbcTemplate(ds);*/
        List list = jdbcTemplate.queryForList("select * from user");

        System.out.println(list.size());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy----------");
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
