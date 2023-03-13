package com.selenium.project.stepdefinition;

import com.selenium.project.Generic.Generic;
import com.selenium.project.PageObject.CustomerNopCommercePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import  static com.selenium.project.stepdefinition.Setup.*;
public class CustomerNopCommerce extends Generic{


    @Then("User can view Dashboard")
    public void userCanViewDashboard() {

        customerNopCommerce = new CustomerNopCommercePage(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration",customerNopCommerce.getPageTitle());
        customerNopCommerce.ViewCustomerMenu();

    }

    @When("User click on customer Menu")
    public void userClickOnCustomerMenu() {
        customerNopCommerce.customerMenu();
    }



    @And("Click on add new button")
    public void clickOnAddNewButton() {
        customerNopCommerce.clickonaddbutton();

    }

    @And("User can view Add new customer page")
    public void userCanViewAddNewCustomerPage() {
        Assert.assertEquals("Add a new customer / nopCommerce administration",customerNopCommerce.getPageTitle());
        
    }

    @And("User enter customer info")
    public void userEnterCustomerInfo() {

       String email= randomstring()+"@gmail.com";
        customerNopCommerce.entercustomeremail(email);
        customerNopCommerce.cutomeName("dhs");
        customerNopCommerce.custLastName("dhdb");
        customerNopCommerce.custpassword("36gd");
        customerNopCommerce.taxtexmp();
        customerNopCommerce.custgender();
        customerNopCommerce.cuscompanyname("dd");
        customerNopCommerce.customerrole("user");
        customerNopCommerce.custdob();

    }

    @And("Click on Save button")
    public void clickOnSaveButton() throws InterruptedException {

        customerNopCommerce.savecustinfo();
        Thread.sleep(6000);

    }

    @And("User can view confirmation message {string}")
    public void userCanViewConfirmationMessage(String message) {
        driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully.");
    }

    @And("Click on customer Menu Item")
    public void clickOnCustomerMenuItem() {

    }

}
