package com.automation.tests;

import com.automation.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest {








    @BeforeMethod
    public void setUp(){
        DriverUtils.createDriver();

    }

    @AfterMethod
    public void cleanUp(){
        DriverUtils.getDriver().quit();
    }
}
