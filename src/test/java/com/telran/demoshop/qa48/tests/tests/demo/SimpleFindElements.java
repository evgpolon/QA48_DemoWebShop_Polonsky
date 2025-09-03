package com.telran.demoshop.qa48.tests.tests.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SimpleFindElements extends TestBase {


   @Test
   public void findElementByName(){

        app.driver.findElement(By.name("description"));
        app.driver.findElement(By.name("q"));
        app.driver.findElement(By.name("pollanswers-1"));
        app.driver.findElement(By.name("viewport"));
   }

    @Test
    public void findElementByTagName () {
        app.driver.findElement(By.tagName("script"));
        app.driver.findElement(By.tagName("span"));
        app.driver.findElement(By.tagName("div"));
        app.driver.findElement(By.tagName("a"));
    }

    @Test
    public void findElementsByTagNameToListAndPrint() {
        List<WebElement> script = app.driver.findElements(By.tagName("script"));
        System.out.println("counter for tagName script: " + script.size());
        List<WebElement> span = app.driver.findElements(By.tagName("span"));
        System.out.println("counter for tagName span: " + span.size());
        List<WebElement> div = app.driver.findElements(By.tagName("div"));
        System.out.println("counter for tagName div: " + div.size());
        List<WebElement> a = app.driver.findElements(By.tagName("a"));
        System.out.println("counter for tagName a: "+ a.size());

    }

    @Test
    public void findElementById() {
        app.driver.findElement(By.id("bar-notification"));
        app.driver.findElement(By.id("mob-menu-button"));
        app.driver.findElement(By.id("topcartlink"));
        app.driver.findElement(By.id("flyout-cart"));
    }



    @Test
    public void findElementByClassName(){

        app.driver.findElement(By.className("close"));
        app.driver.findElement(By.className("bar-notification"));
        app.driver.findElement(By.className("header"));
        app.driver.findElement(By.className("header-links"));

    }



    @Test
    public void findElementByLink(){

        app.driver.findElement(By.linkText("Shopping cart"));
        app.driver.findElement(By.linkText("Register"));
        app.driver.findElement(By.linkText("Wishlist"));
        app.driver.findElement(By.linkText("Log in"));

        app.driver.findElement(By.partialLinkText("cart"));
        app.driver.findElement(By.partialLinkText("Log"));


    }

}