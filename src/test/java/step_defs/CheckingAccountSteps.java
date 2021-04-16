package step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CheckingAccountPage;
import pages.MainPage;
import utilities.Driver;

import java.util.List;

public class CheckingAccountSteps {

    WebDriver driver;
    MainPage mainPage = new MainPage();
    CheckingAccountPage checkingAccountPage = new CheckingAccountPage();

    @When("^user navigates to Digital Bank Wep Application site$")
    public void user_navigates_to_Digital_Bank_Wep_Application_site() {
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
    public void user_creates_checking_account_with_account_name_and_deposit_amount(String accountName, String depositAmount){
mainPage.newCheckingButton.click();
checkingAccountPage.standardCheckingRadioButton.click();
checkingAccountPage.IndividualRadioButton.click();
checkingAccountPage.accountNameInputField.sendKeys(accountName);
checkingAccountPage.initialDepositAmount.sendKeys(depositAmount);
checkingAccountPage.submitButton.click();
    }

    @Then("^user should be able to view checking account info$")
    public void user_should_be_able_to_view_checking_account_info(){


    }

    @Then("^verify all information should match the entered values$")
    public void verify_all_information_should_match_the_entered_values(){

    }

    @Then("^verify header \"([^\"]*)\" is displayed$")
    public void verify_header_is_displayed(String header) {
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
    public void user_clicks_on_View_checking_button() {
    mainPage.viewCheckingButton.click();
    }

    @Then("^verify user has more than (\\d+) checking account$")
    public void verify_user_has_more_than_checking_account(int numOfAccounts) {
    List<WebElement> checkingAccounts = driver.findElements(By.xpath("//form[@action='/bank/account/checking-view']"));
    Assert.assertTrue(checkingAccounts.size()>numOfAccounts);
    }

    @Then("^verify each of the accounts has ON/OFF toggle button$")
    public void verify_each_of_the_accounts_has_ON_OFF_toggle_button() {
        List<WebElement> checkingAccounts = driver.findElements(By.xpath("//form[@action='/bank/account/checking-view']"));
        List<WebElement> toggleButtons = driver.findElements(By.xpath("//span[@class='switch-label']"));
    Assert.assertTrue(checkingAccounts.size()==toggleButtons.size());
    }

    @Then("^verify only one account is activated at the time$")
    public void verify_only_one_account_is_activated_at_the_time()  {
       List<WebElement> checkedButton = driver.findElements(By.xpath("//input[@checked='checked']"));
       Assert.assertTrue(checkedButton.size()==1);
    }

    @Then("^verify transaction history on activated account is displayed$")
    public void verify_transaction_history_on_activated_account_is_displayed() {
        Assert.assertTrue(checkingAccountPage.transactionTable.isDisplayed());
    }

    @And("^user clicks on View Checking Account Button$")
    public void userClicksOnViewCheckingAccountButton() {
       checkingAccountPage.viewCheckingAccountButton.click();
    }
}
