package PageModelMethods;

import PageModel.HomePageCss;
import PageModel.HomePageCssLlenarForm;
import PageModel.HomePageXPath;
import base.utilsBase.BasePage;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsXpath extends BasePage {

    /**
     * Constructor for the BasePage class.
     * Initializes the WebDriver instance and sets up the PageFactory
     * to initialize the WebElements declared in the page object.
     *
     * @param driver the WebDriver instance used to interact with the web page
     */
    public MethodsXpath(WebDriver driver) {
        super(driver);
    }

    public HomePageXPath Method_Hazte_Cliente() {
            HomePageXPath homePageXPath = new HomePageXPath(driver);
                    actions.click(homePageXPath.getBtn_HASTE_CLIENTE());
                    waits.timeOutImplicitWaitHorTwo(driver);
                    actions.click(homePageXPath.getBtn_QUIERO_HACERME_CLIENTE());
        return homePageXPath;
    }
    public HomePageCssLlenarForm Method_Llenado_Formulario_Hazte_Cliente() {
            HomePageCssLlenarForm homePageCssLlenarForm = new HomePageCssLlenarForm(driver);
            HomePageXPath homePageXPath = new HomePageXPath(driver);
                actions.sendKeys(homePageCssLlenarForm.txtbx_CODIGOP_PROMOCIONAL, "123456");
                actions.scrollDown(driver);
                actions.sendKeys(homePageCssLlenarForm.txtbx_NOMBRE, "QA");
                actions.sendKeys(homePageCssLlenarForm.txtbx_1ER_APELLIDO, "test");
                actions.sendKeys(homePageCssLlenarForm.txtbx_2DO_APELLIDO, "aseguramiento");
                actions.scrollDown(driver);
                actions.sendKeys(homePageCssLlenarForm.txtbx_DD, "18");
                actions.sendKeys(homePageCssLlenarForm.txtbx_MM, "01");
                actions.sendKeys(homePageCssLlenarForm.txtbx_AAAA, "1987");
        assertEquals("https://www.openbank.es/hazte-cliente?language=es",driver.
                getCurrentUrl(),"La url es correcta " + driver.getCurrentUrl());
        assertEquals("Cuenta Corriente + Tarjeta Open Debit",homePageXPath.
                getLbl_CUENTA_CORRIENTE().getText(),"Si se encuentra visible la etiqueta correcta");
        assertEquals("Completa tus datos personales.",homePageXPath.
                getLbl_COMPLETAR_DATOS_PERSONALES().getText(),"Si se encuentra visible la etiqueta de datos personales");
        return homePageCssLlenarForm;
    }
}
//