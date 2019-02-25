package testCases;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AddCustomerPageObject;
import pageObjects.MainPageObject;
import utils.WebDriverInstance;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Desafio1 extends WebDriverInstance {
   MainPageObject mainPageObject =  PageFactory.initElements(driver, MainPageObject.class);
   AddCustomerPageObject addCustomerPageObject = PageFactory.initElements(driver, AddCustomerPageObject.class);

   @Test
   public void task1_TrocarTema() {
      sleep(1000);
      mainPageObject.comboBoxSelecaoDeTema(driver).sendKeys("Bootstrap V4 Theme");
      Assert.assertEquals("https://www.grocerycrud.com/demo/bootstrap_theme_v4", driver.getCurrentUrl());
   }

   @Test
   public void task2_ClicarEmAddCliente() {
      sleep(1000);
      mainPageObject.buttonAddCustomer(driver).click();
   }

   @Test
   public void task3_PreencherDados(){
      addCustomerPageObject.inputName(driver).sendKeys("Teste Sicredi");
      addCustomerPageObject.inputLastName(driver).sendKeys("Teste");
      addCustomerPageObject.inputContactFirstName(driver).sendKeys("Henrique");
      addCustomerPageObject.inputPhone(driver).sendKeys("51 9999-9999");
      addCustomerPageObject.inputAddressLine1(driver).sendKeys("Av Assis Brasil, 3970");
      addCustomerPageObject.inputAddressLine2(driver).sendKeys("Torre D");
      addCustomerPageObject.inputCity(driver).sendKeys("Porto Alegre");
      addCustomerPageObject.inputState(driver).sendKeys("RS");
      addCustomerPageObject.inputPostalCode(driver).sendKeys("91000-000");
      addCustomerPageObject.inputCountry(driver).sendKeys("Brasil");
      //Seleciona from Employeer: Fixter
      addCustomerPageObject.comboBoxFromEmployeer(driver).click();
      addCustomerPageObject.comboBoxFromEmployeerOpcaoFixter(driver).click();
      addCustomerPageObject.inputCreditLimit(driver).sendKeys("200");
   }

   @Test
   public void task4_SalvarDadosEValidarMensagem(){
      addCustomerPageObject.buttonSave(driver).click();
      sleep(3000);
      Assert.assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to list",
              addCustomerPageObject.textMensagemSucesso(driver).getText() );
   }


   public void task5_RetornaParaPaginaInicial(){
      addCustomerPageObject.buttonSaveandGoBackToList(driver).click();
   }







}
