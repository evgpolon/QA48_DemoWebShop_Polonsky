package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

public class TestBase {

    public String qtyBefore;
    public String qtyAfter;
    WebDriver driver;

    @AfterMethod (enabled = false)
    public void tearDown(){
        driver.close();
    }

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }


    public void clickOnRegisterButton() {
        click(By.name("register-button"));
    }

    public void clickOnMaleGender() {
        click(By.cssSelector("#gender-male"));
    }

    public void clickOnRegisterLink() {
        click(By.xpath("//a[@href='/register']"));
    }


    public boolean ifLogoutIsPresent() {
        return isElementPresent(By.cssSelector("[href='/logout']"));
    }

    public void clickOnLoginButton() {
        click(By.xpath("//input[@value='Log in']"));
    }

    public void clickOnLoginLink() {
        click(By.className("ico-login"));
    }

    public void fillLoginFields(Login login) {
        type(By.name("Email"), login.getEmail());
        type(By.name("Password"), login.getPassword());
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

    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fillRegisterForm(User user) {
        // First name
        type(By.name("FirstName"), user.getFirstName());
        // Second name
        type(By.name("LastName"), user.getLastName());
        // email
        type(By.name("Email"), user.getEmail());
        // password
        type(By.name("Password"), user.getPassword());
        // confirm password
        type(By.name("ConfirmPassword"), user.getConfirmPassword());
    }

    public void clickOnFemaleGengere() {
        click(By.cssSelector("#gender-female"));
    }

    public boolean ifTheMessageAboutSuccessfulRegistrationIsPresent() {
        return isElementPresent(By.xpath("//div[contains(.,'Your registration completed')]"));
    }
}
