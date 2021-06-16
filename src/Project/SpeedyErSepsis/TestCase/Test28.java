package Project.SpeedyErSepsis.TestCase;

import Project.MainShortcut;
import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test28 extends MainSpeedyExecute {
    public Test28(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.DispositionPage(driver, call);

            call.getAdmitTimeDisposition(driver).click();
            MainShortcut.DeleteText(call.getAdmitTimeChangeDisposition(driver));
            call.getAdmitTimeChangeDisposition(driver).sendKeys("1111");

            call.getReferDisposition(driver).click();
            MainShortcut.DeleteText(call.getReferChangeDisposition(driver));
            call.getReferChangeDisposition(driver).sendKeys("1111");

            logger.info("Pass: Time in Admit and Refer can change");
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
