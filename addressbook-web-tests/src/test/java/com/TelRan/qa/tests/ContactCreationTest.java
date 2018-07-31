package com.TelRan.qa.tests;

import com.TelRan.qa.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation( ){
        app.getContactHelper().createNewContact();

            app.getContactHelper().contactFill(new ContactData()
                .setLastName("Last Name")
                .setFirstName("First Name")
                .setAddress("Address")
                .setPhone("Phone")
                .setEmail1("Email"));
        app.getContactHelper().contactSubmit();
    }

}
