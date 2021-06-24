package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;

public class Test3 extends MainSpeedyExecute {
    public Test3(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.AddCardPage(driver, call);

            //Add patient
            call.CallWebElementAddPage(driver);

            call.getFullName(driver).sendKeys("Automated Test By DJ");
            call.getHN().sendKeys("1234");
            call.getGender().click();

            call.getMaleOrYear(driver).click();

            call.getAge(driver).sendKeys("999");
            call.getAgeUnit().click();

            call.getMaleOrYear(driver).click();

            call.getTemp(driver).sendKeys("999");
            call.getPR(driver).sendKeys("300");
            call.getRR(driver).sendKeys("100");
            call.getBP1(driver).sendKeys("1");
            call.getBP2(driver).sendKeys("2");
            call.getO2SAT(driver).sendKeys("100");
            call.getO2Th().sendKeys("1");
            call.getFever().click();
            call.getSuspected().click();
            call.getHistory().click();
            call.getVoice().click();
            call.getSubmit().click();
            logger.info("Pass: Add patient successfully");

        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }

        ExitWebDriver(TestCaseName);
    }
}
