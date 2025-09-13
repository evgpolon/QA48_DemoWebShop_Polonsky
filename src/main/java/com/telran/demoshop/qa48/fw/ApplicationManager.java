package com.telran.demoshop.qa48.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class ApplicationManager {

    String browser;
    WebDriver driver;
    
    ShoppingHelper shopping;
    UserHelper user;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

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
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();

        }
        else if (browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        user = new UserHelper(driver);
        shopping = new ShoppingHelper(driver);
    }

}
