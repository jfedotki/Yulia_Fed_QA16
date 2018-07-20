package com.TelRan.QA16;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase {

    @Test
    public void testContactDeletionAccept(){
        int before = wd.findElements(By.name("selected[]")).size();
        contactSelect();
        contactDelete();
        confirmAlert();
        int after = wd.findElements(By.name("selected[]")).size();
        Assert.assertEquals(after,before-1);
    }
    @Test
    public void testContactDeletionDissmis(){
        int before = wd.findElements(By.name("selected[]")).size();
        contactSelect();
        contactDelete();
        dismissAlert();
        int after = wd.findElements(By.name("selected[]")).size();
        Assert.assertEquals(before,after);
    }
    @Test
    public void testContactDeleteViaEdit(){
        int before = wd.findElements(By.name("selected[]")).size();
        goToEditContact();
        contactDelete();
        goHome();
        int after = wd.findElements(By.name("selected[]")).size();
        Assert.assertEquals(after,before-1);
    }

 }
