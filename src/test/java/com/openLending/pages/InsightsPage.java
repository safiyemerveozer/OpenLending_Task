package com.openLending.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsightsPage extends OpenLendingHomePage{

    @FindBy(linkText = "Insights")
    public WebElement InsightsLink;
}
