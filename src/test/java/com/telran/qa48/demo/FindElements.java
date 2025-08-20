package com.telran.qa48.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements {


    WebDriver driver;

    @BeforeMethod

    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }


    @Test
    public void findElement() {

        WebElement element = driver.findElement(By.tagName("a"));

        List<WebElement> elements = driver.findElements(By.tagName("a"));



    }


    @AfterMethod(enabled = true)
//enabled = true по дефолту
    public void tearDown() {
        // driver.quit(); - закрывает все вкладки
        driver.close(); // закрывает текущую вкладку
    }


}