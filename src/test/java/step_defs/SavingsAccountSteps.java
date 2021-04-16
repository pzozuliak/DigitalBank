package step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CheckingAccountPage;
import pages.MainPage;
import pages.NewSavingsAccountPage;
import pages.ViewSavingsAccountPage;
import utilities.Driver;

public class SavingsAccountSteps {
    MainPage mainPage = new MainPage();
   NewSavingsAccountPage newSavingsAccountPage = new NewSavingsAccountPage();
   ViewSavingsAccountPage viewSavingsAccountPage = new ViewSavingsAccountPage();

    @And("^user clicks on Savings Account$")
    public void userClicksOnSavingsAccount() {
        mainPage.savingsSubDropdown.click();
    }

    @Then("^user should be able to see and click on Savings dropdown$")
    public void user_should_be_able_to_see_and_click_on_Savings_dropdown() {
     Assert.assertTrue(mainPage.savingsSubDropdown.isDisplayed() && mainPage.savingsSubDropdown.isEnabled());

    }
    @And("^user should be able to see View Savings Button$")
    public void userShouldBeAbleToSeeViewSavingsButton() {
        Assert.assertTrue(mainPage.viewSavingsButton.isDisplayed());
    }

    @And("^user should be able to see New Savings button$")
    public void userShouldBeAbleToSeeNewSavingsButton() {
        Assert.assertTrue(mainPage.newSavingsButton.isDisplayed());
    }



    @Then("^user should be redirected to the \"([^\"]*)\"$")
    public void user_should_be_redirected_to_the(String expectedURL)  {
        String actualURL = Driver.getDriver().getCurrentUrl();
       Assert.assertEquals(actualURL,expectedURL);

    }

    @Then("^user should see \"([^\"]*)\" header$")
    public void user_should_see_header(String expectedHeader)  {
        Assert.assertTrue(newSavingsAccountPage.newSavingsAccountHeader.isDisplayed()
                &&
                newSavingsAccountPage.newSavingsAccountHeader.getText().equals(expectedHeader));


    }

    @Then("^user should be able to see \"([^\"]*)\" label$")
    public void user_should_be_able_to_see_label(String expectedLabel)  {
        Assert.assertTrue(newSavingsAccountPage.selectSavingsAccountOwnershipLabel.isDisplayed());


    }

    @Then("^user should be able to see Savings radio button$")
    public void user_should_be_able_to_see_Savings_radio_button()  {

        Assert.assertTrue(newSavingsAccountPage.savingsRadioButton.isDisplayed());

    }

    @Then("^user should be able to see Money Market radio button$")
    public void user_should_be_able_to_see_Money_Market_radio_button()  {

        Assert.assertTrue(newSavingsAccountPage.moneyMarketRadioButton.isDisplayed());
    }

    @Then("^use should see Savings and Money Market radio buttons are not selected by default$")
    public void use_should_see_Savings_and_Money_Market_radio_buttons_are_not_selected_by_default()  {
        Assert.assertFalse(newSavingsAccountPage.savingsRadioButton.isSelected() &&
                newSavingsAccountPage.moneyMarketRadioButton.isSelected());
    }

    @Then("^user should be able to see Individual radio button on SAVINGS Page$")
    public void user_should_be_able_to_see_Individual_radio_button_on_SAVINGS_Page()  {
        Assert.assertTrue(newSavingsAccountPage.individualRadioButton.isDisplayed());
    }

    @Then("^user should be able to see Joint radio button on SAVINGS Page$")
    public void user_should_be_able_to_see_Joint_radio_button_on_SAVINGS_Page()  {
        Assert.assertTrue(newSavingsAccountPage.jointRadioButton.isDisplayed());
    }

    @Then("^use should see Individual and Joint radio buttons are not selected by default on SAVINGS Page$")
    public void use_should_see_Individual_and_Joint_radio_buttons_are_not_selected_by_default_on_SAVINGS_Page()  {
        Assert.assertFalse(newSavingsAccountPage.individualRadioButton.isSelected() &&
                newSavingsAccountPage.jointRadioButton.isSelected());
    }

    @Then("^user should be able to see \"([^\"]*)\" header on SAVINGS Page$")
    public void user_should_be_able_to_see_header_on_SAVINGS_Page(String expectedHeader) {
        Assert.assertTrue(newSavingsAccountPage.accountNameHeader.isDisplayed()
                &&
                newSavingsAccountPage.accountNameHeader.getText().trim().equals(expectedHeader));

    }

    @Then("^user should be able to see Account Name input field on SAVINGS Page$")
    public void user_should_be_able_to_see_Account_Name_input_field_on_SAVINGS_Page()  {
       Assert.assertTrue(newSavingsAccountPage.accountNameInputField.isDisplayed());
    }

    @Then("^user should be able to type alphanumeric and special characters in Account Name input field on SAVINGS Page$")
    public void user_should_be_able_to_type_alphanumeric_and_special_characters_in_Account_Name_input_field_on_SAVINGS_Page() throws Throwable {
        String accountName = "Valera123#_!@$%^&*()";
        newSavingsAccountPage.accountNameInputField.sendKeys(accountName);
        String actualInput = newSavingsAccountPage.accountNameInputField.getAttribute("value");
        Assert.assertTrue(actualInput.equals(accountName));
    }

    @Then("^user should be able to see Initial Deposit input field on SAVINGS Page$")
    public void user_should_be_able_to_see_Initial_Deposit_input_field_on_SAVINGS_Page() {
       Assert.assertTrue(newSavingsAccountPage.initialDepositInputField.isDisplayed());
    }

    @Then("^user should be able to provide only numeric whole or decimal numbers on SAVINGS Page$")
    public void user_should_be_able_to_provide_only_numeric_whole_or_decimal_numbers_on_SAVINGS_Page() {

    }

    @Then("^user's minimum opening deposit should be (\\d+) \\$ on SAVINGS Page$")
    public void user_s_minimum_opening_deposit_should_be_$_on_SAVINGS_Page(int minimumAmount) {
        newSavingsAccountPage.initialDepositInputField.sendKeys(""+minimumAmount+"");
        String amount = newSavingsAccountPage.initialDepositInputField.getAttribute("value");
        double actualAmount = Double.parseDouble(amount);
        if(actualAmount<minimumAmount)
            Assert.assertTrue(newSavingsAccountPage.newAccountErrorAlert.isDisplayed());
    }

    @Then("^user should be able to see Submit button on SAVINGS Page$")
    public void user_should_be_able_to_see_Submit_button_on_SAVINGS_Page()  {
        Assert.assertTrue(newSavingsAccountPage.submitButton.isDisplayed());

    }

    @When("^user clicks Submit button on SAVINGS Page$")
    public void user_clicks_Submit_button_on_SAVINGS_Page()  {
        Assert.assertTrue(newSavingsAccountPage.submitButton.isEnabled());

    }

    @Then("^user should be able to create a new Account on SAVINGS Page$")
    public void user_should_be_able_to_create_a_new_Account_on_SAVINGS_Page()  {

    }

    @Then("^user should be redirected to the page to view checking account on SAVINGS Page$")
    public void user_should_be_redirected_to_the_page_to_view_checking_account_on_SAVINGS_Page()  {

    }

    @Then("^user should be able to see Reset button on SAVINGS Page$")
    public void user_should_be_able_to_see_Reset_button_on_SAVINGS_Page()  {
        Assert.assertTrue(newSavingsAccountPage.resetButton.isDisplayed());

    }

    @When("^user clicks Reset button on SAVINGS Page$")
    public void user_clicks_Reset_button_on_SAVINGS_Page()  {
       Assert.assertTrue(newSavingsAccountPage.resetButton.isEnabled());
       newSavingsAccountPage.resetButton.click();

    }

    @Then("^user should be able to see all pesonal info fields are reseted to default state on SAVINGS Page$")
    public void user_should_be_able_to_see_all_pesonal_info_fields_are_reseted_to_default_state_on_SAVINGS_Page()  {
        Assert.assertFalse(newSavingsAccountPage.savingsRadioButton.isSelected() &&
                newSavingsAccountPage.moneyMarketRadioButton.isSelected());
        Assert.assertFalse(newSavingsAccountPage.individualRadioButton.isSelected() &&
                newSavingsAccountPage.jointRadioButton.isSelected());
        Assert.assertTrue(newSavingsAccountPage.initialDepositInputField.getAttribute("value").isEmpty());
        Assert.assertTrue(newSavingsAccountPage.accountNameInputField.getAttribute("value").isEmpty());

    }


    @And("^click on New Savings button$")
    public void clickOnNewSavingsButton() {
        mainPage.newSavingsButton.click();
    }
}
