Feature: LoginNopCommerce
@Sanity
  Scenario: Login With Valid credentials
    Given  User is on NopCommerce
    When  User enters email as "admin@yourstore.com" and password as "admin"
    And User clicks on login button
    Then Page title should be "Dashboard / nopCommerce administration"
    When User clicks on log log out link
    Then Page title should be "Your store. Login"
@Regression
  Scenario Outline: Login With Valid credentials
    Given  User is on NopCommerce
    When  User enters email as "<email>" and password as "<password>"
    And User clicks on login button
    Then Page title should be "<title1>"
    When User clicks on log log out link
    Then Page title should be "<title2>"
    Examples:
      | email               | password | title1                                 | title2            |  |
      | admin@yourstore.com | admin    | Dashboard / nopCommerce administration | Your store. Login |  |