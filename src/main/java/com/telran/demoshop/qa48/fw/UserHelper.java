package com.telran.demoshop.qa48.fw;

import com.telran.demoshop.qa48.models.Login;
import com.telran.demoshop.qa48.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    public UserHelper(WebDriver driver) {
        super(driver);
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
