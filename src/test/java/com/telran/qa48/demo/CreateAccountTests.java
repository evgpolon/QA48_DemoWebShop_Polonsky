package com.telran.qa48.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTestMale() {
        //int i = (int)((System.currentTimeMillis()/1000)%3600);
        clickOnRegisterLink();
        clickOnMaleGender();
        fillRegisterForm(new User()
                .setFirstName("Johny")
                .setLastName("Trampampony")
                .setEmail("johny@me.com")
                .setPassword("Pass123$%^")
                .setConfirmPassword("Pass123$%^"));
        clickOnRegisterButton();
        Assert.assertTrue(ifTheMessageAboutSuccessfulRegistrationIsPresent());

    }

    @Test
    public void newUserRegistrationPositiveTestFemale() {
        clickOnRegisterLink();
        clickOnFemaleGengere();
        fillRegisterForm(new User()
                .setFirstName("Lana")
                .setLastName("Bananna")
                .setEmail("lana@me.com")
                .setPassword("Pass123$%^")
                .setConfirmPassword("Pass123$%^"));
        clickOnRegisterButton();
        Assert.assertTrue(ifTheMessageAboutSuccessfulRegistrationIsPresent());

    }

}
