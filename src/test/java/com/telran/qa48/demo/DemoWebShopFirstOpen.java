package com.telran.qa48.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWebShopFirstOpen {

    WebDriver driver;

@BeforeMethod
public void setup() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
}



    @Test
    public void openShop() {
        System.out.println("WEBSHOP is opened");
    }


}
