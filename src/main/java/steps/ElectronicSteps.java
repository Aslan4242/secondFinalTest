package steps;

import pages.ElectronicPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicSteps {

    @Step("выбран пункт меню 'Наушники'")
    void stepSelectMenu(String itemName) {
        new ElectronicPage().selectMenuItem(itemName);
    }
}
