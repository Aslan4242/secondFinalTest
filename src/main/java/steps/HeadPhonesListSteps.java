package steps;

import org.openqa.selenium.WebElement;
import pages.HeadPhonesListPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class HeadPhonesListSteps {
    HeadPhonesListPage headPhonesListPage = new HeadPhonesListPage();

    @Step("нажата кнопка 'Все фильтры'")
    void stepSelectAllFilters() {
        headPhonesListPage.filters.click();
    }

    @Step("элементы выводятся в виде списка'")
    void showAsList() {
        headPhonesListPage.showAsList.click();
    }

    @Step("получение элементов на странице 12")
    public List<WebElement> StepGetElements() {
        List<WebElement> list = headPhonesListPage.getElements();
        return list;
    }

    @Step("ожидание появления списка элементов на странице")
    public void waitLinksClickable() {
        headPhonesListPage.waitLinksClickable();

    }
    @Step("вводится в поисковую строку первый элемент из списка")
    public void StepFillSearchField() {
        List<WebElement> list = headPhonesListPage.getElements();
        String firstElement = list.get(0).getText().substring(9);
        headPhonesListPage.searchField.sendKeys(firstElement);
    }

    @Step("выбирается элемент из выпадающего списка")
    public void StepChooseFromDropDownList() {
        List<WebElement> list = headPhonesListPage.getElements();
        String firstElement = list.get(0).getText().toLowerCase().substring(9);
        headPhonesListPage.selectDropDownElement(firstElement);
    }


}
