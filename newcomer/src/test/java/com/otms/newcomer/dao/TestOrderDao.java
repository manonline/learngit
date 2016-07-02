package com.otms.newcomer.dao;

import java.util.Iterator;
import java.util.List;

//import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.alibaba.fastjson.JSON;
import com.otms.newcomer.dao.OrderDao;
import com.otms.newcomer.entity.Location;
import com.otms.newcomer.entity.Order;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
                                    "classpath:spring-hibernate.xml" })
public class TestOrderDao {
    private static final Logger LOGGER = Logger.getLogger(TestOrderDao.class);

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private LocationDao locationDao;

    @Test
    public void testLoad() {
        Order orderExp = new Order();
        Location location = locationDao.get(1l);
        orderExp.setId(20121100l);
        orderExp.setOrdNum("ORD00001");
        orderExp.setErpNum("ERP00001");
        orderExp.setShipfrom_loc(location);
        Long testID = orderDao.save(orderExp);
        orderExp = orderDao.get(testID);
        orderExp.setId(2089l);
        orderDao.save(orderExp);
        
        System.out.println(orderExp.getShipfrom_loc());
        Order orderAct = orderDao.get(20012l);
        Assert.assertEquals(orderExp.getOrdNum(), orderAct.getOrdNum());
        Assert.assertNotEquals(orderExp.getId(), orderAct.getId());
    }
    
    @Test
    public void testGet() {
        LOGGER.info(JSON.toJSONString("Testing"));
    }
    
    @Test
    public void testFindAll() {
        List<Order> orderList = orderDao.findAll();
        
        // Iterator loop through method 1 - list.size()
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(orderList.get(i).getId());
        }
        
        // Iterator loop through method 2 - list.iterator().next()
        Iterator<Order> ord = orderList.iterator();
        while (ord.hasNext()) {
            System.out.println(ord.next().getId());
        }
        
        // Iterator loop through method 3 - element : list
        for (Order order : orderList) {
            System.out.println("Order : " + order.getId());
        }
        
        LOGGER.info(JSON.toJSONString("Testing"));
    }
    
    @Test
    public void testPersist() {
        LOGGER.info(JSON.toJSONString("Testing"));
    }
    
    @Test
    public void testSave() {
        LOGGER.info(JSON.toJSONString("Testing"));
    }
    
    @Test
    public void testSaveOrUpdate() {
        LOGGER.info(JSON.toJSONString("Testing"));
    }
    
    @Test
    public void testDelete() {
        LOGGER.info(JSON.toJSONString("Testing"));
    }
    
    @Test
    public void testFlush() {
        LOGGER.info(JSON.toJSONString("Testing"));
    }
}