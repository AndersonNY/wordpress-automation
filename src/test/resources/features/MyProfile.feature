@Regression
Feature: Search My profile

 #Task:
  #Using whatever tools/technologies you choose, write a series of automated tests for the My Profile section of the Wordpress product (https://wordpress.com/me).
  # You will first need to create a free Wordpress account to be used as part of the testing.

  Background:
    Given User landing to the application
    When User enter valid username and password for login
      | userName            | password     |
      | oakkurtny@gmail.com | Newyork2022@ |


  Scenario: User Updates MyProfile Information on my profile page
    When User navigates to My Profile page
    Then User changes First and Last Name to
      | FirstName | LastName |
      | Orhan     | Akkurt   |
    And User provide public display name as "andersonny"
    And User writes brief bio in About Me box
      | About Me                                                                                         |
      | Orhan Akkurt is QA Engineer with a 6 year of experience. He knows Java, Selenium, Cucumber, API. |
    And User updates Hide My Gavatar Profile page
    When User clicks save button
    Then User logs out of Word Press


  Scenario: User verifies MyProfile Information on my profile page updated
    When User navigates to My Profile page
    Then User verifies First and Last Name should be
      | FirstName | LastName |
      | Orhan     | Akkurt   |
    And User verifies public display name as "andersonny"
    And User verifies brief bio in About Me box
      | About Me                                                                                         |
      | Orhan Akkurt is QA Engineer with a 6 year of experience. He knows Java, Selenium, Cucumber, API. |


  Scenario: Validation of side panel sections on My Profile page
    When User navigates to My Profile page
    Then User is able to verify following sections are displayed on side panel
      | My Profile            |
      | Account Settings      |
      | Purchases             |
      | Security              |
      | Privacy               |
      | Manage Blogs          |
      | Notification Settings |
      | Blocked Sites         |
      | Get Apps              |

  Scenario: Validation of profile links on My Profile page - last scenario
    When User navigates to My Profile page
    Then Verify if user is able to click on Add button
    And Verify if user is able to click on Add URL button
    And Verify if user is able to click on Add WordPress Site











