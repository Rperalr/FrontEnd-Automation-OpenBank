package base.instances;

import org.openqa.selenium.WebDriver;

public class BasePageIntance  extends BaseTestInstance{

    /**
     * The WebDriver instance used to interact with the web browser.
     * This is protected to allow access within the same package or subclasses.
     */
    public static WebDriver driver;
}
