package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.SpeedyShortcut;
import Project.SpeedyErSepsis.MainSpeedyExecute;

public class Test7 extends MainSpeedyExecute {
    public Test7(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.AddCardPage(driver, call);

            String getUrl = driver.getCurrentUrl();
            if (getUrl.equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/add")) {
                call.CallWebElementAddPage(driver);
                call.getAgeUnit().click();

                call.getMaleOrYear(driver).click();

                call.getAge(driver).sendKeys("99999");
                if (call.getAge(driver).getAttribute("value").equals("999")) {
                    logger.info("Pass: Age (Year) is not breakout the limit");
                } else {
                    logger.error("Fail: Age (Year) is breakout the limit");
                }
                call.getAge(driver).clear();

                call.getAgeUnit().click();

                call.getFemaleOrMonth(driver).click();

                call.getAge(driver).sendKeys("99999");
                if (call.getAge(driver).getAttribute("value").equals("12")) {
                    logger.info("Pass: Age (Month) is not breakout the limit");
                } else {
                    logger.error("Fail: Age (Month) is breakout the limit");
                }

                call.getTemp(driver).sendKeys("9999");
                if (call.getTemp(driver).getAttribute("value").equals("100")) {
                    logger.info("Pass: Temp is not breakout the limit");
                } else {
                    logger.error("Fail: Temp is breakout the limit");
                }
                call.getPR(driver).sendKeys("30099");
                if (call.getPR(driver).getAttribute("value").equals("300")) {
                    logger.info("Pass: PR is not breakout the limit");
                } else {
                    logger.error("Fail: PR is breakout the limit");
                }
                call.getRR(driver).sendKeys("10099");
                if (call.getRR(driver).getAttribute("value").equals("100")) {
                    logger.info("Pass: RR is not breakout the limit");
                } else {
                    logger.error("Fail: RR is breakout the limit");
                }
                call.getBP1(driver).sendKeys("1999");
                if (call.getBP1(driver).getAttribute("value").equals("999")) {
                    logger.info("Pass: BP1 is not breakout the limit");
                } else {
                    logger.error("Fail: BP1 is breakout the limit");
                }
                call.getBP2(driver).sendKeys("29999");
                if (call.getBP2(driver).getAttribute("value").equals("999")) {
                    logger.info("Pass: BP2 is not breakout the limit");
                } else {
                    logger.error("Fail: BP2 is breakout the limit");
                }
                call.getO2SAT(driver).sendKeys("1099");
                if (call.getO2SAT(driver).getAttribute("value").equals("100")) {
                    logger.info("Pass: O2SAT is not breakout the limit");
                } else {
                    logger.error("Fail: O2SAT is breakout the limit");
                }
                call.getO2Th().sendKeys("1999");
                if (call.getO2Th().getAttribute("value").equals("15")) {
                    logger.info("Pass: O2Th is not breakout the limit");
                } else {
                    logger.error("Fail: O2Th is breakout the limit");
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
