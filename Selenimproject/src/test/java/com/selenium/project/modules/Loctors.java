package com.selenium.project.modules;
import com.selenium.project.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Loctors extends BaseClass {

        // String url = "https://opensource-demo.orangehrmlive.com/";

    @Test(dataProvider = "Logindata")
    public void loctors(String username,String pass,String ex) {


        //xpath tagname[@attribute='value'] - //input[@name='username']
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@name='username']")).clear();
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@name='password']")).clear();
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();

        String title = driver.getTitle();
        System.out.println(title);
        String expected = "OrangeHRM";
        if (ex.equals("valid")) {

            if (expected.equals(title)) {

                driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[2]/ul/li/span/i")).click();
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        } else if (ex.equals("invalid")) {
            if (title.equals(expected)) {
                driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[2]/ul/li/span/i")).click();
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
        }
    }

        @DataProvider(name = "Logindata")
        public Object[][] getdata () throws IOException {

            String loginData[][] = {
                    {"Admin", "admin123", "valid"},
                    {"Admin1", "admin12", "invalid"},
                    {"Admin2", "hdgsgd", "invalid"}
            };
            return loginData;
        }

    }
