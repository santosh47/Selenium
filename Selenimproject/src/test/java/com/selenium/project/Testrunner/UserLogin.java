package com.selenium.project.Testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/selenium/project/Feature/Login.feature"},
        glue = {"MyStepdefs"},plugin = {"pretty"}
)

public class UserLogin {


}
