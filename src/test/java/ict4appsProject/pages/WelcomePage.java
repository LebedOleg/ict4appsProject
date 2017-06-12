package ict4appsProject.pages;

import ict4appsProject.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by userqa on 15.05.17.
 */
@DefaultUrl("https://staging.ict4apps.aimprosoft.com")
public class WelcomePage extends PageObject {

    public void theUserClickOnFirstProductImageInSuperImageCarousel(String arg0) {
        $(Locators.SuperCarouselItem).click();
    }

    public void clickOnLogInLink() {
        $(Locators.LogInLink).click();
    }

    public void clickOnControlDropDownMenu() {
        $(Locators.ControlDropDownMenu).click();
    }

    public void clickOnCatalogItemOfControlDropDownMenu() {
        $(Locators.ControllDropDownMenuCatalogItem).click();
    }


}
