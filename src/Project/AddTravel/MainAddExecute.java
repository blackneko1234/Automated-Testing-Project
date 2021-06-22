package Project.AddTravel;

import Project.ProjectManager;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class MainAddExecute extends ProjectManager {
    public AddElement call = new AddElement();

    public MainAddExecute(String browser) {
        super(browser);
    }

    public MainAddExecute(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        driver.get("https://add-travel-webapp-dev-5kgsxuoalq-as.a.run.app/");
    }

    @Override
    public String getCaseName(int TestNumber) {
        return AddTestCaseName.TestCaseList[TestNumber - 1];
    }

    @Override
    public void TestRun(ArrayList<String> NumSet) {
        try {
            for (int i = 1; i <= Collections.max(getIntegerArray(NumSet)); i++) {
                if (NumSet.contains(String.valueOf(i))) {
                    Method InstanceMethod = AddTestMethod.class.getMethod("Test" + i);
                    var CallMethod = new AddTestMethod(Browser);
                    InstanceMethod.invoke(CallMethod);
                }
            }
        } catch (Exception ignored) {

        }
    }

    @Override
    public void ExitWebDriver(String TestCaseName) {
        //AddShortcut.Logout(driver);
        ProjectQuit(TestCaseName);
    }
}