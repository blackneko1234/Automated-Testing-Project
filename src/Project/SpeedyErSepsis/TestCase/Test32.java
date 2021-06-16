package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test32 extends MainSpeedyExecute {
    public Test32(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.DispositionPage(driver, call);
            Thread.sleep(1000);
            call.getCancelDisposition(driver).click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/dashboard")) {
                logger.info("Pass: Current patient status is \"" + call.getPatientStatus(driver).getText() + "\"");
            } else {
                logger.error("Fail: cannot access to the dashboard page");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
