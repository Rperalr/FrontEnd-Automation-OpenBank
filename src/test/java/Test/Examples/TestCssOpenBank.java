package Test.Examples;

import PageModel.HomePageXPath;
import PageModelMethods.MethodsCss;
import actionsSeleniumWd.utilsFunctions.ScreenshotElementUtil;
import actionsSeleniumWd.utilsFunctions.ScreenshotUtils;
import base.utilsBase.BaseTest;
import com.aventstack.extentreports.Status;
import org.junit.Test;

import static base.utilsBase.Constant.*;

public class TestCssOpenBank extends BaseTest {
    /* Estructura de pruebas en Junit
                  1.-Datos de Entrada
                  2.-Cuerpo de la Prueba
                  3.-Resultado de la Prueba
                  4.-Clear de la Prueba
    */
    @Test
    public void TestCss() throws Exception {
        this.createFireFox();
            this.getUrl(OPENBANK_URL_WEBUI);
                HomePageXPath page = new HomePageXPath(driver);
                MethodsCss methods = new MethodsCss(driver);
                ScreenshotElementUtil screenshotElementUtil = new ScreenshotElementUtil();

        this.createReportHtmlTest("Test Smoke - Landing Page OpenBank");
            try {
                    page.MethodaceptarCookies();
                    methods.Method_Css();

            this.test.log(Status.PASS, "Test fue exitoso");
        } catch (Exception e) {
            this.test.log(Status.FAIL, "Test falló: " + e.getMessage());
        }
        ScreenshotUtils.takeScreenshot(driver, PATH_ASHOT + NAME_ASHOOT + TIME_STAMP + ".jpg");

    }
}