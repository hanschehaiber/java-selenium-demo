package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
