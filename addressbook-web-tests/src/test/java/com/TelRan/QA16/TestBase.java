package com.TelRan.QA16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd =new ChromeDriver();
        String myUrl="http://localhost/addressbook";
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get(myUrl);
        login("admin","secret");
    }

    @AfterClass
    public void tearDown() throws Exception {

        // wd.quit();
    }

    public void contactFill(ContactData contact) {

            wd.findElement(By.name("firstname")).click();
            if(contact.getFirstName()!=null){
                 wd.findElement(By.name("firstname")).clear();
                 wd.findElement(By.name("firstname")).sendKeys(contact.getFirstName());
            }

            wd.findElement(By.name("lastname")).click();
             if(contact.getLastName()!=null) {
                wd.findElement(By.name("lastname")).clear();
                wd.findElement(By.name("lastname")).sendKeys(contact.getLastName());
            }

            wd.findElement(By.name("address")).click();
             if(contact.getAddress()!=null) {
               wd.findElement(By.name("address")).clear();
               wd.findElement(By.name("address")).sendKeys(contact.getAddress());
            }

            wd.findElement(By.name("email")).click();
             if(contact.getEmail1()!=null) {
                wd.findElement(By.name("email")).clear();
                wd.findElement(By.name("email")).sendKeys(contact.getEmail1());
            }

            wd.findElement(By.name("home")).click();
            if(contact.getPhone()!=null) {
               wd.findElement(By.name("home")).clear();
               wd.findElement(By.name("home")).sendKeys(contact.getPhone());
            }
            }

        public void contactSubmit(){
            wd.findElement(By.name("submit")).click();
            }
        public void contactUpdate(){
            wd.findElement(By.xpath("//*[@value='Update']")).click();
            }

    public  void contactSelect() {
        wd.findElement(By.name("selected[]")).click();
    }
    public void contactDelete(){
        wd.findElement(By.xpath("//*[@value='Delete']")).click();
        }

    public void confirmAlert(){
        wd.switchTo().alert().accept();
    }
    public void dismissAlert(){
        wd.switchTo().alert().dismiss();
    }

    public void goToEditContact(){
        wd.findElement(By.xpath("//*[@title='Edit']")).click();
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

    public void createNewGroup() {
        wd.findElement(By.xpath("//*[@value='New group']")).click();
    }

    public void goToGroupPage() {
        wd.findElement(By.xpath("//*[@href='group.php']")).click();
    }

    public void groupFill(GroupData groupData){

        wd.findElement(By.name("group_name")).click();
        if(groupData.getGroupName()!=null) {
            wd.findElement(By.name("group_name")).clear();
            wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
        }
        wd.findElement(By.name("group_header")).click();
        if(groupData.getGroupHeader()!=null) {
            wd.findElement(By.name("group_header")).clear();
            wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
        }
        wd.findElement(By.name("group_footer")).click();
        if(groupData.getGroupFooter()!=null) {
            wd.findElement(By.name("group_footer")).clear();
            wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
        }
    }

    public void groupSubmit() {
        wd.findElement(By.name("submit")).click();
    }
    public void groupUpdate() {
        wd.findElement(By.name("update")).click();
    }
    public void goToEditGroup() {
        wd.findElement(By.name("edit")).click();
    }

    public void groupSelection(String groupName) {
        String myXpath = "//*[@title='Select ("+groupName+")']";
        wd.findElement(By.xpath("//*[@href='group.php']")).click();
        wd.findElement(By.xpath(myXpath)).click();
    }

    public void groupDeleteSubmition(){
        wd.findElement(By.name("delete")).click();
    }
    public void createNewContact() {
        wd.findElement(By.linkText("add new")).click();
    }
    public void goHome(){
        wd.findElement(By.xpath("//*[@href='./']")).click();

    }

}
