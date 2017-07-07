Feature: Products portlet


  Background:
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton
    Then Control DropDown menu should appeared
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Продукты" item of Catalog Tab
#     САЙТ
#     ЗАЛОГИНИЛИСЬ

  Scenario: 001 Create product without additional SKU
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton

    # АДМИНКА
    # СОЗДАЛИ ТОВАР С РЕТЕИЛ ПРАЙСОМ

    When Open new tab
    When Switch tab "1"
    Then Control DropDown menu should appeared
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Продукты" item of Catalog Tab
    And Click on the "Добавить" span
    And Enter random test data to Name field
    And Enter random test data to Description field
    And Click on the "Дополнительные характеристики" link
    And Click on Type of Structures dropdown menu
    And Click on "TestStructure" Type Of Structures Dropdown Item
    And Select "TestCategory" category on "Категории" tab
    And Click on the "Детали" link
    And Enter random test data to "retail" field of Detail tab
#    And Enter random test data to "sale" field of Detail tab
    And Enter random test data to "Quantity" field of Detail tab
    And Click on the "Опубликовать" link
    And Click on "Продукты" item of Catalog Tab
    And Click on LAST pagination button

    # АДМИНКА
    # ПРОВЕРИЛИ ЧТО ТОВАР ИМЕЕТ ТАЙТЛ И ДЕСКРИПШН В АДМИНКЕ

    Then Products List should contains product that was created
    Then Check that short description is visible in admin CP

    # АДМИНКА
    # ЗАШЛИ ВНУТРЬ ПРОДУКТА В АДМИНКЕ И ПРОВЕРИЛИ ЧТО ДАННЫЕ СОХРАНИЛИСЬ

    When Click on our created product title
    Then Product name according to name that was entered
    Then Check that Description field has right data
    Then Check that Type of Structures Dropdown menu has right item
    When Click on Categories tab of Products portlet
    Then Check that right category is selected
    When Click on the "Детали" link
    Then Check that "retail" price field has right data
#    Then Check that "sale" price field has right data
    Then Check that quntity field has right data

    # САЙТ
    # ПЕРЕКЛЮЧИЛИ ТАБУ ОБРАТНО И ПРОВЕРИЛИ ЧТО ТОВАР ПОЯВИЛСЯ И ИМЕЕТ ТАЙТЛ,ДЕСКРИПШН И ЦЕНУ УКАЗАННУЮ В АДМИНКЕ

    When Switch tab "0"
    When Click on the "Продукты" span
    Then Check that product list contains our created product
    Then Check that short description is visible
    Then Check that Retail price equals to created in admin CP

    # САЙТ
    # ЗАШЛИ ВНУТРЬ ПРОДУКТА И ПРОВЕРИЛИ ЧТО ЧТО ТАЙТЛ,ДЕСКРИПШН,КОЛИЧЕСТВО И ЦЕНА СООТВЕТСТВУЮТ УКАЗАННЫМ В АДМИНКЕ

    When Click on our created product title on products page
    Then Check that title of product is displayed
    Then Check that product description is displayed
    Then Check that Quantity of product is displayed
    Then Check that Retail price equals to created in admin CP on product page

     # АДМИНКА
     # ДОБАВИЛИ СЕЙЛ ПРАЙС

    When Switch tab "1"
    When Refresh page
    When Click on LAST pagination button
    When Click on our created product title
    When Click on the "Детали" link
    When Enter random test data to "sale" field of Detail tab
    When Click on the "Опубликовать" link

     # САЙТ
     # ПЕРЕКЛЮЧИЛИ ТАБУ И ПРОВЕРИЛИ ЧТО СЕЙЛ ПРАЙС ПОЯВИЛСЯ

    When Switch tab "0"
    When Refresh page
    When Click on the "Продукты" span
    Then Check that Sale price equals to created in admin CP
    When Click on our created product title on products page
    Then Check that Sale price equals to created in admin CP on product page

     # АДМИНКА
     # ПРЕРЕКЛЮЧИЛИ НА АДМИНКУ И ПОСТАВИЛИ ГАЛОЧКУ "СПЕЦИАЛЬНОЕ ПРЕДЛОЖЕНИЕ"

    When Switch tab "1"
    When Click on the special offer check box
    When Click on the "Опубликовать" link

     # САЙТ
     # ПЕРЕКЛЮЧИЛИ ТАБУ И ПРОВЕРИЛИ ЧТО "СПЕЦИАЛЬНЫЙ" ЛЕЙБЛ ПОЯВИЛСЯ И ПРОДУКТ ПОМЕСТИЛСЯ В СПЕЦИАЛЬНЫЕ ПРЕДЛОЖЕНИЯ КАТЕГОРИЮ

    When Switch tab "0"
    When Click on the "Продукты" span
    Then Check that "Специальный" label is appears on on our product
    When Click on the "Специальные Предложения" link on header
    Then Check that "Специальный" label is appears on on our product
#    When Click on our created product title on products page
#    Then Check that title of product is displayed
#    Then Check that product description is displayed
#    Then Check that Quantity of product is displayed
    When Click on the "Продукты" span

    # АДМИНКА
    # ВЗЯЛИ ТЕКУЩУЮ ДАТУ,ДОБАВИЛИ ОДИН ДЕНЬ И ЗАПИСАЛИ В ИНПУТ "ПОКАЗЫВАТЬ КАК НОВЫЙ ДО"

    When Switch tab "1"
    When Enter the next day's date into date text box
    When Click on the "Опубликовать" link

    # САЙТ
    # ПРОВЕРИЛИ ЧТО ЛЕЙБЛ "НОВЫЙ" ПОЯВИЛСЯ

    When Switch tab "0"
    When Refresh page
    Then Check that "Новый" label is appears on on our product

    # АДМИНКА
    # ВЗЯЛИ ТЕКУЩУЮ ДАТУ,ОТНЯЛИ ОДИН ДЕНЬ И ЗАПИСАЛИ В ИНПУТ "ПОКАЗЫВАТЬ КАК НОВЫЙ ДО"

    When Switch tab "1"
    When Enter the previous day's date into date text box
    When Click on the "Опубликовать" link

    # САЙТ
    # ПРОВЕРИЛИ ЧТО ЛЕЙБЛ "НОВЫЙ" ИСЧЕЗ

    When Switch tab "0"
    When Refresh page
    Then Then Check that "Новый" label is disappeared on on our product


    #Create test product
  Scenario Outline: 0013 Create product without additional SKU
    And Click on the "Добавить" span
    And Enter "<Name>" on Name field
    And Enter "<Description>" on Product editing Description field
    And Click on the "Дополнительные характеристики" link
    And Click on Type of Structures dropdown menu
    And Click on "addNewStructureTest" Type Of Structures Dropdown Item

    And Select "Категория для тестов" category on "Категории" tab
    And Click on the "Детали" link
    And Click on "availabilityStatus" dropdown menu
    And Select " Всегда в наличии " item of "availabilityStatus" dropdown menu
    And Enter random test data to "retail" field of Detail tab
    And Enter random test data to "sale" field of Detail tab
#    And Enter random test data to "Quantity" field of Detail tab
    And Click on the "Применить" link
    And Log out
    Examples:
    |Name         |Description        |
    |TestProd1    |TestProd           |
    |TestProd2    |TestProd           |
    |TestProd3    |TestProd           |



  # UI for product edditing



  Scenario: 002 Product Editing page has  "Save" and "Save and Continue" buttons
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Продукты" item of Catalog Tab
    And Click on the "Последняя" link
    And Click on last product in product list
    Then Product editing page should have " Опубликовать " button
    Then Product editing page should have " Применить " button


  Scenario: 003 "Save and Continue" button save changes without
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Продукты" item of Catalog Tab
    And Click on the "Последняя" link
    And Click on last product in product list
    When Enter "qwerty" on Name textbox
    And Click on " Применить " button




   #Uniqie localized field

  Scenario: 004 Enter values on fields that have unique normalized fields and check that they filled
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Продукты" item of Catalog Tab
    And Click on the "Последняя" link


