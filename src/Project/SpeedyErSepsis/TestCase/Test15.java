package Project.SpeedyErSepsis.TestCase;

import Project.MainShortcut;
import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test15 extends MainSpeedyExecute {
    public Test15(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            String getUrl = driver.getCurrentUrl();
            if (getUrl.equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/management")) {
                try {
                    call.CallWebElementDiagnosisPage(driver);
                    MainShortcut.DeleteText(call.getMPEWorNEWS());
                    if (call.getMPEWorNEWS().getAttribute("value").isEmpty()) {
                        logger.error("Fail: MPEW or NEWS can edit");
                    }
                } catch (Exception e) {
                    logger.info("Pass: MPEW or NEWS cannot edit");
                }

                try {
                    MainShortcut.DeleteText(call.getpMap(driver));
                    if (call.getpMap(driver).getAttribute("value").isEmpty()) {
                        logger.error("Fail: pMap can edit");
                    }
                } catch (Exception e) {
                    logger.info("Pass: pMap cannot edit");
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
