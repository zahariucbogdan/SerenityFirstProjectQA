package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.BuyNewProductSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BuyNewProductTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Steps
    private BuyNewProductSteps buyNewProductSteps;
    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }
    @Test
    public void buyNewProductTest() {
        buyNewProductSteps.openHomePage();
        buyNewProductSteps.clickAccountBotton();
        buyNewProductSteps.clickOnLoginLink();
        buyNewProductSteps.typeUserEmail("bogdan_black@yahoo.com");
        buyNewProductSteps.typeUserPassword("qwerty");
        buyNewProductSteps.clickHomeBotton();
        buyNewProductSteps.navigateToVipPage();
        buyNewProductSteps.clickProduct();
        buyNewProductSteps.selectColor();
        buyNewProductSteps.clickSizeM();
        buyNewProductSteps.clickAddToCart();
        buyNewProductSteps.selectCountry("Romania");
        buyNewProductSteps.selectRegion("Iasi");
        buyNewProductSteps.typeCity("Iasi");
        buyNewProductSteps.typePostCode("700460");
        buyNewProductSteps.clickProceedToCheckout();
        buyNewProductSteps.typeBillingFirstName("nicolae");
        buyNewProductSteps.typeBillingMiddleName("bogdan");
        buyNewProductSteps.typeBillingLastName("bogdan");
        buyNewProductSteps.typeBillingStreet("titu maiorescu,nr 10");
        buyNewProductSteps.typeBillingCity("Iasi");
        buyNewProductSteps.typeBillingCountry_id("Romania");
        buyNewProductSteps.typeBillingPostCode("700460");
        buyNewProductSteps.typeBillingPhone("0734931189");
        buyNewProductSteps.clickBillingButtonContinueToShipping();
        buyNewProductSteps.clickFreeShipping();
        buyNewProductSteps.clickShippingMethodContinueToPayment();
        buyNewProductSteps.clickReviwOrder();
        buyNewProductSteps.clickplaceOrder();}
    @After
    public void quit() {
        driver.close();}
}