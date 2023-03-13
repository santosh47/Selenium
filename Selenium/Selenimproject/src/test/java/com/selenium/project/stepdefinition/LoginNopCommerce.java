package com.selenium.project.stepdefinition;

import com.selenium.project.PageObject.LoginNopCommercePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import  static com.selenium.project.stepdefinition.Setup.*;

import java.util.logging.Logger;

public class LoginNopCommerce {
    @Given("User is on NopCommerce")
    public void user_is_on_nop_commerce() {

        driver.get(url);
        driver.manage().window().maximize();
    }


    @When("User enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email,String password) throws InterruptedException {
     loginNopCommercePagepage = new LoginNopCommercePage(driver);
     loginNopCommercePagepage.setUserEmail(email);
     loginNopCommercePagepage.setUserPassword(password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
      loginNopCommercePagepage.usercliksonloginbutton();
        Thread.sleep(5000);
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {
        if(driver.getPageSource().contains("Login was unsuccessfu")) {
            driver.close();
            Assert.assertTrue(false);
            System.out.println(title);
        }
        else{
            Assert.assertEquals(title,driver.getTitle());


        }


    }

    @When("User clicks on log log out link")
    public void user_clicks_on_log_log_out_link() {
       loginNopCommercePagepage.setLogOutButton();
    }


}

