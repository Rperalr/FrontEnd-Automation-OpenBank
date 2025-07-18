package PageModel;

import base.utilsBase.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageCss extends BasePage {
    //CookieS
    @FindBy(how = How.XPATH , xpath = "/html/body/div[2]/div/div/div/div[3]/div/div[3]/button")
    private WebElement btn_COOKIES;

    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-middle-topbar > div.ok-middle-topbar__block > div.products-area > ul > li:nth-child(1) > span")
    private WebElement btnModulos_MENU_PRODUCTOS;
    @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-middle-topbar > div.ok-middle-topbar__block > div.products-area > ul > li:nth-child(1) > div > div > div > div.products-selector__items > ul > li.products-selector__list__item.products-selector__list__item--active > div > span.products-selector__list__item__text")
    private WebElement btnMenuPrincipal_CUENTAS;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-middle-topbar > div.ok-middle-topbar__block > div.products-area > ul > li:nth-child(2) > span")
    private WebElement btnSubMenu_PROMOCIONES;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-middle-topbar > div.ok-middle-topbar__block > div.products-area > ul > li:nth-child(3) > span")
    private WebElement btnSubMenu_CONOCE_OPENBANK;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-middle-topbar > div.ok-middle-topbar__block > div.products-area > ul > li:nth-child(4) > a")
    private WebElement btnSubMenu_BLOG;


    //Assert Labels
    @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-public-topbar > ul > li:nth-child(4) > div > span > span")
    private WebElement btn_PAIS_ORIGEN_LANDING; //Localizadores de los Elementos Web del Modelo de Pagina

    //constructror clase
    public HomePageCss(WebDriver driver) {
        super(driver);
    }

    //getters
    public WebElement getBtnModulos_MENU_PRODUCTOS() {
        return btnModulos_MENU_PRODUCTOS;
    }
    public WebElement getBtnMenuPrincipal_CUENTAS() {
        return btnMenuPrincipal_CUENTAS;
    }
    public WebElement getBtnSubMenu_PROMOCIONES() {
        return btnSubMenu_PROMOCIONES;
    }

    public WebElement getBtnSubMenu_CONOCE_OPENBANK() {
        return btnSubMenu_CONOCE_OPENBANK;
    }
    public WebElement getBtnSubMenu_BLOG() {
        return btnSubMenu_BLOG;
    }
    public WebElement getBtn_PAIS_ORIGEN_LANDING() {
        return btn_PAIS_ORIGEN_LANDING;
    }

    //Aceptar y Cerrar Ventana Cookies
    public void aceptarCookies() {
        try {
            if (btn_COOKIES.isEnabled()) {
                btn_COOKIES.click();
                System.out.println("✅ Cookie banner cerrado.");
            }
        } catch (Exception e) {
            System.out.println("⚠️ No se encontró el banner de cookies o ya estaba cerrado.");
        }
    }
}

