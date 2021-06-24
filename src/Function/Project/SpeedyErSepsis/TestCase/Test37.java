package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class Test37 extends MainSpeedyExecute {
    public Test37(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.login(driver);
            call.getSummaryPopup(driver).click();

            ArrayList<String> KeepText = new ArrayList<>();

            for (int i = 1; i < 4; i++) {

                KeepText.add(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[" + i + "]/div[1]")).getText()
                        + " "
                        + driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[" + i + "]/div[2]")).getText());
            }
            for (int i = 1; i < 17; i++) {
                KeepText.add(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[6]/div[" + i + "]/div[1]")).getText()
                        + " "
                        + driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[6]/div[" + i + "]/div[2]")).getText());
            }
            Thread.sleep(500);
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
