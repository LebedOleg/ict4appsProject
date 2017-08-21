package ict4appsProject.pages;

import ict4appsProject.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("https://staging.ict4apps.aimprosoft.com")
public class FrontWelcomePage extends PageObject {


    public void openNewTab () {
        Actions actions = new Actions(getDriver());
        actions.moveToElement
                ($("(//img[@alt='staging'])[1]")).keyDown(Keys.LEFT_CONTROL).click($("(//img[@alt='staging'])[1]")).keyUp(Keys.LEFT_CONTROL).build().perform();
        waitABit(1000);
    }

    public void checkForCartOptionsVisibility() {
        if ($(Locators.CART_OPTIONS).isDisplayed()) {
            $(Locators.OFF_OPTIONS).click();
        }
    }




}
