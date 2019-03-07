package com.qy.springboot01.service.impl;

import com.qy.springboot01.domain.SysPermission;
import com.qy.springboot01.domain.SysUser;
import com.qy.springboot01.mapper.SysUserMapper;
import com.qy.springboot01.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/12/24 0024.
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUser(String usercode) {
        return sysUserMapper.findUser(usercode);
    }

    @Override
    public List<SysPermission> findPermission(String usercode) {
        return sysUserMapper.findPermission(usercode);
    }
}
