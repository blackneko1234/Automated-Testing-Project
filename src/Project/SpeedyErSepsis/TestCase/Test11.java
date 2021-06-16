package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test11 extends MainSpeedyExecute {
    public Test11(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            String getUrl = driver.getCurrentUrl();
            if (getUrl.equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/management")) {
                call.CallWebElementAssessPage(driver);
                if (call.getMPEWorNEWS().isDisplayed()) {
                    if (call.getMPEWorNEWS().getText().equals("NEWS = 0") || call.getMPEWorNEWS().getText().equals("MPEW = 0")) {
                        logger.error("Fail: MPEW/NEWS is not updated");
                    } else {
                        logger.info("Pass: MPEW/NEWS is valid and the value is: " + call.getMPEWorNEWS().getText());
                    }
                } else {
                    logger.error("Fail: MPEW/NEWS is not valid");
                }
            } else {
                logger.error("Fail: Cannot access to the assess page");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
