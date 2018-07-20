package com.TelRan.QA16;

import org.testng.annotations.Test;

public class ContactEditTest extends TestBase {
    @Test
    public void testContactCorrection( ){
       goToEditContact();
       contactFill(new ContactData().setFirstName("edited first name"));
       contactUpdate();
  }

}
