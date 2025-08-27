package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;



public class FindElementsByCss extends TestBase{


    @Test
    public void findElementByNameCss(){
        driver.findElement(By.cssSelector("[name='description']"));
        driver.findElement(By.cssSelector("[name='q']"));
        driver.findElement(By.cssSelector("[name='pollanswers-1']"));
        driver.findElement(By.cssSelector("[name='viewport']"));
    }

    @Test
    public void findElementByTagNameCss(){
        driver.findElement(By.cssSelector("label"));
        driver.findElement(By.cssSelector("script"));
        driver.findElement(By.cssSelector("div"));
        driver.findElement(By.cssSelector("a"));
    }

    @Test
    public void findElementByIdCss(){
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("#topcartlink"));
    }

    @Test
    public void findElementByClassNameCss(){
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector(".ico-register"));
        driver.findElement(By.cssSelector(".ico-login"));
        driver.findElement(By.cssSelector(".cart-qty"));
    }

    @Test
    public void findElementManualCss(){
        driver.findElement(By.cssSelector("[action='/search']"));
        driver.findElement(By.cssSelector("[action*='arc']"));
        driver.findElement(By.cssSelector("[action^='/se']"));
        driver.findElement(By.cssSelector("[action$='ch']"));
        driver.findElement(By.cssSelector("li#topcartlink"));
        driver.findElement(By.cssSelector("span.close"));
        driver.findElement(By.cssSelector("span.close[title='Close']"));

    }
}

