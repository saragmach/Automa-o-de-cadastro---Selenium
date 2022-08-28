package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*DEFINE E INICIA DRIVER DO NAVEGADOR SE FECHADO*/
public class RunBase {
    static WebDriver driver;
    private enum Browser {CHROME, FIREFOX}

    public static WebDriver getDriver(){

        if(driver == null){
            return getDriver(Browser.CHROME);
        }
        else {
            return driver;
        }
    }

    /*RECEBE NAVEGADOR COMO PARÂMETRO/ FECHA O DRIVER CASO ABERTO/ CRIA NOVO DRIVER DO NAVEGADOR*/
    public static WebDriver getDriver(Browser browser){

        if(driver != null){
            driver.quit();
        }

        switch (browser){
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Passe um navegador válido!");
        }
        return driver;
    }
}
