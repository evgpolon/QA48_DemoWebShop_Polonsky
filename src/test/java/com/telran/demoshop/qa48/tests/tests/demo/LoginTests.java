package com.telran.demoshop.qa48.tests.tests.demo;

import com.telran.demoshop.qa48.models.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void basicLoginTest () {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginFields(new Login()
                .setEmail("johny@me.com")
                .setPassword("Pass123$%^"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().ifLogoutIsPresent());

    }


}
