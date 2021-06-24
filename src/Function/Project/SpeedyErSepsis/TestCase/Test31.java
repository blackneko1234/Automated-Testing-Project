package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class Test31 extends MainSpeedyExecute {
    public Test31(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.DispositionPage(driver, call);
            call.getDispositionInfoIcon(driver).click();

            ArrayList<String> KeepText = new ArrayList<>();

            for (int i = 1; i < 4; i++) {
                KeepText.add(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[" + i + "]/div[1]")).getText()
                        + " "
                        + driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[" + i + "]/div[2]")).getText());
            }
            for (int i = 1; i < 17; i++) {
                KeepText.add(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[" + i + "]/div[1]")).getText()
                        + " "
                        + driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[" + i + "]/div[2]")).getText());
            }
            logger.info("Pass: The information of patient is:");
            for (String s : KeepText) {
                logger.info(s);
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
