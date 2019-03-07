package com.qy.springboot01.shiro;

import com.qy.springboot01.domain.SysPermission;
import com.qy.springboot01.domain.SysUser;
import com.qy.springboot01.service.SysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    private SysUserService sysUserService;

    //给当前realm起个名
    @Override
    public String getName() {
        return "customReam02";
    }
    //支持UsernamePasswordToken
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户主身份--用户名
        String username=(String)principalCollection.getPrimaryPrincipal();
        //通过用户名查找用户对应的权限列表
        List<SysPermission> permissionsList=sysUserService.findPermission(username);
        //创建一个授权对象
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        for(SysPermission sysPermission:permissionsList){
            authorizationInfo.addStringPermission(sysPermission.getPercode());
        }
        return authorizationInfo;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取身份
        String username=(String )authenticationToken.getPrincipal();
        //通过用户名，查找对应的用户是否存在，如果存在返回用户对象
        SysUser sysUser=sysUserService.findUser(username);
        if(sysUser==null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(
                sysUser.getUsercode(),//用户名
                sysUser.getPassword(),//密码
                ByteSource.Util.bytes(sysUser.getSalt()),//salt
                getName() //realm name
        );
        return authenticationInfo;
    }
}
