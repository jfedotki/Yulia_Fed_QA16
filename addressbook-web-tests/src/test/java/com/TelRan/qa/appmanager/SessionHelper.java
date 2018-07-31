package com.TelRan.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void openSite(String myUrl){
        //String myUrl="http://localhost/addressbook";
        wd.get(myUrl);
    }

    public void login(String name, String password){
        type(By.name("user"),name);
        type(By.name("pass"),password);
        click(By.xpath("//*[@value='Login']"));
        }
}
