Feature: Workflow

  Scenario: 01
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton
    Given Click on the "Продукты" span
    Given Click on first product title
    Given Click on the "Добавить В Корзину" button
    Given Click on the Cart icon
    Given Click on the "Proceed to checkout" button
    Given Open new tab
    Given Switch tab "1"
    When Click on Control DropDown menu
    When Click on the "Заказы" span
    When Click on the "Последняя" link
    Then Check that created order has "Не Заполнен" status
    When Click on the created order id
    Then Check that created order page has "Не Заполнен" status tag
    #    Then Check that created order page has "Не заполнен" status in status history
    #    Then Check that created order page has "Не заполнен" status in short status history
    Given Switch tab "0"
    When Click on the Self Pick Up checkbox
    When Select address
    Given Scroll page
    When Click on the "Continue" button
    Given Switch tab "1"
    Given Refresh page
    Then Check that created order page has "Не Заполнен" status tag
    #    Then Check that created order page has "Не заполнен" status in status history
    #    Then Check that created order page has "Не заполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Не Заполнен" status
    When Click on the created order id
    Given Switch tab "0"
    When Click on the "Cash On Delivery" button
    When Click on the "Confirm" span
    Given Switch tab "1"
    Given Refresh page
    Then Check that created order page has "Новый" status tag
    #    Then Check that created order page has "Новый" status in status history
    #    Then Check that created order page has "Новый" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Новый" status
    When Click on the created order id
    When Click on the "Обрабатывается" button
    Then Check that created order page has "Обрабатывается" status tag
    #    Then Check that created order page has "Обрабатывается" status in status history
    #    Then Check that created order page has "Обрабатывается" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Обрабатывается" status
    When Click on the created order id
    When Click on the "Выполнен" button
    Then Check that created order page has "Выполнен" status tag
    #    Then Check that created order page has " Выполнен" status in status history
    #    Then Check that created order page has " Выполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Выполнен" status

  Scenario: 02
    Given Switch tab "0"
    Given Click on the "Продукты" span
    Given Click on first product title
    Given Click on the "Быстрый Заказ" button
    Given Switch tab "1"
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Не Заполнен" status
    When Click on the created order id
    Then Check that created order page has "Не Заполнен" status tag
    #    Then Check that created order page has "Не заполнен" status in status history
    #    Then Check that created order page has "Не заполнен" status in short status history
    Given Switch tab "0"
    When Click on the Self Pick Up checkbox
    When Select address
    Given Scroll page
    When Click on the "Continue" button
    Given Switch tab "1"
    Given Refresh page
    Then Check that created order page has "Не Заполнен" status tag
    #    Then Check that created order page has "Не заполнен" status in status history
    #    Then Check that created order page has "Не заполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Не Заполнен" status
    When Click on the created order id
    Given Switch tab "0"
    When Click on the "Cash On Delivery" button
    When Click on the "Confirm" span
    Given Switch tab "1"
    Given Refresh page
    Then Check that created order page has "Новый" status tag
    #    Then Check that created order page has "Новый" status in status history
    #    Then Check that created order page has "Новый" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Новый" status
    When Click on the created order id
    When Click on the "Обрабатывается" button
    Then Check that created order page has "Обрабатывается" status tag
    #    Then Check that created order page has "Обрабатывается" status in status history
    #    Then Check that created order page has "Обрабатывается" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Обрабатывается" status
    When Click on the created order id
    When Click on the "Выполнен" button
    Then Check that created order page has "Выполнен" status tag
    #    Then Check that created order page has "Выполнен" status in status history
    #    Then Check that created order page has "Выполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Выполнен" status

  Scenario: 03
    When Click on the cancel order button
    When Click on the cancel reason dropdown menu
    When Select reason
    When Click on the "Отменить заказ" button
    Then Check that created order page has "Отменено" status tag
    #    Then Check that created order page has "Отменено" status in status history
    #    Then Check that created order page has "Отменено" status in short status history
    When Click on the "Заказы" link on the left accordion

  Scenario: 04
    When Click on the "Создание заказа" button
    When Click on the "Browse products" button
    When Write "11" into input field
    When Click on the product from product search
    When Click on the "Add to order" button
    When Click on the "add" button
    When Write data into "First name" field
    When Write data into "Last name" field
    When Write data into "Phone" field
    When Save created user
    When Click on the "Сохранить" order button
    Then Check that created order page has "Новый" status tag
    #    Then Check that created order page has "Новый" status in status history
    #    Then Check that created order page has "Новый" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Новый" status
    When Click on the created order id
    When Click on the "Обрабатывается" button
    Then Check that created order page has "Обрабатывается" status tag
    #    Then Check that created order page has "Обрабатывается" status in status history
    #    Then Check that created order page has "Обрабатывается" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Обрабатывается" status
    When Click on the created order id
    When Click on the "Выполнен" button
    Then Check that created order page has "Выполнен" status tag
    #    Then Check that created order page has " Выполнен" status in status history
    #    Then Check that created order page has " Выполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Выполнен" status

  Scenario: 05
    When Click on the "Создание заказа" button
    When Click on the "Browse products" button
    When Write "11" into input field
    When Click on the product from product search
    When Click on the "Add to order" button
    When Write "Nina" into search user text box
    When Select customer who doesn't have a phone
    When Click on the "Сохранить" order button
    Then Check that created order page has "Новый" status tag
    #    Then Check that created order page has "Новый" status in status history
    #    Then Check that created order page has "Новый" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Новый" status