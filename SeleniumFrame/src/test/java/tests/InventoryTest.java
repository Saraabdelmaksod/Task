package tests;

import baseTest.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import listen.Listeners;
import org.testng.annotations.Test;
import pages.LoginScreen;

import static utils.reader.ConfigHandler.websiteProperty;

public class InventoryTest extends BaseTest {
    LoginScreen loginScreen;

    @Epic("Add product to inventory")
    @Story("Add product")
    @Feature("Add Product to inventory ")
    @Test(priority = 0,retryAnalyzer = Listeners.class)
    @Description("Validate that admin user can add product Successfully with valid user name and password")
    @Tag("Happy SC")
    @Severity(SeverityLevel.CRITICAL)

    public void validateItemAdded() {

        loginScreen=   new LoginScreen(driver);
        loginScreen.login(websiteProperty.getProperty("username"), websiteProperty.getProperty("password"))
                .clickOnInventoryTab()
                .enterProductName("Test Product")
                .enterProductPrice("12")
                .clickSaveButton()
                .assertOnItemAddedSuccessfully("Item added successfully");


    }

}
