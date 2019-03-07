package com.qy.dao.impl;

import com.qy.dao.CityDao;
import com.qy.domain.CityEntity;
import com.qy.domain.ProvinceEntity;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "cityDao")
public class CityDaoImpl implements CityDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public List<CityEntity> find() {
        List<CityEntity> list=hibernateTemplate.loadAll(CityEntity.class);
        return list;
    }

    @Override
    public ProvinceEntity list() {
        Session session= hibernateTemplate.getSessionFactory().getCurrentSession();
        ProvinceEntity provinceEntity= (ProvinceEntity) session.createQuery("from ProvinceEntity where id=?").setParameter(0, 3).uniqueResult();
        return provinceEntity;

    }

    @Override
    public CityEntity findOne(int id) {
        Session session= hibernateTemplate.getSessionFactory().getCurrentSession();
        CityEntity cityEntity= (CityEntity) session.createQuery("from CityEntity where id=?").setParameter(0, id).uniqueResult();
        return cityEntity;
    }

    @Override
    public List<CityEntity> find(int page, int pageSize) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        List<CityEntity> list=session.createQuery("from CityEntity").setFirstResult((page-1)*pageSize).setMaxResults(pageSize).list();
        return list;
    }

    @Override
    public void saveCity(CityEntity cityEntity) {
        hibernateTemplate.save(cityEntity);
    }

    @Override
    public void deleteCity(CityEntity cityEntity) {
        hibernateTemplate.delete(cityEntity);
    }

    @Override
    public void updateCity(CityEntity cityEntity) {
        hibernateTemplate.update(cityEntity);
    }
}
