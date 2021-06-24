package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.MainShortcut;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test1 extends MainSpeedyExecute {
    public Test1(String Browser, String TestCaseName) {
        super(Browser, TestCaseName);
        try {
            WebElement ClickLogin = driver.findElement(By.className("MuiButton-label"));
            //Test login but not enter the username and password
            logger.debug("========= Test login but not enter the username and password =========");
            ClickLogin.click();
            if (driver.findElement(By.id("username-helper-text")).isDisplayed()
                    && driver.findElement(By.id("password-helper-text")).isDisplayed()) {
                logger.info("Pass: When click login without enter the username and password it will show the red message");
            } else {
                logger.error("Fail");
            }
            Thread.sleep(2000);

            //Test login but not enter password
            logger.debug("========= Test login but not enter password =========");
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("Test");
            ClickLogin.click();
            if (driver.findElement(By.id("password-helper-text")).isDisplayed()) {
                logger.info("Pass: When click login without enter the password it will show the red message");
            } else {
                logger.error("Fail");
            }
            MainShortcut.DeleteText(username);
            Thread.sleep(2000);

            //Test login but not enter username
            logger.debug("========= Test login but not enter username =========");
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("Test");
            driver.findElement(By.className("MuiButton-label")).click();
            if (driver.findElement(By.id("username-helper-text")).isDisplayed()) {
                logger.info("Pass: When click login without enter the username it will show the red message");
            } else {
                logger.error("Fail");
            }
            MainShortcut.DeleteText(password);
            Thread.sleep(2000);

            //Test login
            logger.debug("========= Test login =========");
            SpeedyShortcut.login(driver);
            driver.navigate().refresh();
            String getUrl = driver.getCurrentUrl();
            if (getUrl.equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/dashboard")) {
                logger.info("Pass: User can login to the website");
            } else {
                logger.error("Fail: The Url is " + getUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
