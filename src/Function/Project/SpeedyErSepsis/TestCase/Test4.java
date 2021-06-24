package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;

public class Test4 extends MainSpeedyExecute {
    public Test4(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.AddCardPage(driver, call);

            call.CallWebElementAddPage(driver);
            String CurrentTime = java.time.LocalTime.now().toString().substring(0, 5);
            if (call.getTime().getText().equals(CurrentTime)) {
                logger.info("Pass: Current time in the website is match to the real current time");
            } else {
                logger.error("Fail: Current time in the website is not match to the real current time");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
