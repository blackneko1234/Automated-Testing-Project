package WebDriver.Browser;

import Project.MainShortcut;
import WebDriver.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverManager extends WebDriverManager {

    @Override
    protected void StartDriver() {
        String[] os = System.getProperty("os.name").toLowerCase().split(" ");
        if (os[0].equals("windows")) {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        }
        driver = new ChromeDriver(MainShortcut.ChromeOptions());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
