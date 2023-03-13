Feature: Saerc Customer
  @Regression
  Scenario: Search Customer using emailid
    Given  User is on NopCommerce
    When  User enters email as "admin@yourstore.com" and password as "admin"
    And User clicks on login button
    Then User can view Dashboard
    When User click on customer Menu
    And Click on customer Menu Item
    And Enter customer Email
    And Click on search button
    Then User should found Email in the saerc table