Feature: To test register feature

  @Regression
  Scenario Outline: Verify register new user
    Given Verify home page is displayed
    When User clicks on register
    And User enters "<First name:>" "<Last name:>" "<Email:>" "<Password:>"
    Then Verify new user registered successfully

                  Examples:
                  |First name:|Last name: |Email:                |Password:  |
                  |Rohith     |M U        |dummymu12@gmail.com   |Rohith@123 |
  @Regression
  Scenario Outline: Verify user already exist
    Given Verify home page is displayed
    When User clicks on register
    And User enters "<First name:>" "<Last name:>" "<Email:>" "<Password:>"
    Then Verify user already existed

                  Examples:
                  |First name:|Last name: |Email:                |Password:  |
                  |Rohith     |M U        |dummymu12@gmail.com   |Rohith@123 |