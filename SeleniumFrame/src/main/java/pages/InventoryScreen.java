package pages;

import bot.ActionBot;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InventoryScreen {

    private WebDriver driver;
    private ActionBot actionBot;
    private final By productNameFiled =By.xpath("");
    private final By productPriceFiled =By.xpath("");
    private final By saveButton =By.xpath("");
    private final By successToastMessage=By.xpath("");

    public InventoryScreen(WebDriver driver){
        this.driver=driver;
        actionBot= new ActionBot(driver);
    }

    @Step("Admin user enter product name")
    public InventoryScreen enterProductName(String productName){
        actionBot.sendKey(productNameFiled,productName);
        return this;
    }

    @Step("Admin user enter price name")
    public InventoryScreen enterProductPrice(String productPrice){
        actionBot.sendKey(productPriceFiled,productPrice);
        return this;
    }

    @Step("Admin user click on save button")
    public InventoryScreen clickSaveButton(){
        actionBot.click(saveButton);
        return this;
    }

    @Step("Admin user assert on item added successfully")
    public void assertOnItemAddedSuccessfully(String expectedSuccessMessage){
        Assert.assertEquals(actionBot.getText(successToastMessage),expectedSuccessMessage);
    }


}
