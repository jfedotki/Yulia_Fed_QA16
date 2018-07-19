package com.TelRan.QA16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ContactCreationTest {
    WebDriver wd;
    ArrayList<ContactData> contactList = new ArrayList<>();

    @BeforeMethod
        public void setUp() {
        wd =new ChromeDriver();
        String myUrl="http://localhost/addressbook";
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get(myUrl);
        login("admin","secret");

    }

    @Test
    public void testContactCreation( ){
        createTestContactList(3);
        createContact();


    }
    @AfterMethod
    public void tearDown() throws Exception {

        // wd.quit();
    }



    public void createContact() {
        for (int i =0;i<contactList.size();i++){
            wd.findElement(By.linkText("add new")).click();
            wd.findElement(By.name("firstname")).click();
            wd.findElement(By.name("firstname")).sendKeys(contactList.get(i).getFirstName());

            wd.findElement(By.name("lastname")).click();
            wd.findElement(By.name("lastname")).sendKeys(contactList.get(i).getLastName());

            wd.findElement(By.name("address")).click();
            wd.findElement(By.name("address")).sendKeys(contactList.get(i).getAddress());

            wd.findElement(By.name("email")).click();
            wd.findElement(By.name("email")).sendKeys(contactList.get(i).getEmail1());

            wd.findElement(By.name("home")).click();
            wd.findElement(By.name("home")).sendKeys(contactList.get(i).getPhone());

            wd.findElement(By.name("submit")).click();
        }
    }



    private void createTestContactList(int n) {
        for (int i= 0; i<n;i++){
            contactList.add(new ContactData("fist name"+i,"last name"+i,"email"+i,"phone"+i,"address"+i));
        }
    }


    public void login(String name, String password){
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(name);

        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//*[@type='submit']")).click();


    }

}
