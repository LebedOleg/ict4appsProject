package ict4appsProject.pages;

import ict4appsProject.Variables;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CRUD extends PageObject {

    public void clickMethod(String Locator) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
        $(Locator).click();
    }

    public void sendKeysMethod(String Locator, String data) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
        $(Locator).sendKeys(data);

    }

//    public void waitForElementVisibility(int Time, String Locator) {
//        withTimeoutOf(Time, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
//    }

    public void waitBit(int i) {
        waitABit(i);
    }


    public static String generateString(Random rng, String characters, int length) //creating random string
    {
        char[] text = new char[length]; // Create list of chars
        for (int i = 0; i < length; i++) //Creating number of random symbols, size equals  variable length
        {
            text[i] = characters.charAt(rng.nextInt(characters.length())); //For current step create random character and saves in list
        }
        return new String(text);//return list
    }

    public void clickByPixelLocation(String LocatorForMove) {
        (new WebDriverWait(getDriver(), 5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@role=\"dialog\"]")));

        getDriver().switchTo().activeElement();

        Actions actions = new Actions(getDriver());
        actions.moveByOffset(1022, 440).click().build().perform();
        $(LocatorForMove).sendKeys(Variables.CategoryName);
    }

    public boolean elementIsPresent(String Locator) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
        return $(Locator).isVisible();
    }

    public boolean elementIsNotPresent(String Locator) {
        return !$(Locator).isVisible();
    }


    public JavascriptExecutor jsExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return js;
    }

    public void scrollPage() {
        for (int i = 0; i < 75; i++) {
            waitABit(5);
            jsExecutor().executeScript("window.scrollBy(0,05)");
        }
    }

    public void refreshPage() {
        getDriver().navigate().refresh();
    }

    public void writeIntoInputField(String Locator, String arg0) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
        $(Locator).sendKeys(arg0);
    }

    public void enterRandomValue(String Locator) {
        int sizeName = 10; // size of random string
        String charac = "1234567890"; //Create the character set for random string
        Random r = new Random();
        String rndm = generateString(r, charac, sizeName);
        $(Locator).sendKeys(rndm);
    }

    public void switchTab(String arg0) {
        Integer x = Integer.parseInt(arg0);
        ArrayList<String> windows = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windows.get(x));
    }

    public WebElementFacade phoneNumber(String xpath) {
        List<WebElementFacade> list = findAll(By.xpath(xpath));
        return list.get(list.size() - 1);
    }

    public int getQuantityOfPhoneNumbers (String xpath) {
        List<WebElementFacade> list = findAll(By.xpath(xpath));
        return list.size();
    }
}