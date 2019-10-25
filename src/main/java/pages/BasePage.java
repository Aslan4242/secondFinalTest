package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class BasePage {

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void selectCheckBox(WebElement element) {
        element.click();
    }
}
