package automationTest.page;

public class GooglePageObject extends AbstractPageObject {
    
    @FindBy(name = "q")
    public WebElement entradaPesquisa;

    @FindBy(id = "result-stats")
    public WebElement resultadoPesquisa;

    public GooglePageObject(Webdriver driver){
        super(driver);
    }

    public void pesquisar(String texto){
        entradaPesquisa.sendKeys(texto + Keys.ENTER);
    }

}
