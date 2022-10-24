package automationTest.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    private WebDriver driver;
    private final String URL_BASE = "https://www.google.com/";
    private final String CAMINHO_DRIVER = "src/resource/chromedriver-v-1060524961.exe";

    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @Test
    public void persquisarNoGoogle(){
        iniciar();

        WebElement entradaPesquisa = driver.findElement(By.name("q"));
        entradaPesquisa.sendKeys("Batata fita" + Keys.ENTER);

        String resultado = driver.findElement(By.id("result-stats")).getText();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

        driver.quit();

    }
}
