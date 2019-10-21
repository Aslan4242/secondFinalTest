package steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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
        @Then("выбирается минимальная сумма \"(.*)\"$")
        public void stepSelectMinSum(String minSum){
                filterSteps.stepSelectMinSum(minSum);
        }
        @Then("выбираются производители \"(.*)\"$")
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
        @Then("проверяется, что элементов на странице \"(.*)\"$")
        public void StepCheckElements(int count) {
                List<WebElement> list =  BaseSteps.getDriver().findElements(By.xpath("//div[contains(@id,'product')]//a[@title][contains(@class,'theme')]"));
                assertEquals("Количество элементов на странице не равно 21",count, list.size());
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
                assertEquals("Выбранный товар не соответствует запомненному значению " + elementName + "|" + currentElement,elementName, currentElement);
        }
}
