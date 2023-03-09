package com.selenium.project.Generic;

import org.openqa.selenium.WebElement;

public class TestNG {

    public void assertElementIsTextbox(WebElement element){
        // get the tag name and type attribute
        String tag = element.getTagName();
        String type = element.getAttribute("type");
        // verify whether tag is input
        if(tag.equals("input") && type.equals("text")){
            System.out.println("******Element is Textbar*******");
        }
        else{
            throw new AssertionError("Element isn't textbar, tag, type are do not belong to textbox");
        }
    }
}
