package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    LogInPage logInPage = new LogInPage();


    public LandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='discover-nav-link'])[1]")
    public WebElement yourLocations;


    @FindBy(xpath = "//a[@data-target='#location-dropdown']")
    public WebElement locations;


    @FindBy(xpath = "(//a[@href='/tracker/metro_areas'])[1]")
    public WebElement trackedLocation;

    @FindBy(xpath = "(//a[@title='Artists'])[1]")
    public WebElement artists;


    @FindBy(xpath = "(//input[@placeholder='Find concerts for any artist or city'])[1]")
    public WebElement findConcertBox;









}
