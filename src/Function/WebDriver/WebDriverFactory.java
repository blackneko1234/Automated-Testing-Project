package Function.WebDriver;

import Function.WebDriver.Browser.ChromeDriverManager;
import Function.WebDriver.Browser.FirefoxDriverManager;

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
