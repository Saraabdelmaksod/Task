package pages;

import bot.ActionBot;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScreen {

    // variable
    private WebDriver driver;
    private ActionBot actionBot;


    private final By userName=By.id("user-name");
    private final By password=By.id("password");
    private final By loginButton=By.id("login-button");

    // constractor
    public LoginScreen(WebDriver driver){
        this.driver=driver;
        actionBot= new ActionBot(driver);
    }

    // actions (methods)
    @Step("Admin user login with user and password")
    public HomeScreen login(String user, String pass){
        actionBot.sendKey(userName,user );
        actionBot.sendKey(password,pass );
        actionBot.click(loginButton);
        return new HomeScreen(driver);
    }




}
