package com.selenium.project.PageObject;

import com.selenium.project.stepdefinition.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.selenium.project.stepdefinition.Setup.driver;

public class LoginNopCommercePage  {

    WebDriver driver;

    public LoginNopCommercePage(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(id = "Email")
    @CacheLookup
    WebElement userEmail;
    @FindBy(id="Password")
    WebElement userPassword;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @FindBy(xpath = "//a[@href='/logout']")
    WebElement logOutButton;


    public void setUserEmail(String email){
        userEmail.clear();
        userEmail.sendKeys(email);
    }
       public void setUserPassword(String password) {
           userPassword.clear();
           userPassword.sendKeys(password);
       }
       public void usercliksonloginbutton(){
        loginButton.click();
       }
public void setLogOutButton(){
        logOutButton.click();
}
}