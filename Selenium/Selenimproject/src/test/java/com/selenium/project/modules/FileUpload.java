package com.selenium.project.modules;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static WebDriver driver;

    public static void main(String args[]) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");

        // Maximize the browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Locating upload button
        WebElement upload = driver.findElement(By.id("uploadFile"));

        //Upload the file
        upload.sendKeys("C:\\Users\\HP\\Desktop\\mot.txt");

        String Message = driver.findElement(By.id("uploadedFilePath")).getText();
        System.out.println("Message is :" + Message);

        // close the browser
        driver.close();
    }
}
