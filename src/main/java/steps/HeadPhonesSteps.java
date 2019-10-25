package steps;

import pages.HeadPhonesPage;
import ru.yandex.qatools.allure.annotations.Step;

public class HeadPhonesSteps {

    HeadPhonesPage headPhonesPage = new HeadPhonesPage();
    @Step("получено название товара")
    public String getLabelText() {
     return headPhonesPage.ElementLabel.getText();
    }
}
