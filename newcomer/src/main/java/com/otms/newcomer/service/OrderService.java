package com.otms.newcomer.service;

import java.util.List;

import com.otms.newcomer.entity.Order;

public interface OrderService {
    
    public List<Order> findAll();
    
    public Order get(Long orderId);
}
