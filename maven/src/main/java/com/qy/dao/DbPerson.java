package com.qy.dao;

import com.qy.domain.Person;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.qy.util.BaseImp;

public class DbPerson extends BaseImp {
    //列取所有的用户
    //列取所有信息
    public List<Person> getList(int page){
        List<Person> list=new ArrayList<Person>();
        try {
            //创建预编译语句
            getPPS("select * from person limit ?,?");
            //给占位符设置值
            st.setInt(1, (page-1)*5);
            st.setInt(2, 5);
            //执行语句
            set=st.executeQuery();
            //遍历所有的值存在List中
            while(set.next()){
                //创建对象
                Person per=new Person();
                //给对象赋值
                per.setId(String.valueOf(set.getInt("id")));
                per.setName(set.getString("name"));
                per.setAge(String.valueOf(set.getInt("age")));
                per.setSex(set.getString("sex"));
                per.setDepart(set.getString("depart"));
                per.setPhone(set.getString("phone"));
                per.setEmail(set.getString("email"));
                per.setIcon(set.getString("icon"));
                per.setDescribe(set.getString("describes"));
                per.setSort(String.valueOf(set.getInt("sort")));
                list.add(per);
            }
            return list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            close();
        }
        return list;
    }
}
