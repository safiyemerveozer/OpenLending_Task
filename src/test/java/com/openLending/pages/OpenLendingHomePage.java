package com.openLending.pages;

import com.openLending.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class OpenLendingHomePage {
    public OpenLendingHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Resources")
    public WebElement resources;
}
