Feature: Upgenix login feature

  User Story:
  As a user, I should be able to log in so that I can land on homepage.

  Accounts are : PosManager, SalesManager

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the Upgenix login page


  Scenario: Login as posmanager
    When user enters posmanager username
    And user enters posmanager password
    Then user should see the dashboard

  Scenario: Login as salesmanager
    When user enters salesmanager username
    And user enters salesmanager password
    Then user should see the dashboard