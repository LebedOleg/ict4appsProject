package ict4appsProject.pages;

import ict4appsProject.Locators;

import ict4appsProject.Variables;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.yecht.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AdminControlPage extends PageObject {
    CRUD crud;

    String Name;
    String Description;
    String RetailPrice;
    String SalePrice;
    String Quantity;
    boolean i =false;
    String PhoneNum;
    int x;
    List<String> listList = new ArrayList<>();

    public void enterRandomTestDataToRetailPriceField(int size, String chararters, String field) {
        int sizeName = size; // size of random string
        String charac = "123456789"; //Create the character set for random string
        String charac2 = "0123456789abcdefghijklmnopqrstuvwxyz";
        if (chararters.equals("charac")) {
            chararters = charac;
        } else if (chararters.equals("charac2")) chararters = charac2;
        Random r = new Random();
        if (field.equals("retail")) {
            RetailPrice = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletDetailsTabPriceField.replace("$1", field)).sendKeys(RetailPrice);
        } else if (field.equals("sale")) {
            SalePrice = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletDetailsTabPriceField.replace("$1", field)).sendKeys(SalePrice);
        } else if (field.equals("Name")) {
            Name = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletNameField).sendKeys(Name);
        } else if (field.equals("Description")) {
            Description = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletDescriptionField).sendKeys(Description);
        } else if (field.equals("Quantity")) {
            Quantity = crud.generateString(r, chararters, sizeName);
            $(Locators.AdminProductPortletDetailsTabQuantityField).sendKeys(Quantity);
        } else if (field.equals("TestCategory")) {
            crud.clickByPixelLocation(Locators.AddCategoryPopUpContainer);
        }
    }

    public boolean compareCurrentNameOfProductWithEntered() {
        return $(Locators.AdminProductPortletNameField).getValue().equals(Name);
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
        return $(Locators.AdminProductPortletTypeOfStructure + "/option[@selected='']").getText().contains(Variables.StructureName);

    }

    public boolean checkThatDescriptionFieldHasRightData() {
        return $(Locators.AdminProductPortletDescriptionField).getText().equals(Description);
    }

    public boolean checkThatRightCategoryIsSelected() {
        return $(Locators.AdminProductPortletCategoriesTabItemCheckbox.replace("$1", Variables.CategoryName) + "[@checked='']").isPresent();
    }

    public boolean checkThatPriceFieldHasRightData(String arg0) {
        if (arg0.equals("retail")) {
            return $(Locators.AdminProductPortletDetailsTabPriceField.replace("$1", arg0)).getValue().contains(RetailPrice);
        } else {
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

    public boolean categoriesListShouldContainCategoryThatWasCreated(String Locator, String Variable) {
        List<WebElementFacade> list = findAll(Locator);
        for (WebElement element : list) {
            if (element.getText().equals(Variable)) {
                return true;
            }
        }
        return false;
    }

    //TODO: WORKFLOW

    public boolean checkThatCreatedOrderHasStatus(String arg0) {
        List<WebElementFacade> list = findAll(By.xpath(Locators.ORDER_LINE_STATUS));
        if (list.get(list.size() - 1).getText().contains(arg0)) {
            return true;
        } else return false;
    }

    public void clickOnTheCreatedOrderId() {
        List<WebElementFacade> list = findAll(By.xpath(Locators.ORDER_LINE_ID));
        list.get(list.size() - 1).click();
    }

    public boolean checkThatCreatedOrderPageHasStatusTag(String arg0) {
        return $(Locators.ORDER_PAGE_STATUS_TAG.replace("$1", arg0)).isPresent();
    }

    public boolean checkThatCreatedOrderPageHasStatusInStatusHistory(String arg0) {
        return $(Locators.ORDER_PAGE_HISTORY_STATUS).getText().equalsIgnoreCase(arg0);
    }

    public boolean checkThatCreatedOrderPageHasStatusInShortStatusHistory(String arg0) {
        return $(Locators.ORDER_PAGE_HISTORY_SHORT_STATUS).getText().equalsIgnoreCase(arg0);
    }

    public void writeIntoSearchUserTextBox(String arg0) {
        $(Locators.SRCH_USR_INPUT).sendKeys(arg0);
    }


    public boolean structuresListShouldContainStructure(String structureName) {
        if (crud.tryFindElement(Locators.AdminStructurePortletDisabledNextPaginationButton) == false) {
            i = crud.tryFindElement(Locators.AdminStructurePortletStructuresList.replace("$1", structureName));
        } else {
            $(Locators.AdminStructurePortletLastPaginationButton).click();
            i = crud.tryFindElement(Locators.AdminStructurePortletStructuresList.replace("$1", structureName));
        }
        return i;
    }


    public boolean structureShouldContainFieldOfBasicStructure(String arg0) {
        crud.clickMethod(Locators.AdminStructurePortletPaginationButton.replace("$1", " ← Первая "));
        String basicFields = $(Locators.AdminStructurePortletListOfStructureFields.replace("$1", "Basic")).getText();
        crud.clickMethod(Locators.AdminStructurePortletPaginationButton.replace("$1", " Последняя → "));
        return $(Locators.AdminStructurePortletListOfStructureFields.replace("$1", arg0)).getText().contains(basicFields);
    }


    public boolean structureShouldContainedFieldThatWasCreated(String fieldName) {
        if (crud.tryFindElement(Locators.AdminStructurePortletDisabledNextPaginationButton) == false) {
            i = crud.tryFindElement(Locators.AdminStructurePortletFieldIsVisible.replace("$1", fieldName));
        } else {
            $(Locators.AdminStructurePortletLastPaginationButton).click();
            i = crud.tryFindElement(Locators.AdminStructurePortletFieldIsVisible.replace("$1", fieldName));
        }
        return i;
    }

    //
    public boolean allStructuresShouldContainField(String field) {
        List<WebElementFacade> list = findAll(Locators.AdminStructurePortletFieldsOfAllStructures);

        for (WebElement element : list) {
            textContains(element.getText(), field);
        }
        return i;
    }

    public void textContains(String text, String field) {
        if (text.contains(field)) {
            i = true;
        } else {
            i = false;
        }
    }


    public void getPhoneNumber() {
        PhoneNum = crud.phoneNumber(Locators.PHONE_NUMBER_INPUT).getText();
    }

    public boolean checkThatWeCanEditPhoneNumberInputField() {
        return crud.phoneNumber(Locators.PHONE_NUMBER_INPUT).getText().equalsIgnoreCase(PhoneNum);
    }

    public boolean checkThatCreatedPhoneNumberWasDeleted() {
        int y = crud.getQuantityOfPhoneNumbers(Locators.PHONE_NUMBER_INPUT);
        return y == x - 1;
    }

    public void getListOfPhoneNumbers() {
        x = crud.getQuantityOfPhoneNumbers(Locators.PHONE_NUMBER_INPUT);
    }


    public boolean fieldShouldBeDeletedFromBasicStructure(String fieldName, String paginationButton, String listLocator) {
        WebElementFacade nextButton = $(Locators.AdminStructurePortletPaginationButton.replace("$1", paginationButton));
        String name = fieldName;
        while (i==false){
            List<WebElementFacade> list = findAll(listLocator);
            for (WebElementFacade elementFacade : list) {
                if (elementFacade.getText().equals(name)){
                    i = true;
                    return true;}
            }
            if (crud.tryElementIsEnabled(nextButton)==true) {
                nextButton.click();
                getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
                //wait that page is refreshed
            }else return false;
        }
        return false;
    }

    public boolean fieldShouldBeDeletedFromAllStructures(String fieldName, String paginationButton, String listLocator) {
        WebElementFacade nextButton = $(Locators.AdminStructurePortletPaginationButton.replace("$1", paginationButton));
        String name = fieldName;
        while (i==false){
            List<WebElementFacade> list = findAll(listLocator);
            for (WebElementFacade elementFacade : list) {
                if (elementFacade.getText().contains(name)){
                    i = true;
                    return true;}
            }
            if (crud.tryElementIsEnabled(nextButton)==true) {
                nextButton.click();
                getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
                //wait that page is refreshed
            }else return false;
        }
        return false;
    }
//
//    public void clickOnItemFromList(String arg0, String arg1) {
//        WebElementFacade nextButton = $(Locators.AdminStructurePortletPaginationButton.replace("$1", " Следующая "));
//        while (nextButton.isEnabled()){
//           if(crud.tryFindElement(Locators.AdminStructurePortletActionsButton.replace("$1", arg0).replace("$2", arg1))==true){
//               crud.clickMethod(Locators.AdminStructurePortletActionsButton.replace("$1", arg0).replace("$2", arg1));}
//           else crud.clickMethod(Locators.AdminStructurePortletPaginationButton.replace("$1", " Следующая "));
//        }
//    }
}


