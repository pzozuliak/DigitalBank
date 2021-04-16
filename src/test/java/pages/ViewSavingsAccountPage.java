package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViewSavingsAccountPage {
    public ViewSavingsAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "new-account-msg")
    public WebElement confirmationMessage;

}
