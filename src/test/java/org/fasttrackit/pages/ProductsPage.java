package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    @FindBy(id = "swatch26")
    private WebElementFacade selectcolor;
    @FindBy(id = "swatch79")
    private  WebElementFacade sizeM;
    @FindBy(css = "button.btn-cart:nth-child(1)")
    private WebElementFacade addToCart;

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;
    public void clickSelectcolor () { clickOn(selectcolor); }
    public void clickSizeM() { clickOn(sizeM); }
    public void clickAddToCart() { clickOn(addToCart); }
    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

}
