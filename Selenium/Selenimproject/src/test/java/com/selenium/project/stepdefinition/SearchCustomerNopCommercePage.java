package com.selenium.project.stepdefinition;

import com.selenium.project.Generic.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchCustomerNopCommercePage {
    WaitHelper wait;

    public SearchCustomerNopCommercePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        wait = new WaitHelper(driver);

    }

    @FindBy(xpath = "//input[@id='SearchEmail']")
    WebElement searchEmail;

    @FindBy(xpath = "//input[@id='SearchFirstName']")
    WebElement searchFirstName;

    @FindBy(xpath = "//input[@id='SearchLastName']")
    WebElement searchLastName;

    @FindBy(xpath = "//table[@id='customers-grid']")
    WebElement table;

    @FindBy(xpath = "//table[@id='customers-grid']//tbody/tr")

    List<WebElement> tableRow;

    @FindBy(xpath = "//table[@id='customers-grid']//tbody/tr/td")
    List<WebElement> tablecol;

    @FindBy(xpath = "//button[@id='search-customers']")
    WebElement btnSearch;


    public void setSearchEmali(String email) {
        wait.waitForElement(searchEmail, 20);
        searchEmail.clear();
        searchEmail.sendKeys(email);
    }

    public void setSearchFirstName(String fName) {

        wait.waitForElement(searchFirstName, 20);
        searchFirstName.clear();
        searchFirstName.sendKeys(fName);
    }

    public void setSearchLastName(String lName) {
        wait.waitForElement(searchLastName, 20);
        searchLastName.clear();
        searchLastName.sendKeys(lName);

    }

    public void clicksearch() {
        btnSearch.click();
        wait.waitForElement(btnSearch, 20);
    }


    public int getNofRow() {

        return (tableRow.size());
    }


    public int getNofColumns() {

        return (tablecol.size());
    }

    public boolean searchCustomerByEmail(String email) {
        boolean flag = false;
        for (int i = 1; i <= getNofRow(); i++) {
            String emailid = table
                    .findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[" + i + "]/td[2]")).getText();
            System.out.println(emailid);

            if (emailid.equals("brenda_lindgren@nopCommerce.com")) {
                flag = true;
            }
        }
       return flag;

    }

    public boolean searchCustomerByfnlName(String flname) {
        boolean flag = false;
        for (int i = 1; i <= getNofRow(); i++) {
            String fnlName = table
                    .findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[" + i + "]/td[3]")).getText();
            String names[]=fnlName.split(" ");


            if(names[0].equals("Pravin") && names[1].equals("Kadam"))
            {

                flag = true;
            }
        }
        return flag;

    }
}
