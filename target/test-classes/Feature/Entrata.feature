@EntrataIndia
Feature: Testing Entrata Website Functionality

  @title
  Scenario: Verify Home Page Title
    Given User is on the Entrata website
    When User navigates to the home page
    Then Home Page Title should be Entrata

  @home
  Scenario: Check the functionality of Entrata
    Given user is on the home page
    When user goes to products option
    And click on the Property Management
    Then navigated sucessfully

  @scroll
  Scenario: Check the functinality of Learn More
    Given user is on the home page of entrata
    When scrolled down
    And click on the learn more
    Then sucessfully navigated

  @resource
  Scenario: Check the functinality of Learn More
    Given user is on home page of entrata
    When click on the resources
    And click on the read more
    And click on the get the guide
    Then sucessfully navigated

  @demo
  Scenario Outline: Watch Demo with User Information
    Given user is on home page
    When user enters <First Name>, <Last Name>, <Email>, <Company Name>, <Phone Number>, <Unit Count>, and <Job Title>
    Then user clicks on Watch Demo

    Examples: 
      | First Name | Last Name | Email                  | Company Name | Phone Number | Unit Count | Job Title |
      | Arti       | Kunde     | arti.email@example.com | Entrata      |   1234567890 |          5 | SE        |
