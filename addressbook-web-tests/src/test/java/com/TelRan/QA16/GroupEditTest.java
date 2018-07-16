package com.TelRan.QA16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupEditTest {
    public WebDriver wd;
    @BeforeMethod
    public void testSetUp(){

        CommonActions.setUp(wd=new ChromeDriver(),"http://localhost/addressbook");
        CommonActions.login("admin","secret",wd);
    }

    @Test
    public void editTest(){
        CommonActions.selectGroup("First Group",wd,"edit");

        editField("group_name","edited group");

    }
    @AfterMethod
    public void tearDown() throws Exception {
        CommonActions.returnHomePage(wd);
        wd.quit();
    }

    public void editField(String fieldName, String newText){
        wd.findElement(By.name(fieldName)).click();
        wd.findElement(By.name(fieldName)).clear();
        wd.findElement(By.name(fieldName)).sendKeys(newText);
        wd.findElement(By.name("update")).click();
    }
}
