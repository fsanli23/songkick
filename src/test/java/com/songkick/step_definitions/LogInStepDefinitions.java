package com.songkick.step_definitions;

import com.songkick.pages.HomePage;
import com.songkick.pages.LogInPage;
import com.songkick.utilities.ConfigurationReader;
import com.songkick.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogInStepDefinitions {
    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();


    @Given("user is on home page")
    public void user_is_on_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @And("user click on accept all cookies")
    public void userClickOnAcceptAllCookies() {
        logInPage.acceptCookies.click();
    }

    @When("user click on the login button")
    public void user_click_on_the_login_button() {

        homePage.logInButton1.click();

    }

    @When("user enters username")
    public void user_enters_username() {
        logInPage.userName.sendKeys(ConfigurationReader.getProperty("userName"));
    }


    @When("user enters password")
    public void user_enters_password() {
        logInPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("user click on the logIn button")
    public void user_click_on_the_log_in_button2() {
        logInPage.logInButton2.click();
    }

    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String expected) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expected, actualTitle);
    }



}
