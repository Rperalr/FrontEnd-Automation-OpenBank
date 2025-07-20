package PageModel;

import base.utilsBase.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageCss extends BasePage {

    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "div[class='ok-middle-topbar'] li:nth-child(1) span:nth-child(1)")
    private WebElement btnModulos_MENU_CUENTAS;
    @FindBy(how = How.CSS , css = "div[class='ok-middle-topbar'] li:nth-child(2) span:nth-child(1)")
    private WebElement btnSubMenu_TARJETAS;
    @FindBy(how = How.CSS , css = "div[class='ok-middle-topbar'] li:nth-child(3) span:nth-child(1)")
    private WebElement btnSubMenu_FINANCIACION;
    @FindBy(how = How.CSS , css = "a[class='products-area__item__link']")
    private WebElement btnSubMenu_BLOG;
    @FindBy(how = How.XPATH , xpath = "//*[@data-testid = 'gatsbyLink']")
    private WebElement btnHome_SABER_MAS;

    //Assert Labels
    @FindBy(how = How.CSS , css = "span[role='button'] span")
    private WebElement btn_PAIS_ORIGEN_LANDING; //Localizadores de los Elementos Web del Modelo de Pagina

    //constructror clase
    public HomePageCss(WebDriver driver) {
        super(driver);
    }

    //getters
    public WebElement getBtnModulos_MENU_CUENTAS() {return btnModulos_MENU_CUENTAS;}
    public WebElement getBtnSubMenu_TARJETAS() {return btnSubMenu_TARJETAS;}
    public WebElement getBtnSubMenu_FINANCIACION() {return btnSubMenu_FINANCIACION;}
    public WebElement getBtnSubMenu_BLOG() {
        return btnSubMenu_BLOG;
    }
    public WebElement getBtn_PAIS_ORIGEN_LANDING() {return btn_PAIS_ORIGEN_LANDING;}

    public WebElement getBtnHome_SABER_MAS() {
        return btnHome_SABER_MAS;
    }
}

