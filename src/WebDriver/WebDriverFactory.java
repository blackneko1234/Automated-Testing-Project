package WebDriver;

import WebDriver.Browser.ChromeDriverManager;
import WebDriver.Browser.FirefoxDriverManager;

public class WebDriverFactory {
    public static WebDriverManager getBrowser(String Browser) {
        WebDriverManager DriverManager;

        switch (Browser) {
            case "Chrome" -> DriverManager = new ChromeDriverManager();
            case "Firefox" -> DriverManager = new FirefoxDriverManager();
            default -> throw new IllegalStateException("Unexpected value: " + Browser);
        }
        return DriverManager;
    }

}
