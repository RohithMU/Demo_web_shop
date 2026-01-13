Feature: To test login feature

  @Regression
  Scenario Outline: Verify login
    Given Verify home page is displayed
    When User clicks on login
    And User enters "<Email>" "<Password>"
    Then Verify user logged in successfully

    Examples:
      | Email                   | Password     |
      | rohithpatilmu@gmail.com | Rohithmu@123 |

  @Regression
  Scenario Outline: Verify login with valid email and invalid password
    Given Verify home page is displayed
    When User clicks on login
    And User enters valid "<Email>" and invalid "<Password>"
    Then Verify invalid password error message is displayed

    Examples:
      | Email                   | Password     |
      | rohithpatilmu@gmail.com | Rohithmu@    |

  @Regression
  Scenario Outline: Verify login with invalid email and valid password
    Given Verify home page is displayed
    When User clicks on login
    And User enters invalid "<Email>" and valid "<Password>"
    Then Verify invalid email error message is displayed

    Examples:
      | Email                   | Password     |
      | rohithpatilmu@gmail     | Rohithmu@123 |

  @Regression
  Scenario Outline: Verify login with invalid email and invalid password
    Given Verify home page is displayed
    When User clicks on login
    And User enters invalid "<Email>" and invalid "<Password>"
    Then Verify invalid credentials error message is displayed

    Examples:
      | Email                   | Password     |
      | rohithpatilmugmail.com  | Rohithmu 123 |

  @Regression
  Scenario Outline: Verify login with empty email
    Given Verify home page is displayed
    When User clicks on login
    And User enters empty "<Email>" and valid "<Password>"
    Then Verify email required error message is displayed

    Examples:
      | Email                   | Password     |
      |                         | Rohithmu@123 |

  @Regression
  Scenario Outline: Verify login with empty password
    Given Verify home page is displayed
    When User clicks on login
    And User enters valid "<Email>" and empty "<Password>"
    Then Verify password required error message is displayed

    Examples:
      | Email                   | Password     |
      | rohithpatilmu@gmail.com |              |

  @Regression
  Scenario: Verify login with empty email and empty password
    Given Verify home page is displayed
    When User clicks on login
    And User clicks on login button without entering credentials
    Then Verify email and password required error message is displayed
