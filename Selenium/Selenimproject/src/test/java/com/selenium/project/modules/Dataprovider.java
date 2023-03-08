package com.selenium.project.modules;

import java.io.IOException;

public class Dataprovider {

    public Object[][] getdata () throws IOException {

        String loginData[][] = {
                {"Admin", "admin123", "valid"}

        };
        return loginData;
    }
}
