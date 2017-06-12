package ict4appsProject.pages;

import ict4appsProject.Locators;

import net.thucydides.core.pages.PageObject;

/**
 * Created by userqa on 12.06.17.
 */
public class AdminControlPage extends PageObject {


    public void clickOnProductsItemOfCatalogTab() {
        $(Locators.ProductsCatalogItem).click();
    }

    public void clickOnAddProductButton() {
        $(Locators.AdminProductPortletAddProduct).click();
    }

    public void clickOnTypeOfStructuresDropdownMenu() {
        $(Locators.AdminProductPortletTypeOfStructure).click();
    }

    public void clickOnTypeOfStructuresDropdownItem() {
        $(Locators.AdminProductPortletTypeOfStructureItem).click();
    }
}
