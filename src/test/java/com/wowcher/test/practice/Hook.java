package com.wowcher.test.practice;

import com.wowcher.test.practice.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    private DriverManager driverManager = new DriverManager();

    @Before
    public void setup(){
        driverManager.openBrowser();
        driverManager.HandleCookies();
        driverManager.deleteLogIn();

    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
