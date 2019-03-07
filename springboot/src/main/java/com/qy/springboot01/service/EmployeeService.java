package com.qy.springboot01.service;


import com.qy.springboot01.domain.Employee;
import org.apache.ibatis.annotations.Param;


import java.util.HashMap;
import java.util.List;

public interface EmployeeService {
    //新增一个员工
    public void insertEmployee(Employee employee);
    //高级查询加分页
    public List<Employee> searchEmployee(@org.apache.ibatis.annotations.Param("employee") Employee employee, @Param("startIndex") int startIndex, @Param("endIndex") int endIndex);
    //多表联查
    public List<HashMap<String,Object>> findEmpList();
    //多表联查2
    public List<Employee> findEmpList1();
    //更改一个员工信息
    public void updateEmployee(Employee employee);
}
