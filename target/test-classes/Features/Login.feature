Feature: Login at Bayer Prod

  Scenario: Login with valid credentials
    Given User launch the url "https://bayertrinity.com/Account/Login"
    When User enters the Username as "bayeradmin@sandydemo.com" and Password as "85790"
    And User clicks on Login button and selects the account as Company
    And User clicks on Select Account button
    Then Verify that user successfully logs in
    And User closes the browser