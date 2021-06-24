package Function.Project.SpeedyErSepsis;

import Function.Project.ProjectManager;

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
        driver.get("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/signIn");
    }

    @Override
    public String getCaseName(int TestNumber) {
        return SpeedyTestCaseName.TestCaseList[TestNumber - 1];
    }

    @Override
    public void TestRun(ArrayList<String> NumSet) {
        try {
            for (int i = 1; i <= Collections.max(getIntegerArray(NumSet)); i++) {
                if (NumSet.contains(String.valueOf(i))) {
                    Method InstanceMethod = SpeedyTestMethod.class.getMethod("Test" + i);
                    var CallMethod = new SpeedyTestMethod(Browser);
                    InstanceMethod.invoke(CallMethod);
                }
            }
        } catch (Exception ignored) {

        }
    }

    @Override
    public void ExitWebDriver(String TestCaseName) {
        SpeedyShortcut.Logout(driver);
        ProjectQuit(TestCaseName);
    }
}