package com.otms.newcomer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otms.newcomer.service.OrderService;
import com.otms.newcomer.dao.OrderDao;
import com.otms.newcomer.entity.Order;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    
    @Autowired
    private OrderDao orderDao;
    
    public List<Order> findAll() {
        return orderDao.findAll();
    }
    
    public Order get(Long orderId) {
        return orderDao.get(orderId);
    }
}
