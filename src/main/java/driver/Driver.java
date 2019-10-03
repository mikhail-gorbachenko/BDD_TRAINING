package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver instance;

    private Driver(){}

    private static WebDriver getDriverInstance(){
        if (instance==null){
            System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
            instance = new FirefoxDriver();
        }

        instance.manage().window().maximize();

        return instance;
    }

    public static WebDriver getDriver(){
        return getDriverInstance();
    }

}
