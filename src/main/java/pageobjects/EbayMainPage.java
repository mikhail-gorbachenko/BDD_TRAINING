package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayMainPage extends Page {

    @FindBy(id = "gh-ac")
    private WebElement searchField;
    @FindBy(id = "gh-btn")
    private WebElement searchButton;

    public EbayMainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public EbayMainPage setValueToSearchField(String value){
        searchField.sendKeys(value);
        return this;
    }

    public EbaySearchPage pressSearchButton(){
        searchButton.click();
        return new EbaySearchPage(driver);
    }


}
