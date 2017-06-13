package ict4appsProject;

public interface Locators {
    String LogInLink = "//a[text()='Войти']";
    String LogInEmailField = ".//*[@id='_58_login']";
    String LogInPasswordField = ".//*[@id='_58_password']";
    String LogInButton = "//button[text()=' Войти ']";


    String ControlDropDownMenu = "//span[text()=' Управление ']";
    String ControllDropDownMenuCatalogItem = "//span[text()=' Каталог ']";
    String ProductsCatalogItem = "//span[text()='Продукты']";


    String AdminProductPortletAddProduct = "//span[text()=' Добавить ']";
    String AdminProductPortletLastPaginationButton = "(//a[text()='Последняя →'])[1]";
    String AdminProductPortletListOfProductsNames = "//h4[@class='media-heading']/a";
    String AdminProductPortletProductName = "//h4/a[contains(text(),'$1')]";


    String AdminProductPortletTypeOfStructure = ".//*[@id='fields-structures']";
    String AdminProductPortletTypeOfStructureItem = ".//*[@id='fields-structures']/option[contains(text(),'тест структуры')]";
    String AdminProductPortletNameField = "//label[text()='Имя']/..//input[@type='text']";
    String AdminProductPortletDescriptionField = "//span[@class='input-localized input-localized-textarea']//textarea";
    String AdminProductPortletCategoriesTab = "//a[text()='Категории']";
    String AdminProductPortletCategoriesTabItemCheckbox = "//span[text()='Категория для тестов']/../input";
    String AdminProductPortletDetailsTab = "//a[text()='Детали']";
    String AdminProductPortletDetailsTabRetailPriceField = ".//*[@id='$1Price-input']";
    String AdminProductPortletDetailsTabSalePriceField = ".//*[@id='salePrice-input']";
    String AdminProductPortletDetailsTabQuantityField = ".//*[@id='stockQuantity-input']";
    String AdminProductPortletPublishButton = "//a[contains(text(),'Опубликовать')]";

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
