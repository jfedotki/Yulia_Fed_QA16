package com.TelRan.QA16;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation(){
        goToGroupPage();
        createNewGroup();
        groupFill(new GroupData().withGroupFooter("First Group")
                .withGroupName("First Group")
                .withGroupHeader("This is a second group")
                .withGroupFooter("This group is regular group"));

        groupSubmit();
        goToGroupPage();
    }


}
