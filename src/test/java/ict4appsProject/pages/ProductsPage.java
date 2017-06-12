package ict4appsProject.pages;

import net.thucydides.core.pages.PageObject;

/**
 * Created by userqa on 15.05.17.
 */
public class ProductsPage extends PageObject{
    public String getCurrentURL() {
        return getDriver().getCurrentUrl();
    }
}
