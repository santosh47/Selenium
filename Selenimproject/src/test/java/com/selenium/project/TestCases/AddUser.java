package com.selenium.project.TestCases;

import com.selenium.project.PageObject.AddUserPage;
import com.selenium.project.PageObject.AdminPage;
import com.selenium.project.PageObject.HrmsLoginPage;
import com.selenium.project.modules.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AddUser extends Setup{
    Generic generic;
    HrmsLoginPage login;
    AdminPage admin;
    AddUserPage addUserPage;

    @Test
    public void addUser() throws InterruptedException {

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
        Thread.sleep(500);

    }


}
