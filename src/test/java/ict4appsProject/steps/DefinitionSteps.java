package ict4appsProject.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ict4appsProject.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;
    private String arg0;


    @Given("^the user is on Ictapps staging page$")
    public void theUserIsOnIctAppsStagingPage() throws Throwable {
        anna.theUserIsOnIctAppsStagingPage();
    }


    @When("^the user click on \"([^\"]*)\"th product image in Super image carousel$")
    public void theUserClickOnThProductImageInSuperImageCarousel(String arg0) throws Throwable {
        anna.theUserClickOnFirstProductImageInSuperImageCarousel(arg0);
    }


    @Given("^Click on LogInLink$")
    public void clickOnLogInLink() throws Throwable {
        anna.clickOnLogInLink();
    }

    @And("^Enter Email address$")
    public void enterEmailAddress() throws Throwable {
        anna.enterEmailAddress();
    }

    @And("^Enter Password$")
    public void enterPassword() throws Throwable {
        anna.enterPassword();
    }

    @And("^Click on LogInButton$")
    public void clickOnLogInButton() throws Throwable {
        anna.clickOnLogInButton();
    }

    @When("^Click on Control DropDown menu$")
    public void clickOnControlDropDownMenu() throws Throwable {
        anna.clickOnControlDropDownMenu();
    }

    @And("^Click on \"([^\"]*)\" item of Control DropDown menu$")
    public void clickOnCatalogItemOfControlDropDownMenu(String arg0) throws Throwable {
        anna.clickOnCatalogItemOfControlDropDownMenu(arg0);
    }

    @And("^Click on \"([^\"]*)\" item of Catalog Tab$")
    public void clickOnProductsItemOfCatalogTab(String arg0) throws Throwable {
        anna.clickOnProductsItemOfCatalogTab(arg0);
    }



    @And("^Click on Type of Structures dropdown menu$")
    public void clickOnTypeOfStructuresDropdownMenu() throws Throwable {
        anna.clickOnTypeOfStructuresDropdownMenu();
    }


    @And("^Enter random test data to Name field$")
    public void enterRandomTestDateToNameField() throws Throwable {
        anna.enterRandomTestDateToNameField();
    }

    @And("^Enter random test data to Description field$")
    public void enterRandomTestDateToDescriptionField() throws Throwable {
        anna.enterRandomTestDateToDescriptionField();
    }

    @And("^Click on Categories tab of Products portlet$")
    public void clickOnCategoriesTabOfProductsPortlet() throws Throwable {
        anna.clickOnCategoriesTabOfProductsPortlet();
    }

    @And("^Enter random test data to \"([^\"]*)\" price field$")
    public void enterRandomTestDataToPriceField(String arg0) throws Throwable {
        anna.enterRandomTestDataToRetailPriceField(arg0);
    }


    @And("^Enter random test data to Quantity field$")
    public void enterRandomTestDataToQuntityField() throws Throwable {
        anna.enterRandomTestDataToQuntityField();
    }


    @Then("^Product name according to name that was entered$")
    public void productNameAccordingToNameThatWasEntered() throws Throwable {
        anna.productNameAccordingToNameThatWasEntered();
    }

    @And("^Click on LAST pagination button$")
    public void clickOnLASTPaginationButton() throws Throwable {
        anna.clickOnLASTPaginationButton();
    }

    @Then("^Products List should contains product that was created$")
    public void productsListShouldContainsProductThatWasCreated() throws Throwable {
        anna.productsListShouldContainsProductThatWasCreated();
    }

    @Then("^Check that Description field has right data$")
    public void checkThatDescriptionFieldHasRightData() throws Throwable {
        anna.checkThatDescriptionFieldHasRightData();
    }

    @Then("^Check that Type of Structures Dropdown menu has right item$")
    public void checkThatTypeOfStructuresDropdownMenuHasRightItem() throws Throwable {
        anna.checkThatTypeOfStructuresDropdownMenuHasRightItem();
    }

    @Then("^Check that right category is selected$")
    public void checkThatRightCategoryIsSelected() throws Throwable {
        anna.checkThatRightCategoryIsSelected();
    }


    @Then("^Check that \"([^\"]*)\" price field has right data$")
    public void checkThatPriceFieldHasRightData(String arg0) throws Throwable {
        anna.checkThatPriceFieldHasRightData(arg0);
    }

    @Then("^Check that quntity field has right data$")
    public void checkThatQuntityFieldHasRightData() throws Throwable {
        anna.checkThatQuntityFieldHasRightData();
    }

    @Then("^Test$")
    public void test() throws Throwable {
        anna.test();
    }

    @And("^Click on Add Category button$")
    public void clickOnAddCategoryButton() throws Throwable {
        anna.clickOnAddCategoryButton();
    }

    @And("^Enter random test data to Category name field$")
    public void enterRandomTestDataToCategoryNameField() throws Throwable {
        anna.enterRandomTestDataToCategoryNameField();
    }

    @And("^Click on Save button of Create Category form$")
    public void clickOnSaveButtonOfCreateCategoryForm() throws Throwable {
        anna.clickOnSaveButtonOfCreateCategoryForm();
    }

    @And("^Click on Add Sructure button$")
    public void clickOnAddSructureButton() throws Throwable {
        anna.clickOnAddSructureButton();
    }

    @And("^Enter data to Structure name field$")
    public void enterDataToStructureNameField() throws Throwable {
        anna.enterDataToStructureNameField();
    }

    @And("^Click on Save Structure button$")
    public void clickOnSaveStructureButton() throws Throwable {
        anna.clickOnSaveStructureButton();
    }

    @Then("^Categories list should contain category that was created$")
    public void categoriesListShouldContainCategoryThatWasCreated() throws Throwable {
        anna.categoriesListShouldContainCategoryThatWasCreated();
    }

    @Then("^Structures list should contain structure that was created$")
    public void structuresListShouldContainStructureThatWasCreated() throws Throwable {
        anna.structuresListShouldContainStructureThatWasCreated();
    }

    @And("^Click on Structure that was created$")
    public void clickOnStructureThatWasCreated() throws Throwable {
        anna.clickOnStructureThatWasCreated();
    }

    @And("^Click on Add Field on Structure button$")
    public void clickOnAddFieldOnStructureButton() throws Throwable {
        anna.clickOnAddFieldOnStructureButton();
    }

    @And("^Select Create new item of Add field to Structure dropdown menu$")
    public void selectCreateNewItemOfAddFieldToStructureDropdownMenu() throws Throwable {
        anna.selectCreateNewItemOfAddFieldToStructureDropdownMenu();
    }


    @And("^Click on Add new field to Structure button$")
    public void clickOnAddNewFieldToStructureButton() throws Throwable {
        anna.clickOnAddNewFieldToStructureButton();
    }

    @Then("^Structure should contained \"([^\"]*)\" field that was created$")
    public void structureShouldContainedFieldThatWasCreated(String arg0) throws Throwable {
        anna.structureShouldContainedFieldThatWasCreated(arg0);
    }

    @And("^Enter \"([^\"]*)\" to field name field$")
    public void enterToFieldNameField(String arg0) throws Throwable {
        anna.enterTestDataToFieldNameField(arg0);
    }

    @And("^Click on name of \"([^\"]*)\" field that was created$")
    public void clickOnNameOfFieldThatWasCreated(String arg0) throws Throwable {
        anna.clickOnNameOfFieldThatWasCreated(arg0);
    }

    @And("^Click on Type of display dropdown menu$")
    public void clickOnTypeOfDisplayDropdownMenu() throws Throwable {
        anna.clickOnTypeOfDisplayDropdownMenu();
    }

    @And("^Select \"([^\"]*)\" option of Type of display dropdown menu$")
    public void selectOptionOfTypeOfDisplayDropdownMenu(String arg0) throws Throwable {
        anna.selectOptionOfTypeOfDisplayDropdownMenu(arg0);
    }

    @Then("^Add field option button should appeared$")
    public void addFieldOptionButtonShouldAppeared() throws Throwable {
        anna.addFieldOptionButtonShouldAppeared();
    }

    @When("^Click on Add field option button$")
    public void clickOnAddFieldOptionButton() throws Throwable {
        anna.clickOnAddFieldOptionButton();
    }

    @And("^Enter \"([^\"]*)\" on Values field of Add option popup$")
    public void enterOnValuesFieldOfAddOptionPopup(String arg0) throws Throwable {
        anna.enterOnValuesFieldOfAddOptionPopup(arg0);
    }

    @And("^Click on Save button of Add option popup$")
    public void clickOnSaveButtonOfAddOptionPopup() throws Throwable {
        anna.clickOnSaveButtonOfAddOptionPopup();
    }

    @Then("^Option \"([^\"]*)\" should appeared on option list$")
    public void optionShouldAppearedOnOptionList(String arg0) throws Throwable {
        anna.optionShouldAppearedOnOptionList(arg0);
    }

    @And("^Click on Add Field to Structure button$")
    public void clickOnAddFieldToStructureButton() throws Throwable {
        anna.clickOnAddFieldToStructureButton();
    }

    @When("^Click on back button of Admin CP$")
    public void clickOnBackButtonOfAdminCP() throws Throwable {
        anna.clickOnBackButtonOfAdminCP();
    }

    @When("^Click on Save button of Field eddit page$")
    public void clickOnSaveButtonOfFieldEdditPage() throws Throwable {
        anna.clickOnSaveButtonOfFieldEdditPage();
    }

    @Given("^Log in into system as admin$")
    public void logInIntoSystemAsAdmin() throws Throwable {
        anna.logInIntoSystemAsAdmin();
    }

    @When("^Go to Products admin CP page and click on Add button$")
    public void goToProductsAdminCPPageAndClickOnAddButton() throws Throwable {
        anna.goToProductsAdminCPPageAndClickOnAddButton();
    }

    @Then("^Control DropDown menu should appeared$")
    public void controlDropDownMenuShouldAppeared() throws Throwable {
        anna.controlDropDownMenuShouldAppeared();
    }


    @Then("^Check that product field is created right$")
    public void checkThatProductFieldIsCreatedRight() throws Throwable {
        anna.checkThatProductFieldIsCreatedRight();
    }

    @And("^Select test Structure at Structures dropdown menu$")
    public void selectTestStructureAtStructuresDropdownMenu() throws Throwable {

    }

    @When("^Click on the \"([^\"]*)\" span$")
    public void clickOnTheSpan(String arg0) throws Throwable {
        anna.clickOnTheSpan(arg0);
    }

    @When("^Click on first product title$")
    public void clickOnFirstProductTitle() throws Throwable {
        anna.clickOnFirstProductTitle();
    }

    @When("^Click on the \"([^\"]*)\" button$")
    public void clickOnTheButton(String arg0) throws Throwable {
        anna.clickOnTheButton(arg0);
    }

    @When("^Click on the Cart icon$")
    public void clickOnTheCartIcon() throws Throwable {
        anna.clickOnTheCartIcon();
    }
    @When("^Click on the \"([^\"]*)\" link$")
    public void clickOnTheLink(String arg0) throws Throwable {
        anna.clickOnTheLink(arg0);
    }

    @Then("^Check that created order has \"([^\"]*)\" status$")
    public void checkThatCreatedOrderHasStatus(String arg0) throws Throwable {
        anna.checkThatCreatedOrderHasStatus(arg0);
    }

    @When("^Click on the created order id$")
    public void clickOnTheCreatedOrderId() throws Throwable {
        anna.clickOnTheCreatedOrderId();
    }

    @Then("^Check that created order page has \"([^\"]*)\" status tag$")
    public void checkThatCreatedOrderPageHasStatusTag(String arg0) throws Throwable {
        anna.checkThatCreatedOrderPageHasStatusTag(arg0);
    }

    @Then("^Check that created order page has \"([^\"]*)\" status in status history$")
    public void checkThatCreatedOrderPageHasStatusInStatusHistory(String arg0) throws Throwable {
        anna.checkThatCreatedOrderPageHasStatusInStatusHistory(arg0);
    }

    @Then("^Check that created order page has \"([^\"]*)\" status in short status history$")
    public void checkThatCreatedOrderPageHasStatusInShortStatusHistory(String arg0) throws Throwable {
        anna.checkThatCreatedOrderPageHasStatusInShortStatusHistory(arg0);
    }

    @Given("^Open new tab$")
    public void openNewTab() throws Throwable {
        anna.openNewTab();
    }

    @When("^Click on the Self Pick Up checkbox$")
    public void clickOnTheSelfPickUpCheckbox() throws Throwable {
        anna.clickOnTheSelfPickUpCheckbox();
    }

    @When("^Select address$")
    public void selectAddress() throws Throwable {
        anna.selectAddress();
    }

    @Given("^Switch tab \"([^\"]*)\"$")
    public void switchTab(String arg0) throws Throwable {
        anna.switchTab(arg0);
    }

    @Given("^Refresh page$")
    public void refreshPage() throws Throwable {
        anna.refreshPage();
    }

    @Given("^Scroll page$")
    public void scrollPage() throws Throwable {
        anna.scrollPage();
    }

    @When("^Write \"([^\"]*)\" into input field$")
    public void writeIntoInputField(String arg0) throws Throwable {
        anna.writeIntoInputField(arg0);
    }

    @When("^Click on the product from product search$")
    public void clickOnTheProductFromProductSearch() throws Throwable {
        anna.clickOnTheProductFromProductSearch();
    }

    @When("^Write data into \"([^\"]*)\" field$")
    public void writeDataIntoField(String arg0) throws Throwable {
        anna.writeDataIntoField(arg0);
    }

    @When("^Save created user$")
    public void saveCreatedUser() throws Throwable {
        anna.saveCreatedUser();
    }

    @When("^Click on the \"([^\"]*)\" order button$")
    public void clickOnTheOrderButton(String arg0) throws Throwable {
        anna.clickOnTheOrderButton(arg0);
    }

    @When("^Click on the \"([^\"]*)\" link on the left accordion$")
    public void clickOnTheLinkOnTheLeftAccordion(String arg0) throws Throwable {
        anna.clickOnTheLinkOnTheLeftAccordion(arg0);
    }


    @When("^Write \"([^\"]*)\" into search user text box$")
    public void writeIntoSearchUserTextBox(String arg0) throws Throwable {
        anna.writeIntoSearchUserTextBox(arg0);
    }

    @When("^Select customer who doesn't have a phone$")
    public void selectCustomerWhoDoesnTHaveAPhone() throws Throwable {
        anna.selectCustomerWhoDoesntHaveAPhone();
    }

    @And("^Click on \"([^\"]*)\" tab of Product portlet$")
    public void clickOnTabOfProductPortlet(String tabName) throws Throwable {
        anna.clickOnTabOfProductPortlet(tabName);
    }

    @And("^Fill \"([^\"]*)\" \"([^\"]*)\" fields and select \"([^\"]*)\" structure on \"([^\"]*)\" tab$")
    public void fillFieldsAndSelectStructureOnTab(String addProductNameField, String addProductDescriptionField, String structureDropDownItem, String tab) throws Throwable {
        anna.fillFieldsAndSelectStructureOnTab(addProductNameField, addProductDescriptionField, structureDropDownItem, tab);
    }

    @And("^Select \"([^\"]*)\" category on \"([^\"]*)\" tab$")
    public void selectCategoryOnTab(String testCategory, String categoryTab) throws Throwable {
        anna.selectCategoryOnTab(testCategory, categoryTab);
    }

    @And("^Enter random test data to \"([^\"]*)\" field of Detail tab$")
    public void enterRandomTestDataToFieldOfDetailTab(String field) throws Throwable {
        anna.enterRandomTestDataToFieldOfDetailTab(field);
    }

    @And("^Fill \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" fields on \"([^\"]*)\" tab$")
    public void fillAndFieldsOnTab(String retailPrice, String salePrice, String quantityField, String tab) throws Throwable {
        anna.fillAndFieldsOnTab(retailPrice, salePrice, quantityField, tab);
    }

    @And("^Click on \"([^\"]*)\" Type Of Structures Dropdown Item$")
    public void clickOnTypeOfStructuresDropdownItem(String arg0) throws Throwable {
        anna.clickOnTypeOfStructuresDropdownItem(arg0);
    }

    @Then("^Check that \"([^\"]*)\" tab is appeared$")
    public void checkThatTabIsAppeared(String tabName) throws Throwable {
        anna.checkThatTabIsAppeared(tabName);
    }

    @And("^Click on Add Articules dropdown menu$")
    public void clickOnAddArticulesDropdownMenu() throws Throwable {
        anna.clickOnAddArticulesDropdownMenu();

    }

    @And("^Click on Auto Generation item of Add Articules dropdown menu$")
    public void clickOnAutoGenerationItemOfAddArticulesDropdownMenu() throws Throwable {
        anna.clickOnAutoGenerationItemOfAddArticulesDropdownMenu();

    }

    @And("^Click on Confirm button of Auto Generation Pop Up window$")
    public void clickOnConfirmButtonOfAutoGenerationPopUpWindow() throws Throwable {
        anna.clickOnConfirmButtonOfAutoGenerationPopUpWindow();
    }

    @When("^Click on the cancel order button$")
    public void clickOnTheCancelOrderButton() throws Throwable {
        anna.clickOnTheCancelOrderButton();
    }


    @Then("^Structure list should contain \"([^\"]*)\" structure$")
    public void structureListShouldContainStructure(String Structure) throws Throwable {
        anna.structureListShouldContainStructure(Structure);
    }

    @And("^Enter \"([^\"]*)\" on Structure name field$")
    public void enterOnStructureNameField(String structureName) throws Throwable {
        anna.enterOnStructureNameField(structureName);
    }

    @Then("^Structures list should contain \"([^\"]*)\" structure$")
    public void structuresListShouldContainStructure(String structureName) throws Throwable {
        anna.structuresListShouldContainStructure(structureName);
    }

    @Then("^\"([^\"]*)\" structure should contain field of basic structure$")
    public void structureShouldContainFieldOfBasicStructure(String arg0) throws Throwable {
        anna.structureShouldContainFieldOfBasicStructure(arg0);
    }

    @And("^Click on name of \"([^\"]*)\" structure$")
    public void clickOnNameOfStructure(String Structure) throws Throwable {
       anna.clickOnNameOfStructure(Structure);
    }

    @Then("^All structures should contain \"([^\"]*)\" field$")
    public void allStructuresShouldContainField(String field) throws Throwable {
        anna.allStructuresShouldContainField(field);
    }


    @When("^Click on the cancel reason dropdown menu$")
    public void clickOnTheCancelReasonDropdownMenu() throws Throwable {
        anna.clickOnTheCancelReasonDropdownMenu();
    }

    @When("^Select reason$")
    public void selectReason() throws Throwable {
        anna.selectReason();
    }

    @When("^Click on the \"([^\"]*)\" link in opened accordion$")
    public void clickOnTheLinkInOpenedAccordion(String arg0) throws Throwable {
        anna.clickOnTheLinkInOpenedAccordion(arg0);
    }

    @When("^Click on the \"([^\"]*)\" dropdown$")
    public void clickOnTheDropdown(String arg0) throws Throwable {
        anna.clickOnTheDropdown(arg0);
    }

    @Then("^Check that \"([^\"]*)\" element is displayed$")
    public void checkThatElementIsDisplayed(String arg0) throws Throwable {
        anna.checkThatElementIsDisplayed(arg0);
    }

    @When("^Write \"([^\"]*)\" into phone number input field$")
    public void writeIntoPhoneNumberInputField(String arg0) throws Throwable {
        anna.writeIntoPhoneNumberInputField(arg0);
    }

    @Then("^Check that error message is not displayed$")
    public void checkThatErrorMessageIsNotDisplayed() throws Throwable {
        anna.checkThatErrorMessageIsNotDisplayed();
    }

    @When("^Clear phone number input field$")
    public void clearPhoneNumberInputField() throws Throwable {
        anna.clearPhoneNumberInputField();
    }

    @Then("^Check that error message is displayed$")
    public void checkThatErrorMessageIsDisplayed() throws Throwable {
        anna.checkThatErrorMessageIsDisplayed();
    }

    @When("^Get phone number$")
    public void getPhoneNumber() throws Throwable {
        anna.getPhoneNumber();
    }

    @Then("^Check that we can edit phone number input field$")
    public void checkThatWeCanEditPhoneNumberInputField() throws Throwable {
        anna.checkThatWeCanEditPhoneNumberInputField();
    }

    @When("^Click on the remove icon$")
    public void clickOnTheRemoveIcon() throws Throwable {
        anna.clickOnTheRemoveIcon();
    }

    @Then("^Check that created phone number was deleted$")
    public void checkThatCreatedPhoneNumberWasDeleted() throws Throwable {
        anna.checkThatCreatedPhoneNumberWasDeleted();
    }

    @When("^Get list of phone numbers$")
    public void getListOfPhoneNumbers() throws Throwable {
        anna.getListOfPhoneNumbers();
    }

    @And("^Click on Actions button near \"([^\"]*)\" field$")
    public void clickOnActionsButtonNearField(String arg0) throws Throwable {
        anna.clickOnActionsButtonNearField(arg0);
    }


    @And("^Click on \"([^\"]*)\" button near \"([^\"]*)\" field$")
    public void clickOnButtonNearField(String arg0, String arg1) throws Throwable {
        anna.clickOnButtonNearField(arg0,arg1);
    }

    @Then("^\"([^\"]*)\" field should be deleted from basic structure$")
    public void fieldShouldBeDeletedFromBasicStructure(String arg0) throws Throwable {
        anna.fieldShouldBeDeletedFromBasicStructure(arg0);
    }


    @Then("^\"([^\"]*)\" field should be deleted from all structures$")
    public void fieldShouldBeDeletedFromAllStructures(String arg0) throws Throwable {
        anna.fieldShouldBeDeletedFromAllStructures(arg0);
    }



    @When("^Click on the \"([^\"]*)\" button more than (\\d+) times$")
    public void clickOnTheButtonMoreThanTimes(String arg0, int arg1) throws Throwable {
        anna.clickOnTheButtonMoreThanTimes(arg0,arg1);
    }

    @Then("^Check that there are no more than (\\d+) phone numbers$")
    public void checkThatThereAreNoMoreThanNumbers(int arg0) throws Throwable {
        anna.checkThatThereAreNoMoreThanNumbers(arg0);
    }

    @When("^Delete all phone numbers$")
    public void deleteAllPhoneNumbers() throws Throwable {
        anna.deleteAllPhoneNumbers();
    }

    @When("^Click on the \"([^\"]*)\" button in opened pop up$")
    public void clickOnTheButtonInOpenedPopUp(String arg0) throws Throwable {
        anna.clickOnTheButtonInOpenedPopUp(arg0);
    }

    @When("^Click on the confirm button$")
    public void clickOnTheConfirmButton() throws Throwable {
        anna.clickOnTheConfirmButton();
    }

    @And("^Select select existing item of Add field to Structure dropdown menu$")
    public void selectSelectExistingItemOfAddFieldToStructureDropdownMenu() throws Throwable {
        anna.selectSelectExistingItemOfAddFieldToStructureDropdownMenu();
    }

    @And("^Enter \"([^\"]*)\" on \"([^\"]*)\" field$")
    public void enterOnField(String arg0, String arg1) throws Throwable {
        anna.enterOnField(arg0,arg1);
    }


    @And("^Click on Add existing field to Structure button$")
    public void clickOnAddExistingFieldToStructureButton() throws Throwable {
        anna.clickOnAddExistingFieldToStructureButton();
    }

    @And("^Get id of \"([^\"]*)\" field$")
    public void getIdOfField(String arg0) throws Throwable {
        anna.getIdOfField(arg0);
    }



    @And("^Click on name of \"([^\"]*)\" field$")
    public void clickOnNameOfField(String fieldName) throws Throwable {
        anna.clickOnNameOfField(fieldName);
    }

    @And("^Enter \"([^\"]*)\" on field name field$")
    public void enterOnFieldNameField(String arg0) throws Throwable {
        anna.enterOnFieldNameField(arg0);
    }

    @And("^Enter \"([^\"]*)\" on field description field$")
    public void enterOnFieldDescriptionField(String arg0) throws Throwable {
        anna.enterOnFieldDescriptionField(arg0);
    }

    @And("^Enter \"([^\"]*)\" on field localization field$")
    public void enterOnFieldLocalizationField(String arg0) throws Throwable {
        anna.enterOnFieldLocalizationField(arg0);
    }

    @And("^Click on \"([^\"]*)\" checkbox of display name of field$")
    public void clickOnCheckboxOfDisplayNameOfField(String arg0) throws Throwable {
        anna.clickOnCheckboxOfDisplayNameOfField(arg0);
    }

    @And("^Enter \"([^\"]*)\" on default value of field$")
    public void enterOnDefaultValueOfField(String arg0) throws Throwable {
        anna.enterOnDefaultValueOfField(arg0);
    }

    @And("^Select \"([^\"]*)\" item of Type of displaying dropdown$")
    public void selectItemOfTypeOfDisplayingDropdown(String arg0) throws Throwable {
        anna.selectItemOfTypeOfDisplayingDropdown(arg0);
    }

    @And("^Select \"([^\"]*)\" item of Type of Editing dropdown$")
    public void selectItemOfTypeOfEditingDropdown(String arg0) throws Throwable {
        anna.selectItemOfTypeOfEditingDropdown(arg0);
    }

    @And("^Click on \"([^\"]*)\" field$")
    public void clickOnField(String arg0) throws Throwable {
        anna.clickOnField(arg0);
    }

    @And("^Click on last hint that appeared$")
    public void clickOnLastHintThatAppeared() throws Throwable {
        anna.clickOnLastHintThatAppeared();
    }

    @When("^Click on our created product title$")
    public void clickOnOurCreatedProductTitle() throws Throwable {
        anna.clickOnOurCreatedProductTitle();
    }

    @Then("^Check that product list contains our created product$")
    public void checkThatProductListContainsOurCreatedProduct() throws Throwable {
        anna.checkThatProductListContainsOurCreatedProduct();
    }

    @When("^Click on our created product title on products page$")
    public void clickOnOurCreatedProductTitleOnProductsPage() throws Throwable {
        anna.clickOnOurCreatedProductTitleOnProductsPage();
    }

    @Then("^Check that short description is visible$")
    public void checkThatShortDescriptionIsVisible() throws Throwable {
        anna.checkThatShortDescriptionIsVisible();
    }

    @Then("^Check that Retail price equals to created in admin CP$")
    public void checkThatPriceEqualsToCreatedInAdminCP() throws Throwable {
        anna.checkThatPriceEqualsToCreatedInAdminCP();
    }

    @Then("^Check that title of product is displayed$")
    public void checkThatTitleOfProductIsDisplayed() throws Throwable {
        anna.checkThatTitleOfProductIsDisplayed();
    }

    @Then("^Check that product description is displayed$")
    public void checkThatProductDescriptionIsDisplayed() throws Throwable {
        anna.checkThatProductDescriptionIsDisplayed();
    }

    @Then("^Check that Quantity of product is displayed$")
    public void checkThatQuantityOfProductIsDisplayed() throws Throwable {
        anna.checkThatQuantityOfProductIsDisplayed();
    }

    @And("^Click on last product in product list$")
    public void clickOnLastProductInProductList() throws Throwable {
        anna.clickOnLastProductInProductList();
    }

    @Then("^Product editing page should have \"([^\"]*)\" button$")
    public void productEditingPageShouldHaveButton(String Name) throws Throwable {
        anna.productEditingPageShouldHaveButton(Name);
    }

    @When("^Enter \"([^\"]*)\" on Name textbox$")
    public void enterOnNameTextbox(String arg0) throws Throwable {
        anna.enterOnNameTextbox(arg0);
    }

    @And("^Enter \"([^\"]*)\" on Name field$")
    public void enterOnNameField(String arg0) throws Throwable {
        anna.enterOnNameField(arg0);
    }

    @And("^Enter \"([^\"]*)\" on Product editing Description field$")
    public void enterOnProductEditingDescriptionField(String Description) throws Throwable {
        anna.enterOnProductEditingDescriptionField(Description);
    }

    @And("^Click on \"([^\"]*)\" dropdown menu$")
    public void clickOnDropdownMenu(String dropDownMenu) throws Throwable {
        anna.clickOnDropdownMenu(dropDownMenu);
    }

    @And("^Select \"([^\"]*)\" item of \"([^\"]*)\" dropdown menu$")
    public void selectItemOfDropdownMenu(String arg0, String arg1) throws Throwable {
        anna.selectItemOfDropdownMenu(arg0,arg1);
    }

    @Then("^Check that short description is visible in admin CP$")
    public void checkThatShortDescriptionIsVisibleInAdminCP() throws Throwable {
        anna.checkThatShortDescriptionIsVisibleInAdminCP();
    }

    @Then("^Check that Sale price equals to created in admin CP$")
    public void checkThatSalePriceEqualsToCreatedInAdminCP() throws Throwable {
        anna.checkThatSalePriceEqualsToCreatedInAdminCP();
    }

    @Then("^Check that Retail price equals to created in admin CP on product page$")
    public void checkThatRetailPriceEqualsToCreatedInAdminCPOnProductPage() throws Throwable {
        anna.checkThatRetailPriceEqualsToCreatedInAdminCPOnProductPage();
    }

    @When("^Click on the special offer check box$")
    public void clickOnTheSpecialOfferCheckBox() throws Throwable {
        anna.clickOnTheSpecialOfferCheckBox();
    }

    @Then("^Check that Sale price equals to created in admin CP on product page$")
    public void checkThatSalePriceEqualsToCreatedInAdminCPOnProductPage() throws Throwable {
        anna.checkThatSalePriceEqualsToCreatedInAdminCPOnProductPage();
    }

    @Then("^Check that \"([^\"]*)\" label is appears on on our product$")
    public void checkThatLabelIsAppearsOnOnOurProduct(String arg0) throws Throwable {
        anna.checkThatLabelIsAppearsOnOnOurProduct( arg0);
    }

    @When("^Click on the \"([^\"]*)\" link on header$")
    public void clickOnTheLinkOnHeader(String arg0) throws Throwable {
        anna.clickOnTheLinkOnHeader(arg0);
    }

    @When("^Enter the next day's date into date text box$")
    public void enterNextDayDate() throws Throwable {
        anna.enterNextDayDate();
    }

    @When("^Enter the previous day's date into date text box$")
    public void enterThePreviousDaySDateIntoDateTextBox() throws Throwable {
        anna.enterPrevDayDate();
    }

    @Then("^Then Check that \"([^\"]*)\" label is disappeared on on our product$")
    public void thenCheckThatLabelIsDisappearedOnOnOurProduct(String arg0) throws Throwable {
        anna.thenCheckThatLabelIsDisappearedOnOnOurProduct(arg0);
    }

    @When("^Click on the \"([^\"]*)\" span under \"([^\"]*)\" product$")
    public void clickOnTheSpanUnderProduct(String arg0, String arg1) throws Throwable {
        anna.clickOnTheSpanUnderProduct(arg0,arg1);
    }

    @And("^Log out$")
    public void logOut() throws Throwable {
        anna.logOut();
    }
}