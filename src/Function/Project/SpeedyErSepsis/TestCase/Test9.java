package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.MainShortcut;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;

public class Test9 extends MainSpeedyExecute {
    public Test9(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            call.CallWebElementEditPage(driver);

            MainShortcut.DeleteText(call.getHN());

            call.getHN().sendKeys("-1234");
            if (Integer.parseInt(call.getHN().getAttribute("value")) > 0) {
                logger.info("Pass: HN is positive");
            } else {
                logger.error("Fail: HN is negative");
            }

            MainShortcut.DeleteText(call.getAge(driver));

            call.getAge(driver).sendKeys("-100");
            if (Integer.parseInt(call.getAge(driver).getAttribute("value")) > 0) {
                logger.info("Pass: Age (Year) is positive");
            } else {
                logger.error("Fail: Age (Year) is negative or not more than 0");
            }

            call.getAgeUnit().click();

            call.getFemaleOrMonth(driver).click();

            MainShortcut.DeleteText(call.getAge(driver));
            call.getAge(driver).sendKeys("-100");
            if (Integer.parseInt(call.getAge(driver).getAttribute("value")) > 0) {
                logger.info("Pass: Age (Month) is positive");
            } else {
                logger.error("Fail: Age (Month) is negative or not more than 0");
            }

            call.CallWebElementAssessPage(driver);

            MainShortcut.DeleteText(call.getTemp(driver));
            call.getTemp(driver).sendKeys("-10");
            if (Integer.parseInt(call.getTemp(driver).getAttribute("value")) > 0) {
                logger.info("Pass: Temp is positive");
            } else {
                logger.error("Fail: Temp is negative");
            }

            MainShortcut.DeleteText(call.getPR(driver));
            call.getPR(driver).sendKeys("-1");
            if (Integer.parseInt(call.getPR(driver).getAttribute("value")) > 0) {
                logger.info("Pass: PR is positive");
            } else {
                logger.error("Fail: PR is negative");
            }

            MainShortcut.DeleteText(call.getRR(driver));
            call.getRR(driver).sendKeys("-9");
            if (Integer.parseInt(call.getRR(driver).getAttribute("value")) > 0) {
                logger.info("Pass: RR is positive");
            } else {
                logger.error("Fail: RR is negative");
            }

            MainShortcut.DeleteText(call.getBP1(driver));
            call.getBP1(driver).sendKeys("-9");
            if (Integer.parseInt(call.getBP1(driver).getAttribute("value")) > 0) {
                logger.info("Pass: BP1 is positive");
            } else {
                logger.error("Fail: BP1 is negative");
            }

            MainShortcut.DeleteText(call.getBP2(driver));
            call.getBP2(driver).sendKeys("-9");
            if (Integer.parseInt(call.getBP2(driver).getAttribute("value")) > 0) {
                logger.info("Pass: BP2 is positive");
            } else {
                logger.error("Fail: BP2 is negative");
            }

            MainShortcut.DeleteText(call.getO2SAT(driver));
            call.getO2SAT(driver).sendKeys("-9");
            if (Integer.parseInt(call.getO2SAT(driver).getAttribute("value")) > 0) {
                logger.info("Pass: O2SAT is positive");
            } else {
                logger.error("Fail: O2SAT is negative");
            }

            MainShortcut.DeleteText(call.getO2Th());
            call.getO2Th().sendKeys("-9");
            if (Integer.parseInt(call.getO2Th().getAttribute("value")) > 0) {
                logger.info("Pass: O2Th is positive");
            } else {
                logger.error("Fail: O2Th is negative");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
