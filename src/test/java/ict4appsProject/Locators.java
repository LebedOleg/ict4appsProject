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
    String AdminProductPortletTypeOfStructureItem = "//select[@id='fields-structures']/option[contains(text(),'$1')]";
    String AdminProductPortletNameField = "//label[@for='name']/ancestor::div[@class='form-group']//input[@type='text']";
    String AdminProductPortletDescriptionField = "//span[@class='input-localized input-localized-textarea']//textarea";
    String AdminProductPortletCategoriesTab = "//a[text()='Категории']";
    String AdminProductPortletTabs = "//a[text()='$1']";

    String AdminProductPortletCategoriesTabItemCheckbox = "//span[text()='$1']/../input";

    String AdminProductPortletDetailsTab = "//a[text()='Детали']";

    String AdminProductPortletDetailsTabPriceField = ".//*[@id='$1Price-input']";
    String AdminProductPortletDetailsTabQuantityField = ".//*[@id='stockQuantity-input']";

    String AdminProductPortletDetailsAvailabilityStatus = "//select[@name='availabilityStatus']";
    String AdminProductPortletDetailsAvailabilityStatusItem = "//option[contains(text(),'$1')]";

    String AdminProductPortletPublishButton = "//a[contains(text(),'Опубликовать')]";
    String AdminProductPortletAddArticulesDropDown = "//a[@class=' dropdown-toggle']/span [contains(text(),'Добавить')]";
    String AdminProductPortletAddArticulesAutoGenerationItem = "//span[contains(text(), 'Автогенерация Артикулов')]";
    String AdminProductPortletConfirmPopUpButton = "//span[text()='Подтвердить']";

    String AdminCategoryPortletAddButton = "//span[@class='nav-item-label' and contains(text(),'Добавить Категорию')]";
    String AddCategoryPopUpContainer = "//fieldset[@class='formData']//div[@class='form-group']//input[@class='language-value']";
    String AddCategoryPopUpSaveButton = "//button[contains(@class,'publishCategoryBtn')]";
    String AdminCategoryPortletCategoriesList = "//span[contains(@class, 'jqtree')]";

    String AdminStructurePortletAddStructureButton = "//a[@class='btn']";
    String AdminStructurePortletStructureNameField = ".//*[@id='name']";
    String AdminStructurePortletSaveStructureButton = "//button[contains(@class,'btn btn-primary')]";
    String AdminStructurePortletStructuresList = "//a[text()='$1']";
    String AdminStructurePortletDisabledNextPaginationButton = "//li[@class='disabled']/a[text()=' Следующая ']";
    String AdminStructurePortletLastPaginationButton = "//a[text()=' Последняя → ']";
    String AdminStructurePortletListOfStructureFields = "//a[text()='$1']/ancestor::tr//td[@class='table-cell '][3]/a";
    String AdminStructurePortletFieldsOfAllStructures = "//tr//td[@class='table-cell '][3]/a";
    String AdminStructurePortletPaginationButton = "//a[text()='$1']";
    String AdminStructurePortletActionsButton = "//a[text()='$1']/ancestor::tr//span[text()='$2']";
    String AdminStructurePortletStructureFieldsList = "//tr//td[@class='table-cell '][1]/a";
    String AdminStructurePortletNextPaginationButton = "//li[@class=]/a[text()='$1']/ancestor::li";
    String AdminStructurePortletPagesDropDownItems = "//ul[@class='dropdown-menu lfr-menu-list direction-down' and @role='menu']/li[@role='presentation']";

    String AdminStructurePortletAddFieldButton = "//a[@title='Добавить Поле']";
    String AdminStructurePortletAddButton = "//button[contains(text(),'Добавить') and @form='addNewField']";
    String AdminStructurePortletAddFieldButtonItem = "//span[contains(text(), 'Создать Новое')]";
    String AdminStructurePortletSelectExistingButtonItem = "//span[contains(text(), ' Выбрать Существующее ')]";
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
    String AdminStructurePortletEnterNameOfFieldInput = "//label[contains(text(),'$1')]/ancestor::div[@class='control-group']//input";
    String AdminStructurePortletSelectLastHint = "(//li[@class='ui-menu-item']//span[@class='field-name'])[last()]";

    //TODO: Items of field

    String AdminStructurePortletNameOfFieldInput = ".//*[@id='name']";
    String AdminStructurePortletDescriptionOfFieldInput = ".//*[@id='description']";
    String AdminStructurePortletLocalizationOfFieldInput = ".//*[@id='_ICT4APPS_CUSTOM_FIELDS_WAR_ict4appsportlet_localizedLabelsInput']";
    String AdminStructurePortletDisplayNAmeOfFieldSelect = ".//*[@name='showLabel' and @value='$1']";
    String AdminStructurePortletAspectSearchSelect = ".//*[@name='faceted' and @value='$1']";
    String AdminStructurePortletAspectOrderInput = ".//*[@id='facetOrder']";
    String AdminStructurePortletDefaultValueOfFieldInput = ".//*[@id='defaultValue']";
    String AdminStructurePortletTypeOfDisplayOfFieldSelect = ".//*[@id='typeStr']";
    String AdminStructurePortletTypeOfDisplayOfFieldSelectItem = ".//*[@id='typeStr']/option[text()='$1']";
    String AdminStructurePortletTypeOfEdditingFieldSelect = ".//*[@id='editTypeStr']";
    String AdminStructurePortletTypeOfIndexFieldSelect = ".//*[@id='editTypeStr']";
    String AdminStructurePortletTypeOfIndexFieldSelectItem = ".//*[@id='editTypeStr']/option[text()='$1']";
    String AdminStructurePortletDisplayorderFieldInput = ".//*[@id='displayOrder']";

    String xxx = "//a[contains(text(),'TestFieldForBasicStructure')]/ancestor::tr/td[contains(@class,'sortable-column')]";

    String yyy = "//span[contains(text(),'$1')] /ancestor::a[@data-fieldid='$2']";

    String zzz = "//button//span[contains(text(),'Подтвердить')]";


    String personalAccountDropDownMenu = "//span[@class='nav-item-label']/span[@class='user-full-name']";
    String personalAccountExitItem = "//a[@role='menuitem' and @title='Выйти']";




    //TODO: WORKFLOW

    String FIRST_PRODUCT_TITLE = "(//a[@class='list_href'])[1]";
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
//    String BACK_LINK = "//a[@title='Back']";
    String ADD_PRODUCT_INPUT = ".//*[@id='accordion']/input";
    String PRODUCT_FROM_PRODUCT_SEARCH = ".//*[@id='checkbox-tree']/ul/li[1]";
    String CREATE_CUSTOMER_FIELDS = "//div[contains(text(),'$1')] /ancestor::div[@class='control-group row-fluid']//div/input";
    String SAVE_USER_BTN = ".//*[@id='userSaveBtn']";
    String SAVE_ORDER_BTN = "//div[@class='pull-right']//button[contains(text(),'$1')]";
    String ORDER_SPAN = "//ul[@class='category-portlets']//span[contains(text(),'$1')]";
    String SRCH_USR_INPUT = "//input[contains(@id,'searchUser')]";
    String CUSTOMER = "//div[@class='autocomplete customer-item']";
    String CANCEL_ORDER_BTN = "//div[@class='pull-left']//button[contains(text(),'Отменить')]";
    String CANCEL_REASON_DROPDOWN_MENU = "//select[@name='default-reason']";
    String SECOND_REASON_TO_CANCEL = "(//select[@name='default-reason']//option)[2]";
    String qwe = "//span[contains(text(),'Системные страницы')] //ancestor::div[contains(@class,'accordion-group')]//li//span[contains(text(),'$1')]";
    String CURRENCY_DROPDOWN_MENU = "//label[contains(text(),'$1')]/ancestor::div/select";
    String CURRENCY_OPTION = "//option[contains(text(),'$1')]";
    String PHONE_NUMBER_INPUT = "//input[contains(@class,'phoneNumber')]";
    String PHONE_ERROR_MSG = "//label[contains(@class,'error')]";
    String REMOVE_PHONE_NUMBER_ICON = "//i[contains(@class,'remove')]";

    //TODO:   PRODUCTS PAGE

    String LIST_OF_PRODUCT_TITLES = "//a[@class='list_href']";
    String CREATED_PRODUCT_TITLE = "//h3/a[contains(text(),'$1')]";
    String SHORT_DESC = "//a[contains(text(),'$1')]/ancestor::div[contains(@class,'product-mask')]/div[contains(@class,'product__introtext')]";
    String RETAIL_PRICE_LIST = "//a[contains(text(),'$1')]/ancestor::div[@class='product-mask']//div/label";
    String PRODUCT_DESC = "//div[@class='info-product table-word-wrap']";
    String PRODUCT_QUANTITY = "//div[@class='product-stock']/span";
    String SHORT_DESC_ADMIN = " //a[contains(text(),'$1')]/ancestor::div[@class='media-body product-compact-view']/div";
    String RETAIL_PRICE_PRODUCT_PORTLET = "//div[@class='retail-price']";
    String SPECIAL_OFFER_LABEL = "//div[contains(text(),'$2')]/../..//div[@class='product-mask']/div/h3/a[contains(text(),'$1')]";
    String SPECIAL_OFFER_CHECKBOX = ".//*[@id='specialOffer']";
    String SPECIAL_OFFERS_LINK = "//span[contains(text(),'Специальные Предложения')]/..";
    String DATE = "//a[text()='$1']";
    String DATE_PICKER = "//input[contains(@class,'hasDatepicker')]";
    String RETAIL_PRICE_PRODUCT_PAGE = "//div[@class='product-stock']/span";
    String AdminProductsPageLastProductInList = "(//h4[@class='media-heading']/a)[last()]";
    String AdminProductsPageNameTextbox = "//div[@class='form-group']//input[contains(@class,'language-value valid')]";

    //TODO:   COMMON ELEMENTS

    String LINK = "//a[contains(text(),'$1')]";
    String BUTTON = "//button[contains(text(),'$1')]";
    String SPAN = "//span[contains(text(),'$1')]";
    String DIV = "//div[contains(text(),'$1')]";
    String LABEL = "//label[contains(text(),'$1')]";
    String ANY_ELEMENT = "//*[contains(text(),'$1')]";

    //TODO:   WELCOME PAGE

    String SuperCarouselItem = "((//div[@class='slick-track' ])[2]/div[@aria-hidden='false']//img)[$1]";

    //TODO:  ADDITIONAL FIELDS VISIBILITY

    String EDIT_PRODUCT = "//span[contains(text(),'#1')]/ancestor::div[@class='portlet-body']//span[contains(text(),'$2')]";
    String STRUCTURES_SELECT = ".//*[@id='fields-structures']";
    String FIELD_TEST_STRUCTURE = "//option[contains(text(),'$1')]";
    String ADDITIONAL_FIELD = ".//*[@id='$1']";
    String ADDITIONAL_FIELD_WITH_DATA_PRODUCT_PAGE = "//div[@class='row-fluid']//div[.=' $1 ' or .=' $2 ']";
    String ACTIONS_BTN_OF_FIELD  = "//a[text()='$1']/ancestor::tr/td//a[@title='$2']";

    //TODO:  PRODUCT STATUS

    String PRODUCT_STATUS ="//label[contains(text(),'$1')]/../select";
    String STATUS_OPTIONS = "//option[contains(text(),'$1')]";
    String WARNING_MSG = ".//*[@id='qty-info-message']";

    String STOCK = "//label[contains(text(),'Остаток')]/../span";

    String BACK_LINK = "//a[@title='Назад']";

}
