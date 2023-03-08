package com.selenium.project.PageObject;

import com.selenium.project.modules.Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrmsLoginPage extends Generic {
    WebDriver ldriver;
    public HrmsLoginPage(WebDriver rdriver) {
     ldriver=rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(name ="username")
    WebElement huserId;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement huserPass;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
    WebElement hclickOnLoginButton;

    public void Setusernameh(String name){

        huserId.sendKeys(name);
    }

    public void Setuserpasswordh(String Password) {

        huserPass.sendKeys(Password);
    }
    public void clickOnLoginButtonh() {

        clickingonweblement(hclickOnLoginButton);

    }
}

