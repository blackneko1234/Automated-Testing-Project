package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test27 extends MainSpeedyExecute {
    public Test27(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            call.getCriticalCareNotification(driver).click();
            call.CallWebElementTreatmentPage(driver);
            call.getSubmit().click();

            if (call.getMecritShow(driver).getText().equals("Mecrit Notified")) {
                logger.info("Pass: Mecrit Notified is show now");
            } else {
                logger.error("Fail: Mecrit Notified is not show");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
