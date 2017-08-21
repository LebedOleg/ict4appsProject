package ict4appsProject.pages;

import ict4appsProject.Locators;
import net.serenitybdd.core.pages.PageObject;


public class FrontLogInPage extends PageObject {

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
