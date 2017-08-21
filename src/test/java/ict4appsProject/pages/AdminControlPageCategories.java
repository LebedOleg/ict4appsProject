package ict4appsProject.pages;
import ict4appsProject.Locators;

import ict4appsProject.LocatorsForAdminCPcategories;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

/**
 * Created by userqa on 17.07.17.
 */
public class AdminControlPageCategories extends PageObject {



    public void enterOnCategoryNameTextbox(String arg0) {
        $(LocatorsForAdminCPcategories.CategoryNameTextBox).sendKeys(arg0);
    }

    public void clickOnAddCategoryButton() {
        $(Locators.AdminCategoryPortletAddButton).click();
    }

    public boolean categoriesListShouldContainCategory(String arg0) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorsForAdminCPcategories.CertainCategoryInList.replace("$1", arg0))));
        return  $(LocatorsForAdminCPcategories.CertainCategoryInList.replace("$1", arg0)).isPresent();
    }

    public void clickOnSaveButtonOfCreateCategoryForm() {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorsForAdminCPcategories.AddCategoryPopUpSaveButton)));
        $(LocatorsForAdminCPcategories.AddCategoryPopUpSaveButton).click();
    }
}
