package com.selenium.project.PageObject;

import com.selenium.project.Generic.Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminPage extends Generic {
    WebDriver ldriver;
    public AdminPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
    WebElement Admin;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    WebElement clickDropdown;

    @FindBy(xpath = "//div[contains(@class,'oxd-select-option')]")
    List<WebElement> SelectUserrole;
   @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
   WebElement addButton;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement systemUserName;

    public void dropdown(){
        clickDropdown.click();;
    }
    public void viewAdminPage(){
        clickingonweblement(Admin);
    }
    public void SystemUserName(String sysuser){

        sendKeyesOnWebelement(systemUserName,sysuser);
    }
    public void selectUserrolename(String txt){
        test(SelectUserrole,txt);


    }
    public void clickOnAddButton(){
        clickingonweblement(addButton);
    }
}
