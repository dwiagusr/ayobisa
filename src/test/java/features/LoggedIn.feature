Feature: LoggedIn User View

  Scenario: Validate user is able to view after Login
    Given User navigates to the Login page
    When User enters valid credentials
    And User clicks on the Login button
    Then User should be able to view the Home page