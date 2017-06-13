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


    String AdminProductPortletTypeOfStructure = ".//*[@id='fields-structures']";
    String AdminProductPortletTypeOfStructureItem = ".//*[@id='fields-structures']/option[contains(text(),'тест структуры')]";
    String AdminProductPortletNameField = "//label[text()='Имя']/..//input[@type='text']";
    String AdminProductPortletDescriptionField = "//span[@class='input-localized input-localized-textarea']//textarea";
    String AdminProductPortletCategoriesTab = "//a[text()='Категории']";
    String AdminProductPortletCategoriesTabItemCheckbox = "//span[text()='Категория для тестов']/../input";
    String AdminProductPortletDetailsTab = "//a[text()='Детали']";
    String AdminProductPortletDetailsTabRetailPriceField = ".//*[@id='retailPrice-input']";
    String AdminProductPortletDetailsTabSaleField = ".//*[@id='salePrice-input']";
    String AdminProductPortletDetailsTabQuantityField = ".//*[@id='stockQuantity-input']";
    String AdminProductPortletPublishButton = "//a[contains(text(),'Опубликовать')]";


    //TODO:   WELCOME PAGE
    String SuperCarouselItem = "((//div[@class='slick-track' ])[2]/div[@aria-hidden='false']//img)[$1]";
}
