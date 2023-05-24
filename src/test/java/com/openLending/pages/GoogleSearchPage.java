package com.openLending.pages;

import com.openLending.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBar;

    @FindBy(xpath = "(//img[@class='XNo5Ab'])[1]")
    public WebElement OpenLendingImage;
}
