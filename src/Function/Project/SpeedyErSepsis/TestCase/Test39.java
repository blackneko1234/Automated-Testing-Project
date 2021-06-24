package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.MainShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test39 extends MainSpeedyExecute {
    public Test39(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.DispositionPage(driver, call);
            call.getReferDisposition(driver).click();
            MainShortcut.DeleteText(call.getReferChangeDisposition(driver));
            call.getReferChangeDisposition(driver).sendKeys("1111");
            call.getSaveDisposition(driver).click();
            if (call.getDispositionSubmitPopup(driver).isDisplayed()) {
                call.getPopupSubmit().click();
            } else {
                logger.error("Fail: The popup not show");
            }
            Thread.sleep(2000);
            SpeedyShortcut.getFirstCard(driver, call);
            call.getAntibiotic(driver).click();
            call.getIVFluid(driver).click();
            call.getLoadAdequateFluid(driver).click();
            call.CallWebElementTreatmentPage(driver);
            call.getSubmit().click();

            if (driver.getCurrentUrl().equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/dashboard")
                    && call.getPatientStatus(driver).getText().equals("Archived")) {
                logger.info("Pass: The status is \"Archived\"");
            } else {
                logger.error("Fail: Not go back to the dashboard or The patient status changed to other");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
