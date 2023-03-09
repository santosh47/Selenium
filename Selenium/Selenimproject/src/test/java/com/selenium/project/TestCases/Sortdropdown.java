package com.selenium.project.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortdropdown {

    @Test
    public void runTestOnDocker() throws Exception {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

        WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
        Select se = new Select(element);
        List<String> originalList = new ArrayList();
        for (WebElement e : se.getOptions()) {
            originalList.add(e.getText());
        }
        //----logic block starts
        List<String> tempList= originalList;
        Collections.sort(tempList);
        Assert.assertEquals(tempList, originalList);
        //----logic ends starts
    }
}
