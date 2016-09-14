package com.otms.newcomer.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.otms.newcomer.service.OrderService;
import com.otms.newcomer.entity.Order;

@Controller
@RequestMapping("/order")
public class OrderController {

    private static final Logger LOGGER = Logger.getLogger(OrderController.class);
    
    @Autowired
    private OrderService orderService;
    
    @RequestMapping("/{orderId}")
    public String showUserInfo(ModelMap modelMap, @PathVariable Long orderId) {
        LOGGER.info("查询用户：" + orderId);
        Order order = orderService.get(orderId);
        modelMap.addAttribute("order", order);
        return "/order/display";
    }
    
    @RequestMapping("/showInfos")
    public @ResponseBody List<Order> showUserInfos(){
        LOGGER.info("查询用户全部用户");
        List<Order> orders = orderService.findAll();
        return orders;
    }
}