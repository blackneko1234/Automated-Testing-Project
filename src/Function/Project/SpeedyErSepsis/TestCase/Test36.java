package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test36 extends MainSpeedyExecute {
    public Test36(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.DispositionPage(driver, call);
            if (driver.getCurrentUrl().equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/disposition")) {
                logger.info("Pass: Can access to the disposition page");
            } else {
                logger.error("Fail: Cannot access to the disposition page");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
