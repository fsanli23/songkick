package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConcertSearchPage {

    public ConcertSearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);


    }


    @FindBy(xpath = "//a[@href='/search?page=1&per_page=10&query=halsey&type=upcoming']")
   public WebElement upcomingEvent;









}
