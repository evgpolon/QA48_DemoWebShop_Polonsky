package com.telran.demoshop.qa48.tests.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWebShopFirstOpen extends TestBase{

    @BeforeMethod
    public void ensurePrecondition (){
        if(!app.getUser().isHomeComponentPresent()){
            app.getUser().clickOnHomeLink();
        }
    }


    @Test
    public void ifHomePageOpen(){
        Assert.assertTrue(app.getUser().isHomeComponentPresent());


    }

}
