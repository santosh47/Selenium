package com.selenium.project.PageObject;

import com.selenium.project.modules.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPge extends Generic {
    WebDriver ldriver;
    public MenuPge(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement menuAdmin;

    @FindBy(xpath="//span[text()='PIM']")
    WebElement menuPIM;

    @FindBy(xpath="//span[text()='Leave']")
    WebElement menuLeave;

    @FindBy(xpath="//span[text()='Time']")
    WebElement menuTime;

    @FindBy(xpath="//span[text()='Recruitment']")
    WebElement menuRecruitment;

    @FindBy(xpath="//span[text()='My Info']")
    WebElement menuInfo;

    @FindBy(xpath="//span[text()='Performance']")
    WebElement menuPerformance;

    @FindBy(xpath="//span[text()='Dashboard']")
    WebElement menuDashboard;

    @FindBy(xpath="//span[text()='Directory']")
    WebElement menuDirectory;

    @FindBy(xpath="//button[@class='oxd-icon-button oxd-main-menu-button' and  @type='button']")
    WebElement menu;

    public void viewMenuAdmin(){

     clickingonweblement(menuAdmin);
 }
    public void viewMenuPIM(){

     clickingonweblement(menuPIM);
    }

    public void viewMenuLeave(){

        clickingonweblement(menuLeave);
    }
    public void viewMenuTime(){

        clickingonweblement(menuTime);
    }
    public void viewMenuRecruitment(){

        clickingonweblement(menuRecruitment);
    }
    public void viewMenuInfo(){

        clickingonweblement(menuInfo);
    }
    public void viewMenuPerformance(){

        clickingonweblement(menuPerformance);
    }
    public void viewMenuDashboard(){

        clickingonweblement(menuDashboard);
    }
    public void viewMenu(){

        clickingonweblement(menu);
    }

}
