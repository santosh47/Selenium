package com.selenium.project.PageObject;

import com.selenium.project.Generic.Generic;
import com.selenium.project.stepdefinition.BaseClass;
import com.selenium.project.stepdefinition.SearchCustomerNopCommercePage;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem;

import java.util.List;

import static com.selenium.project.stepdefinition.Setup.driver;
import static com.selenium.project.stepdefinition.BaseClass.searchCustomerNopCommercePage;

public class CustomerNopCommercePage extends Generic {

    WebDriver driver;

    public CustomerNopCommercePage(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    By viewCustomerMenu = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
    By CustomerMenu = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
    By addNewButton = By.xpath("//a[normalize-space()='Add new']");
    By custEmail = By.xpath("//input[@id='Email']");
    By custpassword = By.xpath("//input[@id='Password']");
    By custName = By.xpath("//input[@id='FirstName']");
    By custLastName = By.xpath("//input[@id='LastName']");
    By custGender = By.xpath("//div[@class='form-check']");
    By cuscompanyname = By.xpath("//input[@id='Company']");
    By taxexemp = By.xpath("//input[@id='IsTaxExempt']");
    @FindBy(xpath = "//div[@class='input-group-append input-group-required']//div[@class='k-widget k-multiselect k-multiselect-clearable']")
    List<WebElement> cutRole;
    @FindBy (xpath = "//button[@name='save']")
    WebElement saveCustInfo;
By custdob = By.xpath("//input[@id='DateOfBirth']");
    //Action

    public String getPageTitle(){
        return driver.getTitle();
    }
    public void ViewCustomerMenu() {
        driver.findElement(viewCustomerMenu).click();
    }

    public void customerMenu() {
        driver.findElement(CustomerMenu).click();
    }

    public void clickonaddbutton() {
        driver.findElement(addNewButton).click();
    }

    public void entercustomeremail(String email) {

        driver.findElement(custEmail).sendKeys(email);
    }

    public void cutomeName(String name) {
        driver.findElement(custName).sendKeys(name);

    }

    public void custLastName(String lname) {
        driver.findElement(custLastName).sendKeys(lname);
    }

    public void custpassword(String cuspass) {
        driver.findElement(custpassword).sendKeys(cuspass);
    }

    public void customerrole(String role) {

        test(cutRole,role);
    }

    public void cuscompanyname(String custCmpName) {

        driver.findElement(cuscompanyname).sendKeys(custCmpName);
    }

    public void custgender(){
        driver.findElement(custGender).click();
    }

    public void taxtexmp(){
        driver.findElement(taxexemp).click();
    }
    public void custdob(){

        driver.findElement(taxexemp).click();
}
public void savecustinfo(){

    saveCustInfo.click();
}

}