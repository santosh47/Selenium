package com.selenium.project.TestCases;

import com.selenium.project.PageObject.AdminPage;
import com.selenium.project.PageObject.HrmsLoginPage;
import com.selenium.project.PageObject.MenuPge;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Menu extends Setup{
    AdminPage admin;
    HrmsLoginPage login;
    MenuPge menu;
    @Test
    public void test() throws InterruptedException {
        login = new HrmsLoginPage(driver);
        login.Setusernameh("Admin");
        login.Setuserpasswordh("admin123");
        login.clickOnLoginButtonh();
        Thread.sleep(3000);
        menu = new MenuPge(driver);
        menu.viewMenuAdmin();
        menu.viewMenuPIM();
        menu.viewMenuLeave();
        menu.viewMenuRecruitment();
        menu.viewMenuInfo();
        menu.viewMenuPerformance();
        menu.viewMenuDashboard();
        menu.viewMenu();

    }

}
