package ict4appsProject.steps.serenity;

import ict4appsProject.Locators;
import ict4appsProject.Variables;
import ict4appsProject.pages.*;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class EndUserSteps {

    FrontWelcomePage welcomePage;
    FrontProductsPage productsPage;
    FrontLogInPage logInPage;
    AdminControlPage adminControlPage;
    AdminControlPageCategories adminControlPageCategories;
    AdminControlPageProducts adminControlPageProducts;
    CRUD crud;
    StructuresPage structuresPage;


    AdminControlPageOrders adminControlPageOrders;
    FrontCartPage cartPage;


    @Step
    public void theUserIsOnIctAppsStagingPage() {
        welcomePage.open();
    }

    @Step
    public void theUserClickOnFirstProductImageInSuperImageCarousel(String arg0) {
        crud.clickMethod(Locators.SuperCarouselItem);
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
      Assert.assertTrue(adminControlPage.productsListShouldContainsProductThatWasCreated(Locators.AdminProductPortletListOfProductsNames));
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
        adminControlPageCategories.clickOnAddCategoryButton();
    }

    @Step
    public void enterRandomTestDataToCategoryNameField() {
        adminControlPage.enterRandomTestDataToRetailPriceField(8,"charac2", Variables.CategoryName);
    }
    @Step
    public void clickOnSaveButtonOfCreateCategoryForm() {
        adminControlPageCategories.clickOnSaveButtonOfCreateCategoryForm();
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
//        Assert.assertTrue(adminControlPageCategories.categoriesListShouldContainCategoryThatWasCreated());
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
        Assert.assertTrue(adminControlPage.fieldShouldBeDeletedFromBasicStructure(FieldName,Locators.AdminStructurePortletNameOfField));
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
        crud.clickMethod(Locators.SPAN.replace("$1","Добавить"));
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
        crud.clickMethod(Locators.LINK.replace("$1","Детали"));
        checkThatPriceFieldHasRightData("retail");
        checkThatPriceFieldHasRightData("sale");
        checkThatQuntityFieldHasRightData();
    }

        @Step
        public void clickOnProductTitle(String arg0) {
            crud.clickMethod(Locators.LINK.replace("$1", arg0));
        public void clickOnTheSpan(String arg0) {
        adminControlPageProducts.clickOnTheAddProductButton();
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
        crud.clickMethod(Locators.LINK.replace("$1","Опубликовать"));

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
    public void structureListShouldContainStructure(String structure) {
        Assert.assertTrue(crud.elementIsPresent(Locators.AdminStructurePortletStructuresList.replace("$1", structure)));
    }
    @Step
    public void enterOnStructureNameField(String structureName) {
        crud.sendKeysMethod(Locators.AdminStructurePortletStructureNameField, structureName);
    }
    @Step
    public void structuresListShouldContainStructure(String structureName) {
        Assert.assertTrue(adminControlPage.structuresListShouldContainStructure(structureName));
    }
    @Step
    public void structureShouldContainFieldOfBasicStructure(String arg0) {
        Assert.assertTrue(adminControlPage.structureShouldContainFieldOfBasicStructure(arg0));
    }

    public void clickOnNameOfStructure(String structure) {
//        adminControlPage.clickOnItemFromList(structure);
        crud.clickMethod(Locators.AdminStructurePortletNameOfField.replace("$1", structure));
    }
    @Step
    public void allStructuresShouldContainField(String field) {
        Assert.assertTrue(adminControlPage.allStructuresShouldContainField(field));
    }

    @Step
    public void clickOnTheButtonMoreThanTimes(String arg0, int arg1) {
        adminControlPage.clickOnTheButtonMoreThanTimes(arg0,arg1);
    }

    @Step
    public void checkThatThereAreNoMoreThanNumbers(int arg0) {
        adminControlPage.checkThatThereAreNoMoreThanNumbers(arg0);
    }

    @Step
    public void deleteAllPhoneNumbers() {
        adminControlPage.deleteAllPhoneNumbers();
    }
    @Step
    public void clickOnActionsButtonNearField(String arg0) {
        crud.clickMethod(Locators.AdminStructurePortletActionsButton.replace("$1", arg0));
    }

    @Step
    public void clickOnButtonNearField(String arg0, String arg1) {
        adminControlPage.getElementText(Locators.xxx);
//        adminControlPage.clickOnItemFromList(arg0,arg1);
        crud.clickMethod(Locators.AdminStructurePortletActionsButton.replace("$1", arg1).replace("$2", arg0));

    }
    @Step
    public void fieldShouldBeDeletedFromBasicStructure(String fieldName) {
        Assert.assertFalse(adminControlPage.fieldShouldBeDeletedFromBasicStructure( fieldName,Locators.AdminStructurePortletNameOfField ));
    }
    @Step
    public void fieldShouldBeDeletedFromAllStructures(String fieldName) {
        Assert.assertFalse(adminControlPage.fieldShouldBeDeletedFromAllStructures(fieldName,Locators.AdminStructurePortletNameOfField));
    }
    @Step
    public void selectSelectExistingItemOfAddFieldToStructureDropdownMenu() {
        crud.clickMethod(Locators.AdminStructurePortletSelectExistingButtonItem);
    }
    @Step
    public void enterOnField(String field, String arg1) {
        structuresPage.enterOnAddExistingFieldInput(Locators.AdminStructurePortletEnterNameOfFieldInput.replace("$1", arg1), field);

    }

    @Step
    public void clickOnTheButtonInOpenedPopUp(String arg0) {
        adminControlPage.clickOnTheButtonInOpenedPopUP(arg0);
    }

    @Step
    public void clickOnTheConfirmButton() {
        crud.clickMethod(Locators.zzz);
    }
    @Step
    public void clickOnAddExistingFieldToStructureButton() {
        structuresPage.clickOnAddExistingFieldToStructureButton();
    }
    @Step
    public void getIdOfField(String arg0) {
        structuresPage.getIdOfField(arg0);
    }
    @Step
    public void clickOnNameOfField(String fieldName) {
        structuresPage.clickOnNameOfField(fieldName);
    }
    @Step
    public void enterOnFieldNameField(String arg0) {
        structuresPage.enterOnFieldNameField(arg0);
    }
    @Step
    public void enterOnFieldDescriptionField(String arg0) {
        structuresPage.enterOnFieldDescriptionField(arg0);
    }
    @Step
    public void enterOnFieldLocalizationField(String arg0) {
        structuresPage.enterOnFieldLocalizationField(arg0);
    }
    @Step
    public void clickOnCheckboxOfDisplayNameOfField(String arg0) {
        structuresPage.clickOnCheckboxOfDisplayNameOfField(arg0);
    }
    @Step
    public void enterOnDefaultValueOfField(String arg0) {
        structuresPage.enterOnDefaultValueOfField(arg0);
    }
    @Step
    public void selectItemOfTypeOfDisplayingDropdown(String arg0) {
        structuresPage.selectItemOfTypeOfDisplayingDropdown(arg0);
    }
    @Step
    public void selectItemOfTypeOfEditingDropdown(String arg0) {
        structuresPage.selectItemOfTypeOfEditingDropdown(arg0);
    }

    @Step
    public void clickOnField(String arg0) {
        structuresPage.clickOnField(arg0);
    }

    @Step
    public void clickOnLastHintThatAppeared() {
        crud.clickMethod(Locators.AdminStructurePortletSelectLastHint);
    }

    @Step
    public void clickOnOurCreatedProductTitle() {
        adminControlPage.clickOnOurCreatedProductTitle();
    }

    @Step
    public void checkThatProductListContainsOurCreatedProduct() {
        Assert.assertTrue(adminControlPage.productsListShouldContainsProductThatWasCreated(Locators.LIST_OF_PRODUCT_TITLES));
    }

    @Step
    public void clickOnOurCreatedProductTitleOnProductsPage() {
        productsPage.clickOnOurCreatedProductTitleOnProductsPage();
    }

    @Step
    public void checkThatShortDescriptionIsVisible() {
      Assert.assertTrue(productsPage.checkThatShortDescriptionIsVisible());
    }

    @Step
    public void checkThatPriceEqualsToCreatedInAdminCP() {
      Assert.assertTrue(productsPage.checkThatPriceEqualsToCreatedInAdminCP());
    }

    @Step
    public void checkThatTitleOfProductIsDisplayed() {
      Assert.assertTrue(productsPage.checkThatTitleOfProductIsDisplayed());
    }

    @Step
    public void checkThatProductDescriptionIsDisplayed() {
        Assert.assertTrue(productsPage.checkThatProductDescriptionIsDisplayed());
    }

    @Step
    public void checkThatQuantityOfProductIsDisplayed() {
        Assert.assertTrue(productsPage.checkThatQuantityOfProductIsDisplayed());
    }

    @Step
    public void clickOnLastProductInProductList() {
        adminControlPage.clickOnLastProductInProductList();
    }

    @Step
    public void productEditingPageShouldHaveButton(String name) {
        Assert.assertTrue(adminControlPage.productEditingPageShouldHaveButton(name));
    }

    @Step
    public void enterOnNameTextbox(String arg0) {
        adminControlPage.enterOnNameTextbox(arg0);
    }

    @Step
    public void enterOnNameField(String name) {
        adminControlPageProducts.enterOnNameField(name);
    }

    @Step
    public void enterOnProductEditingDescriptionField(String description) {
        adminControlPageProducts.enterOnProductEditingDescriptionField(description);
    }
    @Step

    public void clickOnDropdownMenu(String dropDownMenu) {
        productsPage.clickOnDropdownMenu(dropDownMenu);
    }

    @Step
    public void selectItemOfDropdownMenu(String arg0, String arg1) {
        productsPage.selectItemOfDropdownMenu(arg0,arg1);
    }

    @Step
    public void checkThatShortDescriptionIsVisibleInAdminCP() {
        Assert.assertTrue(productsPage.checkThatShortDescriptionIsVisibleInAdminCP());
    }

    @Step
    public void checkThatSalePriceEqualsToCreatedInAdminCP() {
        Assert.assertTrue(productsPage.checkThatSalePriceEqualsToCreatedInAdminCP());
    }

    @Step
    public void checkThatRetailPriceEqualsToCreatedInAdminCPOnProductPage() {
        Assert.assertTrue(productsPage.checkThatRetailPriceEqualsToCreatedInAdminCPOnProductPage());
    }

    @Step
    public void clickOnTheSpecialOfferCheckBox() {
        crud.clickMethod(Locators.SPECIAL_OFFER_CHECKBOX);
    }

    @Step
    public void checkThatSalePriceEqualsToCreatedInAdminCPOnProductPage() {
        Assert.assertTrue(productsPage.checkThatSalePriceEqualsToCreatedInAdminCPOnProductPage());
    }

    @Step
    public void checkThatLabelIsAppearsOnOnOurProduct(String arg0) {
        Assert.assertTrue(productsPage.checkThatLabelIsAppearsOnOnOurProduct( arg0));
    }

    @Step
    public void clickOnTheLinkOnHeader(String arg0) {
        crud.clickMethod(Locators.SPECIAL_OFFERS_LINK.replace("$1",arg0));
    }

    @Step
    public void enterNextDayDate() {
        adminControlPage.enterNextDayDate();
    }

    @Step
    public void enterPrevDayDate() {
        adminControlPage.enterPrevDayDate();
    }

    @Step
    public void thenCheckThatLabelIsDisappearedOnOnOurProduct(String arg0) {
        Assert.assertTrue(productsPage.thenCheckThatLabelIsDisappearedOnOnOurProduct(arg0));
    }

    @Step
    public void clickOnTheSpanUnderProduct(String arg0, String arg1) {
        productsPage.clickOnTheSpanUnderProduct(arg0,arg1);
    }
    @Step
    public void logOut() {
        crud.logOut();
    }

    @Step
    public void clickOnTheStructuresSelect() {
        crud.clickMethod(Locators.STRUCTURES_SELECT);
    }

    @Step
    public void clickOnTheStructure(String arg0) {
        crud.clickMethod(Locators.FIELD_TEST_STRUCTURE.replace("$1",arg0));
    }

    @Step
    public void clickOnTheProductTitle(String arg0) {
        crud.waitBit(2000);
        crud.clickMethod(Locators.LINK.replace("$1",arg0));
    }

    @Step
    public void clickBackButtonInBrowser() {
        crud.clickBackButtonInBrowser();
    }

    @Step
    public void writeIntoAdditionalInputField(String arg0, String arg1) {
        crud.sendKeysMethod(Locators.ADDITIONAL_FIELD.replace("$1",arg1),arg0);
    }

    @Step
    public void checkThatAdditionalFieldWithIsVisible(String arg0, String arg1) {
        Assert.assertTrue(productsPage.checkThatAdditionalFieldWithIsVisible(arg0,arg1));
    }

    @Step
    public void clearAdditionalInputField(String arg0) {
        crud.clearField(Locators.ADDITIONAL_FIELD.replace("$1",arg0));
    }

    @Step
    public void checkThatAdditionalFieldWithIsNotVisible(String arg0) {
        Assert.assertTrue(productsPage.checkThatAdditionalFieldIsNotVisible(arg0));
    }

    @Step
    public void clickOnButtonNearAdditionalField(String arg0, String arg1) {
        crud.clickMethod(Locators.ACTIONS_BTN_OF_FIELD.replace("$2",arg0).replace("$1",arg1));
    }

    @Step
    public void clickOnTheBackLink() {
        crud.clickMethod(Locators.BACK_LINK);
    }

    @Step
    public void goToProductsPageOnTheSite() {
        crud.waitBit(5000);
        productsPage.open();
        crud.waitBit(5000);
    }

    @Step
    public void checkThatProductHasStatus(String arg0) {
        Assert.assertTrue(crud.elementIsPresent(Locators.DIV.replace("$1",arg0)));
    }

//    @Step
//    public void checkThatAndButtonsIsClickable(String arg0, String arg1) {
//       Assert.assertTrue(crud.elementIsClickable(Locators.BUTTON.replace("$1",arg0)));
//       Assert.assertTrue(crud.elementIsClickable(Locators.BUTTON.replace("$1",arg1)));
//    }

    @Step
    public void checkThatLabelIsNotVisible(String arg0) {
        Assert.assertTrue(crud.elementIsNotPresent(Locators.LABEL.replace("$1",arg0)));
    }

    @Step
    public void clearPriceField(String arg0) {
        crud.clearField(Locators.AdminProductPortletDetailsTabPriceField.replace("$1",arg0));
    }

    @Step
    public void checkThatLabelIsVisible(String arg0) {
        Assert.assertTrue(crud.elementIsPresent(Locators.LABEL.replace("$1",arg0)));
    }

    @Step
    public void checkThatIsCorrect(String arg0) {
        Assert.assertTrue(productsPage.checkThatIsCorrect(arg0));
    }

    @Step
    public void clearQuantityField() {
        crud.clearField(Locators.AdminProductPortletDetailsTabQuantityField);
    }

    @Step
    public void clickOnTheButtonTimes(String arg0, int arg1) {
        productsPage.clickOnTheButtonTimes(arg0,arg1);
    }

    @Step
    public void writeIntoQuantityField(String arg0) {
        crud.sendKeysMethod(Locators.AdminProductPortletDetailsTabQuantityField,arg0);
    }

    @Step
    public void checkThatWarningMessageAppears() {
        crud.elementIsPresent(Locators.WARNING_MSG);
    }
    @Step
    public void enterOnCategoryNameTextbox(String arg0) {
        adminControlPageCategories.enterOnCategoryNameTextbox(arg0);
    }
    @Step
    public void categoriesListShouldContainCategory(String arg0) {
        Assert.assertTrue(adminControlPageCategories.categoriesListShouldContainCategory(arg0));
    }
    @Step
    public void enterOnPriceField(String arg0, String arg1) {
        adminControlPageProducts.enterOnPriceField(arg0,arg1);
    }


    //TODO:Workflow     ////////////////////////////////////////////////////////////////////////////////////////////////

    @Step
    public void checkThatCreatedOrderHasStatus(String arg0) {
        Assert.assertTrue(adminControlPageOrders.checkThatCreatedOrderHasStatus(arg0));
    }

    @Step
    public void clickOnTheCreatedOrderId() {
        adminControlPageOrders.clickOnTheCreatedOrderId();
    }

    @Step
    public void checkThatCreatedOrderPageHasStatusTag(String arg0) {
        Assert.assertTrue(adminControlPageOrders.checkThatCreatedOrderPageHasStatusTag(arg0));
    }

    @Step
    public void clickOnTheLinkOnTheLeftAccordion(String arg0) {
        adminControlPageOrders.clickOnTheLinkOnTheLeftAccordion(arg0);
    }

    @Step
    public void clickOnTheCancelOrderButton() {
        adminControlPageOrders.clickOnTheCancelOrderButton();
    }

    @Step
    public void clickOnTheCancelReasonDropdownMenu() {
        adminControlPageOrders.clickOnTheCancelReasonDropdownMenu();
    }

    @Step
    public void selectReason() {
        adminControlPageOrders.selectReason();
    }

    @Step
    public void checkThatCreatedOrderPageHasStatusInStatusHistory(String arg0) {
        Assert.assertTrue(adminControlPageOrders.checkThatCreatedOrderPageHasStatusInStatusHistory(arg0));
    }

    @Step
    public void checkThatCreatedOrderPageHasStatusInShortStatusHistory(String arg0) {
        Assert.assertTrue(adminControlPageOrders.checkThatCreatedOrderPageHasStatusInShortStatusHistory(arg0));
    }

    @Step
    public void writeIntoSearchProductInputField(String arg0) {
        adminControlPageOrders.writeIntoSearchProductInputField(arg0);
    }

    @Step
    public void clickOnTheProductFromProductSearch() {
        crud.waitBit(1000);
        adminControlPageOrders.clickOnTheProductFromProductSearch();
    }

    @Step
    public void writeDataIntoField(String arg0,String arg1) {
        crud.waitBit(500);
        adminControlPageOrders.writeDataIntoField(arg0,arg1);
    }

    @Step
    public void saveCreatedUser() {
        adminControlPageOrders.saveCreatedUser();
    }

    @Step
    public void clickOnTheSaveOrderButton() {
        crud.waitBit(1000);
        adminControlPageOrders.clickOnTheOrderButton();
    }

    @Step
    public void writeIntoSearchUserTextBox(String arg0) {
        adminControlPageOrders.writeIntoSearchUserTextBox(arg0);
    }

    @Step
    public void selectCustomerWhoDoesntHaveAPhone() {
        adminControlPageOrders.selectCustomerWhoDoesntHaveAPhone();
    }

    @Step
    public void clickOnTheAccordionToggle(String arg0) {
        adminControlPageOrders.clickOnTheAccordionToggle(arg0);
    }

    //TODO:Cart     ////////////////////////////////////////////////////////////////////////////////////////////////////

    @Step
    public void clickOnTheSelfPickUpCheckbox() {
        cartPage.clickOnTheSelfPickUpCheckbox();
    }

    @Step
    public void selectAddress() {
        crud.waitBit(1000);
        cartPage.clickOnTheAdressSelect();
        cartPage.clickOntHeAddress();
    }

    //TODO:General methods      ////////////////////////////////////////////////////////////////////////////////////////

    @Step
    public void clickOnTheButton(String arg0) {
        crud.clickMethod(Locators.BUTTON.replace("$1", arg0));
    }

    @Step
    public void clickOnTheSpan(String arg0) {
        crud.clickMethod(Locators.SPAN.replace("$1", arg0));
    }

    @Step
    public void clickOnTheLink(String arg0) {
        crud.waitBit(500);
        crud.clickMethod(Locators.LINK.replace("$1", arg0));
    }

    @Step
    public void openNewTab() {
        welcomePage.openNewTab();
    }

    @Step
    public void switchTab(String arg0) {
        crud.switchTab(arg0);
    }

    @Step
    public void scrollPage() {
        crud.scrollPage();
    }

    @Step
    public void refreshPage() {
        crud.refreshPage();
    }

}
