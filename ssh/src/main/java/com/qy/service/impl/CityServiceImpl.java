package com.qy.service.impl;

import com.qy.dao.CityDao;
import com.qy.domain.CityEntity;
import com.qy.domain.ProvinceEntity;
import com.qy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="cityService")
public class CityServiceImpl implements CityService {
    @Autowired
    @Qualifier(value = "cityDao")
    private CityDao cityDao;

    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public List<CityEntity> find() {
        List<CityEntity> list=cityDao.find();
        return list;
    }

    @Override
    public CityEntity findOne(int id) {
        return cityDao.findOne(id);
    }

    @Override
    public ProvinceEntity list() {
        return cityDao.list();
    }

    @Override
    public List<CityEntity> find(int page, int pageSize) {
        return cityDao.find(page,pageSize);
    }

    @Override
    public void saveCity(CityEntity cityEntity) {
        cityDao.saveCity(cityEntity);
    }

    @Override
    public void deleteCity(CityEntity cityEntity) {
        cityDao.deleteCity(cityEntity);
    }

    @Override
    public void updateCity(CityEntity cityEntity) {
        cityDao.updateCity(cityEntity);
    }
}
