Feature: Checking account verification


  Background:
    When user navigates to Digital Bank Wep Application site
    And user logs in with username "jsmith@demo.io" and password "Demo123!"
    And clicks on Checking button


  Scenario: Creating new checking account
    Then user creates checking account with account name "main" and deposit amount "1000"
    And user should be able to view checking account info
    And verify all information should match the entered values


  Scenario: Display "Transactions" table with all transaction details:
    Then verify header "Date" is displayed
    And verify header "Category" is displayed
    And verify header "Description" is displayed
    And verify header "Amount" is displayed
    And verify header "Balance" is displayed


  Scenario: Verify only one of the accounts is activated
    And user clicks on View checking button
    Then verify user has more than 1 checking account
    And verify each of the accounts has ON/OFF toggle button
    And verify only one account is activated at the time
    And verify transaction history on activated account is displayed