Feature: TestSigma Signup
  As a New User 
  I want to signup my account
  So that i can access my account

 
  Scenario: Successfully signup with user details
    Given I am on the Testsigma Login page
    Given Click on try for free
    When I enter my user name and details
   When i entered my Email
    Then Select Country Code
   And Enter the Phone Number
    Then Select a reason
    And click on checkbox for which application
    Then click on submit
    Then Close the Browser


