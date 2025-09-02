package com.telran.qa48.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void basicLoginTest () {
        clickOnLoginLink();
        fillLoginFields(new Login()
                .setEmail("johny@me.com")
                .setPassword("Pass123$%^"));
        clickOnLoginButton();
        Assert.assertTrue(ifLogoutIsPresent());

    }


}
