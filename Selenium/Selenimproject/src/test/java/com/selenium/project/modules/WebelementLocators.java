package com.selenium.project.modules;

import com.selenium.project.TestCases.Setup1;
import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebelementLocators extends Setup1 {

    @Test
    public void radioButton() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
        for (int i = 0; i < radio.size(); i++) {
            WebElement radioelement = radio.get(i);
            String valu = radioelement.getAttribute("value");
            System.out.println("value radio button" + valu);
            if (valu.equalsIgnoreCase("C#")) {
                radioelement.click();
                break;
            }

        }
    }

    @Test
    public void checkbox() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 0; i < checkbox.size(); i++) {
            WebElement ele = checkbox.get(i);
            String checkBoxID = ele.getAttribute("id");
            System.out.println("Checkbox:" + checkBoxID);
            if (checkBoxID.equalsIgnoreCase("code")) {
                ele.click();
                break;

            }
        }

    }

    @Test
    public void atocomplete() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.xpath("//input[@id='tags']"));
        textbox.sendKeys("se");
        Thread.sleep(8000);
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']//div"));
        System.out.println(list);
        for (WebElement ele : list) {
            if (ele.getText().equals("Selenium")) {
                System.out.println(ele);
                ele.click();
                Thread.sleep(6000);
                break;

            }


        }
    }

    @Test
    public void toolTip() throws InterruptedException {
        driver.get("https://www.online.citibank.co.in/");
        driver.manage().window().maximize();


        //xpath of element where we will get tooltip
        WebElement element = driver.findElement(By.xpath("//a[@id='loginId']"));
        String tooltipText = element.getAttribute("title");
        Thread.sleep(6000);

        System.out.println(tooltipText);
    }

    @Test
    public void calender() throws InterruptedException {
        driver.get("https://www.redbus.in/bus-tickets");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
        List<WebElement> cal = driver.findElements(By.xpath("//ul[@class='rb-calendar-days']//li/span"));
        System.out.println(cal);
        for (WebElement ele : cal) {
            if (ele.getText().equals("27")) {
                System.out.println(ele);
                ele.click();
                Thread.sleep(6000);
                break;

            }

        }
    }

    @Test
    public void mouseHover() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
        driver.manage().window().maximize();
        WebElement hover = driver.findElement(By.xpath("//button[normalize-space()='Automation Tools']"));
        Actions action = new Actions(driver);
        action.moveToElement(hover).perform();
        List<WebElement> mouse = driver.findElements(By.tagName("a"));
        int count = mouse.size();
        for (int i = 0; i < count; i++) {
            WebElement ele = mouse.get(i);
            String mousehover = ele.getAttribute("innerHTML");
            boolean status = ele.isEnabled();
            System.out.println(mousehover + "link status" + status);
            if (mousehover.equalsIgnoreCase("Appium")) {
                ele.click();
                break;
            }
        }
    }

    @Test
    public void alerPopUp() throws InterruptedException {

        driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
        driver.manage().window().maximize();
        WebElement pop = driver.findElement(By.xpath("//button[normalize-space()='Try it']"));
        pop.click();
        Thread.sleep(20000);

        if (isAlerPrest()) {
            driver.switchTo().alert().accept();
            driver.switchTo().defaultContent();

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

   @Test

        public void VerifyLinks() {
            driver.get("http://www.google.co.in/");
            driver.manage().window().maximize();
            List<WebElement> links = driver.findElements(By.tagName("a"));

            System.out.println("Total links are " + links.size());

            for (int i = 0; i < links.size(); i++) {

                WebElement ele = links.get(i);

                String url = ele.getAttribute("href");

                verifyLinkActive(url);

            }

        }

        public void verifyLinkActive(String linkUrl) {
            try {
                URL url = new URL(linkUrl);

                HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

                httpURLConnect.setConnectTimeout(3000);

                httpURLConnect.connect();

                if (httpURLConnect.getResponseCode() == 200) {
                    System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
                }
                if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
                    System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
                }
            } catch (Exception e) {

            }
        }


    }
