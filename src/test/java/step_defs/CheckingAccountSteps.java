package step_defs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import utilities.Driver;

import java.util.List;

public class CheckingAccountSteps {

    WebDriver driver;
    MainPage mainPage = new MainPage();

    @When("^user navigates to Digital Bank Wep Application site$")
    public void user_navigates_to_Digital_Bank_Wep_Application_site() throws Throwable {
        Driver.getDriver().navigate().to("http://3.131.35.165:8080/bank/");
    }

    @When("^clicks on Checking button$")
    public void clicks_on_Checking_button() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,7);
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.checkingSubDropdown));
        mainPage.checkingSubDropdown.click();
        mainPage.newCheckingButton.click();

    }

    @Then("^user creates checking account with account name \"([^\"]*)\" and deposit amount \"([^\"]*)\"$")
    public void user_creates_checking_account_with_account_name_and_deposit_amount(String arg1, String arg2) throws Throwable {

    }

    @Then("^user should be able to view checking account info$")
    public void user_should_be_able_to_view_checking_account_info() throws Throwable {

    }

    @Then("^verify all information should match the entered values$")
    public void verify_all_information_should_match_the_entered_values() throws Throwable {

    }

    @Then("^verify header \"([^\"]*)\" is displayed$")
    public void verify_header_is_displayed(String header) throws Throwable {
        int result = 0;
        WebElement table = driver.findElement(By.xpath("//table[@id='transactionTable']"));

        WebElement rows = table.findElement(By.xpath(".//tr"));

        List<WebElement> headers = table.findElements(By.xpath(".//tr/th"));

        for (int i=1;i<=headers.size();i++){
            if (headers.get(i).toString().equals(header)){
                result = 1;
                break;
            }
        }
        Assert.assertTrue(result>0);
    }

    @When("^user clicks on View checking button$")
    public void user_clicks_on_View_checking_button() throws Throwable {

    }

    @Then("^verify user has more than (\\d+) checking account$")
    public void verify_user_has_more_than_checking_account(int arg1) throws Throwable {

    }

    @Then("^verify each of the accounts has ON/OFF toggle button$")
    public void verify_each_of_the_accounts_has_ON_OFF_toggle_button() throws Throwable {

    }

    @Then("^verify only one account is activated at the time$")
    public void verify_only_one_account_is_activated_at_the_time() throws Throwable {

    }

    @Then("^verify transaction history on activated account is displayed$")
    public void verify_transaction_history_on_activated_account_is_displayed() throws Throwable {

    }
}
