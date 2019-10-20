package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage {
    @FindBy(xpath = "//div[contains(@role,'navigation')]")
    WebElement mainMenu;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName) {
        mainMenu.findElement(By.xpath("//a[contains(text(),'" + itemName + "')]")).click();
    }


}
