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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
                                    "classpath:spring-hibernate.xml" })
public class TestLocationDao {
    
    @Autowired
    private LocationDao locationDao;

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
        Location locationExp = new Location();
        locationExp.setName("Shanghai");
        locationDao.save(locationExp);
        Long locationExpId = locationExp.getId();
        
        Location locationAct = locationDao.get(locationExpId);
        Assert.assertEquals(locationAct.getName(), locationExp.getName());
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
