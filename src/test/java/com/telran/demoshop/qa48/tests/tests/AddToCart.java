package com.telran.demoshop.qa48.tests.tests;

import com.telran.demoshop.qa48.data.UserData;
import com.telran.demoshop.qa48.models.Login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCart extends TestBase {

    @BeforeMethod
    public void preCondition() {
        if(!app.getUser().isRegisterLinkPresent()){
            app.getUser().clickOnLogOutButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginFields(new Login()
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addToCart(){
        app.getShopping().clickOnCommutersLink();
        app.getShopping().clickOnNotebooksLink();
        app.getShopping().clickOnLaptop();
        app.getShopping().clickOnAddToTheCart31();
        app.getShopping().clickOnShoppingCartOnHeader();
        Assert.assertTrue(app.getShopping().isAddedToCart("14.1-inch Laptop"));

    }

    @AfterMethod (enabled = false)
    public void postCondition () {
        app.getShopping().clickCheckboxRemoveFromCart();
        app.getShopping().clickOnUpdateCart();
    }

}

/*

    @Test
    public void buyingBooks(){
        click(By.xpath("//a[@href='/books']"));
        click(By.xpath(("//input[@value='Add to cart'])[1]")));
        pause(1000);
        click(By.className("close"));
        click(By.xpath(("//input[@value='Add to cart'])[2]")));
        pause(1000);
        click(By.className("close"));
        click(By.xpath(("//input[@value='Add to cart'])[3]")));


    }

 */