package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationsPage {


    public LocationsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Search for locations']")
    public WebElement searchForYourLocationBox;


    @FindBy(xpath = "//input[@name='commit']")
    public WebElement searchButton;





















}
