package com.qy.service.impl;

import com.qy.domain.Employee;
import com.qy.mapper.EmployeeMapper;
import com.qy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Qualifier("employeeMapper")
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void insertEmployee(Employee employee) {

    }

    @Override
    public List<Employee> searchEmployee(Employee employee, int startIndex, int endIndex) {
        return employeeMapper.searchEmployee(employee,startIndex,endIndex);
    }

    @Override
    public List<HashMap<String, Object>> findEmpList() {
        return employeeMapper.findEmpList();
    }

    @Override
    public List<Employee> findEmpList1() {
        return employeeMapper.findEmpList1();
    }
}
