package com.selenium.project.TestCases;

import com.selenium.project.PageObject.AddUserPage;
import com.selenium.project.PageObject.AdminPage;
import com.selenium.project.PageObject.HrmsLoginPage;
import com.selenium.project.PageObject.SystemUserPage;
import com.selenium.project.modules.Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SystemUser extends Setup {
    Generic generic;
    HrmsLoginPage login;
    AdminPage admin;
    AddUserPage addUserPage;
    SystemUserPage systemUserPage;

    @Test
    public void systemUser() throws InterruptedException {
        login = new HrmsLoginPage(driver);
        login.Setusernameh("Admin");
        login.Setuserpasswordh("admin123");
        login.clickOnLoginButtonh();
        Thread.sleep(3000);
        admin = new AdminPage(driver);
        admin.viewAdminPage();
        admin.SystemUserName("santoshtet");
        admin.dropdown();
        admin.selectUserrolename("Admin");
        admin.clickOnAddButton();
        System.out.println("pass");
        Thread.sleep(500);
        systemUserPage =new SystemUserPage(driver);
        System.out.println("user");
        systemUserPage.userPassword("Appzui123");
        systemUserPage.enterEmployeeName("santosh");
        systemUserPage.enterUserName("santosh");
        systemUserPage.enterPassword("Appzui123");
        systemUserPage.saveUser();
        Thread.sleep(6000);


    }
}
