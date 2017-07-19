package ict4appsProject;

public interface LocatorsForAdminCPorders {

    String ORDER_LINE_STATUS = "//tr[contains(@class,'order-entity')]//td[5]//strong";
    String ORDER_LINE_ID = "//tr[contains(@class,'order-entity')]//td[2]//a";
    String ORDER_PAGE_STATUS_TAG = "//span[@class='order-status-bar']/span[contains(text(),'$1')]";
    String ORDER_SPAN = "//ul[@class='category-portlets']//span[contains(text(),'$1')]";
    String CANCEL_ORDER_BTN = "//div[@class='pull-left']//button[contains(text(),'Отменить')]";
    String CANCEL_REASON_DROPDOWN_MENU = "//select[@name='default-reason']";
    String SECOND_REASON_TO_CANCEL = "(//select[@name='default-reason']//option)[2]";
    String ORDER_PAGE_HISTORY_STATUS = "(//span[contains(@class,'new-value')])[1]";
    String ORDER_PAGE_HISTORY_SHORT_STATUS = "(//span[@class='status'])[2]";
    String ADD_PRODUCT_INPUT = "//input[@class='checkbox-popup-search']";
    String PRODUCT_FROM_PRODUCT_SEARCH = ".//*[@id='checkbox-tree']/ul/li[1]";
    String CREATE_CUSTOMER_FIELDS = "//div[contains(text(),'$1')] /ancestor::div[@class='control-group row-fluid']//div/input";
    String SAVE_USER_BTN = ".//*[@id='userSaveBtn']";
    String SAVE_ORDER_BTN = "//div[@class='pull-right']//button[contains(text(),'Сохранить')]";
    String SRCH_USR_INPUT = "//input[contains(@id,'searchUser')]";
    String CUSTOMER = "//div[@class='autocomplete customer-item']";
    String ACCORDION_TOGGLE = "//div[@class='accordion-toggle']/span[contains(text(),'$1')]";





}
