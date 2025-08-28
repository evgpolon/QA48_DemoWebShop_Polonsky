package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTestMale() {
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        //click on Login link
        click(By.xpath("//a[@href='/register']"));
        // click gender
        click(By.cssSelector("#gender-male"));
        // First name
        type(By.name("FirstName"), "Johny");
        // Second name
        type(By.name("LastName"), "Trampampony");
        // email
        type(By.name("Email"), "johny" + i + "@me.com");

        // password
        type(By.name("Password"), "Pass123$%^");
        // confirm password
        type(By.name("ConfirmPassword"), "Pass123$%^");
        // register
        click(By.name("register-button"));
        // verify SingOut is displayed
        // //div:nth-child(1) button == //button[.='Sign Out'] == //*[.='Sign Out']
        Assert.assertTrue(isElementPresent(By.xpath("//div[contains(.,'Your registration completed')]")));

    }

    @Test
    public void newUserRegistrationPositiveTestFemale() {
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        //click on Login link
        click(By.xpath("//a[@href='/register']"));
        // click gender
        click(By.cssSelector("#gender-female"));
        // First name
        type(By.name("FirstName"), "Lana");
        // Second name
        type(By.name("LastName"), "Bananna");
        // email
        type(By.name("Email"), "lana" + i + "@me.com");

        // password
        type(By.name("Password"), "Pass123$%^");
        // confirm password
        type(By.name("ConfirmPassword"), "Pass123$%^");
        // register
        click(By.name("register-button"));
        // verify SingOut is displayed
        // //div:nth-child(1) button == //button[.='Sign Out'] == //*[.='Sign Out']
        Assert.assertTrue(isElementPresent(By.xpath("//div[contains(.,'Your registration completed')]")));

    }

}
