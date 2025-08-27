package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTestMale() {

        //click on Login link
        //click(By.cssSelector("[href='/login']"));
        driver.findElement(By.xpath("//a[@href='/register']")).click();
        // click gender
        driver.findElement(By.cssSelector("#gender-male")).click();
        // First name
        driver.findElement(By.cssSelector("[data-val-required*='First name is required']")).click();
        driver.findElement(By.cssSelector("[data-val-required*='First name is required']")).clear();
        driver.findElement(By.cssSelector("[data-val-required*='First name is required']")).sendKeys("Johny");
        // Second name
       // driver.findElement(By.className("class=\"text-box single-line\"")).click();
        //driver.findElement(By.className("class=\"text-box single-line\"")).clear();
       // driver.findElement(By.className("class=\"text-box single-line\"")).sendKeys("Johny");

        //data-val-required="First name is required."
        // Enter Password
        //type(By.name("password"), "Goos12os12#");
        // click on Registration button
        //click(By.name("registration"));
        // verify SingOut is displayed
        // //div:nth-child(1) button == //button[.='Sign Out'] == //*[.='Sign Out']
        //Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));

    }

}
