package pages;

import bot.ActionBot;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen {

    private WebDriver driver;
    private ActionBot actionBot;

    private final By inventoryTab= By.cssSelector("#add-to-cart-sauce-labs-backpack");

    public HomeScreen(WebDriver driver){
        this.driver= driver;
        actionBot= new ActionBot(driver);
    }

    @Step("Admin user click on inventory Tab")
    public InventoryScreen clickOnInventoryTab(){
        actionBot.click(inventoryTab);
        return new InventoryScreen(driver);
    }
}
