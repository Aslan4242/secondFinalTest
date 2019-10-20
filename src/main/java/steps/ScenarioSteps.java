package steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ScenarioSteps {
        MainSteps mainSteps = new MainSteps();
        MarketMainSteps marketMainSteps = new MarketMainSteps();
        ElectronicSteps electronicSteps = new ElectronicSteps();
        HeadPhonesListSteps headPhonesListSteps = new HeadPhonesListSteps();
        FilterSteps filterSteps = new FilterSteps();
        HeadPhonesSteps headPhonesSteps = new HeadPhonesSteps();
        String elementName;

        @When("^выбран пункт меню \"(.*)\"$")
        public void stepSelectMainMenu(String menuItem){
                mainSteps.stepSelectMenu(menuItem);
        }

        @When("выбрана категория 'Электроника'")
        public void stepSelectCategory(){
                marketMainSteps.stepSelectMenu();
        }

        @When("выбрана подкатегория - 'Наушники'")
        public void stepSelectSubCategory(){
                electronicSteps.stepSelectMenu();
        }

        @Then("выбирается пункт 'Все фильтры'")
        public void stepSelectMoreFilters(){
                headPhonesListSteps.stepSelectAllFilters();
        }
        @Then("^выбирается минимальная сумма \"(.*)\"$")
        public void stepSelectMinSum(String minSum){
                filterSteps.stepSelectMinSum(minSum);
        }
        @Then("^выбираются производители \"(.*)\"$")
        public void stepSelectCompany(String company){
                filterSteps.stepSelectCheckBox(company);
        }
        @When("нажимается кнопка 'Применить'")
        public void stepSubmit(){
                filterSteps.stepSelectConfurmButton();
        }
        @Then("элементы выводятся в виде списка")
        public void stepShowAsList(){
                headPhonesListSteps.showAsList();
        }
        @Then("проверяется, что элементов на странице 20")
        public void StepCheckElements(){
                try {
                        Thread.sleep(5000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                List<WebElement> list =  headPhonesListSteps.StepGetElements();
                assertEquals("Количество элементов на странице не равно 20",20, list.size());
                elementName = list.get(0).getText();
        }
        @When("вводится название товара в поисковую строку")
        public void stepFillSerchField(){
                headPhonesListSteps.StepFillSearchField();
        }
        @Then("выбирается соответствующий товар из выпадающего списка")
        public void stepSelectElement(){
                headPhonesListSteps.StepChooseFromDropDownList();
        }
        @Then("проверяется, что выбранный товар соответствует запомненному значению")
        public void StepCheckElement() {
                String currentElement = headPhonesSteps.getLabelText();
                assertEquals("Выбранный товар не соответствует запомненному значению",elementName, currentElement);
        }
}