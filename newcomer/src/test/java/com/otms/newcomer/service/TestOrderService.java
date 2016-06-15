package com.otms.newcomer.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
                                    "classpath:spring-hibernate.xml" })
public class TestOrderService {
    private static final Logger LOGGER = Logger.getLogger(TestOrderService.class);

    @Autowired
    private OrderService orderService;

    @Test
    public void save() {
        LOGGER.info(JSON.toJSONString("Testing"));
    }
}