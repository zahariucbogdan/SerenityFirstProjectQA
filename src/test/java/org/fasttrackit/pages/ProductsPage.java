package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject {
    @FindBy(id = "swatch26")
    private WebElementFacade selectcolor;
    @FindBy(id = "swatch79")
    private  WebElementFacade sizeM;
    @FindBy(css = "button.btn-cart:nth-child(1)")
    private WebElementFacade addToCart;
    public void clickSelectcolor () { clickOn(selectcolor); }
    public void clickSizeM() { clickOn(sizeM); }
    public void clickAddToCart() { clickOn(addToCart); }

}
