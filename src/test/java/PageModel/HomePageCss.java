package PageModel;

import base.utilsBase.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageCss extends BasePage {

    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "div[class='ok-middle-topbar'] li:nth-child(1) span:nth-child(1)")
    private WebElement btn_Modulos_MENU_CUENTAS;
    @FindBy(how = How.CSS , css = "div[class='ok-middle-topbar'] li:nth-child(2) span:nth-child(1)")
    private WebElement btn_SubMenu_TARJETAS;
    @FindBy(how = How.CSS , css = "div[class='ok-middle-topbar'] li:nth-child(3) span:nth-child(1)")
    private WebElement btn_SubMenu_FINANCIACION;
    @FindBy(how = How.CSS , css = "a[class='products-area__item__link']")
    private WebElement btn_SubMenu_BLOG;
    @FindBy(how = How.XPATH , xpath = "//*[@data-testid = 'gatsbyLink']")
    private WebElement btn_Home_SABER_MAS;

    //Assert Labels
    @FindBy(how = How.CSS , css = "span[role='button'] span")
    private WebElement btn_PAIS_ORIGEN_LANDING; //Localizadores de los Elementos Web del Modelo de Pagina

    //constructror clase
    public HomePageCss(WebDriver driver) {
        super(driver);
    }

    //getters
    public WebElement getBtn_Modulos_MENU_CUENTAS() {
        return btn_Modulos_MENU_CUENTAS;
    }

    public WebElement getBtn_SubMenu_TARJETAS() {
        return btn_SubMenu_TARJETAS;
    }

    public WebElement getBtn_SubMenu_FINANCIACION() {
        return btn_SubMenu_FINANCIACION;
    }

    public WebElement getBtn_SubMenu_BLOG() {
        return btn_SubMenu_BLOG;
    }

    public WebElement getBtn_Home_SABER_MAS() {
        return btn_Home_SABER_MAS;
    }

    public WebElement getBtn_PAIS_ORIGEN_LANDING() {
        return btn_PAIS_ORIGEN_LANDING;
    }
}


