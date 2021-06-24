package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test29 extends MainSpeedyExecute {
    public Test29(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.DispositionPage(driver, call);

            call.getDischargeDisposition(driver).click();
            if (call.getDischargeDisposition(driver).isSelected()
                    && !call.getAgainstDisposition(driver).isSelected()
                    && !call.getDeathDisposition(driver).isSelected()) {

                call.getDischargeFollowUp(driver).click();

                if (call.getDischargeFollowUp(driver).isSelected() && !call.getDischargeNotFollowUp(driver).isSelected()) {
                    call.getDischargeNotFollowUp(driver).click();
                    if (!call.getDischargeFollowUp(driver).isSelected() && call.getDischargeNotFollowUp(driver).isSelected()) {
                        logger.info("Pass: Discharge follow up and not follow up can choose only one");
                    }
                } else {
                    logger.error("Fail: Discharge follow up and not follow up can choose more than one");
                }
            } else {
                logger.error("Fail: Other option can select at same time");
            }

            call.getAgainstDisposition(driver).click();
            if (!call.getDischargeDisposition(driver).isSelected()
                    && call.getAgainstDisposition(driver).isSelected()
                    && !call.getDeathDisposition(driver).isSelected()) {

                call.getAgainstAdviceFollowUp(driver).click();

                if (call.getAgainstAdviceFollowUp(driver).isSelected() && !call.getAgainstAdviceNotFollowUp(driver).isSelected()) {

                    call.getAgainstAdviceNotFollowUp(driver).click();

                    if (!call.getAgainstAdviceFollowUp(driver).isSelected() && call.getAgainstAdviceNotFollowUp(driver).isSelected()) {
                        logger.info("Pass: Against advice follow up and not follow up can choose only one");
                    }
                } else {
                    logger.error("Fail: Against advice follow up and not follow up can choose more than one");
                }
            } else {
                logger.error("Fail: Other option can select at same time");
            }

            call.getDeathDisposition(driver).click();
            if (!call.getDischargeDisposition(driver).isSelected() && !call.getAgainstDisposition(driver).isSelected() && call.getDeathDisposition(driver).isSelected()) {
                logger.info("Pass: Death chooses only one");
            } else {
                logger.error("Fail: Other option can select at same time");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
