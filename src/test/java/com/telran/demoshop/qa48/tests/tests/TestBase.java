package com.telran.demoshop.qa48.tests.tests;

import com.telran.demoshop.qa48.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @AfterMethod (enabled = false)
    public void tearDown(){
        app.stop();
    }

    @BeforeMethod
    public void setUp(){
        app.init();
    }


}