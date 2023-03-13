package com.selenium.project.stepdefinition;

import com.selenium.project.Utilities.ReadExcel;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import  static com.selenium.project.stepdefinition.Setup.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ReadDatafromXlincucumber {
    @When("User enters excel as {string} and password as {string}")
    public void userEntersExcelAsAndPasswordAs(String sheetName, String rowNumber) throws IOException, InvalidFormatException, InterruptedException {

        {
             ReadExcel readExcel = new ReadExcel();
           List<Map<String,String>> testdata= readExcel.getData("C:\\Users\\HP\\Desktop\\Selenium\\Selenium\\Selenimproject\\Utilities\\Readdata.xlsx", sheetName);
          String email= testdata.get(0).get("user");
          WebElement ele=driver.findElement(By.id("Email"));
          ele.clear();
          ele.sendKeys(email);
          Thread.sleep(100000);



        }
    }
}
