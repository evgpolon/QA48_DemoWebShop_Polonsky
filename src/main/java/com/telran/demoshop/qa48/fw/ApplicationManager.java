package com.telran.demoshop.qa48.fw;

import com.telran.demoshop.qa48.utils.MyListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ApplicationManager {

    String browser;
    WebDriver driver;
    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);
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
        WebDriverListener listner = new MyListener();
        driver = new EventFiringDecorator<>(listner).decorate(driver);
        driver.get("https://demowebshop.tricentis.com");
        logger.info("Current URL --> " + driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        user = new UserHelper(driver);
        shopping = new ShoppingHelper(driver);
    }

}
