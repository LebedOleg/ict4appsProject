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
    public void theUserIsOnIctAppsStagingPage(int arg0) throws Throwable {
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
}
