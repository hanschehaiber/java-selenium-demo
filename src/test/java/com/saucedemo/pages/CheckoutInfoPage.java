package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoPage extends BasePage {
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");

    private By continueButton = By.id("continue");
    public NavBarComponent navBarComponent;
    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
        navBarComponent = new NavBarComponent(driver);
    }

    public void submitCheckoutInfo(String firstName, String lastName, String postalCode) {
        fillFirstName(firstName);
        fillLastName(lastName);
        fillPostalCode(postalCode);
        clickContinueButton();
    }

    public void clickContinueButton() {
        getDriver().findElement(continueButton).click();
    }

    public void fillFirstName(String firstName) {
        getDriver().findElement(this.firstName).sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        getDriver().findElement(this.lastName).sendKeys(lastName);
    }

    public void fillPostalCode(String postalCode) {
        getDriver().findElement(this.postalCode).sendKeys(postalCode);
    }



}
