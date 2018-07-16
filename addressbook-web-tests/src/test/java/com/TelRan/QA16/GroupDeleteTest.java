package com.TelRan.QA16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupDeleteTest {
    public WebDriver wd;
    @BeforeMethod
    public void testSetUp(){
        CommonActions.setUp(wd=new ChromeDriver(),"http://localhost/addressbook");
        CommonActions.login("admin","secret",wd);
    }

    @Test
    public void editTest(){
        CommonActions.selectGroup("First Group",wd,"delete");
    }
    @AfterMethod
    public void tearDown() throws Exception {
        CommonActions.returnHomePage(wd);
        wd.quit();
    }
}
