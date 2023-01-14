package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class) public class RegisterTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Steps
    private RegisterTest registerTest;
    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }
    @Test
    public void validRegisterTest(){

        registerSteps.
        loginSteps.typeUserEmail("zahariucbogdan@yahoo.com");
        loginSteps.typePassword("qwerty");
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn("bogdan black");
    }
}
