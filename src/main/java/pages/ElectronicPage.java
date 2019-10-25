package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectronicPage {

    public ElectronicPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@class,'section N9o4g')]")
    WebElement electronicElements;

    public void selectMenuItem(String itemName) {
        electronicElements.findElement(By.xpath(".//a[contains(text(),'"+itemName+"')]")).click();
    }
}
