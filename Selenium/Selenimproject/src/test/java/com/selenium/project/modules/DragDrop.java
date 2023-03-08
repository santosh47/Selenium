package com.selenium.project.modules;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragDrop {

    public static WebDriver driver;

    public static void main(String args[]) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        // It is always advisable to Maximize the window before performing DragNDrop action
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        // Find element xpath which we need to drag
        WebElement from = driver.findElement(By.id("draggable"));

        // Find element xpath where we need to drop
        WebElement to = driver.findElement(By.id("droppable"));

        // Create object of actions class
        Actions builder = new Actions(driver);

        // Perform drag and drop operation
        builder.dragAndDrop(from, to).build().perform();
    }
}






