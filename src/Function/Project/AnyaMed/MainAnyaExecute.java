package Function.Project.AnyaMed;

import Function.Project.ProjectManager;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class MainAnyaExecute extends ProjectManager {
    public AnyaElement call = new AnyaElement();

    public MainAnyaExecute(String browser) {
        super(browser);
    }

    public MainAnyaExecute(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        driver.get("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/signIn");
    }

    @Override
    public String getCaseName(int TestNumber) {
        return AnyaTestCaseName.TestCaseList[TestNumber - 1];
    }

    @Override
    public void TestRun(ArrayList<String> NumSet) {
        try {
            for (int i = 1; i <= Collections.max(getIntegerArray(NumSet)); i++) {
                if (NumSet.contains(String.valueOf(i))) {
                    Method InstanceMethod = AnyaTestMethod.class.getMethod("Test" + i);
                    var CallMethod = new AnyaTestMethod(Browser);
                    InstanceMethod.invoke(CallMethod);
                }
            }
        } catch (Exception ignored) {

        }
    }

    @Override
    public void ExitWebDriver(String TestCaseName) {
        //AnyaShortcut.Logout(driver);
        ProjectQuit(TestCaseName);
    }
}