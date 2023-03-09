package com.selenium.project.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  static com.selenium.project.stepdefinition.BaseClass.*;

import java.util.logging.Logger;

public class LoginNopCommerce {
    @Given("User is on NopCommerce")
    public void user_is_on_nop_commerce() {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("User enters Email  and password")
    public void user_enters_email_as_and_password_as() throws InterruptedException {

       WebElement userEmail= driver.findElement(By.id("Email"));
       userEmail.clear();
       userEmail.sendKeys("admin@yourstore.com");
       WebElement userPassword= driver.findElement(By.id("Password"));
       userPassword.clear();
       userPassword.sendKeys("admin");


    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        WebElement loginButton= driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginButton.click();
        Thread.sleep(5000);
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String string) {

    }

    @When("User clicks on log log out link")
    public void user_clicks_on_log_log_out_link() {
        driver.findElement(By.xpath("//span[@class='user-actions-ico']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/ul/li[4]/ul/li[3]/a/span")).click();
    }

}

