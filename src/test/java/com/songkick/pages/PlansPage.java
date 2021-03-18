package com.songkick.pages;

import com.songkick.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlansPage {

    public PlansPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//p[@class='artists summary'])[1]")
    public WebElement artistSummary;

    @FindBy(xpath = "(//img[@alt='Close'])[2]")
    public WebElement closeAlert;

}
