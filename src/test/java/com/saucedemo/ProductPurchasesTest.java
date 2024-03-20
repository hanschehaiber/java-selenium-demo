package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.junit.Assert;

public class ProductPurchasesTest extends TestBase {
    @Test
    public void testing() {
        driver.get("https://www.saucedemo.com");
        WebElement element = driver.findElement(By.id("user-name"));
        element.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.cssSelector("[data-test='checkout']")).click();
        driver.findElement(By.id("first-name")).sendKeys("Jean-luc");
        driver.findElement(By.id("last-name")).sendKeys("Picard");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        boolean checkoutCompleteContainerDisplayed = driver.findElement(By.id("checkout_complete_container")).isDisplayed();
        Assert.assertTrue(checkoutCompleteContainerDisplayed);
    }
}
