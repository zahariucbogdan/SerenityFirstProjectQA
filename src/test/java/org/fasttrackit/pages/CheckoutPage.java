package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(id= "billing:firstname")
    private WebElementFacade billingFirstName;
    @FindBy (id = "billing:middlename")
    private  WebElementFacade billingMiddleName;
    @FindBy (id = "billing:lastname")
    private  WebElementFacade billingLastName;
    @FindBy (id = "billing:street1")
    private WebElementFacade billingStreet;
    @FindBy (id = "billing:city")
    private  WebElementFacade billingCity;
    @FindBy ( id = "billing:country_id")
    private WebElementFacade billingCountry_id;
    @FindBy (id = "billing:postcode")
    private WebElementFacade billingPostcode;
    @FindBy (id = "billing:telephone")
    private WebElementFacade billingPhone;
    @FindBy (id = "billing-buttons-container")
    private WebElementFacade billingButtonsContinueToShipping;
    @FindBy (id = "s_method_freeshipping_freeshipping")
    private WebElementFacade selectFreeShipping;
    @FindBy (id = "shipping-method-buttons-container")
    private WebElementFacade shippingMethodContinueToPayment;
    @FindBy (id = "payment-buttons-container")
    private WebElementFacade paymentButtonsContinueToOrderReview;
    @FindBy (id="review-buttons-container")
    private WebElementFacade placeOrder;

    public void setBillingFirstName(String value){ typeInto (billingFirstName,value);}
    public void setBillingMiddleName(String value){ typeInto (billingMiddleName,value);}
    public void setBillingLastName(String value){ typeInto (billingLastName,value);}
    public void setBillingStreet(String value){ typeInto (billingStreet,value);}
    public void setBillingCity(String value){ typeInto (billingCity,value);}
    public void setBillingCountry_id(String value){ typeInto (billingCountry_id,value);}
    public void setBillingPostcode(String value){ typeInto (billingPostcode,value);}
    public void setBillingPhone(String value){ typeInto (billingPhone,value);}
    public void clickBillingButtonsContinueToShipping(){ clickOn(billingButtonsContinueToShipping); }
    // Thread.sleep(15000);
    public void clickFreeShipping(){ clickOn(selectFreeShipping);}
    // Thread.sleep(5000);
    public void clickShippingMethodContinueToPayment(){ clickOn(shippingMethodContinueToPayment);}
    // Thread.sleep(5000);
    public void clickPaymentButtonsContinueToOrderReview(){ clickOn(paymentButtonsContinueToOrderReview);}
    // Thread.sleep(7000);
    public void clickPlaceOrder(){ clickOn(placeOrder);}

}
