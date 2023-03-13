package com.selenium.project.PageObject;

import com.selenium.project.TestCases.BaseClasss;
import com.selenium.project.stepdefinition.BaseClass;
import com.selenium.project.stepdefinition.SearchCustomerNopCommercePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.logging.Logger;

import static com.selenium.project.stepdefinition.Setup.driver;
import static com.selenium.project.stepdefinition.BaseClass.searchCustomerNopCommercePage;

public class SearchCustomerNopCommerce extends BaseClass {
    @And("Enter customer Email")
    public void enter_customer_email() {

        searchCustomerNopCommercePage =new SearchCustomerNopCommercePage(driver);
       searchCustomerNopCommercePage.setSearchEmali("brenda_lindgren@nopCommerce.com");
    }

    @And("Click on search button")
    public void click_on_search_button() throws InterruptedException {
        searchCustomerNopCommercePage.clicksearch();
        Thread.sleep(6000);

    }

    @Then("User should found Email in the saerc table")
    public void user_should_found_email_in_the_saerc_table() {
        boolean status= searchCustomerNopCommercePage.searchCustomerByEmail("brenda_lindgren@nopCommerce.com");
        Assert.assertEquals(true,status);
    }

    @And("Enter customer fname")
    public void enterCustomerFname() {
        searchCustomerNopCommercePage =new SearchCustomerNopCommercePage(driver);
        searchCustomerNopCommercePage.setSearchFirstName("Pravin");
    }

    @And("Enter customer lname")
    public void enterCustomerLname() {

        searchCustomerNopCommercePage.setSearchLastName("Kadam");
    }

    @Then("User should found name in the search table")
    public void userShouldFoundNameInTheSearchTable() {
        boolean status=  searchCustomerNopCommercePage.searchCustomerByfnlName("Pravin Kadam");
        Assert.assertEquals(true,status);
    }
}
