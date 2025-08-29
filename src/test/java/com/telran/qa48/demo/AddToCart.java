package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static java.awt.SystemColor.text;

public class AddToCart extends TestBase {

    @BeforeMethod
    public void preCondition() {
        click(By.className("ico-login"));
        type(By.name("Email"), "johny@me.com");
        type(By.name("Password"), "Pass123$%^");
        click(By.xpath("//input[@value='Log in']"));
    }

    @Test
    public void addToCart(){
        click(By.xpath("//a[@href='/computers']"));
        click(By.xpath("//li[@class='inactive']//a[@href='/notebooks']"));
        click(By.xpath("//h2[@class='product-title']//a[@href='/141-inch-laptop']"));
        click(By.id("add-to-cart-button-31"));
        Assert.assertTrue(isAddedToCart("14.1-inch Laptop"));

    }

    public boolean isAddedToCart(String text) {
        click(By.linkText("Shopping cart"));
        List<WebElement> products = driver.findElements(By.xpath("//td[@class='product']"));
        for (WebElement element: products) {
            if (element.getText().contains(text))
                return true;
        }
        return false;

    }

    @AfterMethod
    public void postCondiotion () {
        click(By.name("removefromcart"));
        click(By.name("updatecart"));
    }

    /*
     List<WebElement> contacts = driver.findElements(By.cssSelector("h2"));
        for(WebElement element:contacts) {
            if (element.getText().contains(text))
                return true;
        }
        return false;
     */
}