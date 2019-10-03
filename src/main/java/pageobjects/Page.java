package pageobjects;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Page {

    Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    protected WebDriver driver;

    Page(WebDriver driver){
        this.driver = driver;
    }

}
