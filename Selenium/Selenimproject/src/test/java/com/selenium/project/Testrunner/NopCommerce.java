package com.selenium.project.Testrunner;



import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(tags = "@prop", features = {"src/test/java/com/selenium/project/Feature/LoginNopCommerce.feature"}, glue = {"com.selenium.project.stepdefinition"},
        plugin = {},dryRun = false)



public class NopCommerce extends AbstractTestNGCucumberTests {

}
