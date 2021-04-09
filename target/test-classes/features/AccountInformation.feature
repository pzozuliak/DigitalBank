Feature: Account information

  Background:
    When user logs in with username "jsmith@demo.io" and password "Demo123!"

  Scenario: Validate welcome message
    Then user should see message "Welcome Josh"

  Scenario: Home title verification
    Then user should be able to see Home title

  Scenario: Banking accounts title verification
    Then user should be able to see BANKING ACCOUNTS
    And user should be able to see Checking
    And user should be able to see Saving
    And user should be able to see Credit

#  Scenario: Credit accounts title verification
#    Then user should be able to see CREDIT ACCOUNTS
#    And user should be able to see Digital Credit

  Scenario: Transactions and transfers title verification
    Then user should be able to see TRANSACTIONS / TRANSFERS
    And user should be able to see Transfer Between Accounts

  @registration
  Scenario: 3rd party transfers title verification
#    Then user should be able to see 3RD PARTY TRANSFERS
    And user should be able to see VISA Direct Transfer