package ict4appsProject.steps.serenity;

import ict4appsProject.Locators;
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
        crud.waitBit(1500);
        crud.clickMethod(Locators.ProductsCatalogItem);
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
    public void clickOnTypeOfStructuresDropdownItem() {
        crud.clickMethod(Locators.AdminProductPortletTypeOfStructureItem);
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

    @Step
    public void clickOnLASTPaginationButton() {
        crud.clickMethod(Locators.AdminProductPortletLastPaginationButton);
    }

    @Step
    public void productsListShouldContainsProductThatWasCreated() {
        adminControlPage.productsListShouldContainsProductThatWasCreated(Locators.AdminProductPortletListOfProductsNames);
    }

    @Step
    public void checkThatTypeOfStructuresDropdownMenuHasRightItem() {
        adminControlPage.checkThatTypeOfStructuresDropdownMenuHasRightItem();
    }
    @Step
    public void checkThatDescriptionFieldHasRightData() {
        adminControlPage.checkThatDescriptionFieldHasRightData();
    }
    @Step
    public void checkThatRightCategoryIsSelected() {
        adminControlPage.checkThatRightCategoryIsSelected();
    }

    public void checkThatRetailPriceFieldHasRightData() {
        Assert.assertTrue(adminControlPage.checkThatPriceFieldHasRightData());
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
        crud.clickMethod(Locators.CART);
    }
    @Step
    public void clickOnTheLink(String arg0) {
        crud.clickMethod(Locators.LINK.replace("$1",arg0));
    }
}