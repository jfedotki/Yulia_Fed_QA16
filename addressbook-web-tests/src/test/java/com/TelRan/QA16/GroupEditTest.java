package com.TelRan.QA16;

import org.testng.annotations.Test;

public class GroupEditTest extends TestBase{

    @Test
    public void editGroupTest(){
        goToGroupPage();
        groupSelection("First Group");
        goToEditGroup();
        groupFill(new GroupData().withGroupFooter("First Group")
                .withGroupName("Edited Group")
                .withGroupHeader("This is a second group")
                .withGroupFooter("This group is regular group"));
        groupUpdate();
    }





}
