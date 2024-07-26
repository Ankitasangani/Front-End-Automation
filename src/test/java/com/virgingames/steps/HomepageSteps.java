package com.virgingames.steps;

import com.virgingames.pages.FreeGamesPage;
import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomepageSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @And("verify I am on Homepage")
    public void verifyIAmOnHomepage() {
        Assert.assertEquals(new HomePage().getTitle(), "Virgin Games | Play Online Betting Games With Real Money");
    }

    @When("I accept all cookies")
    public void iAcceptAllCookies() {
        new HomePage().acceptAllCookies();
    }

    @Then("I should click on Free Games")
    public void iShouldClickOnFreeGames() {
        new HomePage().clickOnFreeGames();
    }

    @Then("I should navigate successfully on Free Games Page And verify the text Virgin Games Daily Free Games")
    public void iShouldNavigateSuccessfullyOnFreeGamesPageAndVerifyTheTextVirginGamesDailyFreeGames() {
        Assert.assertEquals(new FreeGamesPage().verifyTheText(), "Virgin Games Daily Free Games");
    }

}
