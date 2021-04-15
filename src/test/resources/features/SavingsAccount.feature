#SAVINGS ACCOUNT
#User Story #4:
#As a User, I want have the ability to create a new Savings bank account so that my payment can be processed from my preferred account.
#Functionalities:
#Display Checking field under BANKING ACCOUNTS section,
# clicking on ‘Savings’ dropdown should be displayed with following options: View Savings, New Savings
#Clicking on ‘New Savings’ option, should redirect user to
# “http://dbankdemo.com/account/savings-add” (Note: Click on ‘New Savings’ and try to open it in new tab)
#Display a header “New Savings Account”
#Display a label “Select Savings Account Type” with the following radio button options: Savings, Money Market
#All Radio buttons should be unchecked by default
#Display a label “Select Account Ownership” with the following radio button options: Individual, Joint
#All Radio buttons should be unchecked by default
#Display an Input filed “Account Name”.
#Accepts alphanumeric and special characters.
#Display an Input filed “Initial Deposit Amount”
#Minimum opening deposit is $2500.00. Accepts numeric whole or decimal values.
#Display ‘Submit’ button, clicking on it should successfully create an account and user will be redirected to page to view saving account.
#Display ‘Reset’ button, clicking on it should reset all filled values to default state.
#Logic:
#If any of the following conditions are triggered, it should throw an Error Msg.
#Rule 1: Unselected Account Type: Logic: Account Type options are not selected. Error Msg: “Please select one of these options.”
#Rule 2: Unselected Account Ownership: Logic: Account Ownership options are not selected. Error Msg: “Please select one of these options.”
#Rule 3: Empty Account Name: Logic: Clicking submit button with an empty Account Name. Error Msg: “Please fill out these field.”
#Rule 4: Empty Initial Deposit Amount: Logic: Clicking submit button with an empty Initial Deposit Amount. Error Msg:
# “Please fill out these field.”
#Rule 5: Invalid Initial Deposit Amount: Logic: Clicking submit button with an invalid Initial Deposit Amount.
#Error Msg: “Please match the requested format.”
#ule 6: Minimum Initial Deposit Amount: Logic: Clicking submit button with Initial Deposit Amount less than a minimum amount.
#Error Msg: “TThe initial deposit ($enteredAmount) entered does not meet the minimum amount ($2500.00) required.
# Please enter a valid deposit amount.” """
Feature: Savings account verification

  Background:
    When user navigates to Digital Bank Wep Application site
    And user logs in with username "pasquale.satterfield@hotmail.com" and password "Password123"
    And user clicks on Savings Account


    Scenario:Validation of Savings Account buttons
      Then user should be able to see and click on Savings dropdown
      And user should be able to see New Savings button
      And user should be able to see View Savings Button

  Scenario:redirection to New Savings Account Page
    Then user should be able to see and click on Savings dropdown
    And click on New Savings button
    And user should be redirected to the "http://3.131.35.165:8080/bank/account/savings-add"

    Scenario: Validation of New Savings Account header
      And click on New Savings button
      Then user should be able to see and click on Savings dropdown
      And user should see "New Savings Account" header

  Scenario: Select Savings Account Type fields validation
    And click on New Savings button
    Then user should be able to see "Select Savings Account Type" label
    And user should be able to see Savings radio button
    And user should be able to see Money Market radio button
    And use should see Savings and Money Market radio buttons are not selected by default

  Scenario: Select Account Ownership fields validation
    And click on New Savings button
    Then user should be able to see "Select Account Ownership" label
    And user should be able to see Individual radio button on SAVINGS Page
    And user should be able to see Joint radio button on SAVINGS Page
    And use should see Individual and Joint radio buttons are not selected by default on SAVINGS Page


  Scenario: Account Name input fields validation
    And click on New Savings button
    Then user should be able to see "Account Name" header on SAVINGS Page
    And user should be able to see Account Name input field on SAVINGS Page
    And user should be able to type alphanumeric and special characters in Account Name input field on SAVINGS Page

  Scenario:Initial Deposit Amount fields validation
    And click on New Savings button
    Then user should be able to see "Initial Deposit" header on SAVINGS Page
    And user should be able to see Initial Deposit input field on SAVINGS Page
    And user should be able to provide only numeric whole or decimal numbers on SAVINGS Page
    And user's minimum opening deposit should be 2500 $ on SAVINGS Page


  Scenario: Submit button validation
    And click on New Savings button
    Then user should be able to see Submit button on SAVINGS Page
    When user clicks Submit button on SAVINGS Page
    Then user should be able to create a new Account on SAVINGS Page
    And user should be redirected to the "http://3.131.35.165:8080/bank/account/savings-view" to view savings account

  Scenario:Reset button validation
    And click on New Savings button
    Then user should be able to see Reset button on SAVINGS Page
    When user clicks Reset button on SAVINGS Page
    Then user should be able to see all pesonal info fields are reseted to default state on SAVINGS Page

