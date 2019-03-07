package com.example.demo.controller;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/1/8 0008.
 */
@RestController
public class UserController  {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/{id}")
    public User findAll(@PathVariable("id") long id){
        User user = userRepository.findOne(id);
        return user;
    }
}
