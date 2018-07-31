package com.TelRan.qa.tests;

import com.TelRan.qa.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getGrHelper().goToGroupPage();
        app.getGrHelper().createNewGroup();
        app.getGrHelper().groupFill(new GroupData().withGroupFooter("First Group")
                .withGroupName("First Group")
                .withGroupHeader("This is a second group")
                .withGroupFooter("This group is regular group"));

        app.getGrHelper().groupSubmit();
        app.getGrHelper().goToGroupPage();
    }
}
