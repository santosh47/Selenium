package com.selenium.project.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;
import java.util.logging.Logger;

public class NewCustomePage {


    public NewCustomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[contains(text(),'New Customer')]")
    WebElement NewCutomer;

    @FindBy(xpath = "//tbody/tr[4]/td[2]/input[1]")
    WebElement customerName;

    @FindBy(xpath = "//tbody/tr[5]/td[2]/input[1]")
    WebElement gender;

    @FindBy(xpath = "//input[@id='dob']")
    WebElement dob;

    @FindBy(xpath = "//tbody/tr[7]/td[2]/textarea[1]")
    WebElement address;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "state")
    WebElement state;

    @FindBy(name = "pinno")
    WebElement pinno;

    @FindBy(name = "telephoneno")
    WebElement telePhoneNumber;

    @FindBy(name ="emailid")
    WebElement emailid;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "sub")
    WebElement submit;

    public void newCustomer() {

        NewCutomer.click();
    }
    public void Setcustomername(String cusname) {
        customerName.sendKeys(cusname);
    }
    public void SelectGender() {
        gender.click();
    }
    public void SelectDob(String date,String month,String year) {
        dob.sendKeys(date);
        dob.sendKeys(month);
        dob.sendKeys(year);
    }
    public void EnterAddress(String Address) {
        address.sendKeys(Address);
    }
    public void SelectCity(String cityname) {
        city.sendKeys(cityname);
    }

    public void setState(String statename) {
        state.sendKeys(statename);
    }
    public void setPinno(String pin) {
        pinno.sendKeys(pin);
    }
    public void setTelePhoneNumber(String phoneNumber) {

        telePhoneNumber.sendKeys(phoneNumber);
    }

    public void setEmailid(String email) {
        emailid.sendKeys(email);
    }


    public void setPassword(String pass) {
      password.sendKeys(pass);
    }

    public void Submit() {

        submit.click();
    }

}
