package ict4appsProject.pages;

import ict4appsProject.Locators;

import net.thucydides.core.pages.PageObject;

/**
 * Created by userqa on 12.06.17.
 */
public class LogInPage extends PageObject {


    public void enterEmailAddress() {
        $(Locators.LogInEmailField).clear();
        $(Locators.LogInEmailField).sendKeys("test@liferay.com");

    }

    public void enterPassword() {
        $(Locators.LogInPasswordField).clear();
        $(Locators.LogInPasswordField).sendKeys("test-ict4apps!");
    }


    public void clickOnLogInButton() {
        $(Locators.LogInButton).click();
    }
}
