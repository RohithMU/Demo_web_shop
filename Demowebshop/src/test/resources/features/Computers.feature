Feature: To test purchase computers feature

  @Regression
  Scenario Outline: Verify purchase desktop
    Given Verify computers tab is displayed "<Email>" and "<Password>"
    When User clicks on computers
    Then Verify computers page is displayed
    And User clicks on desktop
    Then Verify desktop page is displayed
    And User selects the sort by value
    Then Verify sort by value selected
    And User selects display per page
    Then Verify display per page selected
    And User selects view as
    Then Verify view as selected.
    And User clicks on add to cart
    Then Verify add to cart displayed with specification
    And User clicks on add to cart
    Then Verify desktop added to cart
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

  @Regression
  Scenario Outline: Verify purchase notebooks
    Given Verify computers tab is displayed "<Email>" and "<Password>"
    When User clicks on computers
    Then Verify computers page is displayed
    And User clicks on notebooks
    Then Verify notebooks page is displayed
    And User selects the sort by value
    Then Verify sort by value selected
    And User selects display per page
    Then Verify display per page selected
    And User selects view as
    Then Verify view as selected.
    And User clicks on add to cart
    Then Verify add to cart displayed with specification
    And User clicks on add to cart
    Then Verify notebooks added to cart
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

  @Regression
  Scenario Outline: Verify purchase accessories
    Given Verify computers tab is displayed "<Email>" and "<Password>"
    When User clicks on computers
    Then Verify computers page is displayed
    And User clicks on accessories
    Then Verify accessories page is displayed
    And User selects the sort by value
    Then Verify sort by value selected
    And User selects display per page
    Then Verify display per page selected
    And User selects view as
    Then Verify view as selected.
    And User clicks on add to cart
    Then Verify add to cart displayed with specification
    And User clicks on add to cart
    Then Verify accessories added to cart
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
