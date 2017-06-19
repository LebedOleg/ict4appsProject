Feature: PhoneAndCurrencySettings

  Scenario: 01
    Given the user is on Ictapps staging page
    Given Click on LogInLink
    And Enter Email address
    And Enter Password
    And Click on LogInButton

    When Click on Control DropDown menu
    When Click on the "Системные страницы" span
    When Click on the "Настройка сайта" link in opened accordion
    When Click on the "Валюта" dropdown
    Then Check that "Украинская гривна" element is displayed



    When Click on the "Добавить" button


    When Click on the "Сохранить" button