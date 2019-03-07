package com.qy;

import com.qy.domain.Dept;
import com.qy.domain.Employee;
import com.qy.mapper.DeptMapper;
import com.qy.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class TestOracle {
    @Test
    public void testSaveEmp() throws IOException {
        String resource="mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();
        EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
        Employee employee=new Employee();
        employee.setBirthdate("1994-09-09");
        employee.setBonus(300.50);
        employee.setEdlevel(1);
        employee.setFirstname("吴");
        employee.setHiredate("2004-02-09");
        employee.setJob("销售");
        employee.setMidinit("L");
        employee.setLastname("狗");
        employee.setPhoneno("1234");
        employee.setSex("1");
        employee.setWorkdept(102);
        employee.setSalary(8000.00);
        mapper.insertEmployee(employee);
        session.commit();
        session.close();
    }

    @Test
    public void testSearchEmployee() throws IOException {
        String resource="mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();
        EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
        Employee employee=new Employee();
        employee.setSalary(1000.00);
        employee.setWorkdept(101);
        /*employee.setSex("1");*/
        List<Employee> employeeList=mapper.searchEmployee(employee,0,4);
        System.out.println();
    }
    @Test
    public void testFind() throws IOException {
        String resource="mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();
        EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
        List<HashMap<String,Object>> empList = mapper.findEmpList();
        List<Employee> list =mapper.findEmpList1();
        System.out.println();
    }

    @Test
    public void testFindDept() throws IOException {
        String resource="mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();
        DeptMapper mapper=session.getMapper(DeptMapper.class);
        /*List<Dept> list=mapper.findDeptList();*/
        List<Dept> list1=mapper.findDeptList1();
        System.out.println();
    }
}
