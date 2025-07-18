package base.utilsBase;

import actionsSeleniumWd.utilsFunctions.ExtentManager;
import actionsSeleniumWd.utilsFunctions.Rdriver;
import actionsSeleniumWd.utilsFunctions.VideoRecorder;
import base.instances.BaseTestInstance;
import org.junit.After;
import org.junit.Before;


public class BaseTest extends BaseTestInstance {

    /**
     * Sets up the WebDriver for the test execution.
     * This method initializes the ExtentManager for reporting,
     * creates a Firefox WebDriver instance, and navigates to the specified URL.
     *
     * @throws Exception if an error occurs during the setup process.
     */
    @Before
    public void setUpDriver() throws Exception {
            this.extentManager();

    }

    /**
     * This method is executed after the test suite has completed.
     * It ensures that the extent report is properly flushed and closed.
     *
     * @throws Exception if an error occurs during the flushing or closing of the report.
     */
    @After
    public void closeExtent() throws Exception {
            this.extenFlush();
                     this.close();
        //System.out.println("No existe reporte Web");
    }

    /**
     * Initializes the extent report manager by retrieving the extent instance
     * from the ExtentManager. This method does not return any value.
     */
    private void extentManager()
    {
            this.ExtentManager();
            return;
    } private void ExtentManager(){
            extent = ExtentManager.getExtent();
        return;
    }

    /**
     * Starts the video recording process.
     * This method initializes and begins the recording using the VideoRecorder.
     *
     * @throws Exception if an error occurs during the recording process.
     */
    private void startRecording() throws Exception {
            VideoRecorder.startRecording();
        return;
    }

    /**
     * Stops the video recording process.
     *
     * @throws Exception if an error occurs while stopping the recording.
     */
    private void stopRecording() throws Exception {
            VideoRecorder.stopRecording();
        return;
    }

    /**
     * Creates a Firefox WebDriver instance.
     *
     * This method initializes the `driver` object based on the provided options.
     * If `optionsDriver` is null, it creates an Edge WebDriver instance using the
     * specified driver path. Otherwise, it creates a Firefox WebDriver instance
     * with the specified driver path and additional options.
     *
     * @throws Exception if an error occurs during the WebDriver creation process.
     */
    public void createEdgeDriver() throws Exception
    {
            this.CreateEdgeDriver();
        return;
    } private void CreateEdgeDriver() throws Exception {
        if (optionsDriver == null)
            driver = Rdriver.CreateEdgeDriver(Constantes.DRIVER_PATH);
        return;
    } public void createFireFox() throws Exception {
        if (optionsDriver == null)
            driver = Rdriver.CreateFireFox(Constantes.DRIVER_PATH,true);
        return;
    } public void createChrome() throws Exception {
        if (optionsDriver == null)
            driver = Rdriver.CreateChromeDriver(Constantes.DRIVER_PATH,true);
        return;
    }public void createOpera() throws Exception {
        if (optionsDriver == null)
            driver = Rdriver.CreateOperaDriver(Constantes.DRIVER_PATH,true);
        return;
    }
    /**
     * Opens a specified URL in the web browser, maximizes the browser window,
     * starts video recording of the session, and logs the initialization message.
     *
     * @throws Exception if an error occurs during the execution of the actions.
     */
    protected void maximize() throws Exception
    {
                 this.Maximize();
                 this.startRecording();
        return;
    } private void Maximize() throws Exception {
                actions.maximize(driver);
        return;
    }

    /**
     * Navigates to the specified URL defined in the Constant.TOOLS_QA variable
     * using the provided WebDriver instance.
     *
     * @throws Exception if an error occurs during the URL navigation process.
     */
    public void getUrl(String url) throws Exception
    {
            this.GetUrl(url);
            this.maximize();
        return;
    } public void GetUrl(String url) throws Exception {
            actions.getUrl(url, driver);
        return;
    }

    /**
     * Flushes the extent report to ensure that all the logged information
     * is written to the report file. This method should be called after
     * all test information has been logged to finalize the report.
     */
    private void extenFlush()
    {
            this.ExtenFlush();
        return;

    } private void ExtenFlush(){
            extent.flush();
        return;
    }
    public void createReportHtml(String nameReport) throws Exception {
        test = extent.createTest(nameReport);//
    }
    /**
     * Closes the resources used during the execution of the program.
     *
     * This method stops the video recording if it is in progress and quits the
     * WebDriver instance if it is not null. It ensures proper cleanup of resources
     * to avoid memory leaks or other issues.
     *
     * @throws Exception if an error occurs while stopping the video recording
     *                   or quitting the WebDriver.
     */
    private void close() throws Exception
    {
            this.stopRecording();
            this.Close();

        return;
    } private void Close() throws Exception {
        this.stopRecording();
        if (driver != null) {
            driver.close();
        }
        return;
    }
}