package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConcertInPage {

    public ConcertInPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Tonight")
    public WebElement tonight;


    @FindBy(xpath = "(//h1)[1]")
    public WebElement concertInHeader;





}
