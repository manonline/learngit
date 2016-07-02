package com.otms.newcomer.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.otms.newcomer.entity.OrderLine;

@Repository("orderLineDao")
public class OrderLineDaoImpl implements com.otms.newcomer.dao.OrderLineDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    public OrderLine load(Long id) {
        // TODO Auto-generated method stub
        return (OrderLine) this.getCurrentSession().load(OrderLine.class, id);
    }

    public OrderLine get(Long id) {
        // TODO Auto-generated method stub
        return (OrderLine) this.getCurrentSession().get(OrderLine.class, id);
    }

    public List<OrderLine> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public void persist(OrderLine entity) {
        // TODO Auto-generated method stub
    }

    public Long save(OrderLine entity) {
        return (Long)this.getCurrentSession().save(entity);
    }

    public void saveOrUpdate(OrderLine entity) {
        // TODO Auto-generated method stub

    }

    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    public void flush() {
        // TODO Auto-generated method stub

    }

}
