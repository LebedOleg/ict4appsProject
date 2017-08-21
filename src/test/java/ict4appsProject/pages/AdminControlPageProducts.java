package ict4appsProject.pages;

import ict4appsProject.Locators;
import ict4appsProject.LocatorsForAdminCPcategories;
import ict4appsProject.LocatorsForAdminCPproducts;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

/**
 * Created by userqa on 17.07.17.
 */
public class AdminControlPageProducts extends PageObject{
    public void enterOnPriceField(String arg0, String arg1) {
        $(Locators.AdminProductPortletDetailsTabPriceField.replace("$1", arg1)).sendKeys(arg0);
    }

    public void clickOnTheAddProductButton() {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorsForAdminCPproducts.AddProductButton)));
        $(LocatorsForAdminCPproducts.AddProductButton).click();
    }

    public void enterOnNameField(String name) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorsForAdminCPproducts.ProductNameTextBox)));
        $(LocatorsForAdminCPproducts.ProductNameTextBox).sendKeys(name);
    }

    public void enterOnProductEditingDescriptionField(String description) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorsForAdminCPproducts.ProductDescriptionField)));
        $(LocatorsForAdminCPproducts.ProductDescriptionField).sendKeys(description);
    }
}
