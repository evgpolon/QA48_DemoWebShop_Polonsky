package com.telran.demoshop.qa48.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {

    WebDriver driver;
    
    ShoppingHelper shopping;
    UserHelper user;
    
    public ShoppingHelper getShopping() {
        return shopping;
    }

    public UserHelper getUser() {
        return user;
    }
    
    public void stop() {
        driver.close();
    }

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        user = new UserHelper(driver);
        shopping = new ShoppingHelper(driver);
    }

}
