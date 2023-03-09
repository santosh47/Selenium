package com.selenium.project.stepdefinition;

import com.selenium.project.PageObject.LoginNopCommercePage;
import com.selenium.project.config.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import java.util.logging.Logger;

public class BaseClass {

   public static ReadConfig readConfig = new ReadConfig();
   public static String url = readConfig.getNocommerceUrl();
    //String UserId = readConfig.getUserName();
    public static String UserPass = readConfig.getUserPassword();
    static Logger logger;
    public LoginNopCommercePage page;
    public static WebDriver driver;
    public final static int TIMEOUT = 10;
    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {

        driver.quit();
    }
}
