package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.MainShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test30 extends MainSpeedyExecute {
    public Test30(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.DispositionPage(driver, call);
            call.CallWebElementDispositionPage(driver);

            MainShortcut.DeleteText(call.getFullName(driver));
            call.getFullName(driver).sendKeys("Automated Test by DJ");

            MainShortcut.DeleteText(call.getHN());
            call.getHN().sendKeys("1212312121");

            call.getGender().click();
            call.getFemaleOrMonth(driver).click();

            MainShortcut.DeleteText(call.getAge(driver));
            call.getAge(driver).sendKeys("10");

            call.getAgeUnit().click();
            call.getFemaleOrMonth(driver).click();

            MainShortcut.DeleteText(call.getAge(driver));
            call.getAge(driver).sendKeys("10");

            logger.info("Pass: Patient information can edit");
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
