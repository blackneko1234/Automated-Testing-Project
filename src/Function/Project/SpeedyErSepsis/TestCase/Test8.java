package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;

public class Test8 extends MainSpeedyExecute {
    public Test8(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.AddCardPage(driver, call);

            String getUrl = driver.getCurrentUrl();
            if (getUrl.equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/add")) {
                call.CallWebElementAddPage(driver);
                call.getAge(driver).sendKeys("-1000");
                if (Integer.parseInt(call.getAge(driver).getAttribute("value")) > 0) {
                    logger.info("Pass: Age (Year) is positive");
                } else {
                    logger.error("Fail: Age (Year) is negative");
                }
                call.getAge(driver).clear();

                call.getAgeUnit().click();

                call.getFemaleOrMonth(driver).click();

                call.getAge(driver).sendKeys("-1000");
                if (Integer.parseInt(call.getAge(driver).getAttribute("value")) > 0) {
                    logger.info("Pass: Age (Month) is positive");
                } else {
                    logger.error("Fail: Age (Month) is negative or not more than 0");
                }
                call.getTemp(driver).sendKeys("-10000");
                if (Integer.parseInt(call.getTemp(driver).getAttribute("value")) > 0) {
                    logger.info("Pass: Temp is positive");
                } else {
                    logger.error("Fail: Temp is negative or not more than 0");
                }
                call.getPR(driver).sendKeys("-900");
                if (Integer.parseInt(call.getPR(driver).getAttribute("value")) > 0) {
                    logger.info("Pass: PR is positive");
                } else {
                    logger.error("Fail: PR is negative");
                }
                call.getRR(driver).sendKeys("-900");
                if (Integer.parseInt(call.getRR(driver).getAttribute("value")) > 0) {
                    logger.info("Pass: RR is positive");
                } else {
                    logger.error("Fail: RR is negative");
                }
                call.getBP1(driver).sendKeys("-900");
                if (Integer.parseInt(call.getBP1(driver).getAttribute("value")) > 0) {
                    logger.info("Pass: BP1 is positive");
                } else {
                    logger.error("Fail: BP1 is negative");
                }
                call.getBP2(driver).sendKeys("-900");
                if (Integer.parseInt(call.getBP2(driver).getAttribute("value")) > 0) {
                    logger.info("Pass: BP2 is positive");
                } else {
                    logger.error("Fail: BP2 is negative");
                }
                call.getO2SAT(driver).sendKeys("-900");
                if (Integer.parseInt(call.getO2SAT(driver).getAttribute("value")) > 0) {
                    logger.info("Pass: O2SAT is positive");
                } else {
                    logger.error("Fail: O2SAT is negative");
                }
                call.getO2Th().sendKeys("-910");
                if (Integer.parseInt(call.getO2Th().getAttribute("value")) > 0) {
                    logger.info("Pass: O2Th is positive");
                } else {
                    logger.error("Fail: O2Th is negative");
                }
            } else {
                logger.error("Fail: Cannot access to the add page");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
