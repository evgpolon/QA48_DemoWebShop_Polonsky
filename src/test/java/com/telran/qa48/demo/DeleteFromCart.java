package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DeleteFromCart extends TestBase {

    @BeforeMethod
    public void preCondition() {
        click(By.className("ico-login"));
        type(By.name("Email"), "johny@me.com");
        type(By.name("Password"), "Pass123$%^");
        click(By.xpath("//input[@value='Log in']"));
        click(By.xpath("//a[@href='/computers']"));
        click(By.xpath("//li[@class='inactive']//a[@href='/notebooks']"));
        click(By.xpath("//h2[@class='product-title']//a[@href='/141-inch-laptop']"));
        click(By.id("add-to-cart-button-31"));
    }

    @Test
    public void deleteAllFromCartTest() {
        click(By.linkText("Shopping cart"));
        int sizeBefore = sizeInCart();
        click(By.name("removefromcart"));
        click(By.name("updatecart"));
        pause(1000);
        int sizeAfter = sizeInCart();
        Assert.assertEquals(sizeAfter, sizeBefore - 1);
    }

    public String qtyBefore, qtyAfter;
    @Test
    public void deleteFromCartCustomQuantityTest() {
        click(By.linkText("Shopping cart"));
        pause(1000);
        qtyBefore = qtyInCart();
        type(By.className("qty-input"), qtyToDel());
        pause(1000);
        click(By.name("updatecart"));
        pause(1000);
        qtyAfter = qtyInCart();
        int before = Integer.parseInt(qtyBefore);
        int after = Integer.parseInt(qtyAfter);
        Assert.assertEquals(after, before - 1);


    }

    private String qtyInCart() {
        WebElement input = driver.findElement(By.className("qty-input"));
        return input.getAttribute("value");

    }

    public String qtyToDel() {
        int qtyToDelete = Integer.parseInt(qtyBefore) - 1;
        String qtyToDel = Integer.toString(qtyToDelete);
        return qtyToDel;
    }

    private int sizeInCart() {
        if(isElementPresent(By.xpath("//td[@class='product']"))){
            return driver.findElements(By.xpath("//td[@class='product']//a[@href='/141-inch-laptop']")).size();
        }
        return 0;
    }

    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}

/*

 */