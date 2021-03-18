package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UpcomingEventPage {

    public UpcomingEventPage() {


        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//p[@class='location']")
    public List<WebElement> concertLocations;

    @FindBy(xpath = "//time")
    public List<WebElement> concertDate;

    @FindBy(xpath = "//strong[@class='item-state-tag canceled']")
    public List<WebElement> cancelled;




}
