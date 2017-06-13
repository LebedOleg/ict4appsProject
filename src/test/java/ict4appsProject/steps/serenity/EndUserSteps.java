package ict4appsProject.steps.serenity;

import ict4appsProject.pages.AdminControlPage;
import ict4appsProject.pages.LogInPage;
import ict4appsProject.pages.ProductsPage;
import ict4appsProject.pages.WelcomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {


    WelcomePage welcomePage;
    ProductsPage productsPage;
    LogInPage logInPage;
    AdminControlPage adminControlPage;


    @Step
    public void theUserIsOnIctAppsStagingPage() {
        welcomePage.open();
    }

    @Step
    public void theUserClickOnFirstProductImageInSuperImageCarousel(String arg0) {
        welcomePage.theUserClickOnFirstProductImageInSuperImageCarousel(arg0);
    }
    @Step
    public void productURLShouldContain(String arg0) {
       Assert.assertThat(productsPage.getCurrentURL(), containsString(arg0));
    }

    @Step
    public void clickOnLogInLink() {
        welcomePage.clickOnLogInLink();
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
        welcomePage.clickOnControlDropDownMenu();
    }

    @Step
    public void clickOnCatalogItemOfControlDropDownMenu() {
        welcomePage.clickOnCatalogItemOfControlDropDownMenu();
    }

    @Step
    public void clickOnProductsItemOfCatalogTab() {
        adminControlPage.clickOnProductsItemOfCatalogTab();
    }

    @Step
    public void clickOnAddProductButton() {
        adminControlPage.clickOnAddProductButton();
    }
    @Step
    public void clickOnTypeOfStructuresDropdownMenu() {
        adminControlPage.clickOnTypeOfStructuresDropdownMenu();
    }

    @Step
    public void clickOnTypeOfStructuresDropdownItem() {
        adminControlPage.clickOnTypeOfStructuresDropdownItem();
    }

    @Step
    public void enterRandomTestDateToNameField() {
        adminControlPage.enterRandomTestDateToNameField();
    }

    @Step
    public void enterRandomTestDateToDescriptionField() {
        adminControlPage.enterRandomTestDateToDescriptionField();
    }

    @Step
    public void clickOnCategoriesTabOfProductsPortlet() {
        adminControlPage.clickOnCategoriesTabOfProductsPortlet();
    }

    @Step
    public void selectTestCategory() {
        adminControlPage.selectTestCategory();
    }
    @Step
    public void clickOnDetailTabOfProductsPortlet() {
        adminControlPage.clickOnDetailTabOfProductsPortlet();
    }

    @Step
    public void enterRandomTestDataToRetailPriceField() {
        adminControlPage.enterRandomTestDataToRetailPriceField();
    }

    @Step
    public void enterRandomTestDataToSalePriceField() {
        adminControlPage.enterRandomTestDataToSalePriceField();
    }

    @Step
    public void enterRandomTestDataToQuntityField() {
        adminControlPage.enterRandomTestDataToQuntityField();
    }
    @Step
    public void clickOnPublishButton() {
        adminControlPage.clickOnPublishButton();
    }

    public void productNameAccordingToNameThatWasEntered() {
        Assert.assertTrue(adminControlPage.compareCurrentNameOfProductWithEntered() );
    }
}