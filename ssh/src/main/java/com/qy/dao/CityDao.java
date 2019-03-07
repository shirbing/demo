package com.qy.dao;

import com.qy.domain.CityEntity;
import com.qy.domain.ProvinceEntity;

import java.util.List;

public interface CityDao {
    public List<CityEntity> find();
    public ProvinceEntity list();
    public CityEntity findOne(int id);
    public List<CityEntity> find(int page,int pageSize );
    public void saveCity(CityEntity cityEntity);
    public void deleteCity(CityEntity cityEntity);
    public void updateCity(CityEntity cityEntity);

}
