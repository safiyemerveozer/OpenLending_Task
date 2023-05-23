@us01
Feature: verify no duplicate blog entries

  Scenario: Verify no duplicate blog entries
    Given user on the Google page
    And user search for "Open Lending" in google search box
    And user verify title is "Open Lending - Google Search"
    And user click Automated Lending Platform | Open Lending | United States image
    And user verify title is "Automated Lending Platform | Open Lending | United States"
    And user click Resources on the top bar
    And user click Insights on the middle bar
    And user click Read More
    And user verify title is "3 Initial Findings From Our Recent Lending Enablement Benchmark Survey - Open Lending"
    Then Verify there are no duplicate blog entries