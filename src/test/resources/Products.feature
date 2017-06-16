Feature: Products cart testing.


  Background:
    Given the user is on Ictapps staging page

    Scenario: 001 Create test Category
      Given Click on LogInLink
      And Enter Email address
      And Enter Password
      And Click on LogInButton
      Then Control DropDown menu should appeared
      When Click on Control DropDown menu
      And Click on " Каталог " item of Control DropDown menu
      And Click on "Категории" item of Catalog Tab
      And Click on Add Category button
      And Enter random test data to Category name field
      And Click on Save button of Create Category form
      Then Categories list should contain category that was created

   Scenario: 002 Create Test Structure
     Given Click on LogInLink
     And Enter Email address
     And Enter Password
     And Click on LogInButton
     Then Control DropDown menu should appeared
     When Click on Control DropDown menu
     And Click on " Каталог " item of Control DropDown menu
     And Click on "Параметры" item of Catalog Tab
     And Click on Add Sructure button
     And Enter data to Structure name field
     And Click on Save Structure button
     Then Structures list should contain structure that was created

   Scenario: 003 Create Test field in test Structure
     Given Click on LogInLink
     And Enter Email address
     And Enter Password
     And Click on LogInButton
     Then Control DropDown menu should appeared
     When Click on Control DropDown menu
     And Click on " Каталог " item of Control DropDown menu
     And Click on "Параметры" item of Catalog Tab
     And Click on Structure that was created
     And Click on Add Field to Structure button
     And Select Create new item of Add field to Structure dropdown menu
     And Enter "TestField1" to field name field
     And Click on Add new field to Structure button
     Then Structure should contained "TestField1" field that was created


   Scenario: 004 Create Test fields for Additional SKu in test Structure
     Given Click on LogInLink
     And Enter Email address
     And Enter Password
     And Click on LogInButton
     Then Control DropDown menu should appeared
     When Click on Control DropDown menu
     And Click on " Каталог " item of Control DropDown menu
     And Click on "Параметры" item of Catalog Tab
     And Click on Structure that was created
     And Click on Add Field to Structure button
     And Select Create new item of Add field to Structure dropdown menu
     And Enter "TestField2" to field name field
     And Click on Add Field on Structure button
     Then Structure should contained "TestField2" field that was created
     When Click on name of "TestField2" field that was created
     And Click on Type of display dropdown menu
     And Select "select" option of Type of display dropdown menu
     Then Add field option button should appeared
     When Click on Save button of Field eddit page
     When Click on name of "TestField2" field that was created
     When Click on Add field option button
     And Enter "AlphaCharacters" on Values field of Add option popup
     And Click on Save button of Add option popup
     Then Option "AlphaCharacters" should appeared on option list
     When Click on back button of Admin CP
     When Click on Add Field to Structure button
     And Select Create new item of Add field to Structure dropdown menu
     And Enter "TestField3" to field name field
     And Click on Add new field to Structure button
     Then Structure should contained "TestField3" field that was created
     When Click on name of "TestField3" field that was created
     And Click on Type of display dropdown menu
     And Select "radiobuttons" option of Type of display dropdown menu
     Then Add field option button should appeared
     When Click on Save button of Field eddit page
     When Click on name of "TestField3" field that was created
     When Click on Add field option button
     And Enter "AlphaCharacters" on Values field of Add option popup
     And Click on Save button of Add option popup
     Then Option "AlphaCharacters" should appeared on option list

Scenario: 005 Create product without additional SKU
  Given Click on LogInLink
  And Enter Email address
  And Enter Password
  And Click on LogInButton
  Then Control DropDown menu should appeared
  When Click on Control DropDown menu
  And Click on " Каталог " item of Control DropDown menu
  And Click on "Продукты" item of Catalog Tab
  And Click on Add product button
  And Click on Type of Structures dropdown menu
  And Click on "TestStucture" Type Of Structures Dropdown Item
  And Enter random test data to Name field
  And Enter random test data to Description field
  And Select "TestCategory" category on "Категории" tab
  And Click on Detail tab of Products portlet
  And Enter random test data to "retail" field of Detail tab
  And Enter random test data to "sale" field of Detail tab
  And Enter random test data to "Quantity" field of Detail tab
  And Click on Publish button
  And Click on "Продукты" item of Catalog Tab
  And Click on LAST pagination button
  Then Products List should contains product that was created
  Then Product name according to name that was entered
  Then Check that Description field has right data
  Then Check that Type of Structures Dropdown menu has right item
  When Click on Categories tab of Products portlet
  Then Check that right category is selected
  When Click on Detail tab of Products portlet
  Then Check that "retail" price field has right data
  Then Check that "sale" price field has right data
  Then Check that quntity field has right data

  Scenario: 006 Create product with additional SKU
    Given the user is on Ictapps staging page
    Given Log in into system as admin
    When Go to Products admin CP page and click on Add button
    And Fill "Name" "Description" fields and select "TestStucture" structure on "Основные Данные" tab
    And Select "TestCategory" category on "Категории" tab
    And Fill "retail" "sale" and "Quantity" fields on "Детали" tab
    Then Check that product field is created right
    And Click on "Основные Данные" tab of Product portlet
    And Click on Type of Structures dropdown menu
    And Click on "TestStucture" Type Of Structures Dropdown Item
    And Click on Publish button
    And Click on "Продукты" item of Catalog Tab
    And Click on LAST pagination button
    Then Products List should contains product that was created
    Then Check that "Артикулы" tab is appeared
    When  Click on "Артикулы" tab of Product portlet
    And  Click on Add Articules dropdown menu
    And Click on Auto Generation item of Add Articules dropdown menu
    And Click on Confirm button of Auto Generation Pop Up window





#  Scenario: Create product without SKU
#    Then Test1

#
#  Scenario: Delete product with SKU
#    Given
#    Then
#  Scenario: Delete product without SKU