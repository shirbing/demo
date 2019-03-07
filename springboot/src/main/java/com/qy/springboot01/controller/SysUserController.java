package com.qy.springboot01.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SysUserController {
    @RequestMapping("/userList")
    public String userInfo(){
        return "userInfo";
    }

    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:delete")//权限管理
    public  String userDel(){
        return "userDel";
    }

}
