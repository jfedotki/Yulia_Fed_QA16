package com.TelRan.qa.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver wd;
    ContactHelper contactHelper;
    SessionHelper sessionHelper;
    GroupHelper grHelper;


    public void start(){
        wd =new ChromeDriver();
        SessionHelper sessionHelper = new SessionHelper(wd);
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper.openSite("http://localhost/addressbook");
        sessionHelper.login("admin","secret");
        grHelper=new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
    }

    public void stop() {
        // wd.quit();
    }

    public void confirmAlert(){
        wd.switchTo().alert().accept();
    }

    public void dismissAlert(){
        wd.switchTo().alert().dismiss();
    }

    public GroupHelper getGrHelper() {
        return grHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}



