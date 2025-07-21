package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import base.utilsBase.BasePage;

public class HomePageXPath extends BasePage {
    //Cookies
    @FindBy(how = How.XPATH , xpath = "//button[contains(text(),'Aceptar y navegar')]")
    private WebElement btn_COOKIES;

    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.XPATH , xpath = "(//a[@title='Hazte Cliente'][normalize-space()='Hazte Cliente'])[1]")
    private WebElement btn_HASTE_CLIENTE;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.XPATH , xpath = "//button[normalize-space()='¡Quiero hacerme cliente!']")
    private WebElement btn_QUIERO_HACERME_CLIENTE;
    @FindBy(how = How.XPATH , xpath = "(//div[@class='Select-placeholder'])[1]")
    private WebElement radBtn_SELECIONAR_PAIS;

    //Assert Labels
    @FindBy(how = How.XPATH , xpath = "//div[@class='title-box__subtitle--register']")
    private WebElement lbl_CUENTA_CORRIENTE;
    @FindBy(how = How.XPATH , xpath = "(//h4[normalize-space()='Completa tus datos personales.'])[1]")
    private WebElement lbl_COMPLETAR_DATOS_PERSONALES;

    //constructror clase
    public HomePageXPath(WebDriver driver) {
        super(driver);
    }

    //getters
    public WebElement getBtn_HASTE_CLIENTE() {
        return btn_HASTE_CLIENTE;
    }
    public WebElement getBtn_QUIERO_HACERME_CLIENTE() {return btn_QUIERO_HACERME_CLIENTE;}
    public WebElement getLbl_CUENTA_CORRIENTE() {
        return lbl_CUENTA_CORRIENTE;
    }
    public WebElement getLbl_COMPLETAR_DATOS_PERSONALES() {
        return lbl_COMPLETAR_DATOS_PERSONALES;
    }

    public WebElement getRadBtn_SELECIONAR_PAIS() {
        return radBtn_SELECIONAR_PAIS;
    }

    public void MethodaceptarCookies() {
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

