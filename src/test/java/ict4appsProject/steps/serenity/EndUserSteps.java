package ict4appsProject.steps.serenity;

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
}