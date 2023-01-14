package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    @Test
    public void validLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("zahariucbogdan@yahoo.com");
        loginSteps.typePassword("qwerty");
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn("bogdan black");
    }

    @Test
    public void invalidLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("zahariucbogdan@yahoo");
        loginSteps.typePassword("qwe");
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn("bogdan black");
    }
    @After
    public void quit() {
        driver.close();
    }
}
