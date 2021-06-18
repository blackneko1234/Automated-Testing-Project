package Project.AddTravel;

import Project.ProjectManager;
import WebDriver.WebDriverFactory;
import WebDriver.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class MainAddExecute extends ProjectManager {
    public WebDriverManager driverManager;
    public WebDriver driver;
    public String Browser;
    public AddElement call = new AddElement();
    protected static Logger logger = Logger.getLogger(MainAddExecute.class);

    public MainAddExecute(String browser) {
        this.Browser = browser;
    }

    public MainAddExecute(String browser, String TestCaseName) {
        logger.debug(">>>>>>>>>>>>>>> TestCase_" + TestCaseName + " <<<<<<<<<<<<<<< \n");
        this.Browser = browser;
        CallAndStartWebDriver(Browser);
    }

    @Override
    public String getCaseName(int TestNumber) {
        return AddTestCaseName.TestCaseList()[TestNumber - 1];
    }

    @Override
    public void TestRun(ArrayList<String> NumSet) {
        try {
            for (int i = 1; i <= Collections.max(getIntegerArray(NumSet)); i++) {
                if (NumSet.contains(String.valueOf(i))) {
                    Method InstanceMethod = AddTestMethod.class.getMethod("Test" + i);
                    AddTestMethod CallMethod = new AddTestMethod(Browser);
                    InstanceMethod.invoke(CallMethod);
                }
            }
        } catch (Exception ignored) {

        }
    }

    @Override
    public void CallAndStartWebDriver(String Browser) {
        driverManager = WebDriverFactory.getBrowser(Browser);
        driver = driverManager.getDriver();
        driver.get("https://add-travel-webapp-dev-5kgsxuoalq-as.a.run.app/");
    }

    @Override
    public void ExitWebDriver(String TestCaseName) {
        //AddShortcut.Logout(driver);
        logger.debug(">>>>>>>>>>>>>>> End TestCase_" + TestCaseName + " <<<<<<<<<<<<<<< \n");
        driverManager.quitDriver();
    }

    @Override
    public ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String stringValue : stringArray) {
            result.add(Integer.parseInt(stringValue));
        }
        return result;
    }
}