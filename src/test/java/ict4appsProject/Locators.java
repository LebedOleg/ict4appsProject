package ict4appsProject;

public interface Locators {
    String LogInLink = "//a[text()='Войти']";
    String LogInEmailField = ".//*[@id='_58_login']";
    String LogInPasswordField = ".//*[@id='_58_password']";
    String LogInButton = "//button[text()=' Войти ']";


    String ControlDropDownMenu = "//span[text()=' Управление ']";
    String ControllDropDownMenuCatalogItem = "//span[text()='$1']";
    String ProductsCatalogItem = "//span[text()='$1']";


    String AdminControlPanelBackButton = "//a[@title='Назад' and @class='icon-circle-arrow-left previous-level']";

    String AdminProductPortletAddProduct = "//span[text()=' Добавить ']";
    String AdminProductPortletLastPaginationButton = "(//a[text()='Последняя →'])[1]";
    String AdminProductPortletListOfProductsNames = "//h4[@class='media-heading']/a";
    String AdminProductPortletProductName = "//h4/a[contains(text(),'$1')]";


    String AdminProductPortletTypeOfStructure = ".//*[@id='fields-structures']";
    String AdminProductPortletTypeOfStructureItem = ".//*[@id='fields-structures']/option[contains(text(),'тест структуры')]";
    String AdminProductPortletNameField = "//label[text()='Имя']/..//input[@type='text']";
    String AdminProductPortletDescriptionField = "//span[@class='input-localized input-localized-textarea']//textarea";
    String AdminProductPortletCategoriesTab = "//a[text()='Категории']";
    String AdminProductPortletCategoriesTabItemCheckbox = "//span[text()='$1']/../input";
    String AdminProductPortletDetailsTab = "//a[text()='Детали']";
    String AdminProductPortletDetailsTabPriceField = ".//*[@id='$1Price-input']";
    String AdminProductPortletDetailsTabQuantityField = ".//*[@id='stockQuantity-input']";
    String AdminProductPortletPublishButton = "//a[contains(text(),'Опубликовать')]";

    String AdminCategoryPortletAddButton = "//span[@class='nav-item-label' and contains(text(),'Добавить Категорию')]";
    String AddCategoryPopUpContainer = "//fieldset[@class='formData']//div[@class='form-group']//input[@class='language-value']";
    String AddCategoryPopUpSaveButton = "//button[contains(@class,'publishCategoryBtn')]";
    String AdminCategoryPortletCategoriesList = "//span[contains(@class, 'jqtree')]";


    String AdminStructurePortletAddStructureButton = "//a[@class='btn']";
    String AdminStructurePortletStructureNameField = ".//*[@id='name']";
    String AdminStructurePortletSaveStructureButton = "//button[contains(@class,'btn btn-primary')]";
    String AdminStructurePortletStructuresList = "//a[text()='$1']";


    String AdminStructurePortletAddFieldButton = "//a[@title='Добавить Поле']";
    String AdminStructurePortletAddButton = "//button[contains(text(),'Добавить') and @form='addNewField']";
    String AdminStructurePortletAddFieldButtonItem = "//span[contains(text(), 'Создать Новое')]";
    String AdminStructurePortletNameOfNewField = "//label[text()=' Имя Поля ']/ancestor::div[@class='control-group']//input";
    String AdminStructurePortletAddNewFieldButton = "//button[text()=' Добавить ']";
    String AdminStructurePortletFieldIsVisible = "//a[text()='$1']";
    String AdminStructurePortletNameOfField = "//a[text()='$1']";
    String AdminStructurePortletTypeOfDisplayDropDown = "//select[@id='typeStr']";
    String AdminStructurePortletTypeOfDisplayDropDownItem = "//option[text()='$1']";
    String AdminStructurePortletAddOptionOfFieldButton = "//a[contains(text(),'Добавить опцию поля')]";
    String AdminStructurePortletValueFieldOfAddOptionPopUp = ".//input[@id='optionValue']";
    String AdminStructurePortletSaveButtonOfAddOptionPopUp = "//span[text()='Сохранить']";
    String AdminStructurePortletSaveButtonOfFieldEddit = "//button[text()='Сохранить']";


    //TODO: WORKFLOW

    //TODO: WORKFLOW

    String FIRST_PRODUCT_TITLE = "(//a[@class='list_href'])[2]";
    String CART = "//div[@class='card']//div[@class='cart-icon']/..";
    String ORDER_LINE_STATUS = "//tr[contains(@class,'order-entity')]//td[5]//strong";
    String ORDER_LINE_ID = "//tr[contains(@class,'order-entity')]//td[2]//a";
    String ORDER_PAGE_STATUS_TAG = "//span[@class='order-status-bar']/span[contains(text(),'$1')]";
    String ORDER_PAGE_HISTORY_STATUS = "(//span[contains(@class,'new-value')])[1]";
    String ORDER_PAGE_HISTORY_SHORT_STATUS = "(//span[@class='status'])[2]";
    String SELF_PICK_UP_CHECKBOX = ".//*[@id='self-pickup']";
    String ADDRESS_SELECT = ".//*[@id='officeAddress']";
    String ADDRESS = "(//select[@id='officeAddress']/option)[2]";
    String CART_OPTIONS = "//div[@class='card']//span[contains(text(),'Корзина Резюме')]";
    String OFF_OPTIONS = "//span[contains(text(),'Режим Редактирования')]";
    String ORDERS_LINK = "//a[@class=\"taglib-icon\"]/span[contains(text(),'$1')]";
    String BACK_LINK = "//a[@title='Back']";
    String ADD_PRODUCT_INPUT = ".//*[@id='accordion']/input";
    String PRODUCT_FROM_PRODUCT_SEARCH = ".//*[@id='checkbox-tree']/ul/li[1]";
    String CREATE_CUSTOMER_FIELDS = "//div[contains(text(),'$1')] /ancestor::div[@class='control-group row-fluid']//div/input";
    String SAVE_USER_BTN = ".//*[@id='userSaveBtn']";
    //    String SAVE_ORDER_BTN = "//div[@class='pull-right']//button[contains(text(),'$1')]";
    String SAVE_ORDER_BTN = "//div[@class='pull-right']//button[contains(text(),'Сохранить')]";
    String ORDER_SPAN = "//ul[@class='category-portlets']//span[contains(text(),'$1')]";

    //TODO:   COMMON ELEMENTS

    String LINK = "//a[contains(text(),'$1')]";
    String BUTTON = "//button[contains(text(),'$1')]";
    String SPAN = "//span[contains(text(),'$1')]";
    String DIV = "//div[contains(text(),'$1')]";

    //TODO:   WELCOME PAGE
    String SuperCarouselItem = "((//div[@class='slick-track' ])[2]/div[@aria-hidden='false']//img)[$1]";

    String TEST = "testdata";
}
