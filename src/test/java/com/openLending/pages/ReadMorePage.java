package com.openLending.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReadMorePage extends OpenLendingHomePage{

    @FindBy(tagName = "h4")
    public List<WebElement> allBlogs;
}
