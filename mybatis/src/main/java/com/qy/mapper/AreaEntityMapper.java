package com.qy.mapper;

import com.qy.domain.AreaEntity;

import java.util.List;

public interface AreaEntityMapper {
    //查询一个地区
    public AreaEntity selectAreaEntity(int id);
    //查询所有地区
    public List<AreaEntity> selectAll();
    //新增一个地区
    public void insertAreaEntity(AreaEntity areaEntity);
    //更新一个地区
    public void updateAreaEntity(AreaEntity areaEntity);
    //删除一个地区
    public void deleteAreaEntity(int id);
}
