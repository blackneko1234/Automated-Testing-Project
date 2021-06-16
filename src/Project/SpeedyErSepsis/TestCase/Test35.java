package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.MainSpeedyExecute;
import Project.SpeedyErSepsis.SpeedyShortcut;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Test35 extends MainSpeedyExecute {
    public Test35(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.login(driver);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement bottom = driver.findElement(By.xpath("//*[text()='No more data ...']"));
            WebElement Top = driver.findElement(By.xpath("//*[text()='รายการคนไข้ทั้งหมด']"));

            js.executeScript("arguments[0].scrollIntoView();", bottom);
            Thread.sleep(2000);
            js.executeScript("arguments[0].scrollIntoView();", Top);
            call.getAddButton(driver).click();
            if (driver.getCurrentUrl().equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/add")) {
                logger.info("Pass: Can go to the add page");
            } else {
                logger.error("Fail: Cannot go to add page");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
