package com.songkick.step_definitions;

import com.songkick.pages.LogInPage;
import com.songkick.utilities.BrowserUtils;
import com.songkick.utilities.Driver;
import io.cucumber.java.After;
import org.junit.Before;


public class Hooks {

    LogInPage logInPage=new LogInPage();

    @Before
    public void LogIn() {
     logInPage.logIn();

    }

    @After
    public void tearDownScenario() {
        BrowserUtils.sleep(1);
        Driver.closeDriver();

    }


}
