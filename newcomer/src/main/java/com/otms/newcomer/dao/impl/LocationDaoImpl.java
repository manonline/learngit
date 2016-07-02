package com.otms.newcomer.dao.impl;

import java.util.List;

import com.otms.newcomer.dao.LocationDao;
import com.otms.newcomer.entity.Location;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("locationDao")
public class LocationDaoImpl implements LocationDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    public Location load(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public Location get(Long id) {
        return (Location)this.getCurrentSession().get(Location.class, id);
    }

    public List<Location> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public void persist(Location entity) {
        // TODO Auto-generated method stub

    }

    public Long save(Location entity) {
        return (Long)this.getCurrentSession().save(entity);
    }

    public void saveOrUpdate(Location entity) {
        // TODO Auto-generated method stub

    }

    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    public void flush() {
        // TODO Auto-generated method stub

    }

}
