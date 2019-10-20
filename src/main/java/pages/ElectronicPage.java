package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectronicPage {

    public ElectronicPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(@href,'naushniki-i')]")
    WebElement headPhones;

    public void selectMenuItem() {
        headPhones.click();
    }

}
