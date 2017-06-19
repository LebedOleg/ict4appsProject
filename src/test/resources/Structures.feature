Feature: Structures admin portlet.


  Background:
    Given the user is on Ictapps staging page
    Given Log in into system as admin

  Scenario: 001 Basic structure is available for admin
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Параметры" item of Catalog Tab
    Then Structure list should contain "Basic" structure

  Scenario: 002 New structure can be added and inherit fields of Basic structure
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Параметры" item of Catalog Tab
    And Click on Add Sructure button
    And Enter "addNewStructureTest" on Structure name field
    And Click on Save Structure button
    Then Structures list should contain "addNewStructureTest" structure
    Then "addNewStructureTest" structure should contain field of basic structure

  Scenario: 003 New field can be added to Basic structure
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Параметры" item of Catalog Tab
    And Click on name of "Basic" structure
    And Click on Add Field to Structure button
    And Select Create new item of Add field to Structure dropdown menu
    And Enter "TestFieldForBasicStructure" to field name field
    And Click on Add new field to Structure button
    Then Structure should contained "TestFieldForBasicStructure" field that was created

   Scenario: 004 All structures are inherited field that was added to Basic structure
     When Click on Control DropDown menu
     And Click on " Каталог " item of Control DropDown menu
     And Click on "Параметры" item of Catalog Tab
     Then All structures should contain "TestFieldForBasicStructure" field

