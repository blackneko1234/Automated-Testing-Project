package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test24 extends MainSpeedyExecute {
    public Test24(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);
            logger.debug("========= Click assess icon it will bring you back to assess page =========");

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
            Thread.sleep(2000);

            logger.debug("========= Click treat icon it will bring you back to treat page =========");
            call.getTreatmentIcon(driver).click();
            call.CallWebElementTreatmentPage(driver);
            if (call.getMapAddButton(driver).isDisplayed()
                    && call.getSofaAddButton(driver).isDisplayed()
                    && call.getLactateAddButton(driver).isDisplayed()
                    && call.getInfection().isDisplayed()
                    && call.getNotInfection().isDisplayed()) {
                logger.info("Pass: When click treat icon it will bring you back to treat page");
            } else {
                logger.error("Fail: When click treat icon it not bring you back to treat page");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
