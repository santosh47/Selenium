package com.selenium.project.Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "",
        features = {"src/test/java/com/selenium/project/Feature/SearchCustomerNopCommerce.feature"}, glue = {"com.selenium.project.stepdefinition"},
        plugin = {"pretty","html:test-output"},
        monochrome = true,
        dryRun = false
)

public class SearchNopCommerceCustomer extends AbstractTestNGCucumberTests{


}
