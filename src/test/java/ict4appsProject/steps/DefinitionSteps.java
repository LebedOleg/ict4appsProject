package ict4appsProject.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import ict4appsProject.steps.serenity.EndUserSteps;

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

    @Then("^product URL should contain \"([^\"]*)\"$")
    public void productURLShouldContain(String arg0) throws Throwable {
        anna.productURLShouldContain(arg0);
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

    @And("^Click on Add product button$")
    public void clickOnAddProductButton() throws Throwable {
        anna.clickOnAddProductButton();
    }

    @And("^Click on Type of Structures dropdown menu$")
    public void clickOnTypeOfStructuresDropdownMenu() throws Throwable {
        anna.clickOnTypeOfStructuresDropdownMenu();
    }

    @And("^Click on Type of Structures dropdown item$")
    public void clickOnTypeOfStructuresDropdownItem() throws Throwable {
        anna.clickOnTypeOfStructuresDropdownItem();
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

    @And("^Select Test Category$")
    public void selectTestCategory() throws Throwable {
        anna.selectTestCategory();
    }

    @And("^Click on Detail tab of Products portlet$")
    public void clickOnDetailTabOfProductsPortlet() throws Throwable {
        anna.clickOnDetailTabOfProductsPortlet();
    }

    @And("^Enter random test data to \"([^\"]*)\" price field$")
    public void enterRandomTestDataToPriceField(String arg0) throws Throwable {
        anna.enterRandomTestDataToRetailPriceField(arg0);
    }

//    @And("^Enter random test data to Sale price field$")
//    public void enterRandomTestDataToSalePriceField() throws Throwable {
//        anna.enterRandomTestDataToSalePriceField();
//    }

    @And("^Enter random test data to Quantity field$")
    public void enterRandomTestDataToQuntityField() throws Throwable {
        anna.enterRandomTestDataToQuntityField();
    }

    @And("^Click on Publish button$")
    public void clickOnPublishButton() throws Throwable {
        anna.clickOnPublishButton();
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


//
}
