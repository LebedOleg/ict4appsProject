Feature: PhoneAndCurrencySettings

  Scenario: 01
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton

    When Click on the "Продукты" span
    When Click on the "тест филдов" product title
    When Click on the "Изменить" span under "тест филдов" product
    When Click on the "Дополнительные характеристики" link
    When Click on the structures select
    When Click on the "FieldTest" structure
    When Click on the "Опубликовать" span

    Then Check that additional fields are not visible

    When Click on the "Изменить" span under "тест филдов" product
    When Click on the "Дополнительные характеристики" link
    When Write "qwertyuiop" into "first" additional input field
    When Click on the "Опубликовать" span

    Then Check that "first" additional field with "qwertyuiop" is visible

    When Click on the "Изменить" span under "тест филдов" product
    When Click on the "Дополнительные характеристики" link
    When Write "йцукенгшщзхъ" into "second" additional input field
    When Click on the "Опубликовать" span

    Then Check that "second" additional field with "йцукенгшщзхъ" is visible

    When Click on the "Изменить" span under "тест филдов" product
    When Click on the "Дополнительные характеристики" link
    When Write "1234567890" into "third" additional input field
    When Click on the "Опубликовать" span

    Then Check that "third" additional field with "1234567890" is visible

    When Click on the "Изменить" span under "тест филдов" product
    When Click on the "Дополнительные характеристики" link
    When Write "!@#$%^&*()_+" into "fourth" additional input field
    When Click on the "Опубликовать" span

    Then Check that "fourth" additional field with "!@#$%^&*()_+" is visible

#    When Click on the "Изменить" span under "тест филдов" product
#    When Click on the "Дополнительные характеристики" link
#    When Write "<button>" into "fifth" additional input field
#    When Click on the "Опубликовать" span
#
#    Then Check that "fifth" additional field with "<button>" is visible

    When Click on the "Изменить" span under "тест филдов" product
    When Click on the "Дополнительные характеристики" link
    When Clear "first" additional input field
    When Click on the "Опубликовать" span

    Then Check that "first" additional field is not visible

    When Click on the "Изменить" span under "тест филдов" product
    When Click on the "Дополнительные характеристики" link
    When Clear "third" additional input field
    When Write "0987654321" into "third" additional input field
    When Click on the "Опубликовать" span

    Then Check that "third" additional field with "0987654321" is visible

    When Open new tab
    When Switch tab "1"
    When Click on Control DropDown menu
    When Click on " Каталог " item of Control DropDown menu
    When Click on "Параметры" item of Catalog Tab
    When Click on the "Последняя" link
    When Click on name of "FieldTest" structure
    When Click on "Действия" button near "second" additional field

    When Click on the "Удалить навсегда" button in opened pop up





    When Click on the confirm button
    When Click on Save Structure button

    When Switch tab "0"

