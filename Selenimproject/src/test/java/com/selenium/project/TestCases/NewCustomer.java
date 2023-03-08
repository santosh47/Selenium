package com.selenium.project.TestCases;

import com.selenium.project.PageObject.LoginPage;
import com.selenium.project.PageObject.NewCustomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewCustomer extends BaseClass {
String customername="test";
String address="Testing";
String date="12";
String month="12";
String year="2002";
String UserAddress="#203 suprma clonial";
String UserCity= "Gadag";
String state="Karnataka";
String Userpinno="582103";
String telephone="123456789";
//String email="test@@123";
String password="23248#5326";


    @Test
    public void Newcustomer(String user) throws InterruptedException {

        NewCustomePage newCustomerPage = new NewCustomePage(driver);

      LoginPage loginPage=new LoginPage(driver);
      loginPage.Setusername(user);
      loginPage.Setuserpassword(UserPass);
      loginPage.clickOnLoginButton();
Thread.sleep(3000);

        newCustomerPage.newCustomer();
       // driver.switchTo().alert().dismiss();
      //  driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newCustomerPage.Setcustomername(customername);
newCustomerPage.SelectGender();
newCustomerPage.SelectDob(date,month,year);
newCustomerPage.EnterAddress(address);
newCustomerPage.SelectCity(UserCity);
newCustomerPage.setState(state);
newCustomerPage.setPinno(Userpinno);
newCustomerPage.setTelePhoneNumber(telephone);
newCustomerPage.setPassword(password);
String email = getSaltString()+"@gmail.com";
newCustomerPage.setEmailid(email);
newCustomerPage.Submit();
Thread.sleep(3000);
boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
if(res==true) {
    Assert.assertTrue(true);
}
else
    Assert.assertTrue(false);

driver.switchTo().alert().dismiss();

    }

}
