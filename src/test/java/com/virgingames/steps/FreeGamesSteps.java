package com.virgingames.steps;

import com.virgingames.pages.FreeGamesPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class FreeGamesSteps {
    @And("I should see the text Virgin Games Daily Free Games")
    public void iShouldSeeTheTextVirginGamesDailyFreeGames() {
        Assert.assertEquals(new FreeGamesPage().verifyTheText(), "Virgin Games Daily Free Games");
    }
}
