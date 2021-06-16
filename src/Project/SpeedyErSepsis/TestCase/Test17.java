package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test17 extends MainSpeedyExecute {
    public Test17(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            call.getAssessIcon(driver).click();

            call.CallWebElementAssessPage(driver);
            if (!call.getTemp(driver).getAttribute("Value").isEmpty()
                    && !call.getPR(driver).getAttribute("Value").isEmpty()
                    && !call.getRR(driver).getAttribute("Value").isEmpty()
                    && !call.getBP1(driver).getAttribute("Value").isEmpty()
                    && !call.getBP2(driver).getAttribute("Value").isEmpty()
                    && !call.getO2SAT(driver).getAttribute("Value").isEmpty()
                    && !call.getO2Th().getAttribute("Value").isEmpty()
            ) {
                logger.info("Pass: When click assess icon it will bring you back to assess page");
            } else {
                logger.error("Fail: When click assess icon it not bring you back to assess page");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
