package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //No page variable here needed, its in the BasePage!

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        fillUsername(username);
        fillPassword(password);
        clickLoginButton();
    }

    public void fillUsername(String username) {
        getDriver().findElement(this.username).sendKeys(username);
    }

    public void fillPassword(String password) {
        getDriver().findElement(this.password).sendKeys(password);
    }

    public void clickLoginButton() {
        getDriver().findElement(loginButton).click();
    }




}
