package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage extends BasePage {

    private By checkout = By.cssSelector("[data-test='checkout']");
    public NavBarComponent navBarComponent;
    public YourCartPage(WebDriver driver) {
        super(driver);
        navBarComponent = new NavBarComponent(driver);
    }

    public void clickCheckout() {
        getDriver().findElement(checkout).click();
    }


}
