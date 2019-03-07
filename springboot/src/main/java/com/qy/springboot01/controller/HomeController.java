package com.qy.springboot01.controller;

import com.qy.springboot01.domain.SysPermission;
import com.qy.springboot01.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private SysUserService sysUserService;
   @RequestMapping({"/","/index"})
   public String index(HttpServletRequest request){
       //通过安全管理工具，获取用户对象
       Subject subject = SecurityUtils.getSubject();
       //获取用户身份-------用户名
       String username = (String)subject.getPrincipal();
       //获取当前对象所在的session
       Session session = subject.getSession();
       //获取权限列表
       List<SysPermission> permissionList = sysUserService.findPermission(username);
       //添加权限列表到session回话中
       session.setAttribute("menuList",permissionList);
       return "index";
   }

   @RequestMapping("/login")
    public String login(HttpServletRequest request, Map<String,Object> map){
       System.out.println("HomeController.login()");
       //登录失败从request中获取shiro处理的异常信息
       //shiroLoginFailure:就是shiro异常类的全类名
       String exception=(String)request.getAttribute("shiroLoginFailure");
       System.out.println("exception="+exception);
       String msg="";
       if(exception!=null){
           if (UnknownAccountException.class.getName().equals(exception)){
               System.out.println("UnknownAccountException--》账号不存在：");
               msg="UnknownAccountException--》账号不存在：";
           }else if (IncorrectCredentialsException.class.getName().equals(exception)){
               System.out.println("IncorrectCredentialsException -- > 密码不正确：");
               msg = "IncorrectCredentialsException -- > 密码不正确：";
           }else if ("kaptchaValidateFailed".equals(exception)){
               System.out.println("kaptchaValidateFailed--> 验证码错误");
               msg="kaptchaValidateFailed--> 验证码错误";
           }else{
               msg="else >> "+exception;
               System.out.println("else -- >"+exception);
           }
       }
       map.put("msg",msg);
       //此方法不处理登录成功，由shiro进行处理
        return "login";
   }
   @RequestMapping("/403")
    public String unauthorizedRole(){
       System.out.println("-------------没有权限----------------");
       return "403";
   }
}
