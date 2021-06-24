package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test13 extends MainSpeedyExecute {
    public Test13(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            call.CallWebElementAssessPage(driver);
            call.getSubmit().click();

            Thread.sleep(1000);
            driver.navigate().back();

            if (call.getPatientStatus(driver).getText().equals("Waiting for diagnose")) {
                logger.info("Pass: Status changed to Waiting for diagnose");
            } else {
                logger.error("Fail: Status not changed");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
