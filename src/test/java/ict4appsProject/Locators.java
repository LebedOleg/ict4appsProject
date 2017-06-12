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
    String AdminProductPortletTypeOfStructure = ".//*[@id='fields-structures']";
    String AdminProductPortletTypeOfStructureItem = ".//*[@id='fields-structures']/option[contains(text(),'тест структуры')]";


    //TODO:   WELCOME PAGE
    String SuperCarouselItem = "((//div[@class='slick-track' ])[2]/div[@aria-hidden='false']//img)[$1]";
}
