package Project.SpeedyErSepsis.TestCase;

import Project.SpeedyErSepsis.SpeedyShortcut;
import Project.SpeedyErSepsis.MainSpeedyExecute;
import org.openqa.selenium.By;

public class Test2 extends MainSpeedyExecute {

    public Test2(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            logger.debug("========= Show username at the top right of website =========");
            SpeedyShortcut.login(driver);

            String AfterLoginUsername = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/header/div/div[2]/p")).getText();
            AfterLoginUsername = AfterLoginUsername.substring(1, AfterLoginUsername.length() - 1);
            if (AfterLoginUsername.equals("user2")) {
                logger.info("Pass: Username before login equal to username after login");
            } else {
                logger.error("Fail: Username before login not equal to username after login");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
