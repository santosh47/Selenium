package com.selenium.project.TestCases;
import com.selenium.project.PageObject.LoginPage;
import com.selenium.project.config.ReadConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginClass extends Setup {
    ReadConfig readConfig = new ReadConfig();
    String actulTitle;
    String expectedTitle = "Guru99 Bank Manager HomePage";
    static LoginPage loginPage;


    @Test(dataProvider = "Logindata")
    public void Userlogin(String user, String pas,String ex) throws InterruptedException {

        loginPage = new LoginPage(driver);

        loginPage.Setusername(user);
        logger.info("Enterd username");

        loginPage.Setuserpassword(pas);
        logger.info("Password enterd");


        loginPage = new LoginPage(driver);
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);


        if (isAlerPresent()) {
            driver.switchTo().alert().accept();
            driver.switchTo().defaultContent();
           // Assert.assertTrue(false);
        }
        else
        {
          //  Assert.assertTrue(true);
           // driver.findElement(By.linkText("Log out")).click();
            loginPage.setLogOut();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            driver.switchTo().defaultContent();
        }

        actulTitle = driver.getTitle();

        System.out.println(actulTitle);
        if (ex.equals("valid")) {

            if (driver.getTitle().equals(expectedTitle)) {

               Assert.assertTrue(true);
                logger.info("login is successfull");

            }
            else {
                // System.out.println("Test case : failed");
                Assert.fail();
                logger.info("Login failed");
            }
        } else if (ex.equals("invalid")) {
            Assert.assertNotEquals(expectedTitle, driver.getTitle());
        }
    }

    @DataProvider(name = "Logindata")
    public Object[][] getdata() throws IOException {

        String loginData[][] = {
                {"mngr471474", "egYtesy", "valid"},
               // {"123", "sdygyey", "invalid"},
               // {"123", "hdgsgd", "invlid"}
        };
           /* String excelfilepath=".\\Utilities\\Readdata.xlsx";
            Xlutility xlutil= new Xlutility(excelfilepath);
            int totalrows=xlutil.getRowCount("Readdata");
            int totalcols=xlutil.getCellCount("Readdata",1);
            String loginData[][]=new String[totalrows][totalcols];
            for (int i=1;i<=totalrows;i++){
                for (int j=0;j<totalcols;j++)
                {
                    loginData[i-1][j]=xlutil.getCellData("Readdata", i, j);
                }

            }*/
        return loginData;

    }
    public boolean isAlerPresent()
    {
        try {
            driver.switchTo().alert();
            return true;
        }
        catch(NoAlertPresentException e)
        {
            return false;
        }
    }

}



