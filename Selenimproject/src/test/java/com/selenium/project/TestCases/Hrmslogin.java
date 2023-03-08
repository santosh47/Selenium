package com.selenium.project.TestCases;

import com.selenium.project.PageObject.AdminPage;
import com.selenium.project.PageObject.HrmsLoginPage;
import com.selenium.project.modules.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Hrmslogin extends Setup{
public Generic generics;
public HrmsLoginPage hlogin;
public  AdminPage drop;


    // String url = "https://opensource-demo.orangehrmlive.com/";
    @Test(dataProvider = "Logindata")
    public void loctors(String husername, String hpass, String ex) throws InterruptedException {
        Select select;
        hlogin = new HrmsLoginPage(driver);
        hlogin.Setusernameh(husername);
        hlogin.Setuserpasswordh(hpass);
        hlogin.clickOnLoginButtonh();
        driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[2]/ul/li/span/i")).click();
        // driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.linkText("Admin")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/input")).sendKeys("Santoshone");
    }

    @Test
    public void Dropdown() {
         drop = new AdminPage(driver);
        List<WebElement> ll = driver.findElements(By.xpath("//div[contains(@class,'oxd-select-option')]"));
        //select.selectByVisibleText("Admin");
        System.out.println("size" + ll.size());
        for (WebElement ptype : ll) {
            if (ptype.getText().equals("Admin")) {
                System.out.println(ptype);
                ptype.click();
                break;
            }
        }
        driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary')]"));
    }
        @Test
        public void Dropdownone() {
            AdminPage drop = new AdminPage(driver);
            drop.dropdown();
            List<WebElement> ll=driver.findElements(By.xpath("//div[contains(@class,'oxd-select-option')]"));
            //select.selectByVisibleText("Admin");
            System.out.println("size"+ll.size());
            for (WebElement ptype:ll)
            {
                if (ptype.getText().equals("Admin")){
                    System.out.println(ptype);
                    ptype.click();
                    break;
                }
            }
            driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary')]"));

    }







    @DataProvider(name = "Logindata")
    public Object[][] getdata () throws IOException {

        String loginData[][] = {
                {"Admin", "admin123", "valid"}

        };
        return loginData;
    }

}

