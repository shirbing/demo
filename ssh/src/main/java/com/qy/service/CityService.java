package com.qy.service;

import com.qy.domain.CityEntity;
import com.qy.domain.ProvinceEntity;

import java.util.List;

public interface CityService {
    public List<CityEntity> find();
    public CityEntity findOne(int id);
    public ProvinceEntity list();
    public List<CityEntity> find(int page,int pageSize );
    public void saveCity(CityEntity cityEntity);
    public void deleteCity(CityEntity cityEntity);
    public void updateCity(CityEntity cityEntity);
}
