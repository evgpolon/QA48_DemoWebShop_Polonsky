package com.telran.qa48.demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCart extends TestBase {

    @BeforeMethod
    public void preCondition() {
        clickOnLoginLink();
        fillLoginFields(new Login()
                .setEmail("johny@me.com")
                .setPassword("Pass123$%^"));
        clickOnLoginButton();
    }

    @Test
    public void addToCart(){
        clickOnCommutersLink();
        clickOnNotebooksLink();
        clickOnLaptop();
        clickOnAddToTheCart31();
        Assert.assertTrue(isAddedToCart("14.1-inch Laptop"));

    }

    @AfterMethod (enabled = false)
    public void postCondition () {
        clickCheckboxRemoveFromCart();
        clickOnUpdateCart();
    }

}