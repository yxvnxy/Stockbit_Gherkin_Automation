Feature: stockbit_register

  @Stockbit_Register
  Scenario Outline: as a user, I want to Register Stockbit Account
    Given I open the browser
    When I open Stockbit Register Page
    And I validate Stockbit register button
    And I click register page button
    And I validate stockbit register page
    And I set name "<Name>"
    And I set email "<Email>"
    And I set registration username "<Username>"
    And I set registration password "<Password>"
    And I set confirm registration password "<Password>"
    And I click register button
    Then User success register

    Examples:
      | Name  | Email                     |  Username    | Password      |
      | Tame  | pratama.ardikaa@gmail.com | tamtametame  | tametame12345 |