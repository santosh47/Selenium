package com.selenium.project.stepdefinition;

import com.selenium.project.PageObject.LoginNopCommercePage;
import com.selenium.project.config.ReadConfig;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import  static com.selenium.project.stepdefinition.BaseClass.*;
import java.util.logging.Logger;

public class NopCommerceRegistrationPage {

    @And("User Clicks on Registraion Button")
    public void userClicksOnRegistraionButton() {
    // page = new LoginNopCommercePage(driver);
     driver.findElement(By.xpath("//div[@class='home-banner-button']//a[@class='btn blue-button'][normalize-space()='Get started']")).click();
    }
}
