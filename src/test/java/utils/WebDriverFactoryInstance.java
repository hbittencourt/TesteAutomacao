package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactoryInstance {

    private static final WebDriverFactoryInstance INSTANCE = new WebDriverFactoryInstance();

    final String chromeDriverFilePath = System.getProperty("user.dir") + "/browserDrivers/chromedriver.exe";

    private WebDriverFactoryInstance(){
    }

    public static final WebDriverFactoryInstance getInstance() {
        return INSTANCE;
    }

    public WebDriver createConfigurationsWebDriver() {

        return setGoogleChromeFactoryDriver();
    }

    private WebDriver setGoogleChromeFactoryDriver() {
        System.setProperty("webdriver.chrome.driver", chromeDriverFilePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }






}
