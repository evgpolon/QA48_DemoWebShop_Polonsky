package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SimpleFindElements {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

   @Test
   public void findElementByName(){

        driver.findElement(By.name("description"));
        driver.findElement(By.name("q"));
        driver.findElement(By.name("pollanswers-1"));
        driver.findElement(By.name("viewport"));
   }

    @Test
    public void findElementByTagName () {
        driver.findElement(By.tagName("script"));
        driver.findElement(By.tagName("span"));
        driver.findElement(By.tagName("div"));
        driver.findElement(By.tagName("a"));
    }

    @Test
    public void findElementsByTagNameToListAndPrint() {
        List<WebElement> script = driver.findElements(By.tagName("script"));
        System.out.println("counter for tagName script: " + script.size());
        List<WebElement> span = driver.findElements(By.tagName("span"));
        System.out.println("counter for tagName span: " + span.size());
        List<WebElement> div = driver.findElements(By.tagName("div"));
        System.out.println("counter for tagName div: " + div.size());
        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println("counter for tagName a: "+ a.size());

    }

    @Test
    public void findElementById() {
        driver.findElement(By.id("bar-notification"));
        driver.findElement(By.id("mob-menu-button"));
        driver.findElement(By.id("topcartlink"));
        driver.findElement(By.id("flyout-cart"));
    }



    @Test
    public void findElementByClassName(){

        driver.findElement(By.className("close"));
        driver.findElement(By.className("bar-notification"));
        driver.findElement(By.className("header"));
        driver.findElement(By.className("header-links"));

    }



    @Test
    public void findElementByLink(){

        driver.findElement(By.linkText("Shopping cart"));
        driver.findElement(By.linkText("Register"));
        driver.findElement(By.linkText("Wishlist"));
        driver.findElement(By.linkText("Log in"));

        driver.findElement(By.partialLinkText("cart"));
        driver.findElement(By.partialLinkText("Log"));


    }

}