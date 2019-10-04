package tests;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.EbayMainPage;
import pageobjects.EbaySearchPage;
import pageobjects.Page;


public class Test {

    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    protected WebDriver driver;

    //@BeforeClass
    public void startBrowser(){
        driver = Driver.getDriver();
        driver.get("https://www.ebay.com");
    }

    public EbayMainPage getEbayMainPage(){
        return new EbayMainPage(driver);
    }

    public EbaySearchPage getEbaySearchPage(){
        return  new EbaySearchPage(driver);
    }

   // @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

}
