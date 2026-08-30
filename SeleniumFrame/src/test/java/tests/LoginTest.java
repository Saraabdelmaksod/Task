package tests;

import baseTest.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import listen.Listeners;
import org.testng.annotations.Test;
import pages.LoginScreen;

import static utils.reader.ConfigHandler.websiteProperty;


public class LoginTest extends BaseTest {

    // method
    @Epic("Login")
    @Feature("login with credentials")
    @Test(priority = 0,retryAnalyzer = Listeners.class)
    @Description("Validate that user can login Successfully with valid user name and password")
    @Tag("Happy SC")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    public void loginSuccessfully(){
        new LoginScreen(driver)
                .login(websiteProperty.getProperty("username"), websiteProperty.getProperty("password"));
    }



}
