package ict4appsProject.pages;

import ict4appsProject.Locators;
import ict4appsProject.Variables;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

    String FieldID;
    int DAY;

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


    public boolean productsListShouldContainsProductThatWasCreated(String Locator) {
        List<WebElementFacade> list = findAll(Locator);
        for (WebElement element : list) {
            if (element.getText().equals(Name)) {
                return true;
            }
        }
        return false;
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


//    public boolean structureShouldContainedFieldThatWasCreated(String fieldName) {
//        WebElementFacade nextButton = $(Locators.AdminStructurePortletNextPaginationButton.replace("$1", " Следующая "));
//        String name = fieldName;
//        while (i==false){
//            List<WebElementFacade> list = findAll(listLocator);
//            for (WebElementFacade elementFacade : list) {
//                if (elementFacade.getText().equals(name)){
//                    i = true;
//                    return true;}
//            }
//            if (nextButton.hasClass("disabled")) {
//                return false;
//                //wait that page is refreshed
//            }else {nextButton.click();
//                getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);}
//        }
//        return false;
//    }

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

    public void clickOnTheButtonMoreThanTimes(String arg0, int arg1) {
        int i;
        for (i = 0; i <= arg1; i++) {
            crud.clickMethod(Locators.BUTTON.replace("$1", arg0));
        }
    }

    public boolean fieldShouldBeDeletedFromBasicStructure(String fieldName, String Locator) {
        try {
            $(Locators.AdminStructurePortletPaginationButton.replace("$1", " Последняя → ")).click();
            return $(Locator.replace("$1", fieldName)).isPresent();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return $(Locator.replace("$1", fieldName)).isPresent();
        }
    }

//        WebElementFacade nextButton = $(Locators.AdminStructurePortletNextPaginationButton.replace("$1", " Следующая "));
//        String name = fieldName;
//        while (i==false){
//            List<WebElementFacade> list = findAll(listLocator);
//            for (WebElementFacade elementFacade : list) {
//                if (elementFacade.getText().equals(name)){
//                    i = true;
//                    return true;}
//            }
//            if ($(Locators.AdminStructurePortletNextPaginationButton.replace("$1", " Следующая ")).hasClass("disabled")) {
//                return false;
//                //wait that page is refreshed
//            }else {nextButton.click();
//                getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);}
//        }
//        return false;
//    }


    public boolean fieldShouldBeDeletedFromAllStructures(String fieldName, String listLocator) {
        WebElementFacade nextButton = $(Locators.AdminStructurePortletPaginationButton.replace("$1", " Следующая "));
        String name = fieldName;
        while (i==false){
            List<WebElementFacade> list = findAll(listLocator);
            for (WebElementFacade elementFacade : list) {
                if (elementFacade.getText().contains(name)){
                    i = true;
                    return true;}
            }
            if (nextButton.hasClass("disabled")) {
                return false;
                //wait that page is refreshed
            }else {nextButton.click();
                getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);}
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


    public boolean checkThatThereAreNoMoreThanNumbers(int arg0) {
        x = crud.getQuantityOfPhoneNumbers(Locators.PHONE_NUMBER_INPUT);
        return x == arg0;
    }

    public void deleteAllPhoneNumbers() {
        x = crud.getQuantityOfPhoneNumbers(Locators.PHONE_NUMBER_INPUT);
        int i;
        for (i = 0; i < x; i++) {
            crud.clickMethod(Locators.REMOVE_PHONE_NUMBER_ICON);
        }
    }

    public String getElementText(String xpath) {
        FieldID = find(By.xpath(xpath)).getText();
        return FieldID;
    }

    public void clickOnTheButtonInOpenedPopUP(String arg0) {
        $(Locators.yyy.replace("$1", arg0).replace("$2", FieldID)).click();
    }

    public void clickOnOurCreatedProductTitle() {
        crud.clickMethod(Locators.AdminProductPortletProductName.replace("$1", Name));
    }

    public void enterNextDayDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, +1);
        String  date = dateFormat.format(calendar.getTime());
        $(Locators.DATE_PICKER).clear();
        $(Locators.DATE_PICKER).sendKeys(date);
    }

    public void clickOnLastProductInProductList() {
        $(Locators.AdminProductsPageLastProductInList).click();
    }

    public boolean productEditingPageShouldHaveButton(String name) {
        return $(Locators.LINK.replace("$1", name)).isPresent();
    }

    public void enterOnNameTextbox(String arg0) {
        $(Locators.AdminProductsPageNameTextbox).sendKeys(arg0);
    }


    public void enterPrevDayDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        String  date = dateFormat.format(calendar.getTime());
        $(Locators.DATE_PICKER).clear();
        $(Locators.DATE_PICKER).sendKeys(date);
    }

}