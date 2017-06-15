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

    String FIRST_PRODUCT_TITLE = "(//a[@class='list_href'])[1]";
    String CART = "//div[@class='card']//div[@class='cart-icon']/./..";

    //TODO:   COMMON ELEMENTS

    String LINK = "//a[contains(text(),'$1')]";
    String BUTTON = "//button[contains(text(),'$1')]";
    String SPAN = "//span[contains(text(),'$1')]";
    String DIV = "//div[contains(text(),'$1')]";

    //TODO:   WELCOME PAGE
    String SuperCarouselItem = "((//div[@class='slick-track' ])[2]/div[@aria-hidden='false']//img)[$1]";
}
