package Project.SpeedyErSepsis.TestCase;

import Project.MainShortcut;
import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;

public class Test33 extends MainSpeedyExecute {
    public Test33(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            logger.debug("========= Press save button it will show confirm popup =========");
            SpeedyShortcut.DispositionPage(driver, call);

            call.getSaveDisposition(driver).click();
            if (call.getDispositionSubmitPopup(driver).isDisplayed()) {
                logger.info("Pass: The popup is show");
            } else {
                logger.error("Fail: The popup not show");
            }

            logger.debug("========= When click cancel popup it will show the disposition page =========");
            call.getPopupCancel().click();
            Thread.sleep(500);
            try {
                if (call.getDispositionSubmitPopup(driver).isDisplayed()) {
                    logger.error("Fail: The popup is show now");
                }
            } catch (Exception e) {
                logger.info("Pass: The popup not show and back to disposition page");
            }

            logger.debug("========= When submit popup status will changed to archive =========");
            call.getAdmitTimeDisposition(driver).click();
            MainShortcut.DeleteText(call.getAdmitTimeChangeDisposition(driver));
            call.getAdmitTimeChangeDisposition(driver).sendKeys("1111");

            call.getSaveDisposition(driver).click();
            if (call.getDispositionSubmitPopup(driver).isDisplayed()) {
                call.getPopupSubmit().click();
            } else {
                logger.error("Fail: The popup not show");
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/dashboard")
                    && call.getPatientStatus(driver).getText().equals("Archived")) {
                logger.info("Pass: The patient status changed to \"Archived\"");
            } else {
                logger.error("Fail: Not go back to the dashboard or The patient status not changed to \"Archived\"");
            }

        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
