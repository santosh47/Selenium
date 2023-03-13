package com.selenium.project.PageObject;
import com.selenium.project.Generic.Generic;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import javax.xml.xpath.XPath;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginPage extends Generic {
WebDriver ldriver;
    public LoginPage(WebDriver rdriver) {
ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }
    @FindBy(xpath = "//tbody/tr[1]/td[2]/input[1]")
    WebElement userId;
    @FindBy(xpath = "//tbody/tr[2]/td[2]/input[1]")
    WebElement userPass;
    @FindBy(xpath = "//tbody/tr[3]/td[2]/input[1]")
    WebElement clickOnLoginButton;
    @FindBy(linkText = "Log out")
    WebElement logOut;
    @FindBy(xpath = "//ul[@class='dropdown-menu']/li/a")
    List<WebElement> seleniumdropdown;

    public void setSeleniumdropdown(String txt){

        test(seleniumdropdown,txt);
    }
    public void Setusername(String name){
        userId.sendKeys(name);
    }

    public void Setuserpassword(String Password) {
        userPass.sendKeys(Password);
    }
    public void clickOnLoginButton() {
        clickOnLoginButton.click();


    }

    public void setLogOut() {
       logOut.click();
    }
}
