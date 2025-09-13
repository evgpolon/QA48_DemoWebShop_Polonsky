package com.telran.demoshop.qa48.tests.tests;

import com.telran.demoshop.qa48.data.UserData;
import com.telran.demoshop.qa48.models.Login;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isRegisterLinkPresent()){
            app.getUser().clickOnLogOutButton();
        }
    }

    @Test
    public void basicLoginTest () {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginFields(new Login()
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().ifLogoutIsPresent());

    }


}
