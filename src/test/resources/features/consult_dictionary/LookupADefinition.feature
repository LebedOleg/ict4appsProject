Feature: As a shop owner, I want product URL to be SEO friendly, so that I can promote my shop in search engines

  Background:
    Given the user is on Ictapps staging page

  Scenario: Friendly URL for product 001
    When the user click on "1"th product image in Super image carousel
    Then product URL should contain "https://staging.ict4apps.aimprosoft.com/product/p"
    Then product currency should be "грн."

  Scenario: Looking up the definition of 'apple'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'apple'
    Then they should see the definition 'A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.'

  Scenario: Looking up the definition of 'pear'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'pear'
    Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'
