package Project;

import WebDriver.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public abstract class ProjectManager {
    public WebDriverManager driverManager;
    public WebDriver driver;
    public String Browser;
    protected static Logger logger = Logger.getLogger("Test");

    public ProjectManager(String browser) {
        this.Browser = browser;
    }

    public ProjectManager(String browser, String TestCaseName) {
        logger.debug(">>>>>>>>>>>>>>> TestCase_" + TestCaseName + " <<<<<<<<<<<<<<< \n");
        this.Browser = browser;
        CallAndStartWebDriver(Browser);
    }

    public abstract String getCaseName(int TestNumber);

    public abstract void TestRun(ArrayList<String> NumSet);

    public abstract void CallAndStartWebDriver(String Browser);

    public abstract void ExitWebDriver(String TestCaseName);

    public abstract ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray);
}
