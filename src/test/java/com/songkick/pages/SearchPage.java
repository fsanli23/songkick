package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {


    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='metro-area track'])[1]")
    public WebElement trackLocation;


    @FindBy(xpath = "(//a[@title='Discover'])[1]")
    public WebElement discover;


    @FindBy(xpath = "(//p[@class='summary'])[1]//a")
    public WebElement Citybutton;






















}
