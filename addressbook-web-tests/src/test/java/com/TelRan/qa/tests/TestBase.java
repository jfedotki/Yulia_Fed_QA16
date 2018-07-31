package com.TelRan.qa.tests;


import com.TelRan.qa.appmanager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() {
         app.start();
    }

    @AfterClass
    public void tearDown() throws Exception {
        app.stop();

    }

}
