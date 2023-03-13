Feature: LoginNopCommerce
  Scenario: Login With Valid credentials
    Given  User is on NopCommerce
    When  User enters email as "admin@yourstore.com" and password as "admin"
    And User clicks on login button
    Then User can view Dashboard
When User click on customer Menu
And Click on customer Menu Item
And Click on add new button
And User can view Add new customer page
And User enter customer info
And Click on Save button
And User can view confirmation message "The new customer has been added successfully."

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

  Scenario: Search Customer using first, last name
    Given  User is on NopCommerce
    When  User enters email as "admin@yourstore.com" and password as "admin"
    And User clicks on login button
    Then User can view Dashboard
    When User click on customer Menu
    And Click on customer Menu Item
    And Enter customer fname
    And Enter customer lname
    And Click on search button
    Then User should found name in the search table