package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.ByNewProductSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BuyNewProduct {

    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    private ByNewProductSteps byNewProductSteps;
    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }
    @Test
    public void ByNewProductTest(){
        ByNewProductSteps.navigateToHomePage();
        ByNewProductSteps.navigateToVipPage();
        ByNewProductSteps.selectProduct();
        ByNewProductSteps.addToCartProduct();
        ByNewProductSteps.addShippingDetails();
        ByNewProductSteps.addBillingInfo();
        ByNewProductSteps.continueToShipping();
        ByNewProductSteps.shippingMetod();
        ByNewProductSteps.reviwOrder();
        ByNewProductSteps.placeOrder();
    }
    @After
    public void quit() {
        driver.close();
    }
}
