Feature: Products cart testing.


  Background:
    Given the user is on Ictapps staging page

Scenario: Create product with SKU
  Given the user is on Ictapps staging page
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
  And Enter random test data to Name field
  And Enter random test data to Description field
  And Click on Categories tab of Products portlet
  And Select Test Category
  And Click on Detail tab of Products portlet
  And Enter random test data to Retail price field
  And Enter random test data to Sale price field
  And Enter random test data to Quantity field
  And Click on Publish button
  And Click on Products item of Catalog Tab
  And Click on LAST pagination button
  Then Products List should contains product that was created
  Then Product name according to name that was entered
  Then Check that Type of Structures dropdown menu has right item
  Then Check that Description field has right data
  When Click on Categories tab of Products portlet
  Then Check that right category is selected
  When Click on Detail tab of Products portlet
  Then Check that Retail price field has right data
#  Then Check that Sale price field has right data
#  Then Check that Quantity field has right data


#  Scenario: Create product without SKU
#    Given
#    Then
#
#  Scenario: Delete product with SKU
#    Given
#    Then
#  Scenario: Delete product without SKU