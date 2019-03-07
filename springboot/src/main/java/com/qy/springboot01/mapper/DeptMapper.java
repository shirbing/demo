package com.qy.springboot01.mapper;


import com.qy.springboot01.domain.Dept;

import java.util.List;

public interface DeptMapper {
    public List<Dept> findDeptList();
    public List<Dept> findDeptList1();

}
