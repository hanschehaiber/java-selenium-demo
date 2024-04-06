package com.saucedemo;

import com.saucedemo.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.junit.Assert;

public class ProductPurchasesTest extends TestBase {
    @Test
    public void singleItemPurchaseTest() {
        String username = "standard_user";
        String password = "secret_sauce";
        String firstName = "Jean-luc";
        String lastName = "Picard";
        String postalCode = "12345";

        driver.get("https://www.saucedemo.com");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickAddBackpackToCart();
        productsPage.navBarComponent.clickShoppingCart();

        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.clickCheckout();

        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);
        checkoutInfoPage.submitCheckoutInfo(firstName, lastName, postalCode);

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.clickFinishButton();

        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
        checkoutCompletePage.checkIfCheckoutCompleteIsDisplayed();

        boolean checkoutCompleteContainerDisplayed = checkoutCompletePage.checkIfCheckoutCompleteIsDisplayed();
        Assert.assertTrue(checkoutCompleteContainerDisplayed);
    }
}
