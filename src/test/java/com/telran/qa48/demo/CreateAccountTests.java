package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTestMale() {
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        //click on Login link
        driver.findElement(By.xpath("//a[@href='/register']")).click();
        // click gender
        driver.findElement(By.cssSelector("#gender-male")).click();
        // First name
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Johny");
        // Second name
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Trampampony");
        // email
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("johny" + i + "@me.com");
        //driver.findElement(By.name("Email")).sendKeys("johny@me.com");

        // password
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Pass123$%^");
        // confirm password
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Pass123$%^");
        // register
        driver.findElement(By.name("register-button")).click();
        // verify SingOut is displayed
        // //div:nth-child(1) button == //button[.='Sign Out'] == //*[.='Sign Out']
        Assert.assertTrue(isElementPresent(By.xpath("//div[contains(.,'Your registration completed')]")));

    }

}
