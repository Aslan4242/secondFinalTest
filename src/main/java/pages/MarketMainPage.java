package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketMainPage {

    public MarketMainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='n-w-tabs__horizontal-tabs']")
   public WebElement electronic;

    public void selectMenuItem(String itemName) {
        electronic.findElement(By.xpath(".//a[contains(@data-bem,'"+itemName+"')]")).click();
    }
}
