package com.selenium.project.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Generic {

   WebDriver driver;
   public void clickingonweblement(WebElement element){
       element.click();
   }

   public void sendKeyesOnWebelement(WebElement element,String text){
       element.click();
       element.clear();
       element.sendKeys(text);

   }
   //Selecting dropdown list
    public void selectByVisibleText(WebElement element,String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    //Accepting lert
    public void acceptAlert(WebDriver driver){
       driver.switchTo().alert().accept();

    }

    //mouse hovering
    public void mouseHoverandClickOnelement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
    }
    // Window Handle
    public String getCurrentWindowID(){
       return driver.getWindowHandle();
    }
    public void testselectOpetionFromDropDown(WebElement element,String txt){
       Select select=new Select(element);
        List<WebElement>alloptions=select.getOptions();
        for (WebElement option:alloptions){
            if(option.getText().equals(txt)){
                option.click();
                break;
            }
        }

    }
    public void test(List<WebElement> ele,String txt) {


        List<WebElement> ll =ele;      //select.selectByVisibleText("Admin");
        System.out.println("size" + ll.size());
        for (WebElement ptype : ll) {
            if (ptype.getText().equals(txt)) {
                System.out.println(ptype);
                ptype.click();
                break;
            }
        }
    }
}
