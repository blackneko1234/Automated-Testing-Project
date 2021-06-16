package Project.SpeedyErSepsis;

import Project.ProjectManager;
import WebDriver.WebDriverFactory;
import WebDriver.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class MainSpeedyExecute extends ProjectManager {
    public WebDriverManager driverManager;
    public WebDriver driver;
    public String Browser;
    public SpeedyElement call = new SpeedyElement();
    protected static Logger logger = Logger.getLogger(MainSpeedyExecute.class);


    public MainSpeedyExecute(String browser) {
        this.Browser = browser;
    }

    public MainSpeedyExecute(String browser, String TestCaseName) {
        logger.debug(">>>>>>>>>>>>>>> TestCase_" + TestCaseName + " <<<<<<<<<<<<<<< \n");
        this.Browser = browser;
        CallAndStartWebDriver(Browser);
    }

    @Override
    public void TestRun(ArrayList<String> NumSet) {
        try {
            for (int i = 1; i <= Collections.max(getIntegerArray(NumSet)); i++) {
                if (NumSet.contains(String.valueOf(i))) {
                    Method InstanceMethod = SpeedyTestMethod.class.getMethod("Test" + i);
                    SpeedyTestMethod CallMethod = new SpeedyTestMethod(Browser);
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
        driver.get("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/signIn");
    }

    @Override
    public void ExitWebDriver(String TestcaseName) {
        SpeedyShortcut.Logout(driver);
        logger.debug(">>>>>>>>>>>>>>> End TestCase_" + TestcaseName + " <<<<<<<<<<<<<<< \n");
        driverManager.quitDriver();
    }

    @Override
    public String getCaseName(int TestNumber) {
        return SpeedyTestCaseName.TestCaseList()[TestNumber - 1];
    }

    @Override
    public ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (String stringValue : stringArray) {
            result.add(Integer.parseInt(stringValue));
        }
        return result;
    }
}
