package com.TelRan.QA16;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation( ){
        createNewContact();
        contactFill(new ContactData()
                .setLastName("Last Name")
                .setFirstName("First Name")
                .setAddress("Address")
                .setPhone("Phone")
                .setEmail1("Email"));
        contactSubmit();
    }

}
