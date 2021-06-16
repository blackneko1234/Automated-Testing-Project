package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test23 extends MainSpeedyExecute {
    public Test23(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            call.getNote(driver).sendKeys("TestTestTestTestTest123456789");
            if (call.getNote(driver).getText().isEmpty()) {
                logger.error("Fail: Cannot type note");
            } else {
                logger.info("Pass: Can type note");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
