package Project.SpeedyErSepsis.TestCase;

import Project.MainShortcut;
import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test16 extends MainSpeedyExecute {
    public Test16(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {

            SpeedyShortcut.getFirstCard(driver, call);

            call.CallWebElementEditPage(driver);
            MainShortcut.DeleteText(call.getAge(driver));
            call.getAgeUnit().click();

            call.getMaleOrYear(driver).click();
            call.getAge(driver).sendKeys("Test");
            if (call.getAge(driver).getAttribute("value").isEmpty()) {
                logger.info("Pass: Age (Year) cannot enter alphabet");
            } else {
                logger.error("Fail: Age (Year) can enter alphabet");
            }
            MainShortcut.DeleteText(call.getAge(driver));

            call.getAgeUnit().click();

            call.getFemaleOrMonth(driver).click();
            call.getAge(driver).sendKeys("Test");
            if (call.getAge(driver).getAttribute("value").isEmpty()) {
                logger.info("Pass: Age (Month) cannot enter alphabet");
            } else {
                logger.error("Fail: Age (Month) can enter alphabet");
            }

            call.CallWebElementDiagnosisPage(driver);
            MainShortcut.DeleteText(call.getBP1());
            call.getBP1().sendKeys("Test");
            if (call.getBP1().getAttribute("value").isEmpty() || call.getBP1().getAttribute("value").equals("0")) {
                logger.info("Pass: BP1 cannot enter alphabet");
            } else {
                logger.error("Fail: BP1 can enter alphabet");
            }

            call.CallWebElementDiagnosisPage(driver);
            MainShortcut.DeleteText(call.getBP2());
            call.getBP2().sendKeys("Test");
            if (call.getBP2().getAttribute("value").isEmpty() || call.getBP2().getAttribute("value").equals("0")) {
                logger.info("Pass: BP2 cannot enter alphabet");
            } else {
                logger.error("Fail: BP2 can enter alphabet");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
