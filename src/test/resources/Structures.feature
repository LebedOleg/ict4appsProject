Feature: Structures admin portlet.


  Background:
    Given the user is on Ictapps staging page
    Given Log in into system as admin
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Параметры" item of Catalog Tab


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
     Then All structures should contain "TestFieldForBasicStructure" field

   Scenario: 005 Field is deleted form all structures if delete it in basic structure
     And Click on name of "Basic" structure
     When Click on the "Последняя" link
     And Click on "Действия" button near "TestFieldForBasicStructure" field
     When Click on the "Удалить навсегда" button in opened pop up
     When Click on the confirm button
     Then "TestFieldForBasicStructure" field should be deleted from basic structure
     And Click on Save Structure button
     Then "TestFieldForBasicStructure" field should be deleted from all structures


   Scenario: 006 New field in child structure can be added
     When Click on the "Последняя" link
     And Click on name of "addNewStructureTest" structure
     And Click on Add Field to Structure button
     And Select Create new item of Add field to Structure dropdown menu
     And Enter "subFieldTest" to field name field
     And Click on Add new field to Structure button
     Then Structure should contained "subFieldTest" field that was created

   Scenario: 007 Already existing field can be added to structure which doesn't have it.
     And Click on Add Sructure button
     And Enter "qwertyTest" on Structure name field
     And Click on Save Structure button
     And Click on the "Последняя" link
     And Click on name of "addNewStructureTest" structure
     And Get id of "subFieldTest" field
     And Click on Save Structure button
     And Click on the "Последняя" link
     And Click on name of "qwertyTest" structure
     And Click on Add Field to Structure button
     And Select select existing item of Add field to Structure dropdown menu
     And Enter "subField" on " Введите Имя Поля" field
     And Click on " Введите Имя Поля" field
     And Click on Add existing field to Structure button
     And Click on last hint that appeared
     Then Structure should contained "subFieldTest" field that was created

   Scenario: 008 Change #### items of field and check that it changes in all structures
     When Click on Control DropDown menu
     And Click on " Каталог " item of Control DropDown menu
     And Click on "Параметры" item of Catalog Tab
     When Click on the "Последняя" link
     And Click on name of "addNewStructureTest" structure
     And Click on name of "subFieldTest" field
     And Enter "TestName" on field name field
     And Enter "TestDescription" on field description field
     And Enter "TestLocalization" on field localization field
     And Click on "True" checkbox of display name of field
     And Enter "333" on default value of field
     And Select "boolean" item of Type of displaying dropdown
#     And Select "date" item of Type of Editing dropdown
     When Click on the "Сохранить" button
     And Click on back button of Admin CP
     And Click on the "Последняя" link
     And Click on name of "qwertyTest" structure
     And Click on name of "subFieldTest" field
     Then Name field should contain "TestName" value
     And description field should contain "TestDescription" value
     And localization field should contain "TestLocalization" value
     And "True" checkbox should be selected on display name of field
     And default value of field should contain "333" value
     And "boolean" item should be selected on Type of displaying dropdown


  Scenario: 009   Change #### items of field and check that it unique for
    When Click on Control DropDown menu
    And Click on " Каталог " item of Control DropDown menu
    And Click on "Параметры" item of Catalog Tab
    When Click on the "Последняя" link
    And Click on name of "qwertyTest" structure
    And Click on name of "subFieldTest" field
    And Click on "True" checkbox of aspect search  field
    And Enter "222" on aspect order field
    And Enter "222" on Display order field
    When Click on the "Сохранить" button
    And Click on back button of Admin CP
    And Click on the "Последняя" link
    And Click on name of "addNewStructureTest" structure
    And Click on name of "subFieldTest" field
    Then aspect search  field shouldn't have "True" state
    And aspect order field shouldn't have "222" value
    And Display order field shoudn't have "222" value









