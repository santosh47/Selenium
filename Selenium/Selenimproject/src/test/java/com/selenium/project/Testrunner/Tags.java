package com.selenium.project.Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/com/selenium/project/Feature/"}, glue = {"com.selenium.project.stepdefinition"},
        plugin = {"pretty","html:test-output"},
        monochrome = true,
        tags = "@Sanity"

)

public class Tags extends AbstractTestNGCucumberTests{


}
