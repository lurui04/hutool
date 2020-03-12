package cn.hutool.desgin.singleton;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataSourceConfigTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getConfig() {
        String result = DataSourceConfig.getInstance().getConfig();
        Assert.assertEquals("read data success",result); ;
    }
}