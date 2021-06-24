package Function.WebDriver.Browser;

import Function.Project.MainShortcut;
import Function.WebDriver.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxDriverManager extends WebDriverManager {

    @Override
    protected void StartDriver() {
        String[] os = System.getProperty("os.name").toLowerCase().split(" ");
        if (os[0].equals("windows")) {
            System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        }
        driver = new FirefoxDriver(MainShortcut.FirefoxOptions());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
