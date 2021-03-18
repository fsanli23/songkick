package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscoverPage {
    public DiscoverPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='button-text'])[1]")
    public WebElement interested;

    @FindBy(xpath = "(//div[@class='overlay'])[1]")
    public WebElement eventTitle;

    @FindBy(xpath = "(//a[@title='Plans'])[1]")
    public WebElement plans;











}
