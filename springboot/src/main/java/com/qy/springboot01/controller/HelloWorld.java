package com.qy.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    public String heelo(HttpServletRequest request, HttpSession session){
        request.setAttribute("id","10001");
        session.setAttribute("username","小鸣");
        return "index";
    }
}
