package com.telran.qa48.demo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DeleteFromCart extends TestBase {

    @BeforeMethod
    public void preCondition() {
        clickOnLoginLink();
        fillLoginFields(new Login()
                .setEmail("johny@me.com")
                .setPassword("Pass123$%^"));
        clickOnLoginButton();
        clickOnCommutersLink();
        clickOnNotebooksLink();
        clickOnLaptop();
        clickOnAddToTheCart31();
    }

    @Test
    public void deleteAllFromCartTest() {
        clickOnShoppingCartOnHeader();
        int sizeBefore = sizeInCart();
        clickCheckboxRemoveFromCart();
        clickOnUpdateCart();
        pause(1000);
        int sizeAfter = sizeInCart();
        Assert.assertEquals(sizeAfter, sizeBefore - 1);
    }

    @Test
    public void deleteFromCartCustomQuantityTest() {
        clickOnShoppingCartOnHeader();
        pause(1000);
        qtyBefore = qtyInCart();
        typeQtyToDelete();
        pause(1000);
        clickOnUpdateCart();
        pause(1000);
        qtyAfter = qtyInCart();
        int before = Integer.parseInt(qtyBefore);
        int after = Integer.parseInt(qtyAfter);
        Assert.assertEquals(after, before - 1);


    }


}

/*

 */