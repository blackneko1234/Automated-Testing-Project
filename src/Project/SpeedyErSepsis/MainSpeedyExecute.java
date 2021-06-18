package Project.SpeedyErSepsis;

import Project.ProjectManager;
import WebDriver.WebDriverFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class MainSpeedyExecute extends ProjectManager {
    public SpeedyElement call = new SpeedyElement();

    public MainSpeedyExecute(String browser) {
        super(browser);
    }

    public MainSpeedyExecute(String browser, String TestCaseName) {
        super(browser, TestCaseName);
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
    public void ExitWebDriver(String TestCaseName) {
        SpeedyShortcut.Logout(driver);
        logger.debug(">>>>>>>>>>>>>>> End TestCase_" + TestCaseName + " <<<<<<<<<<<<<<< \n");
        driverManager.quitDriver();
    }

    @Override
    public String getCaseName(int TestNumber) {
        return SpeedyTestCaseName.TestCaseList()[TestNumber - 1];
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
