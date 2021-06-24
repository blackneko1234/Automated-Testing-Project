package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test18 extends MainSpeedyExecute {
    public Test18(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);
            call.CallWebElementDiagnosisPage(driver);
            call.getInfection().click();

            if (!call.getInfection().getAttribute("class").equals(call.getNotInfection().getAttribute("class"))) {
                logger.info("Pass: When click button choice can choose only one");
            } else {
                logger.error("Fail: When click button choice can choose more than one or testing element is not true");
            }

            Thread.sleep(2000);

            call.getNotInfection().click();
            if (!call.getInfection().getAttribute("class").equals(call.getNotInfection().getAttribute("class"))) {
                logger.info("Pass: When click button choice can choose only one");
            } else {
                logger.error("Fail: When click button choice can choose more than one or testing element is not true");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
