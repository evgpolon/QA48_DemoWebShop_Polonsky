package com.telran.demoshop.qa48.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingHelper extends BaseHelper{
    public String qtyBefore;
    public String qtyAfter;

    public ShoppingHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToTheCart31() {
        click(By.id("add-to-cart-button-31"));
    }

    public void clickOnLaptop() {
        click(By.xpath("//h2[@class='product-title']//a[@href='/141-inch-laptop']"));
    }

    public void clickOnNotebooksLink() {
        click(By.xpath("//li[@class='inactive']//a[@href='/notebooks']"));
    }

    public void clickOnCommutersLink() {
        click(By.xpath("//a[@href='/computers']"));
    }

    public void clickOnUpdateCart() {
        click(By.name("updatecart"));
    }

    public void clickCheckboxRemoveFromCart() {
        click(By.name("removefromcart"));
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

    public void clickOnShoppingCartOnHeader() {
        click(By.linkText("Shopping cart"));
    }

    public void typeQtyToDelete() {
        type(By.className("qty-input"), qtyToDel());
    }

    public String qtyInCart() {
        WebElement input = driver.findElement(By.className("qty-input"));
        return input.getAttribute("value");

    }

    public String qtyToDel() {
        int qtyToDelete = Integer.parseInt(qtyBefore) - 1;
        String qtyToDel = Integer.toString(qtyToDelete);
        return qtyToDel;
    }

    public int sizeInCart() {
        if(isElementPresent(By.xpath("//td[@class='product']"))){
            return driver.findElements(By.xpath("//td[@class='product']//a[@href='/141-inch-laptop']")).size();
        }
        return 0;
    }
}
