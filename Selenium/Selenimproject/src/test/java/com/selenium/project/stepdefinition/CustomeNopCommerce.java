package com.selenium.project.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import  static com.selenium.project.stepdefinition.BaseClass.*;
public class CustomeNopCommerce {
    @Then("User can view Dashboard")
    public void userCanViewDashboard() {

        WebElement viewDashboard = driver.findElement(By.xpath("//p[normalize-space()='Dashboard']"));
        viewDashboard.click();
    }

    @When("User click on customer Menu")
    public void userClickOnCustomerMenu() {
        WebElement viewCustomerMenu = driver.findElement(By.xpath("//a[@href='#']//p[contains(text(),'Customers')]"));
        viewCustomerMenu.click();
    }



    @And("Click on add new button")
    public void clickOnAddNewButton() {
        WebElement CustomerMenu = driver.findElement(By.xpath(" //a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]"));
        CustomerMenu.click();

    }

    @And("User can view Add new customer page")
    public void userCanViewAddNewCustomerPage() {
        
    }

    @And("User enter customer info")
    public void userEnterCustomerInfo() {
        
    }

    @And("Click on Save button")
    public void clickOnSaveButton() {
        
    }

    @And("User can view confirmation message {string}")
    public void userCanViewConfirmationMessage(String arg0) {
    }

    @And("Click on customer Menu Item")
    public void clickOnCustomerMenuItem() {
    }
}
