Feature: To test login feature

  @Regression
  Scenario Outline: Verify login
    Given Verify home page is displayed
    When User clicks on login
    And User enters "<Email>" "<Password>"
    Then Verify user logged in successfully

                  Examples:
                  |Email                  |Password     |
                  |rohithpatilmu@gmail.com|Rohithmu@123 |