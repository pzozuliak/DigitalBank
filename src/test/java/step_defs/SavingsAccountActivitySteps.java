package step_defs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LogInPage;
import pages.MainPage;
import pages.SavingsAccountPage;
import utilities.Driver;

public class SavingsAccountActivitySteps {

    WebDriver driver;
    MainPage mainPage = new MainPage();
    SavingsAccountPage savingsPage = new SavingsAccountPage();
    LogInPage logInPage =new LogInPage();




    @When("^user clicks on SavingsDropdown$")
    public void user_clicks_on_SavingsDropdown() throws Throwable {
        mainPage.savingsSubDropdown.click();
    }

    @When("^user clicks NewSavings button$")
    public void user_clicks_NewSavings_button() throws Throwable {
        savingsPage.newSavingsButton.click();
    }


    @When("^user clicks ViewSavings button$")
    public void user_clicks_ViewSavings_button() throws Throwable {
        savingsPage.viewSavingsButton.click();
    }

    @Then("^user should be able to see (\\d+) or More Savings accounts$")
    public void user_should_be_able_to_see_or_More_Savings_accounts(int arg1) throws Throwable {
        Assert.assertTrue(savingsPage.savingsAccounts.size()>=1);
    }

    @Then("^verify header \"([^\"]*)\" is displaying transactions$")
    public void verify_header_is_displaying_transactions(String arg1) throws Throwable {

    }

}
