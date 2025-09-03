package com.telran.demoshop.qa48.tests.find;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsByXpath extends TestDemo {

    @Test
    public void findElementsByXpath () {

        driver.findElement(By.xpath("//div"));
        List<WebElement> tagdiv = driver.findElements(By.xpath("//div"));
        System.out.println(tagdiv.size());

        driver.findElement(By.xpath("//a"));
        driver.findElement(By.xpath("//script"));

        driver.findElement(By.xpath("//div[@class='header-menu']"));

        driver.findElement(By.xpath("//li[@id='topcartlink']"));


    }

    /*


        //id -> xpath - //tag[@id='value']
        // driver.findElement(By.id("root"));
        driver.findElement(By.xpath("//div[@id='root']"));

        // class name -> xpath - //tag[#class='value']
        //driver.findElement(By.className("mobile-header"));
        driver.findElement(By.xpath("//div[@class='mobile-header']"));

        //contains->//*[contains(.,'Text')]
        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));

        //equal-> //*[text()='Text']
        driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
        driver.findElement(By.xpath("//h2[.='Type your data and hit Yalla!']"));

        //start -> //*[starts-with(@attr,'Text')]
        driver.findElement(By.xpath("//label[starts-with(@for,'c')]"));

        //move up
        driver.findElement(By.xpath("//a[@class='navigation-link']/.."));

        // parent
        driver.findElement(By.xpath("//h1/parent::*"));
        driver.findElement(By.xpath("//h1/parent::div"));
        driver.findElement(By.xpath("//h1/.."));
        // ancestor
        driver.findElement(By.xpath("//h1/ancestor::*")); //all
        driver.findElement(By.xpath("//h1/ancestor::div")); //two options
        driver.findElement(By.xpath("//h1/ancestor::div[2]")); //same level
        //following-sibling
        driver.findElement(By.xpath("//h1/following-sibling::form"));
        // preceding-sibling
        driver.findElement(By.xpath("//h2/preceding-sibling::*"));
     */

}




