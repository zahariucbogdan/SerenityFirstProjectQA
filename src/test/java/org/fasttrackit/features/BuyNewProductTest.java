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
        buyNewProductSteps.typeUserEmail("bogdan_black@yahoo.com");
        buyNewProductSteps.typePassword("qwerty");
        buyNewProductSteps.clickLoginBotton();
        buyNewProductSteps.navigateToVipPage();
        buyNewProductSteps.selectProduct();
        buyNewProductSteps.selectColor();
        buyNewProductSteps.clickSizeM();
        buyNewProductSteps.clickAddToCart();
        buyNewProductSteps.selectCountry("Romania");
        buyNewProductSteps.selectRegion("Iasi");
        buyNewProductSteps.typeCity("Iasi");
        buyNewProductSteps.typePostCode("700460");
        buyNewProductSteps.clickProceedToCheckout("zahariuc");
        buyNewProductSteps.typeBillingFirstName("nicolae");
        buyNewProductSteps.typeBillingMiddleName("bogdan");
        buyNewProductSteps.typeBillingLastName("titu maiorescu,nr 10");
        buyNewProductSteps.typeBillingStreet("Iasi");
        buyNewProductSteps.typeBillingCity("Romania");
        buyNewProductSteps.typeBillingCountry_id("700460");
        buyNewProductSteps.typeBillingPostCode("0734931189");
        buyNewProductSteps.typeBillingPhone();
        buyNewProductSteps.clickBillingButtonContinueToShipping();
        buyNewProductSteps.clickFreeShipping();
        buyNewProductSteps.clickShippingMethodContinueToPayment();
        buyNewProductSteps.clickReviwOrder();
        buyNewProductSteps.clickplaceOrder();}
    @After
    public void quit() {
        driver.close();}
}