package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test22 extends MainSpeedyExecute {
    public Test22(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            call.CallWebElementTreatmentPage(driver);
            Thread.sleep(2000);
            call.getInfection().click();
            System.out.println(call.getInfection().getAttribute("class"));
            System.out.println(call.getNotInfection().getAttribute("class"));
            if (!call.getInfection().getAttribute("class").equals(call.getNotInfection().getAttribute("class"))) {
                logger.info("Pass: When click button choice can choose only one");
            } else {
                logger.error("Fail: When click button choice can choose more than one");
            }

            Thread.sleep(2000);

            call.getNotInfection().click();
            if (!call.getInfection().getAttribute("class").equals(call.getNotInfection().getAttribute("class"))) {
                logger.info("Pass: When click button choice can choose only one");
            } else {
                logger.error("Fail: When click button choice can choose more than one");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
