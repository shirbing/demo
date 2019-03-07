package com.qy.controller;

import com.alibaba.fastjson.JSON;
import com.qy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    public void setCityService(CityService cityService) {
        this.cityService = cityService;
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        return JSON.toJSONString(cityService.find());
    }
    @RequestMapping("/findOne")
    @ResponseBody
    public String findOne(int id){
        return JSON.toJSONString(cityService.findOne(id));
    }

    @RequestMapping("/findPage")
    @ResponseBody
    public String findPage(int page,int pageSize){
        return JSON.toJSONString(cityService.find(page,pageSize));
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        return JSON.toJSONString(cityService.list());
    }
}
