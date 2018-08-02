package com.telran.qa.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
     @BeforeMethod
     public void preTestAction(){
     app.getSessionHelper().logout();

  }
    @Test
    public void testLog(){
        app.getSessionHelper().login("admin","secret");
        Assert.assertTrue(app.getContactHelper().isElementPresent(By.linkText("Logout")));

    }
}
