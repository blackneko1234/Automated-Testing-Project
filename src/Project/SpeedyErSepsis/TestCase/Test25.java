package Project.SpeedyErSepsis.TestCase;

import Project.MainShortcut;
import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test25 extends MainSpeedyExecute {
    public Test25(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            call.CallWebElementEditPage(driver);
            MainShortcut.DeleteText(call.getFullName(driver));
            call.getFullName(driver).sendKeys("AutomatedTest Edited by DJ");

            MainShortcut.DeleteText(call.getHN());
            call.getHN().sendKeys("1234");

            MainShortcut.DeleteText(call.getAge(driver));
            call.getAge(driver).sendKeys("1234");

            call.getGender().click();
            call.getFemaleOrMonth(driver).click();

            call.getAgeUnit().click();
            call.getFemaleOrMonth(driver).click();

            MainShortcut.DeleteText(call.getAge(driver));
            call.getAge(driver).sendKeys("12");

            logger.info("Pass: Patient information can edit");

        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
