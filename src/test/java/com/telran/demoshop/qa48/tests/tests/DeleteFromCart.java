package com.telran.demoshop.qa48.tests.tests;

import com.telran.demoshop.qa48.models.Login;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DeleteFromCart extends TestBase {

    @BeforeMethod
    public void preCondition() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginFields(new Login()
                .setEmail("johny@me.com")
                .setPassword("Pass123$%^"));
        app.getUser().clickOnLoginButton();
        app.getShopping().clickOnCommutersLink();
        app.getShopping().clickOnNotebooksLink();
        app.getShopping().clickOnLaptop();
        app.getShopping().clickOnAddToTheCart31();
    }

    @Test
    public void deleteAllFromCartTest() {
        app.getShopping().clickOnShoppingCartOnHeader();
        int sizeBefore = app.getShopping().sizeInCart();
        app.getShopping().clickCheckboxRemoveFromCart();
        app.getShopping().clickOnUpdateCart();
        app.getShopping().pause(1000);
        int sizeAfter = app.getShopping().sizeInCart();
        Assert.assertEquals(sizeAfter, sizeBefore - 1);
    }

    @Test
    public void deleteFromCartCustomQuantityTest() {
        app.getShopping().clickOnShoppingCartOnHeader();
        app.getShopping().pause(1000);
        app.getShopping().qtyBefore = app.getShopping().qtyInCart();
        app.getShopping().typeQtyToDelete();
        app.getShopping().pause(1000);
        app.getShopping().clickOnUpdateCart();
        app.getShopping().pause(1000);
        app.getShopping().qtyAfter = app.getShopping().qtyInCart();
        int before = Integer.parseInt(app.getShopping().qtyBefore);
        int after = Integer.parseInt(app.getShopping().qtyAfter);
        Assert.assertEquals(after, before - 1);


    }


}

/*

 */