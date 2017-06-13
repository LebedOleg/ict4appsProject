Feature: Workflow


  Background:
    Given the user is on Ictapps staging page
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton

    Scenario: 01
      When Click on the "Продукты" span
      When Click on first product title
      When Click on the "Добавить В Корзину" button
      When Click on the Cart icon
      When Click on the "Proceed to checkout" button

