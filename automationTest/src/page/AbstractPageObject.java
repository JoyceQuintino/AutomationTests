package automationTest.page;

/**
 * Classe base para criação das novas PagesObjects
 * Todas as pages devem ser herdadas desta classe
 */
public abstract class AbstractPageObject {
    
    protected Webdriver driver;
    
    /**
     * Construtor base para criação da fábrica de elementos (PageFactory)
     * @param driver
     */
    protected AbstractPageObject(Webdriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
}
