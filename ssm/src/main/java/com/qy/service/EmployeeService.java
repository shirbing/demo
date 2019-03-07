package com.qy.service;

import com.qy.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface EmployeeService {
    //新增一个员工
    public void insertEmployee(Employee employee);
    //高级查询加分页
    public List<Employee> searchEmployee(@Param("employee") Employee employee, @Param("startIndex") int startIndex, @Param("endIndex") int endIndex);
    //多表联查
    public List<HashMap<String,Object>> findEmpList();
    //多表联查2
    public List<Employee> findEmpList1();
}
