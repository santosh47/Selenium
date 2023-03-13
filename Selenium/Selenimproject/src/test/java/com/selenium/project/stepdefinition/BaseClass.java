package com.selenium.project.stepdefinition;

import com.selenium.project.Generic.Generic;
import com.selenium.project.PageObject.CustomerNopCommercePage;
import com.selenium.project.PageObject.LoginNopCommercePage;
import com.selenium.project.config.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class BaseClass {

   public static ReadConfig readConfigpro = new ReadConfig();
   public static String url = readConfigpro.getNocommerceUrl();
    //String UserId = readConfig.getUserName();
    public static String UserPass = readConfigpro.getUserPassword();
    public static Logger logger;
    public static LoginNopCommercePage loginNopCommercePagepage;
    public static CustomerNopCommercePage customerNopCommerce;
    public static SearchCustomerNopCommercePage searchCustomerNopCommercePage;
    public static Generic generic = new Generic();

}
