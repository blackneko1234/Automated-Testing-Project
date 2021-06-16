package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.SpeedyShortcut;
import Project.SpeedyErSepsis.MainSpeedyExecute;

public class Test10 extends MainSpeedyExecute {
    public Test10(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {

            SpeedyShortcut.getFirstCard(driver, call);

            String getUrl = driver.getCurrentUrl();
            if (getUrl.equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/management")) {
                call.CallWebElementEditPage(driver);
                if (call.getTime().isDisplayed()) {
                    logger.info("Pass: Time is valid time of this card is: " + call.getTime().getText());
                } else {
                    logger.error("Fail: This is not valid");
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
