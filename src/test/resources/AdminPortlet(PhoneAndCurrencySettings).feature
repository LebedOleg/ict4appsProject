Feature: PhoneAndCurrencySettings

  Scenario: 01
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton

    When Click on Control DropDown menu
    When Click on the "Системные страницы" span
    When Click on the "Настройки сайта" link in opened accordion
    When Click on the "Валюта" dropdown
    Then Check that "Украинская гривна" element is displayed

    When Click on the "Добавить" button
    When Write "1234567890" into phone number input field
    When Click on the "Сохранить" button
    Then Check that error message is not displayed

    When Click on the "Добавить" button
    When Write "1111111111" into phone number input field
    When Click on the "Сохранить" button
    When Get list of phone numbers
    When Click on the remove icon
    Then Check that created phone number was deleted

    When Clear phone number input field
    When Write "0987654321" into phone number input field
    When Click on the "Сохранить" button
    When Get phone number
    When Click on the "Сохранить" button
    When Clear phone number input field
    When Write "1234567890" into phone number input field
    Then Check that we can edit phone number input field

    When Click on the "Добавить" button
    When Write "1234567890" into phone number input field
    When Click on the "Сохранить" button
    Then Check that error message is displayed
    When Clear phone number input field

    When Write "12345678910" into phone number input field
    When Click on the "Сохранить" button
    Then Check that error message is displayed
    When Clear phone number input field

    When Write "12345678" into phone number input field
    When Click on the "Сохранить" button
    Then Check that error message is displayed
    When Clear phone number input field

    When Write "qwerty" into phone number input field
    When Click on the "Сохранить" button
    Then Check that error message is displayed
    When Clear phone number input field

    When Write "!@#$%^" into phone number input field
    When Click on the "Сохранить" button
    Then Check that error message is displayed
    When Clear phone number input field

