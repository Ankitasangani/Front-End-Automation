package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(css = "label[for='privacy_pref_optin']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Free Games')]")
    WebElement freeGames;

    public String getTitle() {
        return driver.getTitle();
    }

    public void acceptAllCookies() {
        clickOnElement(acceptCookies);
    }

    public void clickOnFreeGames() {
        clickOnElement(freeGames);
    }
}
