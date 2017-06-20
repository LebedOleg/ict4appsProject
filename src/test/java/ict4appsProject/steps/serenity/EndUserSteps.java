package ict4appsProject.steps.serenity;

import ict4appsProject.Locators;
import ict4appsProject.Variables;
import ict4appsProject.pages.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {


    WelcomePage welcomePage;
    ProductsPage productsPage;
    LogInPage logInPage;
    AdminControlPage adminControlPage;
    CRUD crud;

    @Step
    public void theUserIsOnIctAppsStagingPage() {
        welcomePage.open();
    }

    @Step
    public void theUserClickOnFirstProductImageInSuperImageCarousel(String arg0) {
        crud.clickMethod(Locators.SuperCarouselItem);
    }
    @Step
    public void productURLShouldContain(String arg0) {
       Assert.assertThat(productsPage.getCurrentURL(), containsString(arg0));
    }

    @Step
    public void clickOnLogInLink() {
        crud.clickMethod(Locators.LogInLink);
    }

    @Step
    public void enterEmailAddress() {
        logInPage.enterEmailAddress();
    }

    @Step
    public void enterPassword() {
        logInPage.enterPassword();
    }

    @Step
    public void clickOnLogInButton() {
        logInPage.clickOnLogInButton();
    }

    @Step
    public void clickOnControlDropDownMenu() {
        crud.clickMethod(Locators.ControlDropDownMenu);
    }

    @Step
    public void clickOnCatalogItemOfControlDropDownMenu(String arg0) {
        crud.clickMethod(Locators.ControllDropDownMenuCatalogItem.replace("$1", arg0));
    }

    @Step
    public void clickOnProductsItemOfCatalogTab(String arg0) {
        crud.waitBit(1500);
        crud.clickMethod(Locators.ProductsCatalogItem.replace("$1", arg0));
    }

    @Step
    public void clickOnAddProductButton() {
        crud.clickMethod(Locators.AdminProductPortletAddProduct);
    }
    @Step
    public void clickOnTypeOfStructuresDropdownMenu() {
        crud.clickMethod(Locators.AdminProductPortletTypeOfStructure);
    }

    @Step
    public void clickOnTypeOfStructuresDropdownItem(String StructureItem) {
        crud.clickMethod(Locators.AdminProductPortletTypeOfStructureItem.replace("$1", StructureItem));

    }

    @Step
    public void enterRandomTestDateToNameField() {
        adminControlPage.enterRandomTestDataToRetailPriceField(8, "charac2", "Name");
    }

    @Step
    public void enterRandomTestDateToDescriptionField() {
        adminControlPage.enterRandomTestDataToRetailPriceField(8, "charac2", "Description");
    }

    @Step
    public void clickOnCategoriesTabOfProductsPortlet() {
        crud.clickMethod(Locators.AdminProductPortletCategoriesTab);
    }

    @Step
    public void selectTestCategory(String testCategory) {
        crud.clickMethod(Locators.AdminProductPortletCategoriesTabItemCheckbox.replace("$1", testCategory));
    }
    @Step
    public void clickOnDetailTabOfProductsPortlet() {
        crud.clickMethod(Locators.AdminProductPortletDetailsTab);
    }

    @Step
    public void enterRandomTestDataToRetailPriceField(String arg0) {
        adminControlPage.enterRandomTestDataToRetailPriceField(4,"charac", arg0);
    }

    @Step
    public void enterRandomTestDataToQuntityField() {
        adminControlPage.enterRandomTestDataToRetailPriceField(3, "charac", "Quantity");
    }
    @Step
    public void clickOnPublishButton() {
        crud.clickMethod(Locators.AdminProductPortletPublishButton);
    }

    public void productNameAccordingToNameThatWasEntered() {
        Assert.assertTrue(adminControlPage.compareCurrentNameOfProductWithEntered() );
    }

    @Step
    public void clickOnLASTPaginationButton() {
        crud.waitBit(1500);
        crud.clickMethod(Locators.AdminProductPortletLastPaginationButton);
    }

    @Step
    public void productsListShouldContainsProductThatWasCreated() {
        adminControlPage.productsListShouldContainsProductThatWasCreated(Locators.AdminProductPortletListOfProductsNames);
    }

    @Step
    public void checkThatTypeOfStructuresDropdownMenuHasRightItem() {
        Assert.assertTrue(adminControlPage.checkThatTypeOfStructuresDropdownMenuHasRightItem());
    }

    @Step
    public void checkThatDescriptionFieldHasRightData() {
        Assert.assertTrue(adminControlPage.checkThatDescriptionFieldHasRightData());
    }

    @Step
    public void checkThatRightCategoryIsSelected() {
        Assert.assertTrue(adminControlPage.checkThatRightCategoryIsSelected());
    }

    @Step
    public void checkThatPriceFieldHasRightData(String arg0) {
        Assert.assertTrue(adminControlPage.checkThatPriceFieldHasRightData(arg0));
    }
    @Step
    public void checkThatQuntityFieldHasRightData() {
        Assert.assertTrue(adminControlPage.checkThatQuntityFieldHasRightData());
    }

    public void test() {
        adminControlPage.test();
    }

    @Step
    public void clickOnAddCategoryButton() {
        crud.clickMethod(Locators.AdminCategoryPortletAddButton);
    }

    @Step
    public void enterRandomTestDataToCategoryNameField() {
        adminControlPage.enterRandomTestDataToRetailPriceField(8,"charac2", Variables.CategoryName);
    }
    @Step
    public void clickOnSaveButtonOfCreateCategoryForm() {
        crud.clickMethod(Locators.AddCategoryPopUpSaveButton);
    }

    @Step
    public void clickOnAddSructureButton() {
        crud.clickMethod(Locators.AdminStructurePortletAddStructureButton);
    }

    @Step
    public void enterDataToStructureNameField() {
        crud.sendKeysMethod(Locators.AdminStructurePortletStructureNameField, Variables.StructureName);
    }

    @Step
    public void clickOnSaveStructureButton() {
        crud.clickMethod(Locators.AdminStructurePortletSaveStructureButton);
    }

    @Step
    public void categoriesListShouldContainCategoryThatWasCreated() {
        Assert.assertTrue(adminControlPage.categoriesListShouldContainCategoryThatWasCreated(Locators.AdminCategoryPortletCategoriesList, Variables.CategoryName));
    }
    @Step
    public void structuresListShouldContainStructureThatWasCreated() {
        Assert.assertTrue(crud.elementIsPresent(Locators.AdminStructurePortletStructuresList.replace("$1", Variables.StructureName)));
    }

    @Step
    public void clickOnStructureThatWasCreated() {
        crud.clickMethod(Locators.AdminStructurePortletStructuresList.replace("$1", Variables.StructureName));
    }
    @Step
    public void clickOnAddFieldOnStructureButton() {
        crud.clickMethod(Locators.AdminStructurePortletAddButton);
    }
    @Step
    public void selectCreateNewItemOfAddFieldToStructureDropdownMenu() {
        crud.clickMethod(Locators.AdminStructurePortletAddFieldButtonItem);
    }
    @Step
    public void enterTestDataToFieldNameField(String arg0) {
        crud.sendKeysMethod(Locators.AdminStructurePortletNameOfNewField, arg0);
    }
    @Step
    public void clickOnAddNewFieldToStructureButton() {
        crud.clickMethod(Locators.AdminStructurePortletAddNewFieldButton);
    }
    @Step
    public void structureShouldContainedFieldThatWasCreated(String FieldName) {
        Assert.assertTrue(crud.elementIsPresent(Locators.AdminStructurePortletFieldIsVisible.replace("$1", FieldName)));
    }
    @Step
    public void clickOnNameOfFieldThatWasCreated(String FieldName) {
        crud.clickMethod(Locators.AdminStructurePortletNameOfField.replace("$1", FieldName));
    }
    @Step
    public void clickOnTypeOfDisplayDropdownMenu() {
        crud.clickMethod(Locators.AdminStructurePortletTypeOfDisplayDropDown);
    }
    @Step
    public void selectOptionOfTypeOfDisplayDropdownMenu(String arg0) {
        crud.clickMethod(Locators.AdminStructurePortletTypeOfDisplayDropDownItem.replace("$1", arg0));
    }
    @Step
    public void addFieldOptionButtonShouldAppeared() {
        Assert.assertTrue(crud.elementIsPresent( Locators.AdminStructurePortletAddOptionOfFieldButton));
    }
    @Step
    public void clickOnAddFieldOptionButton() {
        crud.clickMethod(Locators.AdminStructurePortletAddOptionOfFieldButton);
    }
    @Step
    public void enterOnValuesFieldOfAddOptionPopup(String arg0) {
        crud.sendKeysMethod(Locators.AdminStructurePortletValueFieldOfAddOptionPopUp,arg0);
    }

    public void clickOnSaveButtonOfAddOptionPopup() {
        crud.clickMethod(Locators.AdminStructurePortletSaveButtonOfAddOptionPopUp);
    }

    @Step
    public void optionShouldAppearedOnOptionList(String arg0) {
        Assert.assertTrue(crud.elementIsPresent(Locators.AdminStructurePortletFieldIsVisible.replace("$1", arg0)));
    }

    @Step
    public void clickOnAddFieldToStructureButton() {
        crud.clickMethod(Locators.AdminStructurePortletAddFieldButton);
    }

    @Step
    public void clickOnBackButtonOfAdminCP() {
        crud.clickMethod(Locators.AdminControlPanelBackButton);
    }

    @Step
    public void clickOnSaveButtonOfFieldEdditPage() {
        crud.clickMethod(Locators.AdminStructurePortletSaveButtonOfFieldEddit);
    }

    @Step
    public void logInIntoSystemAsAdmin() {
        crud.clickMethod(Locators.LogInLink);
        logInPage.enterEmailAddress();
        logInPage.enterPassword();
        logInPage.clickOnLogInButton();
        Assert.assertTrue(crud.elementIsPresent(Locators.ControlDropDownMenu));
    }

    @Step
    public void goToProductsAdminCPPageAndClickOnAddButton() {
        crud.clickMethod(Locators.ControlDropDownMenu);
        clickOnCatalogItemOfControlDropDownMenu(" Каталог ");
        clickOnProductsItemOfCatalogTab("Продукты");
        clickOnAddProductButton();
    }
@Step
    public void controlDropDownMenuShouldAppeared() {
        Assert.assertTrue(crud.elementIsPresent(Locators.ControlDropDownMenu));
    }

    @Step
    public void checkThatProductFieldIsCreatedRight() {
        clickOnProductsItemOfCatalogTab("Продукты");
        clickOnLASTPaginationButton();
        productsListShouldContainsProductThatWasCreated();
        productNameAccordingToNameThatWasEntered();
        checkThatDescriptionFieldHasRightData();
        checkThatTypeOfStructuresDropdownMenuHasRightItem();
        clickOnCategoriesTabOfProductsPortlet();
        checkThatRightCategoryIsSelected();
        clickOnDetailTabOfProductsPortlet();
        checkThatPriceFieldHasRightData("retail");
        checkThatPriceFieldHasRightData("sale");
        checkThatQuntityFieldHasRightData();
    }

        @Step
        public void clickOnTheSpan(String arg0) {
            crud.clickMethod(Locators.SPAN.replace("$1", arg0));
        }

        @Step
        public void clickOnFirstProductTitle() {
            crud.clickMethod(Locators.FIRST_PRODUCT_TITLE);
        }

        @Step
        public void clickOnTheButton(String arg0) {
            crud.clickMethod(Locators.BUTTON.replace("$1", arg0));
        }

        @Step
        public void clickOnTheCartIcon() {
            welcomePage.checkForCartOptionsVisibility();
            crud.waitBit(100);
            crud.clickMethod(Locators.CART);
        }

        @Step
        public void clickOnTheLink(String arg0) {
            crud.clickMethod(Locators.LINK.replace("$1", arg0));
            crud.waitBit(2000);
        }

        @Step
        public void checkThatCreatedOrderHasStatus(String arg0) {
            Assert.assertTrue(adminControlPage.checkThatCreatedOrderHasStatus(arg0));
        }

        @Step
        public void clickOnTheCreatedOrderId() {
            adminControlPage.clickOnTheCreatedOrderId();
        }

        @Step
        public void checkThatCreatedOrderPageHasStatusTag(String arg0) {
            Assert.assertTrue(adminControlPage.checkThatCreatedOrderPageHasStatusTag(arg0));
        }

        @Step
        public void checkThatCreatedOrderPageHasStatusInStatusHistory(String arg0) {
            Assert.assertTrue(adminControlPage.checkThatCreatedOrderPageHasStatusInStatusHistory(arg0));
        }

        @Step
        public void checkThatCreatedOrderPageHasStatusInShortStatusHistory(String arg0) {
            Assert.assertTrue(adminControlPage.checkThatCreatedOrderPageHasStatusInShortStatusHistory(arg0));
        }

        @Step
        public void openNewTab() {
            welcomePage.openNewTab();
        }

        @Step
        public void clickOnTheSelfPickUpCheckbox() {
            crud.clickMethod(Locators.SELF_PICK_UP_CHECKBOX);
        }

    @Step
    public void selectAddress() {
        crud.waitBit(1000);
        crud.clickMethod(Locators.ADDRESS_SELECT);
        crud.clickMethod(Locators.ADDRESS);
    }

        @Step
        public void switchTab(String arg0) {
            crud.switchTab(arg0);
        }

        @Step
        public void refreshPage() {
            crud.refreshPage();
        }

        @Step
        public void scrollPage() {
            crud.scrollPage();
        }

        @Step
        public void writeIntoInputField(String arg0) {
            crud.writeIntoInputField(Locators.ADD_PRODUCT_INPUT,arg0);
        }

        @Step
        public void clickOnTheProductFromProductSearch() {
            crud.waitBit(1000);
            crud.clickMethod(Locators.PRODUCT_FROM_PRODUCT_SEARCH);
        }

        @Step
        public void writeDataIntoField(String arg0) {
            crud.waitBit(500);
            crud.enterRandomValue(Locators.CREATE_CUSTOMER_FIELDS.replace("$1",arg0));
        }

    @Step
    public void saveCreatedUser() {
        crud.clickMethod(Locators.SAVE_USER_BTN);
    }

    @Step
    public void clickOnTheOrderButton(String arg0) {
        crud.waitBit(1000);
        crud.clickMethod(Locators.SAVE_ORDER_BTN.replace("$1",arg0));
    }

    @Step
    public void clickOnTheLinkOnTheLeftAccordion(String arg0) {
        crud.clickMethod(Locators.ORDER_SPAN.replace("$1",arg0));
    }

    @Step
    public void writeIntoSearchUserTextBox(String arg0) {
        adminControlPage.writeIntoSearchUserTextBox(arg0);
    }

    @Step
    public void selectCustomerWhoDoesntHaveAPhone() {
        crud.clickMethod(Locators.CUSTOMER);
    }


    @Step
    public void clickOnTabOfProductPortlet(String tabName) {
        crud.clickMethod(Locators.AdminProductPortletTabs.replace("$1", tabName));
    }
    @Step
    public void fillFieldsAndSelectStructureOnTab(String addProductNameField, String addProductDescriptionField, String structureDropDownItem, String tab) {
        clickOnTypeOfStructuresDropdownMenu();
        clickOnTypeOfStructuresDropdownItem(structureDropDownItem);
        adminControlPage.enterRandomTestDataToRetailPriceField(8, "charac2", addProductNameField);
        adminControlPage.enterRandomTestDataToRetailPriceField(8, "charac2", addProductDescriptionField);
    }

    @Step
    public void selectCategoryOnTab(String testCategory, String categoryTab) {
        clickOnTabOfProductPortlet(categoryTab);
        selectTestCategory(testCategory);
    }
    @Step
    public void enterRandomTestDataToFieldOfDetailTab(String field) {
        adminControlPage.enterRandomTestDataToRetailPriceField(4,"charac", field);
    }

    @Step
    public void fillAndFieldsOnTab(String retailPrice, String salePrice, String quantityField, String tab) {
        clickOnTabOfProductPortlet(tab);
        enterRandomTestDataToFieldOfDetailTab(retailPrice);
        enterRandomTestDataToFieldOfDetailTab(salePrice);
        enterRandomTestDataToFieldOfDetailTab(quantityField);
        clickOnPublishButton();

    }
    @Step
    public void checkThatTabIsAppeared(String tabName) {
        crud.elementIsPresent(Locators.AdminProductPortletTabs.replace("$1", tabName));
    }
    @Step
    public void clickOnAddArticulesDropdownMenu() {
        crud.clickMethod(Locators.AdminProductPortletAddArticulesDropDown);
    }
    @Step
    public void clickOnAutoGenerationItemOfAddArticulesDropdownMenu() {
        crud.clickMethod(Locators.AdminProductPortletAddArticulesAutoGenerationItem);
    }

    @Step
    public void clickOnConfirmButtonOfAutoGenerationPopUpWindow() {
        crud.clickMethod(Locators.AdminProductPortletConfirmPopUpButton);
    }

    @Step
    public void clickOnTheCancelOrderButton() {
        crud.clickMethod(Locators.CANCEL_ORDER_BTN);
    }

    @Step
    public void clickOnTheCancelReasonDropdownMenu() {
        crud.clickMethod(Locators.CANCEL_REASON_DROPDOWN_MENU);
    }

    @Step
    public void selectReason() {
        crud.clickMethod(Locators.SECOND_REASON_TO_CANCEL);
    }

    @Step
    public void clickOnTheLinkInOpenedAccordion(String arg0) {
        crud.clickMethod(Locators.qwe.replace("$1",arg0));
    }

    @Step
    public void clickOnTheDropdown(String arg0) {
        crud.clickMethod(Locators.CURRENCY_DROPDOWN_MENU.replace("$1",arg0));
    }

    @Step
    public void checkThatElementIsDisplayed(String arg0) {
        Assert.assertTrue(crud.elementIsPresent(Locators.CURRENCY_OPTION.replace("$1",arg0)));
    }

    @Step
    public void writeIntoPhoneNumberInputField(String arg0) {
        crud.phoneNumber(Locators.PHONE_NUMBER_INPUT).sendKeys(arg0);
    }

    @Step
    public void checkThatErrorMessageIsNotDisplayed() {
        Assert.assertTrue(crud.elementIsNotPresent(Locators.PHONE_ERROR_MSG));
    }

    @Step
    public void clearPhoneNumberInputField() {
        crud.phoneNumber(Locators.PHONE_NUMBER_INPUT).clear();
    }

    @Step
    public void checkThatErrorMessageIsDisplayed() {
        Assert.assertTrue(crud.elementIsPresent(Locators.PHONE_ERROR_MSG));
    }

    @Step
    public void getPhoneNumber() {
        adminControlPage.getPhoneNumber();
    }

    @Step
    public void checkThatWeCanEditPhoneNumberInputField() {
        Assert.assertTrue(adminControlPage.checkThatWeCanEditPhoneNumberInputField());
    }

    @Step
    public void clickOnTheRemoveIcon() {
        crud.phoneNumber(Locators.REMOVE_PHONE_NUMBER_ICON).click();
    }

    @Step
    public void checkThatCreatedPhoneNumberWasDeleted() {
       Assert.assertTrue(adminControlPage.checkThatCreatedPhoneNumberWasDeleted());
    }

    @Step
    public void getListOfPhoneNumbers() {
        adminControlPage.getListOfPhoneNumbers();
    }

    @Step
    public void clickOnTheButtonMoreThanTimes(String arg0, int arg1) {
        adminControlPage.clickOnTheButtonMoreThanTimes(arg0,arg1);
    }

    @Step
    public void checkThatThereAreNoMoreThanNumbers(int arg0) {
        Assert.assertTrue(adminControlPage.checkThatThereAreNoMoreThanNumbers(arg0));
    }

    @Step
    public void deleteAllPhoneNumbers() {
        adminControlPage.deleteAllPhoneNumbers();
    }
}
