package com.qy.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qy.dao.DbPerson;
import com.qy.domain.Person;

import java.util.List;

@Controller
//@RequestMapping("/person")
public class PersonController {
    @RequestMapping("/listPerson")
    @ResponseBody
    public String listPerson(){
        int page=1;
        System.out.println("+++++++++++++++++");
        DbPerson dbper=new DbPerson();
        List<Person> list=dbper.getList(page);
        //通过json返回数据给前端
        return JSON.toJSONString(list);
    }
}
