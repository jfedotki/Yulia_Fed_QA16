package com.telran.qa.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase {

    @Test
    public void testContactDeletionAccept(){
        boolean chk = app.getContactHelper().isElementPresent(By.name("selected[]"));
        if(!app.getContactHelper().isElementPresent(By.name("selected[]"))){
            app.getContactHelper().newContact();
        }
        int before = app.getContactHelper().elementsCount(By.name("selected[]"));
        app.getContactHelper().contactSelectByIndex(before-1);
        app.getContactHelper().contactDelete();
        app.confirmAlert();
        int after = app.getContactHelper().elementsCount(By.name("selected[]"));
        Assert.assertEquals(after,before-1);
    }

    @Test
    public void testContactDeletionDismiss(){
        if(!app.getContactHelper().isElementPresent(By.name("selected[]"))){
            app.getContactHelper().newContact();
        }
        int before = app.getContactHelper().elementsCount(By.name("selected[]"));
        app.getContactHelper().contactSelect();
        app.getContactHelper().contactDelete();
        app.dismissAlert();
        int after = app.getContactHelper().elementsCount(By.name("selected[]"));
        Assert.assertEquals(before,after);
    }
    @Test
    public void testContactDeleteViaEdit(){
        if(!app.getContactHelper().isElementPresent(By.name("selected[]"))){
            app.getContactHelper().newContact();
        }
        int before = app.getContactHelper().elementsCount(By.name("selected[]"));
        app.getContactHelper().goToEditContact();
        app.getContactHelper().contactDelete();
        app.getContactHelper().goHome();
        int after = app.getContactHelper().elementsCount(By.name("selected[]"));
        Assert.assertEquals(after,before-1);
    }

    @Test
    public void testContactDeleteByIndex(){
        if(!app.getContactHelper().isElementPresent(By.name("selected[]"))){
            app.getContactHelper().newContact();
        }
        int before = app.getContactHelper().elementsCount(By.name("selected[]"));
        app.getContactHelper().contactSelectByIndex(before-1);
        app.getContactHelper().contactDelete();
        app.confirmAlert();
        int after = app.getContactHelper().elementsCount(By.name("selected[]"));
        Assert.assertEquals(after,before-1);
    }


    }


