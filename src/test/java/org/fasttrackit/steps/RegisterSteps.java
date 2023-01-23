package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;
public class RegisterSteps extends ScenarioSteps {
    private HomePage homePage;
    private AccountPage accountPage;
    private RegisterPage registerPage;
    @Step
    public void navigateToRegisterPage() {
        homePage.open();
        homePage.clickOnAccountButton();
        homePage.clickOnRegisterLink();}
    @Step
    public void typeFirstName(String firstname){ registerPage.setFirstnameField(firstname);}
    @Step
    public void typeMiddleName(String middlename){ registerPage.setMiddlenameField(middlename);}
    @Step
    public void typeLastnameField(String lastname){ registerPage.setLastnameField(lastname);}
    @Step
    public void typeUserEmail(String email){ registerPage.setEmail_addressField(email);}
    @Step
    public void typePasswordField(String password){ registerPage.setPasswordField(password);}
    @Step
    public void typeConfirmEmailField(String confirmpassword){ registerPage.setConfirmEmailField(confirmpassword);}
    @Step
    public void clickRegister() { registerPage.clickRegisterBotton();}

}
