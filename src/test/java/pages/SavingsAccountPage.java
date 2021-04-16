package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SavingsAccountPage {
    public SavingsAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "new-savings-menu-item")
    public WebElement newSavingsButton;
    @FindBy(id = "view-savings-menu-item")
    public  WebElement viewSavingsButton;
    @FindBy(className = "col-md-6 col-lg-3")
    public List<WebElement> savingsAccounts;
    @FindBy(className = "table")
    public WebElement transactionTable;
    @FindBy(className = "th")
    public List<WebElement> tableHeaders;



}
