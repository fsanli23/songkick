package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArtistsPage {

    public ArtistsPage() {


        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//input[@placeholder='Search for artists'])[1]")
    public WebElement searchBox;



    @FindBy(xpath = "//input[@id='untrack-all-bottom']")
    public WebElement selectAllOnThisPage;


    @FindBy(xpath = "//input[@value='Untrack selected']")
    public WebElement untrackSelected;


    @FindBy(xpath = "//ul[@class='un-tracker']//li//a")
    public WebElement actual;






}
