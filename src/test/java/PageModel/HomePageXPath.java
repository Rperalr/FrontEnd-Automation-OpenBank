package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import base.utilsBase.BasePage;

public class HomePageXPath extends BasePage {
    //Cookies
    @FindBy(how = How.XPATH , xpath = "/html/body/div[2]/div/div/div/div[3]/div/div[3]/button")
    public WebElement btn_COOKIES;

    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.XPATH , xpath = "//*[@id=\"navbar-wrapper\"]/div[3]/div[2]/div[2]/div[2]/div/a")
    private WebElement btn_HASTE_CLIENTE;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.XPATH , xpath = "//button[normalize-space()='¡Quiero hacerme cliente!']")
    private WebElement btn_QUIERO_HACERME_CLIENTE;
    @FindBy(how = How.XPATH , xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]")
    private WebElement txbx_SELECIONAR_PAIS;

    //Assert Labels
    @FindBy(how = How.XPATH , xpath = "/html/body/div[1]/div/div[1]/header/div[1]/div[1]/a")
    private WebElement lbl_AREA_CLIENTES; //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.XPATH , xpath = "//*[@id=\"content\"]/div[1]/div/div[1]/div/div[1]/div/div/div/div/div/div[2]")
    private WebElement lbl_CUENTA_CORRIENTE;
    @FindBy(how = How.XPATH , xpath = "//*[@id=\"content\"]/div[1]/div/div[2]/div[1]/div[1]/div/div/h4")
    private WebElement lbl_COMPLETAR_DATOS_PERSONALES;

    //constructror clase
    public HomePageXPath(WebDriver driver) {
        super(driver);
    }

    //getters
    public WebElement getBtn_HASTE_CLIENTE() {
        return btn_HASTE_CLIENTE;
    }
    public WebElement getBtn_QUIERO_HACERME_CLIENTE() {
        return btn_QUIERO_HACERME_CLIENTE;
    }
    public WebElement getLbl_AREA_CLIENTES() {
        return lbl_AREA_CLIENTES;
    }
    public WebElement getLbl_CUENTA_CORRIENTE() {
        return lbl_CUENTA_CORRIENTE;
    }
    public WebElement getLbl_COMPLETAR_DATOS_PERSONALES() {
        return lbl_COMPLETAR_DATOS_PERSONALES;
    }
    public WebElement getTxbx_SELECIONAR_PAIS() {
        return txbx_SELECIONAR_PAIS;
    }

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

