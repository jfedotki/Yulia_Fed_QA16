package com.TelRan.qa.appmanager;

import com.TelRan.qa.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }
    public  void contactSelect() {
       click(By.name("selected[]"));
    }

    public void contactDelete(){
        click(By.xpath("//*[@value='Delete']"));
        }

    public void goToEditContact(){
        click(By.xpath("//*[@title='Edit']"));
    }

    public void createNewContact() {
       click(By.linkText("add new"));
    }
    public void newContact(){
        createNewContact();
        contactFill(new ContactData().setAddress("new address").setFirstName("new first name").setLastName("new last name"));
        contactSubmit();
    }

    public void contactSelectByIndex(int i) {
        wd.findElements(By.name("selected[]")).get(i).click();
    }

    public void contactSubmit(){
            click(By.name("submit"));
            }

    public void contactUpdate(){
            click(By.xpath("//*[@value='Update']"));
            }

    public void contactFill(ContactData contact) {

        if(contact.getFirstName()!=null){
            type(By.name("firstname"),contact.getFirstName());
        }

        if(contact.getLastName()!=null) {
            type(By.name("lastname"),contact.getLastName());
        }

        if(contact.getAddress()!=null) {
            type(By.name("address"),contact.getAddress());
        }

        if(contact.getEmail1()!=null) {
            type(By.name("email"),contact.getEmail1());
        }

        if(contact.getPhone()!=null) {
            type(By.name("home"),contact.getPhone());

        }
    }
}
