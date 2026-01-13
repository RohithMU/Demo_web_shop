Feature: To test purchase apparel&shoes feature

  @Regression
  Scenario Outline: Verify purchase apparel&shoes
    Given Verify books tab is displayed "<Email>" and "<Password>"
    When User clicks on apparel&shoes
    Then Verify apparel&shoes page is displayed
    And User selects the sort by value
    Then Verify sort by value selected
    And User selects display per page
    Then Verify display per page selected
    And User selects view as
    Then Verify view as selected.
    And User clicks on add to cart
    Then Verify apparel&shoes is added to cart
    And User clicks on shopping cart
    Then Verify shopping cart page displayed
    And User clicks on terms of service checkbox
    And User clicks on checkout
    Then Verify checkout page is displayed
    And User clicks on billing address continue
    Then Verify shipping address displayed
    And User clicks on shipping address continue
    Then Verify shipping method is displayed
    And User clicks on shipping method continue
    Then Verify payment method is displayed
    And User selects payment method
    And User clicks on payment method continue
    Then Verify payment information is displayed
    And User clicks on payment information continue
    Then Verify confirm order is displayed
    And User clicks on confirm
    Then Verify order successfully message displayed
    And User clicks on continue
    Then Verify home page is displayed
     Examples:
      | Email                   | Password     |
      | rohithpatilmu@gmail.com | Rohithmu@123 |