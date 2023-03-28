package com.tutorialsninja.automation.stepdef;

import io.cucumber.java.en.*;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;

public class test {
    @Given("navigate url")
    public void navigate_url() {
        System.out.println("testing cc");

        Base.driver.get(Base.reader.getUrl());

    }
}
