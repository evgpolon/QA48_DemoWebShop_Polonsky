package com.telran.demoshop.qa48.tests.tests.demo;

import com.telran.demoshop.qa48.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTestMale() {
        //int i = (int)((System.currentTimeMillis()/1000)%3600);
        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnMaleGender();
        app.getUser().fillRegisterForm(new User()
                .setFirstName("Johny")
                .setLastName("Trampampony")
                .setEmail("johny@me.com")
                .setPassword("Pass123$%^")
                .setConfirmPassword("Pass123$%^"));
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().ifTheMessageAboutSuccessfulRegistrationIsPresent());

    }

    @Test
    public void newUserRegistrationPositiveTestFemale() {
        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnFemaleGengere();
        app.getUser().fillRegisterForm(new User()
                .setFirstName("Lana")
                .setLastName("Bananna")
                .setEmail("lana@me.com")
                .setPassword("Pass123$%^")
                .setConfirmPassword("Pass123$%^"));
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().ifTheMessageAboutSuccessfulRegistrationIsPresent());

    }

}
