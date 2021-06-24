package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import org.openqa.selenium.By;

public class Test38 extends MainSpeedyExecute {
    public Test38(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.login(driver);
            call.getFilterStatus(driver).click();
            call.getChooseStatusAssess(driver).click();

            if (!driver.findElements(By.xpath("//*[text()='Waiting for assess']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Waiting for diagnose']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Waiting for treatment']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Treating'][@style='color: rgb(153, 203, 254);']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Archived'][@style='color: rgb(251, 173, 38);']")).isEmpty()) {
                logger.info("Pass: Patient show 'Waiting for Assess' status only");
            } else {
                logger.error("Fail: Patient show other status or not show");
            }

            call.getFilterStatus(driver).click();
            call.getChooseStatusDiagnose(driver).click();
            if (driver.findElements(By.xpath("//*[text()='Waiting for assess']")).isEmpty()
                    && !driver.findElements(By.xpath("//*[text()='Waiting for diagnose']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Waiting for treatment']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Treating'][@style='color: rgb(153, 203, 254);']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Archived'][@style='color: rgb(251, 173, 38);']")).isEmpty()) {
                logger.info("Pass: Patient show 'Waiting for Diagnose' status only");
            } else {
                logger.error("Fail: Patient show other status or not show");
            }

            call.getFilterStatus(driver).click();
            call.getChooseStatusTreatment(driver).click();

            if (driver.findElements(By.xpath("//*[text()='Waiting for assess']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Waiting for diagnose']")).isEmpty()
                    && !driver.findElements(By.xpath("//*[text()='Waiting for treatment']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Treating'][@style='color: rgb(153, 203, 254);']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Archived'][@style='color: rgb(251, 173, 38);']")).isEmpty()) {
                logger.info("Pass: Patient show 'Waiting for Treatment' status only");
            } else {
                logger.error("Fail: Patient show other status or not show");
            }

            call.getFilterStatus(driver).click();
            call.getChooseStatusTreating(driver).click();
            if (driver.findElements(By.xpath("//*[text()='Waiting for assess']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Waiting for diagnose']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Waiting for treatment']")).isEmpty()
                    && !driver.findElements(By.xpath("//*[text()='Treating'][@style='color: rgb(153, 203, 254);']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Archived'][@style='color: rgb(251, 173, 38);']")).isEmpty()) {
                logger.info("Pass: Patient show 'Treating' status only");
            } else {
                logger.error("Fail: Patient show other status or not show");
            }

            call.getFilterStatus(driver).click();
            call.getChooseStatusArchived(driver).click();
            if (driver.findElements(By.xpath("//*[text()='Waiting for assess']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Waiting for diagnose']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Waiting for treatment']")).isEmpty()
                    && driver.findElements(By.xpath("//*[text()='Treating'][@style='color: rgb(153, 203, 254);']")).isEmpty()
                    && !driver.findElements(By.xpath("//*[text()='Archived'][@style='color: rgb(251, 173, 38);']")).isEmpty()) {
                logger.info("Pass: Patient show 'Archived' status only");
            } else {
                logger.error("Fail: Patient show other status or not show");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
