package com.telran.qa.tests;


import com.telran.qa.manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class TestBase {

    public static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() {
         app.start();
    }

    @AfterSuite
    public void tearDown() throws Exception {
        app.stop();

    }

}
