package Function.Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.HashMap;
import java.util.Map;

public class MainShortcut {
    public static ChromeOptions ChromeOptions() {
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        return options;
    }

    public static FirefoxOptions FirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(new FirefoxProfile());
        options.addPreference("dom.webnotifications.enabled", true);
        return options;
    }

    public static void WindowsTerminateTask() {
        try {
            String[] os = System.getProperty("os.name").toLowerCase().split(" ");
            if (os[0].equals("windows")) {
                Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe /T");
                Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
            }
        } catch (Exception ignored) {

        }
    }

    public static void DeleteText(WebElement element) {
        element.sendKeys(Keys.CONTROL, Keys.chord("a"));
        element.sendKeys(Keys.BACK_SPACE);
    }
}
