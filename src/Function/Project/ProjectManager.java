package Function.Project;

import Function.WebDriver.WebDriverFactory;
import Function.WebDriver.WebDriverManager;
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
        DriverSet();
    }

    public ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String stringValue : stringArray) {
            result.add(Integer.parseInt(stringValue));
        }
        return result;
    }

    public void ProjectQuit(String TestCaseName) {
        logger.debug(">>>>>>>>>>>>>>> End TestCase_" + TestCaseName + " <<<<<<<<<<<<<<< \n");
        driverManager.quitDriver();
    }

    public void DriverSet() {
        driverManager = WebDriverFactory.getBrowser(Browser);
        driver = driverManager.getDriver();
    }

    public abstract String getCaseName(int TestNumber);

    public abstract void TestRun(ArrayList<String> NumSet);

    public abstract void ExitWebDriver(String TestCaseName);

}