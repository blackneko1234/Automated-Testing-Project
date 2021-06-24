package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.MainShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test14 extends MainSpeedyExecute {
    public Test14(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {

            SpeedyShortcut.getFirstCard(driver, call);

            String getUrl = driver.getCurrentUrl();
            if (getUrl.equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/management")) {
                call.CallWebElementDiagnosisPage(driver);
                MainShortcut.DeleteText(call.getBP1());
                call.getBP1().sendKeys("-10");
                if (Integer.parseInt(call.getBP1().getAttribute("value")) > 0) {
                    logger.info("Pass: BP1 is positive");
                } else {
                    logger.error("Fail: BP1 is negative");
                }

                call.CallWebElementDiagnosisPage(driver);
                MainShortcut.DeleteText(call.getBP2());
                call.getBP2().sendKeys("-10");
                if (Integer.parseInt(call.getBP2().getAttribute("value")) > 0) {
                    logger.info("Pass: BP2 is positive");
                } else {
                    logger.error("Fail: BP2 is negative");
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
