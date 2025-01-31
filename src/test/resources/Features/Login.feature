Feature: Login Page
  I want verify the Login feautre file
@Smoke
  Scenario Outline: Verify Login Successfull
    Given User is on login page
    When User enters valid <username> and <password>
    And User clicks on login button
    Then User is able to navigate homepage

    Examples: 
      | username                | password     |
      | rohithpatilmu@gmail.com | Rohithmu@123 |
@Regression @Smoke
  Scenario Outline: Verify Login Unsuccessfull
    Given User is on login page
    When User enters invalid <username> and <password>
    And User clicks on login button
    Then User is not able to navigate homepage

    Examples: 
      | username              | password    |
      | rohithpatil@gmail.com | Rohithmu@13 |

