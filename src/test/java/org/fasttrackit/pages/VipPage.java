package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class VipPage extends PageObject {
    @FindBy(id = "product-collection-image-427")
    private WebElementFacade selectproduct;
    public void setSelectproduct(String value){ clickOn(selectproduct);}
}
