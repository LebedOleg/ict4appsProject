package ict4appsProject.pages;

import ict4appsProject.LocatorsForAdminCPorders;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class AdminControlPageOrders extends PageObject{

    public boolean checkThatCreatedOrderHasStatus(String arg0) {
        List<WebElementFacade> list = findAll(By.xpath(LocatorsForAdminCPorders.ORDER_LINE_STATUS));
        if (list.get(list.size() - 1).getText().contains(arg0)) {
            return true;
        } else return false;
    }

    public void clickOnTheCreatedOrderId() {
        List<WebElementFacade> list = findAll(By.xpath(LocatorsForAdminCPorders.ORDER_LINE_ID));
        list.get(list.size()-1).click();
    }

    public boolean checkThatCreatedOrderPageHasStatusTag(String arg0) {
        return $(LocatorsForAdminCPorders.ORDER_PAGE_STATUS_TAG.replace("$1",arg0)).isPresent();
    }

    public void clickOnTheLinkOnTheLeftAccordion(String arg0) {
        $(LocatorsForAdminCPorders.ORDER_SPAN.replace("$1",arg0)).click();
    }

    public void clickOnTheCancelOrderButton() {
        $(LocatorsForAdminCPorders.CANCEL_ORDER_BTN).click();
    }

    public void clickOnTheCancelReasonDropdownMenu() {
        $(LocatorsForAdminCPorders.CANCEL_REASON_DROPDOWN_MENU).click();
    }

    public void selectReason() {
        $(LocatorsForAdminCPorders.SECOND_REASON_TO_CANCEL).click();
    }

    public boolean checkThatCreatedOrderPageHasStatusInStatusHistory(String arg0) {
        return $(LocatorsForAdminCPorders.ORDER_PAGE_HISTORY_STATUS).getText().equalsIgnoreCase(arg0);
    }

    public boolean checkThatCreatedOrderPageHasStatusInShortStatusHistory(String arg0) {
        return $(LocatorsForAdminCPorders.ORDER_PAGE_HISTORY_SHORT_STATUS).getText().equalsIgnoreCase(arg0);
    }

    public void writeIntoSearchProductInputField(String arg0) {
        $(LocatorsForAdminCPorders.ADD_PRODUCT_INPUT).sendKeys(arg0);
    }

    public void clickOnTheProductFromProductSearch() {
        $(LocatorsForAdminCPorders.PRODUCT_FROM_PRODUCT_SEARCH).click();
    }

    public void writeDataIntoField(String arg0, String arg1) {
        $(LocatorsForAdminCPorders.CREATE_CUSTOMER_FIELDS.replace("$1",arg1)).sendKeys(arg0);
    }

    public void saveCreatedUser() {
        $(LocatorsForAdminCPorders.SAVE_USER_BTN).click();
    }

    public void clickOnTheOrderButton() {
        $(LocatorsForAdminCPorders.SAVE_ORDER_BTN).click();
    }

    public void writeIntoSearchUserTextBox(String arg0) {
        $(LocatorsForAdminCPorders.SRCH_USR_INPUT).sendKeys(arg0);
    }

    public void selectCustomerWhoDoesntHaveAPhone() {
        $(LocatorsForAdminCPorders.CUSTOMER).click();
    }
}
