package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.SpeedyShortcut;
import Project.SpeedyErSepsis.MainSpeedyExecute;

public class Test6 extends MainSpeedyExecute {
    public Test6(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.AddCardPage(driver, call);
            call.CallWebElementAddPage(driver);
            call.getAlert().click();
            if (call.getAlert().isSelected() && !call.getVoice().isSelected() && !call.getPain().isSelected() && !call.getUnresponsive().isSelected()) {
                logger.info("Pass: Alert is selected only");
            } else {
                logger.error("Fail: Radio is selected more than one");
            }
            Thread.sleep(1000);

            call.getVoice().click();
            if (!call.getAlert().isSelected() && call.getVoice().isSelected() && !call.getPain().isSelected() && !call.getUnresponsive().isSelected()) {
                logger.info("Pass: Voice is selected only");
            } else {
                logger.error("Fail: Radio is selected more than one");
            }
            Thread.sleep(1000);

            call.getPain().click();
            if (!call.getAlert().isSelected() && !call.getVoice().isSelected() && call.getPain().isSelected() && !call.getUnresponsive().isSelected()) {
                logger.info("Pass: Pain is selected only");
            } else {
                logger.error("Fail: Radio is selected more than one");
            }
            Thread.sleep(1000);

            call.getUnresponsive().click();
            if (!call.getAlert().isSelected() && !call.getVoice().isSelected() && !call.getPain().isSelected() && call.getUnresponsive().isSelected()) {
                logger.info("Pass: Unresponse is selected only");
            } else {
                logger.error("Fail: Radio is selected more than one");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
