package com.TelRan.QA16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactDeleteTest {

    WebDriver wd;


    @BeforeMethod
    public void setUp() {
        wd =new ChromeDriver();
        String myUrl="http://localhost/addressbook";
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get(myUrl);
        login("admin","secret");

    }

    @Test
    public void testContactDeletion( ){
       contactSelection();
       contactDeletion();

    }
    @AfterMethod
    public void tearDown() throws Exception {

        // wd.quit();
    }
    private void contactDeletion() {

        wd.findElement(By.xpath("//*[@value='Delete']")).click();
    }

    private void contactSelection() {
        wd.findElement(By.xpath("//*[@title='Edit']")).click();

    }

    public void login(String name, String password){
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(name);

        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//*[@type='submit']")).click();


    }
}
