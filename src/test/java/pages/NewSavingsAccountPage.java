package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NewSavingsAccountPage {
    public NewSavingsAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "strong[class='card-title text-white']")
    public WebElement newSavingsAccountHeader;

    //strong[text()='Select Savings Account Type']/..
    @FindBy(xpath = "//strong[text()='Select Savings Account Type']/..")
    public WebElement selectSavingsAccountTypeLabel;

    @FindBy(id = "Savings")
    public WebElement savingsRadioButton;

    @FindBy(xpath = "//input[@id='Money Market']")
    public WebElement moneyMarketRadioButton;

    @FindBy(xpath = "//strong[text()='Select Account Ownership']/..")
    public WebElement selectSavingsAccountOwnershipLabel;

    @FindBy(id = "Individual")
    public WebElement individualRadioButton;

    @FindBy(id = "Joint")
    public WebElement jointRadioButton;

    @FindBy(xpath = "//strong[text()='Account Name']")
    public WebElement accountNameHeader;

    @FindBy(id = "name")
    public WebElement accountNameInputField;

    @FindBy(xpath = "//strong[text()='Initial Deposit']")
    public WebElement initialDepositHeader;

    @FindBy(id = "openingBalance")
    public WebElement initialDepositInputField;

    @FindBy(id = "newSavingsSubmit")
    public WebElement submitButton;

    @FindBy(id = "newSavingsReset")
    public WebElement resetButton;

    @FindBy(id = "new-account-error-alert")
    public WebElement newAccountErrorAlert;











}


