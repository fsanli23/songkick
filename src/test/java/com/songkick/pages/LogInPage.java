package com.songkick.pages;

import com.songkick.step_definitions.LogInStepDefinitions;
import com.songkick.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LogInPage {

    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@name='username_or_email']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logInButton2;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptCookies;

    @Test
    public   void logIn()  {

        LogInStepDefinitions logInStepDefinitions = new LogInStepDefinitions();
        logInStepDefinitions.user_is_on_home_page();
        logInStepDefinitions.userClickOnAcceptAllCookies();
        logInStepDefinitions.user_click_on_the_login_button();
        logInStepDefinitions.user_enters_username();
        logInStepDefinitions.user_enters_password();
        logInStepDefinitions.user_click_on_the_log_in_button2();




    }


}
