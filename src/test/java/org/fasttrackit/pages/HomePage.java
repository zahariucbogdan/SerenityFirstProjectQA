package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountButton;
    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;
    @FindBy(css = "div.links:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")
    private  WebElementFacade registerlink;
    @FindBy(id = "search")
    private WebElementFacade searchField;
    @FindBy(css = "li.level0:nth-child(6) > a:nth-child(1)")
    private WebElementFacade vipsection;
    public void clickOnAccountButton(){
        clickOn(accountButton);
    }
    public void clickOnLoginLink(){
        clickOn(loginLink);
    }
    public void clickOnRegisterLink() { clickOn(registerlink); }
    public void clickVipsection() { clickOn(vipsection); }
    public void setSearchField(String searchValue) {
        searchField.clear();
        searchField.sendKeys(searchValue + Keys.ENTER);
    }
}
