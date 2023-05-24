package com.openLending.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResourcesPage extends OpenLendingHomePage{

    @FindBy(linkText = "Insights")
    public WebElement InsightsLink;
}
