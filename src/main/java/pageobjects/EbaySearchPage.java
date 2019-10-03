package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EbaySearchPage extends Page {

    public EbaySearchPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

}
