package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AristSearchPage {

    public AristSearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }





    @FindBy(xpath = "(//button[@class='artist track'])[1]")
    public WebElement trackArtist;

    @FindBy(xpath = "(//a[@title='Artists'])[1]")
    public WebElement ArtistButton;

}
