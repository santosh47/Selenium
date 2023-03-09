package com.selenium.project.TestCases;

import com.selenium.project.PageObject.AdminPage;
import com.selenium.project.PageObject.HrmsLoginPage;
import com.selenium.project.PageObject.SystemUserPage;
import com.selenium.project.Generic.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Admin {
    Generic generic;
    HrmsLoginPage login;
    AdminPage admin;
    SystemUserPage systemUserPage;
    WebDriver driver;
    @Test(dataProvider = "Logindata")
    public void addSysteuser(String usrename,String password) throws InterruptedException {
        login = new HrmsLoginPage(driver);
        login.Setusernameh("Admin");
        login.Setuserpasswordh("admin123");
        login.clickOnLoginButtonh();
        Thread.sleep(3000);
        admin = new AdminPage(driver);
        admin.viewAdminPage();
        Thread.sleep(3000);
        admin.SystemUserName("santoshtettttt");
        Thread.sleep(6000);
      //  admin.dropdown();
        admin.selectUserrolename("Admin");
        admin.clickOnAddButton();
        System.out.println("pass");
        Thread.sleep(5000);
       String title=driver.getCurrentUrl();
        System.out.println(title);
        driver.findElement(By.xpath("//input[@type='password' and @Class='oxd-input oxd-input--focus oxd-input--error']")).sendKeys("Admin@123");

        systemUserPage =new SystemUserPage(driver);
        System.out.println("user");
        systemUserPage.userPassword("Appzui123");

    }

    @DataProvider(name = "Logindata")
    public Object[][] getdata() throws IOException {

        String loginData[][] = {
                {"Admin", "admin123"},
                // {"123", "sdygyey", "invalid"},
                // {"123", "hdgsgd", "invlid"}
        };
        return loginData;
    }
}
