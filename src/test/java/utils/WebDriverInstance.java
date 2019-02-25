package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverInstance {

    protected static WebDriver driver = null;
    protected static String baseUrl = System.getProperty("baseUrl",
            "https://www.grocerycrud.com/demo/bootstrap_theme");

    protected static boolean setUpIsDone = false;




    @BeforeClass
    public static void setUp() throws Exception {
        driver = WebDriverFactoryInstance.getInstance().createConfigurationsWebDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.get(baseUrl);
        setUpIsDone = true;

    }

    @AfterClass
    public static void cleanUp() throws Exception {
        driver.close();
        driver.quit();
    }

    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
