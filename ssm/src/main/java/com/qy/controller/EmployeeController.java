package com.qy.controller;

import com.alibaba.fastjson.JSON;
import com.qy.domain.Employee;
import com.qy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Qualifier("employeeService")
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/list")
    @ResponseBody
    public String findEmpList() {
        List list = employeeService.findEmpList();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/list1")
    @ResponseBody
    public String findEmpList1() {
        List list = employeeService.findEmpList1();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/ser")
    @ResponseBody
    public String searchEmpList(String sex,int startIndex,int endIndex) {
        Employee employee=new Employee();
        employee.setSex(sex);
        List list = employeeService.searchEmployee(employee,startIndex,endIndex);
        return JSON.toJSONString(list);
    }

}
