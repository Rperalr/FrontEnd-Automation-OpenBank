package PageModel;

import base.utilsBase.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageCssLlenarForm extends BasePage {

    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#promocode")
    public WebElement txtbx_CODIGOP_PROMOCIONAL;
    @FindBy(how = How.CSS , css = "#docNumber")
    public WebElement txtbx_NUMERO_DOCUMENTO;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#name")
    public WebElement txtbx_NOMBRE;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#lastName")
    public WebElement txtbx_1ER_APELLIDO;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#secondLastName")
    public WebElement txtbx_2DO_APELLIDO;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#birthDay")
    public WebElement txtbx_DD;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#birthMonth")
    public WebElement txtbx_MM;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "#birthYear")
    public WebElement txtbx_AAAA;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.ID , id = "resident_0")
    public WebElement chkbx_PERDSONA_FISICA;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS , css = "button[aria-disabled='true']")
    public WebElement btn_ENTENDIDO;
    @FindBy(how = How.XPATH , xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]")
    public WebElement txbx_SELECIONAR_PAIS;
    @FindBy(how = How.XPATH , xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/span")
    public WebElement txbx_SELECIONAR_PAIS_ESPAÑA;

    //Assert Labels
    @FindBy(how = How.CSS , css = "span[role='button'] span")
    public WebElement btn_PAIS_ORIGEN_LANDING; //Localizadores de los Elementos Web del Modelo de Pagina

    //constructror clase
    public HomePageCssLlenarForm(WebDriver driver) {
        super(driver);
    }
    public void aceptarPersonaFisica() {
        try {
            if (chkbx_PERDSONA_FISICA.isSelected()) {
                chkbx_PERDSONA_FISICA.click();
                System.out.println("✅ Cookie banner cerrado.");
            }
        } catch (Exception e) {
            System.out.println("⚠️ No se encontró el banner de cookies o ya estaba cerrado.");
        }
    }
}

