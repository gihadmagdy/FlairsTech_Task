Feature: Record counter validation

  Scenario: Record counter
    When user navigate to login page
    And user enter valid credentials
    And user click on login button
    Then user navigated to home page
    And user click on admin button
    And user get number of record
    And user click on add button
    And user select user role
    And user enter name
    And user select user status
    And user enter user name
    And user enter password and confirm password
    And user click save
    Then validate record list updated new record
    And user remove already added user
    Then validate record list updated

