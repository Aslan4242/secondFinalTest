package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps {

    @Step("выбран пункт меню 'Маркет'")
    public void stepSelectMenu(String menuItem) {
        new MainPage().selectMenuItem(menuItem);
    }
}
