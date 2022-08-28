package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;

    /*PRIVATES DOS IDS DE CADA CAMPO*/
    private final By titleM = By.id("id_gender1");
    private final By titleF = By.id("id_gender2");
    private final By first_name_field = By.id("customer_firstname");
    private final By last_name_field = By.id("customer_lastname");
    private final By password_field = By.id("passwd");
    private final By seleciona_dia = By.id("days");
    private final By seleciona_mes = By.id("months");
    private final By seleciona_ano = By.id("years");
    private final By preenche_endereco = By.id("address1");
    private final By preenche_cidade = By.id("city");
    private final By seleciona_estado = By.id("id_state");
    private final By preenche_cep = By.id("postcode");
    private final By preenche_celular = By.id("phone_mobile");
    private final By cria_conta = By.id("submitAccount");
    private final By sucesso = By.id("center_column");


    public CadastroPage (WebDriver driver) {
        this.driver = driver;
    }
            /*MARCA O CAMPO TITLE*/
    public void selectTitle(Integer type ){
        pause();
        if (type == 1){
            driver.findElement(titleM).click();
        }
        else if(type == 2){
            driver.findElement(titleF).click();
        }
    }
            /*PREENCHE O NOME*/
    public void preencheNome(String name){
        driver.findElement(first_name_field).sendKeys(name);
    }

            /*PREENCHE O SOBRENOME*/
    public void preencheSobrenome(String name){
        driver.findElement(last_name_field).sendKeys(name);
    }

            /*PREENCHE SENHA*/
    public void preencheSenha(String senha){
        driver.findElement(password_field).sendKeys(senha);
    }

            /*SELECIONA O ANIVERSARIO*/
    public void selecionaAniversario(Integer dia, Integer mes, String ano){
        Select selecionaDia = new Select(driver.findElement(seleciona_dia));
        selecionaDia.selectByIndex(dia);

        Select selecionaMes = new Select(driver.findElement(seleciona_mes));
        selecionaMes.selectByIndex(mes);

        Select selecionaAno = new Select(driver.findElement(seleciona_ano));
        selecionaAno.selectByValue(ano);
    }

            /*PREENCHE O ENDEREÇO*/
    public void preencheEndereco (String end){
        driver.findElement(preenche_endereco).sendKeys(end);
    }

            /*PREENCHE A CIDADE*/
    public void preencheCidade (String cid){
        driver.findElement(preenche_cidade).sendKeys(cid);
    }

            /*SELECIONA O ESTADO*/
    public void SelecionaEstado (String est){
        Select selecionaEstado = new Select (driver.findElement(seleciona_estado));
        selecionaEstado.selectByValue(est);
    }

            /*PREENCHE O CEP*/
    public void preencheCep (String cp){
        driver.findElement(preenche_cep).sendKeys(cp);
    }

            /*PREENCHE O CELULAR*/
    public void preencheCelular (String cel){
        driver.findElement(preenche_celular).sendKeys(cel);
    }

            /*CLICA EM CRIAR A CONTA*/
    public void clicaCriaConta (){
        driver.findElement(cria_conta).click();
        pause();
    }

            /*VERIFICA SE A CONTA FOI CRIADA*/
    public void verificaSucesso (){
        Assert.assertTrue(driver.findElement(sucesso).isDisplayed());
    }
}
