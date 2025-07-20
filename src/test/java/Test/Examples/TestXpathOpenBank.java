package Test.Examples;

import PageModel.HomePageXPath;
import PageModelMethods.MethodsXpath;
import actionsSeleniumWd.utilsFunctions.ScreenshotElementUtil;
import actionsSeleniumWd.utilsFunctions.ScreenshotUtils;
import com.aventstack.extentreports.Status;
import base.utilsBase.BaseTest;
import org.junit.Test;


import static base.utilsBase.Constant.*;

public class TestXpathOpenBank extends BaseTest {
    /* Estructura de pruebas en Junit
                  1.-Datos de Entrada
                  2.-Cuerpo de la Prueba
                  3.-Resultado de la Prueba
                  4.-Clear de la Prueba
    */
    @Test
    public void TestXpath() throws Exception {
       this.createFireFox();
          this.getUrl(OPENBANK_URL_WEBUI);
                 HomePageXPath page = new HomePageXPath(driver);
                 MethodsXpath methods = new MethodsXpath(driver);
                 ScreenshotElementUtil screenshotElementUtil = new ScreenshotElementUtil();

          this.createReportHtmlTest("Test - Solicitud - Hazte Cliente");
            try {
                    page.aceptarCookies();
                    methods.Method_Xpath_Hazte_Cliente();
                    methods.Method_Llenado_Formulario_Hazte_Cliente();

           this.test.log(Status.PASS, "Test fue exitoso");
       } catch (Exception e) {
            this.test.log(Status.FAIL, "Test falló: " + e.getMessage());
      }
       screenshotElementUtil.captureElementScreenshot(driver, page.getLbl_COMPLETAR_DATOS_PERSONALES(), ALLPATH_ASHOT_ELEMENT_WEB);
       ScreenshotUtils.takeScreenshot(driver, PATH_ASHOT + NAME_ASHOOT + TIME_STAMP + ".jpg");

    }
}