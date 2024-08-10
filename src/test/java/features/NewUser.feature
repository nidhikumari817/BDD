Feature: New User View

  Scenario: Validate new user is able to view after clicking on new Registration
    Given User navigates to login page
    When User clicks on New Registration button
    And User should be able to view the Registration page
    Then User should be able to view the product category page