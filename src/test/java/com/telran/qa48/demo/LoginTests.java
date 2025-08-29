package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void basicLoginTest () {
        click(By.className("ico-login"));
        type(By.name("Email"), "johny@me.com");
        type(By.name("Password"),"Pass123$%^");
        click(By.xpath("//input[@value='Log in']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));

    }



}
