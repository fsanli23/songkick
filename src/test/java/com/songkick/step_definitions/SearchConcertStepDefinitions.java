package com.songkick.step_definitions;

import com.songkick.pages.*;
import com.songkick.utilities.BrowserUtils;
import com.songkick.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchConcertStepDefinitions {
    LogInPage logInPage = new LogInPage();
    LandingPage landingPage = new LandingPage();
    SearchPage searchPage = new SearchPage();
    LocationsPage locationsPage = new LocationsPage();
    DiscoverPage discoverPage = new DiscoverPage();
    PlansPage plansPage = new PlansPage();
    ConcertInPage concertInPage = new ConcertInPage();


    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        logInPage.logIn();
    }


    @When("user click  on locations1")
    public void user_click_on_locations1() {
        landingPage.locations.click();

    }


    @When("user click on tracked_location")
    public void user_click_on_tracked_location() {
        landingPage.trackedLocation.click();

    }


    @When("user search city {string}")
    public void user_search_city(String city) {
        locationsPage.searchForYourLocationBox.sendKeys(city + Keys.ENTER);

    }


    @When("user click the track_location")
    public void user_click_the_track_location() {
        searchPage.trackLocation.click();

    }


    @When("user click on the traked city")
    public void userClickOnTheTrakedCity() {
        BrowserUtils.sleep(2);
        searchPage.Citybutton.click();


    }


    @When("user click on the tonight")
    public void userClickOnTheTonight() {
        BrowserUtils.sleep(1);

        Driver.getDriver().findElement(By.xpath("(//img[@alt='Close'])[2]")).click();

        concertInPage.tonight.click();
    }


    @Then("user sees {string}")
    public void userSees(String str) {

        Assert.assertTrue(concertInPage.concertInHeader.getText().equalsIgnoreCase(str));


    }
}

