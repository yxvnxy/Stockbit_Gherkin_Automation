Feature: client_portal_login

  @ClientPortal_Login
  Scenario Outline: as a user, I want to Login to my Client Portal Testing Account
    Given I open the browser
    When I open client portal Login Page
    And I validate client portal Login Page already open
    And I set email "<email>"
    And I set password "<Password>"
    And I click login button
    Then User success login

    Examples:
      | email    | Password      |
      | general-testing-account@stickearn.com | password |