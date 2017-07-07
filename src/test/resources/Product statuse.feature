Feature: Products portlet

  Scenario: 001
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton
    When Click on Control DropDown menu
    When Click on " Каталог " item of Control DropDown menu
    When Click on "Продукты" item of Catalog Tab
    When Click on the "Добавить" span
    When Enter "statusTest" on Name field
    When Select "TestCategory" category on "Категории" tab
    When Click on the "Детали" link
    When Click on "availabilityStatus" dropdown menu
    When Select " Всегда в наличии " item of "availabilityStatus" dropdown menu
    When Enter random test data to "retail" field of Detail tab
    When Click on the "Опубликовать" link
    When Go to products page on the site
    When Click on the "statusTest" product title
    Then Check that product has "В наличии" status
#    Then Check that "Добавить В Корзину" and "Быстрый Заказ" buttons are clickable
    Then Check that "Остаток" label is not visible

    When Click on the "Изменить" span under "statusTest" product
    When Click on the "Детали" link
    When Clear "retail" price field
    When Click on the "Опубликовать" link
    Then Check that product has "Нет в наличии" status
    Then Check that "Остаток" label is not visible

    When Click on the "Изменить" span under "statusTest" product
    When Click on the "Детали" link
    When Select "Под заказ" item of "availabilityStatus" dropdown menu
    When Enter random test data to "retail" field of Detail tab
    When Click on the "Опубликовать" link
    Then Check that product has "Под заказ" status
    Then Check that "Остаток" label is not visible

    When Click on the "Изменить" span under "statusTest" product
    When Click on the "Детали" link
    When Clear "retail" price field
    When Click on the "Опубликовать" link
    Then Check that product has "Нет в наличии" status
    Then Check that "Остаток" label is not visible

    When Click on the "Изменить" span under "statusTest" product
    When Click on the "Детали" link
    When Select "Зависит от количеств" item of "availabilityStatus" dropdown menu
    When Enter random test data to "retail" field of Detail tab
    When Enter random test data to Quantity field
    When Click on the "Опубликовать" link
    Then Check that product has "В наличии" status
    Then Check that "Остаток" label is visible
    Then Check that "Остаток" is correct

    When Click on the "Изменить" span under "statusTest" product
    When Click on the "Детали" link
    When Clear "retail" price field
    When Click on the "Опубликовать" link
    Then Check that product has "Нет в наличии" status
    Then Check that "Остаток" label is not visible

    When Click on the "Изменить" span under "statusTest" product
    When Click on the "Детали" link
    When Clear quantity field
    When Click on the "Опубликовать" link
    Then Check that product has "Нет в наличии" status
    Then Check that "Остаток" label is not visible

    When Click on the "Изменить" span under "statusTest" product
    When Click on the "Детали" link
    When Write "10" into Quantity field
    When Click on the "Опубликовать" link
    Then Check that product has "В наличии" status
    Then Check that "Остаток" label is visible
    Then Check that "Остаток" is correct
    When Click on the "+" button 11 times
    Then Check that warning message appears

