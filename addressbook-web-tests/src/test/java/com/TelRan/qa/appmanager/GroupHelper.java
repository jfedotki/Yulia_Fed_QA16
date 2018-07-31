package com.TelRan.qa.appmanager;

import com.TelRan.qa.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{

    private WebDriver wd;
    public GroupHelper(WebDriver wd) {
        super(wd);
    }



    public void createNewGroup() {

        click(By.xpath("//*[@value='New group']"));
    }

    public void groupFill(GroupData groupData){

        if(groupData.getGroupName()!=null) {
            type(By.name("group_name"), groupData.getGroupName());
        }

        if(groupData.getGroupHeader()!=null) {
            type(By.name("group_header"),groupData.getGroupHeader());
         }

        if(groupData.getGroupFooter()!=null) {
            type(By.name("group_footer"),groupData.getGroupFooter());
         }
    }

    public void groupSubmit() {
        click(By.name("submit"));
    }

    public void groupUpdate() {
        click(By.name("update"));
    }

    public void goToEditGroup() {
        click(By.name("edit"));
    }

    public void groupSelection() {
        click(By.name("selected[]"));
    }

    public void groupDeleteSubmition() {
        click(By.name("delete"));
    }

    public boolean isGroupPresent(){
        return isElementPresent(By.name("selected[]"));

    }

    public void createGroup(){
        createNewGroup();
        groupFill(new GroupData().withGroupFooter("Test Group")
                .withGroupName("Test Group")
                .withGroupHeader("This is a test group")
                .withGroupFooter("This group is test group"));

        groupSubmit();

    }
    public void goToGroupPage() {
        click(By.xpath("//*[@href='group.php']"));
    }
}
