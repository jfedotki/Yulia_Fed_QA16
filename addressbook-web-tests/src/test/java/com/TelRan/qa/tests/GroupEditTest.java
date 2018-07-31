package com.TelRan.qa.tests;

import com.TelRan.qa.model.GroupData;
import org.testng.annotations.Test;

public class GroupEditTest extends TestBase{

    @Test
    public void editGroupTest(){
        app.getGrHelper().goToGroupPage();
        app.getGrHelper().groupSelection();
        app.getGrHelper().goToEditGroup();
        app.getGrHelper().groupFill(new GroupData().withGroupFooter("First Group")
                .withGroupName("Edited Group")
                .withGroupHeader("This is a second group")
                .withGroupFooter("This group is regular group"));
        app.getGrHelper().groupUpdate();
        app.getGrHelper().goHome();
    }





}
