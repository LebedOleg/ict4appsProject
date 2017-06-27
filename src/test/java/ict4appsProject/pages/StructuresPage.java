package ict4appsProject.pages;

import ict4appsProject.Locators;
import ict4appsProject.Variables;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by userqa on 21.06.17.
 */
public class StructuresPage extends PageObject  {
    String FieldID;

    public void clickOnAddExistingFieldToStructureButton() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($("//div[@class='row autocomplete-container']//button")).click().build().perform();
    }

    public void getIdOfField(String arg0) {
       FieldID =  $("//a[text()='subFieldTest']/ancestor::tr//td[contains(@class,'table-sortable-column')]/a").getText();
    }

    public void enterOnAddExistingFieldInput(String Locator, String field) {
//        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locator))));

        Actions actions = new Actions(getDriver());
        actions.sendKeys($(Locator), field).build().perform();
//        $(Locator).sendKeys(FieldID + "." + field);
    }

    public void clickOnNameOfField(String fieldName) {
        $(Locators.AdminStructurePortletNameOfField.replace("$1", fieldName)).click();
    }

    public void enterOnFieldNameField(String arg0) {
        $(Locators.AdminStructurePortletNameOfFieldInput).sendKeys(arg0);
    }

    public void enterOnFieldDescriptionField(String arg0) {
        $(Locators.AdminStructurePortletDescriptionOfFieldInput).sendKeys(arg0);
    }

    public void enterOnFieldLocalizationField(String arg0) {
        $(Locators.AdminStructurePortletLocalizationOfFieldInput).sendKeys(arg0);
    }

    public void clickOnCheckboxOfDisplayNameOfField(String arg0) {
        $(Locators.AdminStructurePortletDisplayNAmeOfFieldSelect.replace("$1", arg0)).click();
    }

    public void enterOnDefaultValueOfField(String arg0) {
        $(Locators.AdminStructurePortletDefaultValueOfFieldInput).sendKeys(arg0);
    }

    public void selectItemOfTypeOfDisplayingDropdown(String arg0) {
        $(Locators.AdminStructurePortletTypeOfDisplayOfFieldSelect).click();
        $(Locators.AdminStructurePortletTypeOfDisplayOfFieldSelectItem).sendKeys(arg0);
    }

    public void selectItemOfTypeOfEditingDropdown(String arg0) {
        $(Locators.AdminStructurePortletEnterNameOfFieldInput.replace("$1", arg0)).click();
    }

    public void clickOnField(String arg0) {
        $(Locators.AdminStructurePortletEnterNameOfFieldInput.replace("$1",arg0)).click();
        waitABit(2000);
    }
}
