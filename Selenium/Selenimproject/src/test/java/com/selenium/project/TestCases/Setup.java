package com.selenium.project.TestCases;

import com.selenium.project.config.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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

        @BeforeClass
        public static void Initializebrowser() {
            logger = Logger.getLogger("Banking");
            PropertyConfigurator.configure("Log4j.properties");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/");
            logger.info("URL is opend");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            logger.info("wait web page load ");
            driver.manage().window().maximize();
            logger.info("Window maximized");
        }
        @AfterClass
        public void tearDown()
        {
            driver.quit();
        }
    }

