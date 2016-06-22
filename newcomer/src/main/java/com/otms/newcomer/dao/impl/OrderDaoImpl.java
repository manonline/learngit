package com.otms.newcomer.dao.impl;

import com.otms.newcomer.dao.OrderDao;
import com.otms.newcomer.entity.Order;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public Order load(Integer id) {
        return (Order)this.getCurrentSession().load(Order.class, id);
    }

    public Order get(Integer id) {
        return (Order)this.getCurrentSession().get(Order.class, id);
    }
    
    @SuppressWarnings("unchecked")
    public List<Order> findAll() {
        List<Order> orders = this.getCurrentSession().createQuery("from Order").list();
        return orders;
    }

    public void persist(Order entity) {
        this.getCurrentSession().persist(entity);
    }

    public Integer save(Order entity) {
        return (Integer)this.getCurrentSession().save(entity);
    }

    public void saveOrUpdate(Order entity) {
        this.getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Integer id) {
        Order entity = this.load(id);
        this.getCurrentSession().delete(entity);
    }

    public void flush() {
        this.getCurrentSession().flush();
    }

}
