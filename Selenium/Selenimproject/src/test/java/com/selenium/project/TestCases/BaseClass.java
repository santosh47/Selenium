package com.selenium.project.TestCases;

import com.selenium.project.config.ReadConfig;
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



public class BaseClass {
    ReadConfig readConfig= new ReadConfig();
    public static WebDriver driver;
    Logger logger;
    String url = readConfig.getApplicationUrl();
    //String UserId = readConfig.getUserName();
   String UserPass= readConfig.getUserPassword();
    @Parameters("browser")
    @BeforeClass
    public void Initializebrowser(String br) {
       logger = Logger.getLogger("Banking");
       PropertyConfigurator.configure("Log4j.properties");
       if (br.equals("chrome")) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       } else if (br.equals("firefox")) {
           WebDriverManager.firefoxdriver().setup();
           driver = new FirefoxDriver();
       } else if (br.equals("edge")) {
           WebDriverManager.edgedriver().setup();
           driver = new EdgeDriver();
       }
       driver.get(url);
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
    public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}
