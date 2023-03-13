package com.selenium.project.modules;

import com.selenium.project.TestCases.Setup1;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdown extends Setup1 {
    @Test
    public void bootStrapdropdown() throws InterruptedException {

        driver.get("https://demo.guru99.com/V1/index.php");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Selenium']"));
        element.click();
        Thread.sleep(5000);
        logger.info("pass");
        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);


        List<WebElement> seleniumdropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for (WebElement ele : seleniumdropdown) {

            System.out.println("Values " + ele.getAttribute("innerHTML"));


            if (ele.getAttribute("innerHTML").contains("Radio &amp; Checkbox Demo")) {

                ele.click();

                break;


            }
        }
    }
        @Test
        public void radiobutton() {
            List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));

            System.out.println("size of " + radio.size());
            for (WebElement radiobutton : radio) {
                System.out.println(radiobutton.getText());
                if (radiobutton.getText().equals("Checkbox2")) {
                    System.out.println(radiobutton);
                    radiobutton.click();
                    break;
                }
            }


                }

                @Test
    public void checkbox(){
                    if(isAlerPrest())
                    {
                        driver.switchTo().alert().accept();
                        driver.switchTo().defaultContent();
                    }
                    List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));

                    System.out.println("size of " + check.size());
                    for (WebElement checkBox : check) {
                        if (checkBox.getText().equals("Checkbox2")) {
                            System.out.println(checkBox);
                            checkBox.click();
                            break;
                        }
                    }
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



