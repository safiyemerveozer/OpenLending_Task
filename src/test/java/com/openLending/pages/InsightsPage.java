package com.openLending.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsightsPage extends OpenLendingHomePage{

    @FindBy(xpath = "//a[@class='outline-primary-link']")
    public WebElement ReadMoreLink;
}
