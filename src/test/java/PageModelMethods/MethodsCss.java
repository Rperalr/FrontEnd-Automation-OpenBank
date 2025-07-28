package PageModelMethods;
import PageModel.HomePageCss;
import PageModel.HomePageCssLlenarForm;
import PageModel.HomePageXPath;
import base.utilsBase.BasePage;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MethodsCss extends BasePage {

    /**
     * Constructor for the BasePage class.
     * Initializes the WebDriver instance and sets up the PageFactory
     * to initialize the WebElements declared in the page object.
     *
     * @param driver the WebDriver instance used to interact with the web page
     */
    public MethodsCss(WebDriver driver) {
        super(driver);
    }

    public HomePageCss Method_Css() {
            HomePageCss homePageCss = new HomePageCss(driver);
                actions.click(homePageCss.getBtnHome_SABER_MAS());
                actions.moveTo(homePageCss.getBtnModulos_MENU_CUENTAS(),driver);
                waits.timeOutImplicitWaitHorTwo(driver);
                actions.moveTo(homePageCss.getBtnSubMenu_TARJETAS(),driver);
                actions.moveTo(homePageCss.getBtnSubMenu_FINANCIACION(),driver);
                actions.click(homePageCss.getBtnSubMenu_BLOG());
        assertEquals("https://www.openbank.es/open-to-learn",driver.
                getCurrentUrl(),"La url es correcta " + driver.getCurrentUrl());
        assertEquals("España - ES",homePageCss.
                getBtn_PAIS_ORIGEN_LANDING().getText(),"Se encuentra visible el list en el Home de OpenBank");
    return homePageCss;

    }
}
