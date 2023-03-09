package com.selenium.project.PageObject;

import com.selenium.project.stepdefinition.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginNopCommercePage  {

    WebDriver driver;

    public LoginNopCommercePage(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
}