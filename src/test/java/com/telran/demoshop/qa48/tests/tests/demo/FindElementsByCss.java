package com.telran.demoshop.qa48.tests.tests.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class FindElementsByCss extends TestBase {


    @Test
    public void findElementByNameCss(){
        app.driver.findElement(By.cssSelector("[name='description']"));
        app.driver.findElement(By.cssSelector("[name='q']"));
        app.driver.findElement(By.cssSelector("[name='pollanswers-1']"));
        app.driver.findElement(By.cssSelector("[name='viewport']"));
    }

    @Test
    public void findElementByTagNameCss(){
        app.driver.findElement(By.cssSelector("label"));
        app.driver.findElement(By.cssSelector("script"));
        app.driver.findElement(By.cssSelector("div"));
        app.driver.findElement(By.cssSelector("a"));
    }

    @Test
    public void findElementByIdCss(){
        app.driver.findElement(By.cssSelector("#dialog-notifications-success"));
        app.driver.findElement(By.cssSelector("#dialog-notifications-error"));
        app.driver.findElement(By.cssSelector("#bar-notification"));
        app.driver.findElement(By.cssSelector("#topcartlink"));
    }

    @Test
    public void findElementByClassNameCss(){
        app.driver.findElement(By.cssSelector(".master-wrapper-page"));
        app.driver.findElement(By.cssSelector(".ico-register"));
        app.driver.findElement(By.cssSelector(".ico-login"));
        app.driver.findElement(By.cssSelector(".cart-qty"));
    }

    @Test
    public void findElementManualCss(){
        app.driver.findElement(By.cssSelector("[action='/search']"));
        app.driver.findElement(By.cssSelector("[action*='arc']"));
        app.driver.findElement(By.cssSelector("[action^='/se']"));
        app.driver.findElement(By.cssSelector("[action$='ch']"));
        app.driver.findElement(By.cssSelector("li#topcartlink"));
        app.driver.findElement(By.cssSelector("span.close"));
        app.driver.findElement(By.cssSelector("span.close[title='Close']"));

    }
}

