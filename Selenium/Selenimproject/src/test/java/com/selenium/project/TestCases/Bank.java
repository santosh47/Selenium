package com.selenium.project.TestCases;
import com.selenium.project.Generic.WaitHelper;
import com.selenium.project.PageObject.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bank extends Setup1 {

    @Test
    public void gurulogin() throws InterruptedException {

        driver.get("https://demo.guru99.com/V1/index.php");
        logger.info("Url Opened");
        driver.manage().window().maximize();
        WebElement userID= driver.findElement(By.name("uid"));
        userID.clear();
        userID.sendKeys("mngr484531");
        logger.info("Enterd userid");

        WebElement userPass= driver.findElement(By.name("password"));
        userPass.clear();
        userPass.sendKeys("udyvYvE");
        logger.info("Enterd userpassword");

        WebElement btnLogin= driver.findElement(By.xpath("btnLogin"));
        Thread.sleep(4000);

        System.out.println(driver.getTitle());
        if(driver.getTitle().equals("GTPL Bank Home Page"))
        {

            Assert.assertTrue(true);
            logger.info("Login test Passed");
        }
        else
        {
            Assert.fail("Title Not found");
        }

           if(isAlerPrest())
           {
            driver.switchTo().alert().accept();
            driver.switchTo().defaultContent();
        }

    }

@Test
    public void selenium() throws InterruptedException {

    WebElement element = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
    element.click();
    Thread.sleep(5000);
    logger.info("pass");
    driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);


    List<WebElement> seleniumdropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

   // List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));


    for (WebElement ele : seleniumdropdown) {

        System.out.println("Values " + ele.getAttribute("innerHTML"));


        if (ele.getAttribute("innerHTML").contains("Radio &amp; Checkbox Demo")) {

            ele.click();

            break;


        }
    }
    Thread.sleep(5000);
    WebElement radio=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
    radio.click();
     }
    @Test
    public void RadioandCheckbox() throws InterruptedException {


}

    public boolean isAlerPrest() {
        try {

            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }

    }
}

