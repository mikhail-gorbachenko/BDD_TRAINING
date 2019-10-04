package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.Test;

public class BaseStepsDef extends Test {

    @Given("I set search request {string}")
    public void iSearchRequest(String value) {
        startBrowser();
        getEbayMainPage().setValueToSearchField(value);
    }

    @When("I perform search")
    public void iPerformSearch() {
        getEbayMainPage().pressSearchButton();
    }

    @Then("the term query {string} should be the first in the Search Result grid")
    public void theTermQueryShouldBeTheFirstInTheSearchResultGrid(String value) {
        getEbaySearchPage().assSertThis(value);
        closeBrowser();
    }
}
