package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    private By addBackpackToCart = By.id("add-to-cart-sauce-labs-backpack");
    public NavBarComponent navBarComponent;

    public ProductsPage(WebDriver driver) {
        super(driver);
        navBarComponent = new NavBarComponent(driver);
    }

    public void clickAddBackpackToCart() {
       getDriver().findElement(addBackpackToCart).click();
    }

}
