package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends BasePage {
    private By finishButton = By.id("finish");

    public NavBarComponent navBarComponent;

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
        navBarComponent = new NavBarComponent(driver);
    }

    public void clickFinishButton() {
        getDriver().findElement(finishButton).click();
    }


}
