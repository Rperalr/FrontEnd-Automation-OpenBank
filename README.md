## Validación WebUI / OpenBank)

Este proyecto nos sirve para una regresión de una nueva solicitud de nuevo cliente:

- JUnit (Unit Testing)
- Selenium Web Driver
- Java POO (POM)

## Getting Started

1. Clone the repository:

bash
(https://github.com/Rperalr/FrontEnd-Automation-OpenBank/tree/QA_DEV)
cd FrontEnd-Automation-OpenBank

2. Run tests with Maven:

bash
mvn clean install

mvn test

##  Project Structure

Arquitectura Java WebUI - Selenium Web Driver With Junit -  
- Junit
- ExtentReport
- utils
- videoRecorder
- log4j
- POM
- Driver - (chrome,firefox,edge,opera)
- Selenium actions
- Apache Poi
- Screenshot
  
                WebUI-OpenBank/
          ├── logs/
          ├── src/
          │   └── main/
          │       └── java/
          │           ├── ExtentRepor/
          │           ├── implements/
          │           ├── interfaces/
          │           ├── uitlsFunctions/
          │           └── Base/
          │               ├── Instances/
          │               └── UitlsBase/
          ├── Test/
          │   ├── Ashot/
          │   ├── ExtentRepor/
          │   └── Java/
          │       ├── PageModel/
          │       ├── PageModelMethods/
          │       └── Test/
          ├── resources/
          │   ├── .XML/
          │   ├── .pom/
          │   ├── .log4j/
          │   ├── .readme/
          │   └── .gitignore/
  
##  Ejemplo de Test Java POO (Selenium WebUI - Methods)
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

##  Ejemplo de Test Java POO (Selenium WebUI - Locators)
  @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-middle-topbar > div.ok-middle-topbar__block > div.products-area > ul > li:nth-child(1) > span")
        private WebElement btnModulos_MENU_PRODUCTOS;
        
            @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-middle-topbar > div.ok-middle-topbar__block > div.products-area > ul > li:nth-child(1) > div > div > div > div.products-selector__items > ul > li.products-selector__list__item.products-    selector__list__item--active > div > span.products-selector__list__item__text")
            private WebElement btnMenuPrincipal_CUENTAS;
                //getters
                public WebElement getBtnModulos_MENU_PRODUCTOS() {
                return btnModulos_MENU_PRODUCTOS;
                }
                public WebElement getBtnMenuPrincipal_CUENTAS() {
                return btnMenuPrincipal_CUENTAS;
                }


##  Ejemplo de Test Java POO (Selenium WebUI - Test - Junit)
@Test
    public void TestCss() throws Exception {
        this.createFireFox();
            this.getUrl(OPENBANK_URL_WEBUI);
            
                HomePageXPath page = new HomePageXPath(driver);
                Methods methods = new Methods(driver);
                ScreenshotElementUtil screenshotElementUtil = new ScreenshotElementUtil();

        this.createReportHtml("Test Smoke");
            try {
                    page.aceptarCookies();
                    methods.Method_Css();

            this.test.log(Status.PASS, "Test fue exitoso");
        } catch (Exception e) {
            this.test.log(Status.FAIL, "Test falló: " + e.getMessage());
        }
        ScreenshotUtils.takeScreenshot(driver, PATH_ASHOT + NAME_ASHOOT + TIME_STAMP + ".jpg");

    }
}

