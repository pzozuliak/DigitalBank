package step_defs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainPage;
import utilities.Driver;

public class FunctionalitiesSteps {

    FunctionalitiesSteps functionalitiesSteps = new FunctionalitiesSteps();
    MainPage mainPage = new MainPage();

    @Given("^User navigates to Deposit page$")
    public void user_navigates_to_Deposit_page() {
        Driver.getDriver().navigate().to("http://3.131.35.165:8080/bank");
    }

    @When("^User User submits a deposit without selected account$")
    public void user_User_submits_a_deposit_without_selected_account() {


    }

    @Then("^Verify field error message \"([^\"]*)\" is displayed$")
    public void verify_field_error_message_is_displayed(String arg1) {

    }

    @When("^User submits a deposit with invalid amount$")
    public void user_submits_a_deposit_with_invalid_amount() {

    }

    @Then("^Verify  error message \"([^\"]*)\" is displayed$")
    public void verify_error_message_is_displayed(String arg1) {

    }

    @Given("^User selects deposit account as \"([^\"]*)\"$")
    public void user_selects_deposit_account_as(String arg1)  {

    }

    @When("^User submits a deposit with \"([^\"]*)\" amount$")
    public void user_submits_a_deposit_with_amount(String arg1)  {

    }

    @Then("^Verify deposit amount has been applied$")
    public void verify_deposit_amount_has_been_applied()  {

    }


}
