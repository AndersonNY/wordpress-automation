Feature: Search My profile

  # All the steps in Background will get executed before each scenario
  # Background keyword works like @BeforeMethod annotation


 #Task:
  #Using whatever tools/technologies you choose, write a series of automated tests for the My Profile section of the Wordpress product (https://wordpress.com/me).
  # You will first need to create a free Wordpress account to be used as part of the testing.

  Background:
    Given User landing to the application
    When User enter valid username and password for login
      |userName|password|
      | oakkurtny@gmail.com       |  Newyork2022@      |
    Then Verify user able to loging successfully


  Scenario: User Views Settings on MyProfile page
    When User navigates to MyProfile page
    Then Settings of personal information should be displayed


    Scenario: User Updates Information MyProfile page
    When User navigates to MyProfile page
      When User changes First Name and Last Name
      And User writes brief bio in About Me box
      And User updates Hide My Gavatar Profile page
      When User clicks save button
     Then User logs out of Word Press


    @myprofile
    Scenario: Information Update on MyProfile page
        When User navigates to MyProfile page
        Then First Name and Last Name should be displayed
        Then User logs out of Word Press






