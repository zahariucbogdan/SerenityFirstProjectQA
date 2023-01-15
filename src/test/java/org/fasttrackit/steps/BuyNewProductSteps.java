package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;

import java.awt.datatransfer.StringSelection;

public class BuyNewProductSteps extends ScenarioSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private CartPage cartPage;
    private VipPage vipPage;
    private ProductsPage productsPage;
    private CheckoutPage checkoutPage;

    @Step
    public void openHomePage() {
        homePage.open();}
    @Step
    public void clickAccountBotton(){
        homePage.clickOnAccountButton();}
    @Step
    public void clickOnLoginLink(){
        homePage.clickOnLoginLink();}
   @Step
   public void typeUserEmail(String email){
       loginPage.setEmailField(email);}
   @Step
   public void typeUserPassword (String password){
       loginPage.setPasswordField(password);}
    @Step
    public void clickHomeBotton (){homePage.clickHomeBotton();}
   @Step
    public void navigateToVipPage(){
        homePage.clickVipsection();}
    @Step
    public void clickProduct(){
        vipPage.clickproduct();}
    @Step
    public void selectColor(){
        productsPage.clickSelectcolor();}
    @Step
    public void clickSizeM(){
        productsPage.clickSizeM();}
    @Step
    public void clickAddToCart(){
        productsPage.clickAddToCart();}
    @Step
    public void selectCountry(String country){
        cartPage.clickSelectCountry(country);}
    @Step
    public void selectRegion(String city){
        cartPage.clickSelectRegion(city);}
    @Step
    public void typeCity(String city){
        cartPage.setCityname(city);}
    @Step
    public void typePostCode(String postcode){
        cartPage.setpostcode(postcode);}
    @Step
    public void clickProceedToCheckout(){
        cartPage.clickProceedtochechout();}
    @Step
    public void typeBillingFirstName(String billingFirstName) {
        checkoutPage.setBillingFirstName(billingFirstName);}
    @Step
    public void typeBillingMiddleName(String billingMiddleName){
        checkoutPage.setBillingMiddleName(billingMiddleName);}
    @Step
    public void typeBillingLastName(String billingLastName){
        checkoutPage.setBillingLastName(billingLastName);}
    @Step
    public void typeBillingStreet(String billingStreet){
        checkoutPage.setBillingStreet(billingStreet);}
    @Step
    public void typeBillingCity(String billingCity){
        checkoutPage.setBillingCity(billingCity);}
    @Step
    public void typeBillingCountry_id(String billingCountry_id){
        checkoutPage.setBillingCountry_id(billingCountry_id);}
    @Step
    public void typeBillingPostCode(String billingPostCode){
        checkoutPage.setBillingPostcode(billingPostCode);}
    @Step
    public void typeBillingPhone(String billingPhone){
        checkoutPage.setBillingPhone(billingPhone);}
    @Step
    public void clickBillingButtonContinueToShipping() {
        checkoutPage.clickBillingButtonsContinueToShipping();}
    @Step
    public void clickFreeShipping(){
        checkoutPage.clickFreeShipping();}
    @Step
    public void clickShippingMethodContinueToPayment() {
        checkoutPage.clickShippingMethodContinueToPayment();}
    @Step
    public void clickReviwOrder(){
        checkoutPage.clickPaymentButtonsContinueToOrderReview();}
    @Step
    public void clickplaceOrder(){
        checkoutPage.clickPlaceOrder();}

}

