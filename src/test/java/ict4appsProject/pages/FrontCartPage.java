package ict4appsProject.pages;

import ict4appsProject.LocatorsForCartPage;
import net.thucydides.core.pages.PageObject;

public class FrontCartPage extends PageObject {

    public void clickOnTheSelfPickUpCheckbox() {
        $(LocatorsForCartPage.SELF_PICK_UP_CHECKBOX).click();
    }

    public void clickOnTheAdressSelect() {
        $(LocatorsForCartPage.ADDRESS_SELECT).click();
    }

    public void clickOntHeAddress() {
        $(LocatorsForCartPage.ADDRESS).click();
    }

}
