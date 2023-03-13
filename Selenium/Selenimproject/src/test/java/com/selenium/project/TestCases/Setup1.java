package com.selenium.project.TestCases;

import com.selenium.project.config.ReadConfig;
import com.selenium.project.stepdefinition.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

public class Setup1 extends BaseClass {

        public static WebDriver driver;
        public final static int TIMEOUT = 10;
        @BeforeClass
        public void setUp() throws FileNotFoundException {

                readConfigpro = new ReadConfig();
               // FileInputStream file=new FileInputStream("config.properties");
                String browser=readConfigpro.getBrowser();
                logger= Logger.getLogger("bank");
                PropertyConfigurator.configure("Log4j.properties");

                if (browser.equals("chrome")) {
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                } else if (browser.equals("firefox")) {
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                } else if (browser.equals("edge")) {
                        WebDriverManager.edgedriver().setup();
                        driver = new EdgeDriver();
                }
        }

        @AfterClass
        public void teardown() {

                driver.quit();
        }
}
