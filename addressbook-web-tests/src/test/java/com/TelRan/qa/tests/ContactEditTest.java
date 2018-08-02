package com.telran.qa.tests;

import com.telran.qa.model.ContactData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactEditTest extends TestBase {
    @Test
    public void testContactCorrection( ){
        if (!app.getContactHelper().isElementPresent(By.name("selected[]"))){
            app.getContactHelper().newContact();
        }
       app.getContactHelper().goToEditContact();
       app.getContactHelper().contactFill(new ContactData().setFirstName("edited first name"));
       app.getContactHelper().contactUpdate();
  }

}
