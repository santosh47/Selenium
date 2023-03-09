package com.selenium.project.TestCases;

import com.selenium.project.config.ReadConfig;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Setup {

        ReadConfig readConfig= new ReadConfig();
        public static WebDriver driver;
        static Logger logger;
        String url = readConfig.getApplicationUrl();
        //String UserId = readConfig.getUserName();
        String UserPass= readConfig.getUserPassword();



        @AfterMethod
        public void tearDown()
        {
            driver.quit();
        }
    }

