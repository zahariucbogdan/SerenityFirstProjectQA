package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;
    @FindBy(id =  "pass")
    private WebElementFacade passwordField;
    @FindBy(id = "send2")
    private WebElementFacade loginButton;
    public void setEmailField(String value){
        emailField.sendKeys(value);
    }
    public void setPasswordField(String value){
        passwordField.sendKeys(value);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

}