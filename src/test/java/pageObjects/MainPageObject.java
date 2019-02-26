package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Henrique Bittencourt
 *
 **/

public class MainPageObject {

    public WebElement comboBoxSelecaoDeTema(WebDriver driver){
        String id = "switch-version-select";
        return driver.findElement(By.id(id));
    }

    public WebElement buttonSearch(WebDriver driver){
        String xpath = "//*[@id=\"gcrud-search-form\"]/div[1]/div[2]/a[3]";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement buttonAddCustomer(WebDriver driver){
        String xpath = "//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement inputSearch(WebDriver driver){
        String className = "search-input";
        return driver.findElement(By.className(className));
    }

    public WebElement checkBoxAll(WebDriver driver){
        String className = "select-all-none";
        return driver.findElement(By.className(className));
    }

    public WebElement buttonDelete(WebDriver driver){
        String xpath = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement textRemoverItem(WebDriver driver){
        String xpath = "/html/body/div[2]/div[2]/div[3]/div/div/div[2]";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement buttonModalDelete(WebDriver driver){
        String xpath = "/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement textConfirmacaoPopUp(WebDriver driver){
        String xpath = "//span[3]/p";
        return driver.findElement(By.xpath(xpath));
    }












}
