package com.qy.springboot01.util;

import com.qy.springboot01.domain.SysUser;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class SignUpHelper {
    //生成随机数
    private RandomNumberGenerator randomNumberGenerator=new SecureRandomNumberGenerator();
    private String algorithmName="md5";
    private final int hashIterations=2;
    /*
    * 注册的时候，随机产生一个salt，将密码进行加密处理。
    * toHex将变量改为其他进制
    * */
    public void encryptPassword(SysUser user){
        //User对象包含最基本的字段username和password
        String salt=randomNumberGenerator.nextBytes().toHex();
        user.setSalt(salt);
        //将用户的注册密码经过散列算法替换成一个不可逆的新密码保存进数据，散列过程使用salt
        String newPassword=new SimpleHash(algorithmName,user.getPassword(),
                ByteSource.Util.bytes(user.getSalt()),hashIterations).toHex();
        user.setPassword(newPassword);
        System.out.println(salt+"-------"+user.getPassword()+"=============="+user.getUsername());
        System.out.println();

    }

    public static void main(String[] args){
        SysUser sysUser=new SysUser();
        sysUser.setUsername("zhangsan");
        sysUser.setPassword("123456");
        new SignUpHelper().encryptPassword(sysUser);
    }
}
