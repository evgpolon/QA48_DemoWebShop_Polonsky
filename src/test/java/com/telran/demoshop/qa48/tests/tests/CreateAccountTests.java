package com.telran.demoshop.qa48.tests.tests;

import com.telran.demoshop.qa48.data.FemaleRegistrationData;
import com.telran.demoshop.qa48.data.MaleRegistrationData;
import com.telran.demoshop.qa48.models.User;
import com.telran.demoshop.qa48.utils.MyDataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{


    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isRegisterLinkPresent()){
            app.getUser().clickOnLogOutButton();
        }
    }

    @Test
    public void newUserRegistrationPositiveTestMale() {
        //int i = (int)((System.currentTimeMillis()/1000)%3600);
        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnMaleGender();
        app.getUser().fillRegisterForm(new User()
                .setFirstName(MaleRegistrationData.NAME)
                .setLastName(MaleRegistrationData.LASTNAME)
                .setEmail(MaleRegistrationData.EMAIL)
                .setPassword(MaleRegistrationData.PASSWORD)
                .setConfirmPassword(MaleRegistrationData.CONFPASSWORD));
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().ifTheMessageAboutSuccessfulRegistrationIsPresent());

    }


    @Test (dataProvider = "newUserMaleWithCsv", dataProviderClass = MyDataProviders.class)
    public void newUserRegistrationPositiveTestMaleWithCsv(User user) {
        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnMaleGender();
        app.getUser().fillRegisterForm(user);
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().ifTheMessageAboutSuccessfulRegistrationIsPresent());

    }

    @Test
    public void newUserRegistrationPositiveTestFemale() {
        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnFemaleGenger();
        app.getUser().fillRegisterForm(new User()
                .setFirstName(FemaleRegistrationData.NAME)
                .setLastName(FemaleRegistrationData.LASTNAME)
                .setEmail(FemaleRegistrationData.EMAIL)
                .setPassword(FemaleRegistrationData.PASSWORD)
                .setConfirmPassword(FemaleRegistrationData.CONFPASSWORD));
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().ifTheMessageAboutSuccessfulRegistrationIsPresent());
    }

    @Test (dataProvider = "newUserFemaleWithCsv", dataProviderClass = MyDataProviders.class)
    public void newUserRegistrationPositiveTestFemaleWithCsv(User user) {
        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnFemaleGenger();
        app.getUser().fillRegisterForm(user);
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().ifTheMessageAboutSuccessfulRegistrationIsPresent());

    }


}
