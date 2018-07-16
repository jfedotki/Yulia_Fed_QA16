package com.TelRan.QA16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTest {
    public WebDriver wd;

    @BeforeMethod

     public void testSetUp(){

        CommonActions.setUp(wd=new ChromeDriver(),"http://localhost/addressbook");
        CommonActions.login("admin","secret",wd);
    }
    @Test
    public void testGroupCreation(){
        newGroup("First Group","This is a first group","This group is regular group");
        newGroup("Second Group","This is a second group","This group is regular group");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CommonActions.returnHomePage(wd);
        wd.quit();
    }



        public void newGroup(String groupName, String groupHeader, String groupFooter){

        wd.findElement(By.xpath("//*[@href='group.php']")).click();
        wd.findElement(By.xpath("//*[@value='New group']")).click();

        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupName);

        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupHeader);

        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupFooter);

        wd.findElement(By.name("submit")).click();

        wd.findElement(By.xpath("//*[@href='group.php']")).click();

    }



}
