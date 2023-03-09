Feature: LoginNopCommerce
  Scenario: Login With Valid credentials
    Given  User is on NopCommerce
    And  User enters Email  and password
    And User clicks on login button
Then User can view Dashboard
When User click on customer Menu
And Click on customer Menu Item
And Click on add new button
And User can view Add new customer page
And User enter customer info
And Click on Save button
And User can view confirmation message "The new customer has been added successfully."
