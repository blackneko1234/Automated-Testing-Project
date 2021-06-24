package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test21 extends MainSpeedyExecute {
    public Test21(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            call.CallWebElementTreatmentPage(driver);
            call.getSubmit().click();

            Thread.sleep(1000);

            if (call.getPatientStatus(driver).getText().equals("Treating")) {
                logger.info("Pass: Status changed to Treating");
            } else {
                logger.info("Fail: Status not changed");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
