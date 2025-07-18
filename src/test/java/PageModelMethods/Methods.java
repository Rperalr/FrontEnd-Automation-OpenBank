package PageModelMethods;
import PageModel.HomePageCss;
import PageModel.HomePageXPath;
import base.utilsBase.BasePage;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Methods extends BasePage {

    /**
     * Constructor for the BasePage class.
     * Initializes the WebDriver instance and sets up the PageFactory
     * to initialize the WebElements declared in the page object.
     *
     * @param driver the WebDriver instance used to interact with the web page
     */
    public Methods(WebDriver driver) {
        super(driver);
    }

    public HomePageXPath Method_Xpath() {
        HomePageXPath homePageXPath = new HomePageXPath(driver);
            actions.click(homePageXPath.getBtn_HASTE_CLIENTE());
            waits.timeOutImplicitWaitHorTwo(driver);
            actions.click(homePageXPath.getBtn_QUIERO_HACERME_CLIENTE());
            waits.timeOutImplicitWaitHorTwo(driver);
                actions.scrollDown(driver);
                actions.click(homePageXPath.getTxbx_SELECIONAR_PAIS());
                waits.timeOutImplicitWaitMilTwo(driver);
                actions.selectByVisibleText(homePageXPath.getTxbx_SELECIONAR_PAIS(),"España");

            assertEquals("https://www.openbank.es/hazte-cliente?language=es",driver.
                    getCurrentUrl(),"La url es correcta " + driver.getCurrentUrl());
            assertEquals("Cuenta Corriente + Tarjeta Open Debit",homePageXPath.
                    getLbl_CUENTA_CORRIENTE().getText(),"Si se encuentra visible la etiqueta correcta");
            assertEquals("Completa tus datos personales.",homePageXPath.
                    getLbl_COMPLETAR_DATOS_PERSONALES().getText(),"Si se encuentra visible la etiqueta de datos personales");

        return homePageXPath;
    }

    public HomePageCss Method_Css() {
        HomePageCss homePageCss = new HomePageCss(driver);
            actions.moveTo(homePageCss.getBtnModulos_MENU_PRODUCTOS(),driver);
            waits.timeOutImplicitWaitHorTwo(driver);
                    actions.moveTo(homePageCss.getBtnSubMenu_PROMOCIONES(),driver);
                    actions.moveTo(homePageCss.getBtnSubMenu_CONOCE_OPENBANK(),driver);
                    actions.click(homePageCss.getBtnSubMenu_BLOG());

            assertEquals("https://www.openbank.es/open-to-learn",driver.
                     getCurrentUrl(),"La url es correcta " + driver.getCurrentUrl());
            assertEquals("España - ES",homePageCss
                     .getBtn_PAIS_ORIGEN_LANDING().getText(),"Si se encuentra visible el Boton de pais origen en la Landind OpenBank");

        return homePageCss;
    }
}
