package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import support.Utils;


public class LoginPage extends Utils {

    WebDriver driver;

    private final By create_email_field = By.id("email_create");
    private final By create_email_button = By.id("SubmitCreate");

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    /*ACESSA TELA DE LOGIN DO AUTOMATION PRACTICE*/
    public void acessarTelaLogin(){

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Assert.assertTrue(driver.findElement(By.id("create-account_form")).isDisplayed());

    }

    /*PREENCHE CAMPO DE EMAIL COM UM E-MAIL ALEATÓRIO*/
    public void preencherCampoEmail(){
        driver.findElement(create_email_field).sendKeys(getRandomEmail());

    }

    /*CONFIRMA E CRIA CONTA*/
    public void clicarCriarConta(){
        driver.findElement(create_email_button).sendKeys(Keys.ENTER);
    }


}
