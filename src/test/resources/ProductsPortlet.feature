Feature: Products portlet

  Scenario: 001 Create product without additional SKU
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton

    When Open new tab
    When Switch tab "1"
    Then Control DropDown menu should appeared
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Продукты" item of Catalog Tab
    And Click on the "Добавить" span
    And Click on Type of Structures dropdown menu
    And Click on "TestStucture" Type Of Structures Dropdown Item
    And Enter random test data to Name field
    And Enter random test data to Description field
    And Select "TestCategory" category on "Категории" tab
    And Click on the "Детали" link
    And Enter random test data to "retail" field of Detail tab
#    And Enter random test data to "sale" field of Detail tab
    And Enter random test data to "Quantity" field of Detail tab
    And Click on the "Опубликовать" link
    And Click on "Продукты" item of Catalog Tab

    And Click on LAST pagination button
    Then Products List should contains product that was created
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

    When Switch tab "0"
    When Click on the "Продукты" span
    Then Check that product list contains our created product
    Then Check that short description is visible
    Then Check that price equals to created in admin CP
    When Click on our created product title on products page

    Then Check that title of product is displayed
    Then Check that product description is displayed
    Then Check that Quantity of product is displayed

    When Switch tab "1"


