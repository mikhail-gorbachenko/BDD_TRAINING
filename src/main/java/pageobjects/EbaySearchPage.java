package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;

public class EbaySearchPage extends Page {

    @FindBy(id = "srp-river-results-listing1")
    private WebElement firstSnippet;

    public EbaySearchPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void assSertThis(String value){
        String actualValue = firstSnippet.getText();
        assertThat(actualValue, containsStringIgnoringCase(value));
    }

}
