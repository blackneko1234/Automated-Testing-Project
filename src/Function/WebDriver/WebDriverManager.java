package Function.WebDriver;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverManager {
    protected WebDriver driver;

    protected abstract void StartDriver();

    public void quitDriver() {
        try {
            Thread.sleep(2000);
            driver.close();
            driver.quit();
        } catch (Exception ignored) {

        }
    }

    public WebDriver getDriver() {
        StartDriver();
        return driver;
    }
}
