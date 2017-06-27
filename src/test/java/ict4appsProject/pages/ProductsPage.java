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
        return $(Locators.RETAIL_PRICE_PRODUCT_PAGE).getText().contains(adminControlPage.Quantity);
    }

    public void enterOnNameField(String name) {
        $(Locators.AdminProductPortletNameField).sendKeys(name);
    }

    public void enterOnProductEditingDescriptionField(String description) {
        $(Locators.AdminProductPortletDescriptionField).sendKeys(description);
    }

    public void clickOnDropdownMenu(String dropDownMenu) {
        $(Locators.AdminProductPortletDetailsAvailabilityStatus).click();
    }

    public void selectItemOfDropdownMenu(String arg0, String arg1) {
        $(Locators.AdminProductPortletDetailsAvailabilityStatusItem.replace("$1", arg0)).click();
    }
}
