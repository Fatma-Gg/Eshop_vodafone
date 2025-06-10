
Feature: Vodafone eShop automation

  Scenario: Add product to cart from homepage
    Given user opens the Vodafone eShop homepage
    When user adds a product to the cart from homepage
    Then the product should be added to the cart successfully

  Scenario: customer add the second product to cart.
    Given User open the website
    When User add the second product to cart
    Then item added to the cart successfully

  Scenario: customer search for the third product to cart.
    Given User in page of shopping
    When User searched for third product to cart
    Then the third item added to the cart