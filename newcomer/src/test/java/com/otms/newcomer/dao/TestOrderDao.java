package com.otms.newcomer.dao;

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
import com.otms.newcomer.entity.Order;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
                                    "classpath:spring-hibernate.xml" })
public class TestOrderDao {
    private static final Logger LOGGER = Logger.getLogger(TestOrderDao.class);

    @Autowired
    private OrderDao orderDao;

    @Test
    public void testLoad() {
        Order orderExp = new Order();
        orderExp.setId(20012l);
        orderExp.setOrdNum("ORD00001");
        orderExp.setErpNum("ERP00001");
        orderDao.save(orderExp);
        
        Order orderAct = orderDao.load(2000111l);
        Assert.assertEquals(orderExp.getId(), orderAct.getId());
        Assert.assertEquals(orderExp.getOrdNum(), orderAct.getOrdNum());
    }
    
    @Test
    public void testGet() {
        LOGGER.info(JSON.toJSONString("Testing"));
    }
    
    @Test
    public void testFindAll() {
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