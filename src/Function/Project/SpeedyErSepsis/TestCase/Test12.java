package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.MainShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test12 extends MainSpeedyExecute {
    public Test12(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {

            SpeedyShortcut.getFirstCard(driver, call);

            String getUrl = driver.getCurrentUrl();
            if (getUrl.equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/management")) {
                call.CallWebElementEditPage(driver);
                MainShortcut.DeleteText(call.getHN());

                call.getHN().sendKeys("Test");
                if (call.getHN().getAttribute("value").isEmpty()) {
                    logger.info("Pass: HN cannot input alphabet");
                } else {
                    logger.error("Fail: HN can input alphabet");
                }

                MainShortcut.DeleteText(call.getAge(driver));

                call.getAge(driver).sendKeys("Test");
                if (call.getAge(driver).getAttribute("value").isEmpty() || call.getAge(driver).getAttribute("value").equals("0")) {
                    logger.info("Pass: Age (Year) cannot input alphabet");
                } else {
                    logger.error("Fail: Age (Year) can input alphabet");
                }

                call.getAgeUnit().click();

                call.getFemaleOrMonth(driver).click();

                MainShortcut.DeleteText(call.getAge(driver));
                call.getAge(driver).sendKeys("Test");
                if (call.getAge(driver).getAttribute("value").isEmpty() || call.getAge(driver).getAttribute("value").equals("0")) {
                    logger.info("Pass: Age (Month) cannot input alphabet");
                } else {
                    logger.error("Fail: Age (Month) can input alphabet");
                }

                call.CallWebElementAssessPage(driver);

                MainShortcut.DeleteText(call.getTemp(driver));
                call.getTemp(driver).sendKeys("Test");
                if (call.getTemp(driver).getAttribute("value").isEmpty() || call.getTemp(driver).getAttribute("value").equals("0")) {
                    logger.info("Pass: Temp cannot input alphabet");
                } else {
                    logger.error("Fail: Temp can input alphabet");
                }

                MainShortcut.DeleteText(call.getPR(driver));
                call.getPR(driver).sendKeys("Test");
                if (call.getPR(driver).getAttribute("value").isEmpty() || call.getPR(driver).getAttribute("value").equals("0")) {
                    logger.info("Pass: PR cannot input alphabet");
                } else {
                    logger.error("Fail: PR can input alphabet");
                }

                MainShortcut.DeleteText(call.getRR(driver));
                call.getRR(driver).sendKeys("Test");
                if (call.getRR(driver).getAttribute("value").isEmpty() || call.getRR(driver).getAttribute("value").equals("0")) {
                    logger.info("Pass: RR cannot input alphabet");
                } else {
                    logger.error("Fail: RR can input alphabet");
                }

                MainShortcut.DeleteText(call.getBP1(driver));
                call.getBP1(driver).sendKeys("Test");
                if (call.getBP1(driver).getAttribute("value").isEmpty() || call.getBP1(driver).getAttribute("value").equals("0")) {
                    logger.info("Pass: BP1 cannot input alphabet");
                } else {
                    logger.error("Fail: BP1 can input alphabet");
                }

                MainShortcut.DeleteText(call.getBP2(driver));
                call.getBP2(driver).sendKeys("Test");
                if (call.getBP2(driver).getAttribute("value").isEmpty() || call.getBP2(driver).getAttribute("value").equals("0")) {
                    logger.info("Pass: BP2 cannot input alphabet");
                } else {
                    logger.error("Fail: BP2 can input alphabet");
                }

                MainShortcut.DeleteText(call.getO2SAT(driver));
                call.getO2SAT(driver).sendKeys("Test");
                if (call.getO2SAT(driver).getAttribute("value").isEmpty() || call.getO2SAT(driver).getAttribute("value").equals("0")) {
                    logger.info("Pass: O2SAT cannot input alphabet");
                } else {
                    logger.error("Fail: O2SAT can input alphabet");
                }

                MainShortcut.DeleteText(call.getO2Th());
                call.getO2Th().sendKeys("Test");
                if (call.getO2Th().getAttribute("value").isEmpty() || call.getO2Th().getAttribute("value").equals("0")) {
                    logger.info("Pass: O2Th cannot input alphabet");
                } else {
                    logger.error("Fail: O2Th can input alphabet");
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
