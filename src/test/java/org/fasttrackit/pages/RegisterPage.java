package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;


public class RegisterPage extends BasePage {
    @FindBy(id = "#firstname")
    private WebElementFacade firstnameField;
    @FindBy(id = "#middlename")
    private WebElementFacade middlenameField;
    @FindBy(id = "lastname")
    private WebElementFacade lastnameField;
    @FindBy (id = "email_address")
    private WebElementFacade email_addressField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(id = "confirmation")
    private WebElementFacade confirmEmailField;
    @FindBy(css = "button.button:nth-child(2)")
    private WebElementFacade registerBotton;

    public void setFirstnameField (String value) { typeInto(firstnameField,value);}
    public void setMiddlenameField(String value) { typeInto(middlenameField,value);}
    public void setLastnameField(String value) { typeInto(lastnameField,value);}
    public void setEmail_addressField(String value) { typeInto(email_addressField,value);}
    public void setPasswordField(String value) { typeInto(passwordField,value);}
    public void setConfirmEmailField(String value) { typeInto(confirmEmailField,value);}
    public void clickRegisterBotton() { clickOn(registerBotton);}

}
