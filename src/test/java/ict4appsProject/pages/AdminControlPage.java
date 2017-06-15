package ict4appsProject.pages;

import ict4appsProject.Locators;

import ict4appsProject.Variables;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

/**
 * Created by userqa on 12.06.17.
 */
public class AdminControlPage extends PageObject {
    CRUD crud;

    String Name;
    String Description;
    String RetailPrice;
    String SalePrice;
    String Quantity;





    public void enterRandomTestDataToRetailPriceField(int size, String chararters,String field) {
        int sizeName = size; // size of random string
        String charac = "123456789"; //Create the character set for random string
        String charac2 = "0123456789abcdefghijklmnopqrstuvwxyz";
        if(chararters.equals("charac")) {chararters = charac;}
        else if (chararters.equals("charac2")) chararters = charac2;
        Random r = new Random();
        if (field.equals("retail")) {
        RetailPrice = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletDetailsTabPriceField.replace("$1", field)).sendKeys(RetailPrice);}
        else if(field.equals("sale")) {
            SalePrice = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletDetailsTabPriceField.replace("$1", field)).sendKeys(SalePrice);}
         else if (field.equals("Name")){
            Name = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletNameField).sendKeys(Name);
        }else if(field.equals("Description")) {
            Description = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletDescriptionField).sendKeys(Description);
        }else if(field.equals("Quantity")) {
            Quantity = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletDetailsTabQuantityField).sendKeys(Quantity);
        }else if(field.equals("TestCategory")) {
             crud.clickByPixelLocation(Locators.AddCategoryPopUpContainer);
        }
        }


    public boolean compareCurrentNameOfProductWithEntered() {
       return  $(Locators.AdminProductPortletNameField).getValue().equals(Name);
    }


    public void productsListShouldContainsProductThatWasCreated(String Locator) {
        List<WebElementFacade> list = findAll(Locator);
        for (WebElement element : list) {
           if (element.getText().equals(Name)) {
               crud.clickMethod(Locators.AdminProductPortletProductName.replace("$1", Name));
           }
        }

    }

    public boolean checkThatTypeOfStructuresDropdownMenuHasRightItem() {
       return  $(Locators.AdminProductPortletTypeOfStructure + "/option[@selected='']").getText().equals(" тест структуры ");

    }

    public boolean checkThatDescriptionFieldHasRightData() {
        return $(Locators.AdminProductPortletDescriptionField).getText().equals(Description);
    }

    public boolean checkThatRightCategoryIsSelected() {
        return $(Locators.AdminProductPortletCategoriesTabItemCheckbox + "[@checked='']").isPresent();
    }

    public boolean checkThatPriceFieldHasRightData(String arg0) {
        System.out.println(RetailPrice);
        System.out.println(SalePrice);
        if (arg0.equals("retail")) {
      return   $(Locators.AdminProductPortletDetailsTabPriceField.replace("$1", arg0)).getValue().contains(RetailPrice); }
      else {
            return $(Locators.AdminProductPortletDetailsTabPriceField.replace("$1", arg0)).getValue().contains(SalePrice);
        }
    }

    public boolean checkThatQuntityFieldHasRightData() {
        return $(Locators.AdminProductPortletDetailsTabQuantityField).getValue().equals(Quantity);
    }



    public void test() {
        System.out.println(Name);
        System.out.println(Description);
        System.out.println(SalePrice);
    }

    public  boolean categoriesListShouldContainCategoryThatWasCreated(String Locator, String Variable) {
        List<WebElementFacade> list = findAll(Locator);
        for (WebElement element : list) {
            if (element.getText().equals(Variable)) {
                return true;
            }
        }
        return false;
    }
}
