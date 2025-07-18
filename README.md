## Validación WebUI / OpenBank)

Este proyecto nos sirve para una regresión de una nueva solicitud de nuevo cliente:

- JUnit (Unit Testing)
- Selenium Web Driver
- Java POO (POM)

## Getting Started

1. Clone the repository:

bash
(https://github.com/Rperalr/FrontEnd-Automation-OpenBank/tree/QA_DEV)
cd Proyecto_OB

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
  
##  Ejemplo de Test Java POO (Selenium WebUI - Methods)

    public HomePageCss Method_Css() {
    HomePageCss homePageCss = new HomePageCss(driver);
        actions.maximize(driver);
        actions.sleep();
        actions.click(homePageCss.getBtnModulos_MENU_PRODUCTOS());
        waits.timeOutImplicitWaitHorTwo(driver);
        actions.click(homePageCss.getBtnMenuPrincipal_CUENTAS());
        waits.timeOutImplicitWaitHorTwo(driver);
        actions.click(homePageCss.getBtnSubMenu_PROMOCIONES());
        actions.scrollDown(driver);
            assertEquals("https://www.openbank.es/",driver.
            getCurrentUrl(),"La url es correcta " + driver.getCurrentUrl());
            assertEquals("España - ES",homePageCss
            .getBtn_PAIS_ORIGEN_LANDING().getText(),"Si se encuentra visible el Boton de pais origen en la Landind OpenBank");
    return homePageCss;
    }

##  Ejemplo de Test Java POO (Selenium WebUI - Locators)
    //Localizadores de los Elementos Web del Modelo de Pagina
        @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-middle-topbar > div.ok-middle-topbar__block > div.products-area > ul > li:nth-child(1) > span")
        private WebElement btnModulos_MENU_PRODUCTOS;
        @FindBy(how = How.CSS , css = "#navbar-wrapper > div.ok-topbar > div.ok-middle-topbar > div.ok-middle-topbar__block > div.products-area > ul > li:nth-child(1) > div > div > div > div.products-selector__items > ul > li.products-selector__list__item.products-selector__list__item--active > div > span.products-selector__list__item__text")
        private WebElement btnMenuPrincipal_CUENTAS;
            //getters
            public WebElement getBtnModulos_MENU_PRODUCTOS() {
            return btnModulos_MENU_PRODUCTOS;
            }
            public WebElement getBtnMenuPrincipal_CUENTAS() {
            return btnMenuPrincipal_CUENTAS;
            }
