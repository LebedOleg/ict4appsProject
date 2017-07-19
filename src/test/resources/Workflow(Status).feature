Feature: Workflow

  Scenario: 01
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton

  Scenario: 02 Create product without additional SKU
    Given Open new tab
    Given Switch tab "1"
    When Click on Control DropDown menu
    When Click on the "Каталог" span
    And Click on "Продукты" item of Catalog Tab
    And Click on the "Добавить" span
    And Enter "test1" on Name field
    And Click on the "Дополнительные характеристики" link
    And Click on Type of Structures dropdown menu
    And Click on "Basic" Type Of Structures Dropdown Item
    And Select "testCategory" category on "Категории" tab
    And Click on the "Детали" link
    And Click on "availabilityStatus" dropdown menu
    And Select " Всегда в наличии " item of "availabilityStatus" dropdown menu
    And Enter "200" on "retail" price field
    And Enter "100" on "sale" price field
    And Click on the "Применить" link
    Given Switch tab "0"

  Scenario: 03
    Given Click on the "Продукты" span
    Given Refresh page
    Given Click on "test1" product title
    Given Click on the "Добавить В Корзину" button
    Given Click on the Cart icon
    Given Click on the "Proceed to checkout" button
    Given Switch tab "1"

    Given Click on the "Заказы" accordion toggle
    When Click on the "Заказы" link on the left accordion

    When Click on the "Последняя" link
    Then Check that created order has "Не Заполнен" status
    When Click on the created order id
    Then Check that created order page has "Не Заполнен" status tag
#        Then Check that created order page has "Не заполнен" status in status history
#        Then Check that created order page has "Не заполнен" status in short status history
    Given Switch tab "0"
    When Click on the Self Pick Up checkbox
    When Select address
    Given Scroll page
    When Click on the "Continue" button
    Given Switch tab "1"
    Given Refresh page
    Then Check that created order page has "Не Заполнен" status tag
#        Then Check that created order page has "Не заполнен" status in status history
#        Then Check that created order page has "Не заполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Не Заполнен" status
    When Click on the created order id
    Given Switch tab "0"
    When Click on the "Cash On Delivery" button
    When Click on the "Confirm" span
    When Click on the "Continue Shopping" link
    Given Switch tab "1"
    Given Refresh page
    Then Check that created order page has "Новый" status tag
        Then Check that created order page has "Новый" status in status history
        Then Check that created order page has "Новый" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Новый" status
    When Click on the created order id
    When Click on the "Обрабатывается" button
    Then Check that created order page has "Обрабатывается" status tag
        Then Check that created order page has "Обрабатывается" status in status history
        Then Check that created order page has "Обрабатывается" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Обрабатывается" status
    When Click on the created order id
    When Click on the "Выполнен" button
    Then Check that created order page has "Выполнен" status tag
        Then Check that created order page has " Выполнен" status in status history
        Then Check that created order page has " Выполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Выполнен" status

  Scenario: 04
    Given Switch tab "0"
    Given Click on the "Продукты" span
    Given Click on "test1" product title
    Given Click on the "Быстрый Заказ" button
    Given Switch tab "1"
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Не Заполнен" status
    When Click on the created order id
    Then Check that created order page has "Не Заполнен" status tag
        Then Check that created order page has "Не заполнен" status in status history
        Then Check that created order page has "Не заполнен" status in short status history
    Given Switch tab "0"
    When Click on the Self Pick Up checkbox
    When Select address
    Given Scroll page
    When Click on the "Continue" button
    Given Switch tab "1"
    Given Refresh page
    Then Check that created order page has "Не Заполнен" status tag
        Then Check that created order page has "Не заполнен" status in status history
        Then Check that created order page has "Не заполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Не Заполнен" status
    When Click on the created order id
    Given Switch tab "0"
    When Click on the "Cash On Delivery" button
    When Click on the "Confirm" span
    When Click on the "Continue Shopping" link
    Given Switch tab "1"
    Given Refresh page
    Then Check that created order page has "Новый" status tag
        Then Check that created order page has "Новый" status in status history
        Then Check that created order page has "Новый" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Новый" status
    When Click on the created order id
    When Click on the "Обрабатывается" button
    Then Check that created order page has "Обрабатывается" status tag
        Then Check that created order page has "Обрабатывается" status in status history
        Then Check that created order page has "Обрабатывается" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Обрабатывается" status
    When Click on the created order id
    When Click on the "Выполнен" button
    Then Check that created order page has "Выполнен" status tag
        Then Check that created order page has "Выполнен" status in status history
        Then Check that created order page has "Выполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Выполнен" status

  Scenario: 05
    When Click on the cancel order button
    When Click on the cancel reason dropdown menu
    When Select reason
    When Click on the "Отменить заказ" button
    Then Check that created order page has "Отменено" status tag
        Then Check that created order page has "Отменено" status in status history
        Then Check that created order page has "Отменено" status in short status history
    When Click on the "Заказы" link on the left accordion

  Scenario: 06
    When Click on the "Создание заказа" button
    When Click on the "Browse products" button
    When Write "11" into search product input field
    When Click on the product from product search
    When Click on the "Add to order" button
    When Click on the "add" button
    When Write "Vladimir" into "First name" field
    When Write "Kulikov" into "Last name" field
    When Write "1234567890" into "Phone" field
    When Save created user
    When Click on the Save order button
    Then Check that created order page has "Новый" status tag
        Then Check that created order page has "Новый" status in status history
        Then Check that created order page has "Новый" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Новый" status
    When Click on the created order id
    When Click on the "Обрабатывается" button
    Then Check that created order page has "Обрабатывается" status tag
        Then Check that created order page has "Обрабатывается" status in status history
        Then Check that created order page has "Обрабатывается" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Обрабатывается" status
    When Click on the created order id
    When Click on the "Выполнен" button
    Then Check that created order page has "Выполнен" status tag
        Then Check that created order page has " Выполнен" status in status history
        Then Check that created order page has " Выполнен" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Выполнен" status

  Scenario: 07
    When Click on the "Создание заказа" button
    When Click on the "Browse products" button
    When Write "11" into search product input field
    When Click on the product from product search
    When Click on the "Add to order" button
    When Write "Nina" into search user text box
    When Select customer who doesn't have a phone
    When Click on the Save order button
    Then Check that created order page has "Новый" status tag
        Then Check that created order page has "Новый" status in status history
        Then Check that created order page has "Новый" status in short status history
    When Click on the "Заказы" link on the left accordion
    When Click on the "Последняя" link
    Then Check that created order has "Новый" status