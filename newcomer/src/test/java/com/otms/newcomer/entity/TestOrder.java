package com.otms.newcomer.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.otms.newcomer.entity.Order;
// check BeforeClass and AfterClass annotation
import org.junit.runner.RunWith;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert.*;


// check hamcrest
//import static org.hamcrest.CoreMatchers.allOf;
//import static org.hamcrest.CoreMatchers.anyOf;
//import static org.hamcrest.CoreMatchers.both;
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.everyItem;
//import static org.hamcrest.CoreMatchers.hasItems;
//import static org.hamcrest.CoreMatchers.not;
//import static org.hamcrest.CoreMatchers.sameInstance;
//import static org.hamcrest.CoreMatchers.startsWith;

import org.apache.log4j.Logger;
import com.otms.newcomer.entity.Order;

//import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
                                    "classpath:spring-hibernate.xml" })
public class TestOrder {
    private static final Logger LOGGER = Logger.getLogger(TestOrder.class);

    private static Order order;
    
    @BeforeClass
    public static void globalInit() {
        order = new Order();
    }
    
    @AfterClass
    public static void globalDestory() {
        
    }
    
    // check throw exception
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
    public void testId() {
        
        order.setId(5);
        Assert.assertEquals(5, order.getId());
        
        //order.setID(2);
        //order.getID();
        
        // LOGGER.info(JSON.toJSONString("Testing"));
    }
    @Test
    public void testErpNum() {
        order.setErpNum("ERP00001");
        Assert.assertEquals("ERP00001", order.getErpNum());
        Assert.assertNotEquals("ERP01", order.getErpNum());
    }
    
}