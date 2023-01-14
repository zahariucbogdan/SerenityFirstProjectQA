package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;

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
   public void typeUserEmail(String email) {
       loginPage.setPasswordField(email);}
   @Step
   public void typePassword(String password) {
        loginPage.setPasswordField(password);}
    @Step
    public void clickLoginBotton(){
        homePage.clickOnLoginLink();}
    @Step
    public void navigateToVipPage(){
        homePage.clickVipsection();}
    @Step
    public void selectProduct(){
        vipPage.setSelectproduct();}
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
    public void selectCountry(){
        cartPage.setSelectCountry();}
    @Step
    public void selectRegion(){
        cartPage.setSelectRegion();}
    @Step
    public void typeCity(){
        cartPage.setCityname();}
    @Step
    public void typePostCode(){
        cartPage.setpostcode();}
    @Step
    public void clickProceedToCheckout(){
        cartPage.clickProceedtochechout();}
    @Step
    public void typeBillingFirstName() {
        checkoutPage.setBillingFirstName();}
    @Step
    public void typeBillingMiddleName(){
        checkoutPage.setBillingMiddleName();}
    @Step
    public void typeBillingLastName(){
        checkoutPage.setBillingLastName();}
    @Step
    public void typeBillingStreet(){
        checkoutPage.setBillingStreet();}
    @Step
    public void typeBillingCity(){
        checkoutPage.setBillingCity();}
    @Step
    public void typeBillingCountry_id(){
        checkoutPage.setBillingCountry_id();}
    @Step
    public void typeBillingPostCode(){
        checkoutPage.setBillingPostcode();}
    @Step
    public void typeBillingPhone(){
        checkoutPage.setBillingPhone();}
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
