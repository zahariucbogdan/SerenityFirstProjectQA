package org.fasttrackit.pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CartPage extends BasePage{
    @FindBy (id = "country")
    private WebElementFacade selectcountry;
    @FindBy (id = "region_id")
    private WebElementFacade selectregion;
    @FindBy (id = "city")
    private  WebElementFacade cityname;
    @FindBy (id = "postcode")
    private  WebElementFacade postcode;
    @FindBy (css = ".cart-totals span span")
    private  WebElementFacade proceedtochechout;
    @FindBy(css = ".success-msg span")
    private WebElementFacade addedToCartMessage;
    public void clickSelectCountry(String value){ typeInto (selectcountry,value);}
    public void clickSelectRegion(String value){ typeInto (selectregion,value);}
    public void setCityname(String value){ typeInto (cityname,value);}
    public void setpostcode(String value){ typeInto(postcode,value);}
    public void clickProceedtochechout(){ clickOn(proceedtochechout);}
    public boolean wasProductWasAddedToCart(String productName) {
        return addedToCartMessage.getText().equalsIgnoreCase(productName + " was added to your shopping cart.");
    }

}
