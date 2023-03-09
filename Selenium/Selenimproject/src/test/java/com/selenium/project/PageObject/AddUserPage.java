package com.selenium.project.PageObject;

import com.selenium.project.Generic.Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Generic {

    WebDriver ldriver;
    public AddUserPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

 @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
     WebElement dropdown;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement seleUser;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement selectStatus;

    @FindBy(xpath ="//input[@type='password' and @Class='oxd-input oxd-input--focus oxd-input--error']")
    WebElement password;
    @FindBy(xpath ="//input[@placeholder='Type for hints...']")
    WebElement empoyeeName;
    @FindBy(xpath ="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement userName;

    @FindBy(xpath ="//input[@class='oxd-input oxd-input--active' and @type='password']")
    WebElement confirmPassword;

    @FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and @type='submit']")
    WebElement saveUser;




    public void selectdropdown(){
        dropdown.click();
    }
    public void setSelectStatus(String txt){
        //selectOpetionFromDropDown(seleUser,txt);
    }


    public void userPassword(String txt){

        sendKeyesOnWebelement(password,txt);
    }

    public void enterEmployeeName(String txt){

        sendKeyesOnWebelement(empoyeeName,txt);
    }

    public void enterUserName(String txt) {
        sendKeyesOnWebelement(userName,txt);
    }


    public void enterPassword(String txt) {
        sendKeyesOnWebelement(confirmPassword,txt);
    }


    public void saveUser() {
        clickingonweblement(saveUser);
    }
}
