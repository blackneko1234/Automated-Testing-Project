package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.MainShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test19 extends MainSpeedyExecute {
    public Test19(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);
            logger.debug("========= Test edit data in diagnosis page =========");

            call.CallWebElementEditPage(driver);
            MainShortcut.DeleteText(call.getFullName(driver));
            call.getFullName(driver).sendKeys("TestForTestCase19");

            MainShortcut.DeleteText(call.getHN());
            call.getHN().sendKeys("1234");
            call.getGender().click();
            call.getFemaleOrMonth(driver).click();

            MainShortcut.DeleteText(call.getAge(driver));
            call.getAge(driver).sendKeys("10");
            call.getAgeUnit().click();
            call.getFemaleOrMonth(driver).click();
            call.getAge(driver).sendKeys("10");

            call.CallWebElementDiagnosisPage(driver);
            MainShortcut.DeleteText(call.getBP1());
            call.getBP1().sendKeys("3");

            MainShortcut.DeleteText(call.getBP2());
            call.getBP2().sendKeys("3");
            call.getInfection().click();
            call.getFastTrack(driver).click();
            call.getSubmit().click();
            logger.info("Pass: Edit patient in diagnosis page successfully");

            logger.debug("========= Show time when save in patient treatment that save from diagnose page =========");
            String CurrentTime = java.time.LocalTime.now().toString().substring(0, 5);
            System.out.println(CurrentTime);
            if (call.getTreatTime(driver).getText().equals(CurrentTime)) {
                logger.info("Pass: Current time in the website is match to the real current time");
            } else {
                logger.error("Fail: Current time in the website is not match to the real current time");
            }

            Thread.sleep(1000);
            logger.debug("========= Status color changed to red when activated fast protocol =========");
            driver.navigate().back();

            System.out.println(call.getPatientStatusBar(driver).getCssValue("background-color"));
            if (call.getPatientStatusBar(driver).getCssValue("background-color").equals("rgba(255, 94, 94, 1)")) {
                logger.info("Pass: The status bar color changed to red");
            } else {
                logger.error("Fail: The status bar color not changed to red");
            }

            Thread.sleep(1000);
            logger.debug("========= Status changed to 'Waiting for treatment' =========");
            if (call.getPatientStatus(driver).getText().equals("Waiting for treatment")) {
                logger.info("Pass: Status changed to Waiting for treatment");
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
