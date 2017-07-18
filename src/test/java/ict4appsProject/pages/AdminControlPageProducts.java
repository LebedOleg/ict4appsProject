package ict4appsProject.pages;

import ict4appsProject.Locators;
import net.thucydides.core.pages.PageObject;

/**
 * Created by userqa on 17.07.17.
 */
public class AdminControlPageProducts extends PageObject{
    public void enterOnPriceField(String arg0, String arg1) {
        $(Locators.AdminProductPortletDetailsTabPriceField.replace("$1", arg1)).sendKeys(arg0);
    }
}
