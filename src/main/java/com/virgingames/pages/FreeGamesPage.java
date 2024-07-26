package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FreeGamesPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Virgin Games Daily Free Games')]")
    WebElement text;

    public String verifyTheText() {
        return getTextFromElement(text);
    }
}
