package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage {
    private By checkoutCompleteContainer = By.id("checkout_complete_container");

    private NavBarComponent navBarComponent;
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        navBarComponent = new NavBarComponent(driver);
    }

    public boolean checkIfCheckoutCompleteIsDisplayed() {
        return getDriver().findElement(checkoutCompleteContainer).isDisplayed();
    }
}
