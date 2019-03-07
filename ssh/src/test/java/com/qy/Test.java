package com.qy;

import com.qy.domain.CityEntity;
import com.qy.service.CityService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void find(){
        CityService cityService=new ClassPathXmlApplicationContext("/applicationContext.xml").getBean(CityService.class);
        List<CityEntity> list= cityService.find();
        System.out.println("--------以上是查询----------");


    }
    @org.junit.Test
    public void addCity(){
        CityService cityService=new ClassPathXmlApplicationContext("/applicationContext.xml").getBean(CityService.class);
        CityEntity cityEntity=new CityEntity();
        cityEntity.setCode("901000");
        cityEntity.setName("窝窝市");
//        cityEntity.setProvincecode("900000");
        cityService.saveCity(cityEntity);
        System.out.println("------添加----------");
    }

}
