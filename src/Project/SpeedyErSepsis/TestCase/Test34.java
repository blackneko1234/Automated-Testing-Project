package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test34 extends MainSpeedyExecute {
    public Test34(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.login(driver);
            try {
                if (call.getStatusAssess(driver).isDisplayed()
                        && call.getStatusDiagnose(driver).isDisplayed()
                        && call.getStatusTreatment(driver).isDisplayed()
                        && call.getStatusTreating(driver).isDisplayed()
                        && call.getStatusArchived(driver).isDisplayed()) {
                    logger.info("Pass: All patient status has been show");
                }
            } catch (Exception e) {
                logger.error("Fail: Patient status not show all");
            }

        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
