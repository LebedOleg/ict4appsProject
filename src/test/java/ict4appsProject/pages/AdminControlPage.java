package ict4appsProject.pages;

import ict4appsProject.Locators;

import net.thucydides.core.pages.PageObject;

import java.util.Random;

/**
 * Created by userqa on 12.06.17.
 */
public class AdminControlPage extends PageObject {
    String FirstName;


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



    public void enterRandomTestDateToNameField() {
        int sizeName = 8; // size of random string
        String charac = "0123456789abcdefghijklmnopqrstuvwxyz"; //Create the character set for random string
        Random r = new Random();
         FirstName = generateString(r, charac, sizeName);
        $(Locators.AdminProductPortletNameField).sendKeys(FirstName);
    }


    public static String generateString(Random rng, String characters, int length) //creating random string
    {
        char[] text = new char[length]; // Create list of chars
        for (int i = 0; i < length; i++) //Creating number of random symbols, size equals  variable length
        {
            text[i] = characters.charAt(rng.nextInt(characters.length())); //For current step create random character and saves in list
        }
        return new String(text);//return list
    }

    public void enterRandomTestDateToDescriptionField() {
        int sizeName = 8; // size of random string
        String charac = "0123456789abcdefghijklmnopqrstuvwxyz"; //Create the character set for random string
        Random r = new Random();
        String Description = generateString(r, charac, sizeName);
        $(Locators.AdminProductPortletDescriptionField).sendKeys(Description);
    }

    public void clickOnCategoriesTabOfProductsPortlet() {
        $(Locators.AdminProductPortletCategoriesTab).click();
    }

    public void selectTestCategory() {
        $(Locators.AdminProductPortletCategoriesTabItemCheckbox).click();
    }

    public void clickOnDetailTabOfProductsPortlet() {
        $(Locators.AdminProductPortletDetailsTab).click();
    }

    public void enterRandomTestDataToRetailPriceField() {
        int sizeName = 4; // size of random string
        String charac = "123456789"; //Create the character set for random string
        Random r = new Random();
        String RetailPrice = generateString(r, charac, sizeName);
        $(Locators.AdminProductPortletDetailsTabRetailPriceField).sendKeys(RetailPrice);
    }

    public void enterRandomTestDataToSalePriceField() {
        int sizeName = 4; // size of random string
        String charac = "123456789"; //Create the character set for random string
        Random r = new Random();
        String SalePrice = generateString(r, charac, sizeName);
        $(Locators.AdminProductPortletDetailsTabSaleField).sendKeys(SalePrice);
    }

    public void enterRandomTestDataToQuntityField() {
        int sizeName = 3; // size of random string
        String charac = "123456789"; //Create the character set for random string
        Random r = new Random();
        String Quantity = generateString(r, charac, sizeName);
        $(Locators.AdminProductPortletDetailsTabQuantityField).sendKeys(Quantity);
    }

    public void clickOnPublishButton() {
        $(Locators.AdminProductPortletPublishButton).click();
    }

    public boolean compareCurrentNameOfProductWithEntered() {
       return  $(Locators.AdminProductPortletNameField).getText().equals(FirstName);
    }
}
