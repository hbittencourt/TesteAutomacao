package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomerPageObject {
    public WebElement inputName(WebDriver driver){
        String id = "field-customerName";
        return driver.findElement(By.id(id));
    }

    public WebElement inputLastName(WebDriver driver){
        String id = "field-contactLastName";
        return driver.findElement(By.id(id));
    }

    public WebElement inputContactFirstName(WebDriver driver){
        String id = "field-contactFirstName";
        return driver.findElement(By.id(id));
    }

    public WebElement inputPhone(WebDriver driver){
        String id = "field-phone";
        return driver.findElement(By.id(id));
    }

    public WebElement inputAddressLine1(WebDriver driver){
        String id = "field-addressLine1";
        return driver.findElement(By.id(id));
    }

    public WebElement inputAddressLine2(WebDriver driver){
        String id = "field-addressLine2";
        return driver.findElement(By.id(id));
    }

    public WebElement inputCity(WebDriver driver){
        String id = "field-city";
        return driver.findElement(By.id(id));
    }

    public WebElement inputState(WebDriver driver){
        String id = "field-state";
        return driver.findElement(By.id(id));
    }

    public WebElement inputPostalCode(WebDriver driver){
        String id = "field-postalCode";
        return driver.findElement(By.id(id));
    }

    public WebElement inputCountry(WebDriver driver){
        String id = "field-country";
        return driver.findElement(By.id(id));
    }

    public WebElement comboBoxFromEmployeer(WebDriver driver){
        String id = "field_salesRepEmployeeNumber_chosen";
        return driver.findElement(By.id(id));
    }
    public WebElement comboBoxFromEmployeerOpcaoFixter(WebDriver driver){
        String xpath = "//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement inputCreditLimit(WebDriver driver){
        String id = "field-creditLimit";
        return driver.findElement(By.id(id));
    }

    public WebElement buttonSaveandGoBackToList(WebDriver driver){
        String id = "save-and-go-back-button";
        return driver.findElement(By.id(id));
    }

    public WebElement buttonSave(WebDriver driver){
        String id = "form-button-save";
        return driver.findElement(By.id(id));
    }

    public WebElement textMensagemSucesso(WebDriver driver){
        String id = "report-success";
        return driver.findElement(By.id(id));
    }







}
