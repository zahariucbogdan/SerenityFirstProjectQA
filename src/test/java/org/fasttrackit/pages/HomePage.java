package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;


@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountButton;
    @FindBy(css = "div.links:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)")
    private WebElementFacade loginLink;
    @FindBy(css = "div.links:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")
    private  WebElementFacade registerlink;
    @FindBy(id = "search")
    private WebElementFacade searchField;
    @FindBy(css = "li.level0:nth-child(6) > a:nth-child(1)")
    private WebElementFacade vipsection;
    @FindBy(css = ".large")
    private WebElementFacade homeBotton;
    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;

    public void clickOnAccountButton(){ clickOn(accountButton); }
    public void clickOnLoginLink(){ clickOn(loginLink); }
    public void clickOnRegisterLink() { clickOn(registerlink); }
    public void clickVipsection() { clickOn(vipsection); }
    public void clickHomeBotton() { clickOn(homeBotton); }
    public void clickSearchButton(){
        clickOn(searchButton);

    public void setSearchField(){ (String searchValue); }
        searchField.clear();
        searchField.sendKeys(searchValue + Keys.ENTER);
    }
}
