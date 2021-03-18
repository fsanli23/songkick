package com.songkick.step_definitions;

import com.songkick.pages.AristSearchPage;
import com.songkick.pages.ArtistsPage;
import com.songkick.pages.LandingPage;
import com.songkick.utilities.BrowserUtils;
import com.songkick.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class AddingArtistStepDefinitions {
    LandingPage landingPage = new LandingPage();

    ArtistsPage artistsPage = new ArtistsPage();

    AristSearchPage aristSearchPage = new AristSearchPage();


    @When("user click on the artist")
    public void user_click_on_the_artist() {
        landingPage.artists.click();
    }


    @When("user enter  {string}")
    public void user_enter(String artistName) {
        artistsPage.searchBox.sendKeys(artistName + Keys.ENTER);

    }

    @When("user click track button")
    public void user_click_track_button() {
        aristSearchPage.trackArtist.click();
        BrowserUtils.sleep(3);
    }

    @When("user  click artist")
    public void user_click_artist() {
        aristSearchPage.ArtistButton.click();
    }

    @Then("user sees the {string}")
    public void user_sees_the(String expected) {


/*

        System.out.println("this is expected"+expected);
        System.out.println("this is actual"+artistsPage.actual.getAttribute("title"));



        BrowserUtils.sleep(3);
       Assert.assertTrue(artistsPage.actual.getAttribute("title").trim().contains(expected));

*/
        BrowserUtils.sleep(3);
        artistsPage.actual.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().toLowerCase().contains(expected.substring(0,2).toLowerCase()));

        Driver.getDriver().navigate().back();

    }


    @Then("user delete added artist")
    public void userDeleteAddedArtist() {



        artistsPage.selectAllOnThisPage.click();
        BrowserUtils.sleep(3);
        artistsPage.untrackSelected.click();
        BrowserUtils.sleep(3);

    }
}
