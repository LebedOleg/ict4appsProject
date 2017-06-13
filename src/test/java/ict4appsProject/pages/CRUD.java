package ict4appsProject.pages;

import ict4appsProject.Locators;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class CRUD extends PageObject{

    public void clickMethod(String Locator) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
        $(Locator).click();
    }

    public void waitForElementVisibility(int $1, String Locator) {
        withTimeoutOf($1, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
    }

    public void waitBit(int i) {
        waitABit(i);
    }
}
