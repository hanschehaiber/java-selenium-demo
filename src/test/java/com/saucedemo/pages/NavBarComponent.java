package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavBarComponent extends BasePage {
    private By shoppingCartContainer = By.id("shopping_cart_container");

    public NavBarComponent(WebDriver driver) {
        super(driver);
    }

    public void clickShoppingCart() {
        getDriver().findElement(shoppingCartContainer).click();
    }
}
