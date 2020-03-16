package cn.hutool.desgin.build;

import org.junit.Assert;
import org.junit.Test;

public class ConstructorArgTest {


    @Test
    public void buildTest() {
        ConstructorArg constructorArg = new ConstructorArg.Build().setArg("test").setRef(true).setType(String.class).build();
        Assert.assertEquals("test", constructorArg.getArg());
    }

}