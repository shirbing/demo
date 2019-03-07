package com.qy.springboot01.mapper;

import com.qy.springboot01.domain.SysPermission;
import com.qy.springboot01.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2018/12/24 0024.
 */
@Mapper
@Component
public interface SysUserMapper {
    //通过用户code查找用户对象
    public SysUser findUser(String usercode);
    //通过用户code查找权限列表
    public List<SysPermission> findPermission(String usercode);
}
