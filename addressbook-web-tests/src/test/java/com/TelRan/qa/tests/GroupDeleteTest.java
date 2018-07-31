package com.TelRan.qa.tests;

import org.testng.annotations.Test;

public class GroupDeleteTest extends TestBase {
    @Test
    public void editTest(){
        app.getGrHelper().goToGroupPage();
        if(!app.getGrHelper().isGroupPresent()){
            app.getGrHelper().createGroup();
        }
        app.getGrHelper().groupSelection();
        app.getGrHelper().groupDeleteSubmition();
        app.getGrHelper().goToGroupPage();
        app.getGrHelper().goHome();

    }

}
