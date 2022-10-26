package automationTest.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import automationTest.page.GooglePageObject;

public class GoogleTest extends AbstractTest{

    //private static GooglePageObject googlePage;

    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePageObject(driver);
    }

    @Test
    public void pesquisarNoGoogle(){

        //googlePage.entradaPesquisa.sendKeys("Batata fita" + Keys.ENTER);

        googlePage.pesquisar("Batata frita");

        String resultado = googlePage.resultadoPesquisa.getText();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

    }
}
