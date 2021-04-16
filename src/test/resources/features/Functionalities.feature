Feature: Functionalities

  Background:
    When user logs in with username "jsmith@demo.io" and password "Demo123!"


  Scenario: Submitting deposit without account
    Given User navigates to Deposit page
    When User User submits a deposit without selected account
    Then Verify field error message "Please select an item in the list." is displayed


  Scenario: Submitting deposit with zero deposit amount
    Given User navigates to Deposit page
    When User submits a deposit with invalid amount
    Then Verify  error message "The deposit amount $0.00 must be greater than $0.00" is displayed


  Scenario: Submitting valid deposit
    Given User navigates to Deposit page
    And User selects deposit account as "Checking account"
    When User submits a deposit with "20.50$" amount
    Then Verify deposit amount has been applied
##basic comment