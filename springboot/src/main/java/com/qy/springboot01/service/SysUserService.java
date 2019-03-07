package com.qy.springboot01.service;

import com.qy.springboot01.domain.SysPermission;
import com.qy.springboot01.domain.SysUser;

import java.util.List;

public interface SysUserService {
    //通过用户Code查找用户对象
    public SysUser findUser(String usercode);
    //通过用户code查找权限列表
    public List<SysPermission> findPermission(String usercode);
}
