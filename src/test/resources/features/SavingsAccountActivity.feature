Feature: Savings account operations
  Background:
    When User navigate to digital bank application page
    When user logs in with username "jb@mail.com" and password "Jb123454321"
    And user clicks on SavingsDropdown

  Scenario: Testing New Saving Button

    And user clicks NewSavings button
    Then user should be on "http://3.131.35.165:8080/bank/account/savings-add" page

  Scenario: Testing one that savings accounts are displayed
    When user clicks ViewSavings button
    Then user should be able to see 1 or More Savings accounts

  Scenario:
    When user clicks ViewSavings button
    Then verify only one account is activated at the time

    Scenario:
      When user clicks ViewSavings button
      Then verify header "Date" is displaying transactions