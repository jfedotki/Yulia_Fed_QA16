package com.TelRan.QA16;

import org.testng.annotations.Test;

public class GroupDeleteTest extends TestBase {
    @Test
    public void editTest(){
        groupSelection("Second Group");
        groupDeleteSubmition();
        goToGroupPage();

    }

}
