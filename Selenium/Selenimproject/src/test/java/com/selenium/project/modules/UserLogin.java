package com.selenium.project.modules;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UserLogin {

    WebDriver driver;
    public void UserLogin() {

        driver.get("https://www.demo.guru99.com/v4");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

    }

}
