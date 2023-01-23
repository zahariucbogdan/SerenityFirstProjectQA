package org.fasttrackit.features;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
@RunWith(SerenityRunner.class)
    public class RegisterTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Steps
    private RegisterSteps registerSteps;
    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }
    @Test
    public void RegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Zahariuc");
        registerSteps.typeMiddleName("Nicolae");
        registerSteps.typeLastnameField("Bogdan");
        registerSteps.typeUserEmail("zahariucbogd@yahoo.com");
        registerSteps.typePasswordField("qwerty");
        registerSteps.typeConfirmEmailField("qwerty");
        registerSteps.clickRegister();}
    //@After
   // public void quit() {
     //   driver.close();
   // }
}
