package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class VipPage extends BasePage {
    @FindBy(id = "product-collection-image-412")
    private WebElementFacade clickproduct;
    public void clickproduct(){clickproduct.click();}
}
