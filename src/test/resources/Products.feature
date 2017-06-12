Feature: Products cart testing.


  Background:
    Given the user is on Ictapps staging page

Scenario: Create product with SKU
  Given Click on LogInLink
  And Enter Email address
  And Enter Password
  And Click on LogInButton
  When Click on Control DropDown menu
  And Click on Catalog item of Control DropDown menu
  And Click on Products item of Catalog Tab
  And Click on Add product button
  And Click on Type of Structures dropdown menu
  And Click on Type of Structures dropdown item
  And
  Then

  Scenario: Create product without SKU
    Given
    Then

  Scenario: Delete product with SKU
    Given
    Then
  Scenario: Delete product without SKU