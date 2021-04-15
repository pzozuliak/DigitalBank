Feature: New Checking Bank Account operations

  Background:
    When user logs in with username "jsmith@demo.io" and password "Demo123!"
    When user clicks on CheckingDropdown
    And user clicks New Checking button
    Then user should be on "http://3.131.35.165:8080/bank/account/checking-add" page

  Scenario: Redirecting user to the New Checking tab

  Scenario:New Checking Account header validation
    Then user should be able to see "New Checking Account" header

  Scenario:Select Checking Account Type fields validation
    Then user should be able to see "Select Checking Account Type" header
    And user should be able to see Standard	Checking radio button
    And user should be able to see 	Interest Checking radio button
    And use should see Standard and Interest Checking radio buttons are not selected by default

  Scenario: Select Account Ownership fields validation
    Then user should be able to see "Select Account Ownership" header
    And user should be able to see Individual radio button
    And user should be able to see Joint radio button
    And use should see Individual and Joint radio buttons are not selected by default

  Scenario: Account Name input fields validation
    Then user should be able to see "Account Name" header
    And user should be able to see Account Name input field
    And user should be able to type alphanumeric and special characters in Account Name input field

  Scenario:Initial Deposit Amount fields validation
    Then user should be able to see "Initial Deposit Amount" header
    And user should be able to see Initial Deposit Amount input field
    And user should be able to provide only numeric whole or decimal numbers
    And user's minimum opening deposit should be 25 $

  Scenario: Submit button validation
    Then user should be able to see Submit button
    When user clicks Submit button
    Then user should be able to create a new Account
    And user should be redirected to the page to view checking account

  Scenario:Reset button validation
    Then user should be able to see Reset button
    When user clicks Reset button
    Then user should be able to see all pesonal info fields are reseted to default state