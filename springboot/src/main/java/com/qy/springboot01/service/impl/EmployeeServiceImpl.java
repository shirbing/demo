package com.qy.springboot01.service.impl;

import com.qy.springboot01.domain.Employee;
import com.qy.springboot01.mapper.EmployeeMapper;
import com.qy.springboot01.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;

@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    //新增一个员工
    @CacheEvict(value ="emplist",allEntries = true)
    @Override
    public void insertEmployee(Employee employee) {
        employeeMapper.insertEmployee(employee);
    }
    //条件查询员工
    @Override
    public List<Employee> searchEmployee(Employee employee, int startIndex, int endIndex) {

        return employeeMapper.searchEmployee(employee,startIndex,endIndex);
    }
    //查询所有员工
    @Override
    public List<HashMap<String, Object>> findEmpList() {
        return employeeMapper.findEmpList();
    }
    //查询所有员工
    @Override
    @Cacheable(value = "emplist")
    public List<Employee> findEmpList1() {
        System.out.println("===========================================");
        return employeeMapper.findEmpList1();
    }

    //更新员工
    @Override
    @CachePut(value ="emplist",key="T(String).valueOf(#empno)" )
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }
}
