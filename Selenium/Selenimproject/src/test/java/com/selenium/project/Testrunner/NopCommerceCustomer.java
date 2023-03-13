package com.selenium.project.Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(tags = "",
        features = {"src/test/java/com/selenium/project/Feature/CustomerNopCommerce.feature"}, glue = {"com.selenium.project.stepdefinition"},
        plugin = {"pretty","html:test-output"},
        monochrome = true
)

public class NopCommerceCustomer  extends AbstractTestNGCucumberTests{


}
