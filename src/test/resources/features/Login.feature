# Feature keyword represents the functionality we're testing
@login
Feature: Login Functionality

  # Scenario is about how and what you're testing (test scenario - test case)
  Scenario: Login with valid username and password
    Given User landing to the application
    When User enter valid username and password for login
      | userName            | password     |
      | oakkurtny@gmail.com | Newyork2022@ |
    Then Verify user able to loging successfully


  Scenario: Login with valid username and invalid password
    Given User landing to the application
    When User enter valid username and password for login
      | userName            | password   |
      | oakkurtny@gmail.com | Newyork202 |
    Then Verify user not able to login