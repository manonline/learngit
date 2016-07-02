package com.otms.newcomer.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.otms.newcomer.entity.Location;
import com.otms.newcomer.entity.Order;
import com.otms.newcomer.entity.OrderLine;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
                                    "classpath:spring-hibernate.xml" })
public class TestOrderLineDao {
    
    @Autowired
    private OrderLineDao orderLineDao;
    @Autowired
    private OrderDao orderDao;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testLoad() {
        OrderLine orderLineExp = new OrderLine();
        Order order = orderDao.get(4L);
        orderLineExp.setItem("Shanghai");
        orderLineExp.setOrder(order);
        orderLineExp.setLineNum(1L);
        orderLineDao.save(orderLineExp);
        Long orderLineExpId = orderLineExp.getId();
        
        OrderLine orderLineAct = orderLineDao.get(orderLineExpId);
        Assert.assertEquals(orderLineAct.getItem(), orderLineExp.getItem());
    }

    @Test
    public void testGet() {
        fail("Not yet implemented");
    }

    @Test
    public void testFindAll() {
        fail("Not yet implemented");
    }

    @Test
    public void testPersist() {
        fail("Not yet implemented");
    }

    @Test
    public void testSave() {
        fail("Not yet implemented");
    }

    @Test
    public void testSaveOrUpdate() {
        fail("Not yet implemented");
    }

    @Test
    public void testDelete() {
        fail("Not yet implemented");
    }

    @Test
    public void testFlush() {
        fail("Not yet implemented");
    }
}