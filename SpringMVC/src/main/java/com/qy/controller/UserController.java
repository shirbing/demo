package com.qy.controller;

import com.alibaba.fastjson.JSON;
import com.qy.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
@Controller
public class UserController {
    @RequestMapping("/findUserById")
    public ModelAndView findUserById(HttpServletRequest request){
        System.out.println(request.getParameter("id"));
//         指定跳转页面 user.jsp
        ModelAndView mv=new ModelAndView("user");
//        指定传递的数据
        mv.addObject("id",request.getParameter("id"));
        return mv;
    }
    @RequestMapping("/findUserBySearch")
    public ModelAndView findUserBySearch(int id,String username,int age){
        System.out.println(id+" "+username+" "+age);
        return  new ModelAndView("user");
    }
    @RequestMapping("/findUserBySearchs")
    public ModelAndView findUserBySearchs(User user){
       ModelAndView mv=new ModelAndView("user");
        mv.addObject("user",user);
        return mv;
    }
/*
    当前端传递的参数名和方法名参数不一致时，通过@RequestParam指定转换关系
    id1 ：前端传递的参数
    id：方法参数
    @RequestParam("id1") int id
*
* */
    @RequestMapping("/findUserBySearch1")
    public ModelAndView findUserBySearch1(@RequestParam("id1") int id, String username, int age){
        System.out.println(id+" "+username+" "+age);
        return  new ModelAndView("user");
    }
    /*
    地址栏传参
    */
    @RequestMapping("/delete/{d}")
    public ModelAndView delete(@PathVariable("d") int id){
        System.out.println(id);
        return null;
    }
    /*
    * 通过springmvc向视图层传递参数
    * 第二种方式：使用model对象
    *
    * */
    @RequestMapping("/findUser")
    public String findUser(Model model){
        User u=new User(12,"小鸣",20);
        //指定返回的数据
        model.addAttribute("user",u);
       return "user";
    }
    /*第三种：HttpServletRequest
    *
    * 默认情况下通过 转发 跳转到指定页面
    *
    * 转发：forward
    *
    * 重定向：redirect
    *
    * */
    @RequestMapping("/findUser1")
    public String findUser1(HttpServletRequest request){
        User u=new User(12,"小鸣",20);
        //指定返回的数据
        request.setAttribute("user",u);
       // return "user";
       // return "forward:/user.jsp";
       // return "redirect:/user.jsp";
        return "forward:/findUserById";
       // return "redirect:/findUserById";
    }
/*检测用户名*/
    @RequestMapping("/checkUsername")
    @ResponseBody
    public String checkUsername(String username){
        boolean flag=false;
        if (username.equals("小鸣")){
            flag=true;
        }
        return JSON.toJSONString(flag);
    }
    //登录
    @RequestMapping("/tologin")
    public String toLogin(String name,String password,Model model){
        //是否为空
        if(name.equals("小鸣") && password.equals("123")){
            return "forward:/index.html";
        }
        model.addAttribute("message","用户名或者密码错误");

        return "redirect:/login.html";
    }

}