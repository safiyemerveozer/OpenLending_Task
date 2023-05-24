package com.openLending.steps;

import com.openLending.pages.*;
import com.openLending.utility.ConfigReader;
import com.openLending.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class us01_StepDefinition extends OpenLendingHomePage {
    @Given("user on the Google page")
    public void user_on_the_google_page() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    @Given("user search for {string} in google search box")
    public void user_search_for_in_google_search_box(String searchValue) {
        googleSearchPage.searchBar.sendKeys(searchValue+ Keys.ENTER);
    }
    @Given("user verify title is {string}")
    public void user_verify_title_is(String expectedTitle) {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("user click Automated Lending Platform | Open Lending | United States image")
    public void user_click_automated_lending_platform_open_lending_united_states_image() {
        googleSearchPage.OpenLendingImage.click();

        Driver.getDriver().findElement(By.xpath("//button[@class='cmplz-btn cmplz-accept']")).click();

    }
    @Given("user click Resources on the top bar")
    public void user_click_resources_on_the_top_bar() {
        resources.click();

    }
    ResourcesPage resourcesPage=new ResourcesPage();
    @Given("user click Insights on the middle bar")
    public void user_click_insights_on_the_middle_bar() {
        resourcesPage.InsightsLink.click();
    }
    InsightsPage insightsPage=new InsightsPage();
    @Given("user click Read More")
    public void user_click_read_more() {
        insightsPage.ReadMoreLink.click();
    }

    ReadMorePage readMorePage=new ReadMorePage();
    @Then("Verify there are no duplicate blog entries")
    public void verify_there_are_no_duplicate_blog_entries() {

        List<String> allBlogs=new ArrayList<>();
        Set<String> allBlogsNoDup=new HashSet<>();
        for (WebElement each : readMorePage.allBlogs) {
            allBlogs.add(each.getText());
            allBlogsNoDup.add(each.getText());
        }
        Assert.assertTrue(allBlogs.size()==allBlogsNoDup.size());


    }

}
