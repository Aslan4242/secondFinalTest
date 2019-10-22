package steps;

import pages.FiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FilterSteps {

    @Step("выбрана мнимальная сумма '5000'")
    void stepSelectMinSum(String value) {
        new FiltersPage().fillMinSumField(value);
    }

    @Step("выбран производитель 'Beats'")
    void stepSelectCheckBox(String checkBoxName) {
        new FiltersPage().selectCheckBox(checkBoxName);
    }

    @Step("нажата кнопка 'Показать пдходящие'")
    void stepSelectConfurmButton() {
        new FiltersPage().showButton.click();
    }

}
