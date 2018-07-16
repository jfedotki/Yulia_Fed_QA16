package com.TelRan.QA16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CommonActions {

    public static void setUp(WebDriver wd, String myUrl) {

        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get(myUrl);

    }

    public static void login(String name, String password, WebDriver wd){
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(name);

        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//*[@type='submit']")).click();


    }

   public static void selectGroup(String groupName, WebDriver wd, String action){

      String myXpath = "//*[@title='Select ("+groupName+")']";
      wd.findElement(By.xpath("//*[@href='group.php']")).click();
      wd.findElement(By.xpath(myXpath)).click();
      if (action.equals("edit")){
          wd.findElement(By.name("edit")).click();
      }else if (action.equals("delete")){
           wd.findElement(By.name("delete")).click();
       }

    }

    public static void returnHomePage(WebDriver wd){
        wd.findElement(By.xpath("//*[@href='./']")).click();
    }
}
