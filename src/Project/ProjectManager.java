package Project;

import java.util.ArrayList;

public abstract class ProjectManager {
    public abstract String getCaseName(int index);

    public abstract void TestRun(ArrayList<String> NumSet);

    public abstract void CallAndStartWebDriver(String Browser);

    public abstract void ExitWebDriver(String TestCaseName);

    public abstract ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray);
}
