package ict4appsProject.pages;

import ict4appsProject.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://staging.ict4apps.aimprosoft.com/products")
public class ProductsPage extends PageObject{

    AdminControlPage adminControlPage;
    CRUD crud;

    public void clickOnOurCreatedProductTitleOnProductsPage() {
        crud.clickMethod(Locators.CREATED_PRODUCT_TITLE.replace("$1", adminControlPage.Name));
    }

    public boolean checkThatShortDescriptionIsVisible() {
        return $(Locators.SHORT_DESC.replace("$1",adminControlPage.Name)).getText().equalsIgnoreCase(adminControlPage.Description);
    }

    public boolean checkThatPriceEqualsToCreatedInAdminCP() {
        return $(Locators.RETAIL_PRICE_LIST.replace("$1",adminControlPage.Name)).getText().equalsIgnoreCase(adminControlPage.RetailPrice);
    }

    public boolean checkThatTitleOfProductIsDisplayed() {
        return $(Locators.SPAN.replace("$1",adminControlPage.Name)).isVisible();
    }

    public boolean checkThatProductDescriptionIsDisplayed() {
        return $(Locators.PRODUCT_DESC).getText().contains(adminControlPage.Description);
    }

    public boolean checkThatQuantityOfProductIsDisplayed() {
        return $(Locators.PRODUCT_QUANTITY).getText().contains(adminControlPage.Quantity);
    }

    public boolean checkThatShortDescriptionIsVisibleInAdminCP() {
        return $(Locators.SHORT_DESC_ADMIN.replace("$1",adminControlPage.Name)).getText().contains(adminControlPage.Description);
    }

    public boolean checkThatSalePriceEqualsToCreatedInAdminCP() {
        return $(Locators.RETAIL_PRICE_LIST.replace("$1",adminControlPage.Name)).containsText(adminControlPage.SalePrice);
    }

    public boolean checkThatRetailPriceEqualsToCreatedInAdminCPOnProductPage() {
        return $(Locators.RETAIL_PRICE_PRODUCT_PORTLET).containsText(adminControlPage.RetailPrice);
    }

    public boolean checkThatSalePriceEqualsToCreatedInAdminCPOnProductPage() {
        return $(Locators.RETAIL_PRICE_PRODUCT_PORTLET).containsText(adminControlPage.SalePrice);
    }

    public boolean checkThatLabelIsAppearsOnOnOurProduct(String arg0) {
        return $(Locators.SPECIAL_OFFER_LABEL.replace("$1",adminControlPage.Name).replace("$2",arg0)).isVisible();
    }

    public boolean thenCheckThatLabelIsDisappearedOnOnOurProduct(String arg0) {
        return !$(Locators.SPECIAL_OFFER_LABEL.replace("$1",adminControlPage.Name).replace("$2",arg0)).isVisible();
    }

    public void clickOnTheSpanUnderProduct(String arg0, String arg1) {
        if (!crud.elementIsPresent(Locators.EDIT_PRODUCT.replace("$2",arg0).replace("$1",arg1))){
            crud.clickMethod(Locators.OFF_OPTIONS);
            crud.clickMethod(Locators.EDIT_PRODUCT.replace("$2",arg0).replace("$1",arg1));
        }
    }
}
