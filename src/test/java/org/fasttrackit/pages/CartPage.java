package org.fasttrackit.pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CartPage extends PageObject {
    @FindBy (id = "country")
    private WebElementFacade selectcountry;
    @FindBy (id = "region_id")
    private WebElementFacade selectregion;
    @FindBy (id = "city")
    private  WebElementFacade cityname;
    @FindBy (id = "postcode")
    private  WebElementFacade postcode;
    @FindBy (css = ".method-checkout-cart-methods-onepage-bottom > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
    private  WebElementFacade proceedtochechout;

    public void setSelectCountry(String value){
        selectcountry.sendKeys(value);}
    public void setSelectRegion(String value){ typeInto (selectregion,value);}
    public void setCityname(String value){ typeInto (cityname,value);}
    public void setpostcode(String value){ typeInto(postcode,value);}
    public void clickProceedtochechout(){ clickOn(proceedtochechout);}

}
