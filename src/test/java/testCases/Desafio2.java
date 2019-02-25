package testCases;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import pageObjects.MainPageObject;
import utils.WebDriverInstance;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Desafio2 extends WebDriverInstance {
    MainPageObject mainPageObject =  PageFactory.initElements(driver, MainPageObject.class);

    static Desafio1 desafio1 = PageFactory.initElements(driver, Desafio1.class);

    @Test
    public void task0_RodarDesafio1(){
        desafio1.task1_TrocarTema();
        desafio1.task2_ClicarEmAddCliente();
        desafio1.task3_PreencherDados();
        desafio1.task4_SalvarDadosEValidarMensagem();
        desafio1.task5_RetornaParaPaginaInicial();
    }

    @Test
    public void task1_BuscarSicredi(){
        mainPageObject.buttonSearch(driver).click();
        mainPageObject.inputSearch(driver).sendKeys("Sicredi"+ Keys.ENTER);
    }

    @Test
    public void task2_ClicarCheckbox(){
        sleep(2000);
        mainPageObject.checkBoxAll(driver).click();
    }

    @Test
    public void task3_ClicarBotaoDelete(){
        sleep(1000);
        mainPageObject.buttonDelete(driver).click();
    }

    @Test
    public void task4_confirmarMensagem(){
        sleep(1000);
        Assert.assertEquals("Are you sure that you want to delete this 1 item?", mainPageObject.textRemoverItem(driver).getText());
    }

    @Test
    public void task5_ConfirmaRemocao(){
        mainPageObject.buttonModalDelete(driver).click();
    }

    @Test
    public void task6_ValidaRemocao(){
        System.out.println(mainPageObject.textConfirmacaoPopUp(driver).getText());
    }
}
