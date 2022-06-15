Feature: stockbit_login

  @Stockbit_Login
  Scenario Outline: as a user, I want to Login to my Stockbit Account
    Given I open the browser
    When I open Stockbit Login Page
    And I validate Stockbit Login Page already open
    And I set username "<Username>"
    And I set password "<Password>"
    And I click login button
    Then User success login

    Examples:
      | Username    | Password      |
      | tamtametame | tametame12345 |