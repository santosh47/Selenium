package com.selenium.project.stepdefinition;

import com.selenium.project.TestCases.BaseClasss;
import com.selenium.project.config.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Setup extends BaseClass {

        public static WebDriver driver;
        public final static int TIMEOUT = 10;
        @Before
        public void setUp() throws FileNotFoundException {

                readConfigpro = new ReadConfig();
               // FileInputStream file=new FileInputStream("config.properties");
                String browser=readConfigpro.getBrowser();
                //logger= Logger.getLogger("banking")

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

        @After
        public void teardown() {

                driver.quit();
        }
}
