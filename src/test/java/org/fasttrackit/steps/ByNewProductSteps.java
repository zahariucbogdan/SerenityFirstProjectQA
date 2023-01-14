package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;

public class ByNewProductSteps extends ScenarioSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private CartPage cartPage;
    private VipPage vipPage;
    private ProductsPage productsPage;
    private CheckoutPage checkoutPage;

    @Step
    public void navigateToHomePage() {
        homePage.open();
        homePage.clickOnAccountButton();
        homePage.clickOnLoginLink();}
    @Step
    public void navigateToVipPage(){
        homePage.clickVipsection();}
    @Step
    public void selectProduct(){
        vipPage.setSelectproduct();}
    @Step
    public void addToCartProduct(){
        productsPage.clickSelectcolor();
        productsPage.clickSizeM();
        productsPage.clickAddToCart();}
    @Step
    public void addShippingDetails(){
        cartPage.setSelectCountry();
        cartPage.setSelectRegion();
        cartPage.setCityname();
        cartPage.setpostcode();
        cartPage.clickProceedtochechout();}
    @Step
    public void addBillingInfo() {
        checkoutPage.setBillingFirstName();
        checkoutPage.setBillingMiddleName();
        checkoutPage.setBillingLastName();
        checkoutPage.setBillingStreet();
        checkoutPage.setBillingCity();
        checkoutPage.setBillingCountry_id();
        checkoutPage.setBillingPostcode();
        checkoutPage.setBillingPhone();}
    @Step
    public void continueToShipping() {
        checkoutPage.clickBillingButtonsContinueToShipping();
        checkoutPage.clickFreeShipping();}
    @Step
    public void shippingMetod() {
        checkoutPage.clickShippingMethodContinueToPayment();}
    @Step
    public void reviwOrder(){
        checkoutPage.clickPaymentButtonsContinueToOrderReview();}
    @Step
    public void placeOrder(){
        checkoutPage.clickPlaceOrder();}

}
