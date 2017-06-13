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

    @And("^Click on Catalog item of Control DropDown menu$")
    public void clickOnCatalogItemOfControlDropDownMenu() throws Throwable {
        anna.clickOnCatalogItemOfControlDropDownMenu();
    }

    @And("^Click on Products item of Catalog Tab$")
    public void clickOnProductsItemOfCatalogTab() throws Throwable {
        anna.clickOnProductsItemOfCatalogTab();
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

    @And("^Enter random test data to Retail price field$")
    public void enterRandomTestDataToRetailPriceField() throws Throwable {
        anna.enterRandomTestDataToRetailPriceField();
    }

    @And("^Enter random test data to Sale price field$")
    public void enterRandomTestDataToSalePriceField() throws Throwable {
        anna.enterRandomTestDataToSalePriceField();
    }

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

    @Then("^Check that Type of Structures dropdown menu has right item$")
    public void checkThatTypeOfStructuresDropdownMenuHasRightItem() throws Throwable {
        anna.checkThatTypeOfStructuresDropdownMenuHasRightItem();
    }

    @Then("^Check that Description field has right data$")
    public void checkThatDescriptionFieldHasRightData() throws Throwable {
        anna.checkThatDescriptionFieldHasRightData();
    }

    @Then("^Check that right category is selected$")
    public void checkThatRightCategoryIsSelected() throws Throwable {
        anna.checkThatRightCategoryIsSelected();
    }

    @Then("^Check that Retail price field has right data$")
    public void checkThatRetailPriceFieldHasRightData() throws Throwable {
        anna.checkThatRetailPriceFieldHasRightData();
    }
}
