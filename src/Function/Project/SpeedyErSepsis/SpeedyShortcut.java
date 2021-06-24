package Function.Project.SpeedyErSepsis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpeedyShortcut {
    public static void login(WebDriver driver) {
        try {
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement ClickLogin = driver.findElement(By.className("MuiButton-label"));
            username.sendKeys("user2");
            password.sendKeys("1");
            ClickLogin.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getFirstCard(WebDriver driver, SpeedyElement call) {
        try {
            login(driver);
            call.getSelectFirstCard(driver).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void AddCardPage(WebDriver driver, SpeedyElement call) {
        try {
            login(driver);
            call.getAddButton(driver).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void DispositionPage(WebDriver driver, SpeedyElement call) {
        try {
            login(driver);
            call.getSummaryPopup(driver).click();
            call.getDispositionPage(driver).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Logout(WebDriver driver) {
        try {
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement Top = driver.findElement(By.xpath("//*[text()='รายการคนไข้ทั้งหมด']"));
            js.executeScript("arguments[0].scrollIntoView();", Top);

            WebElement Dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div/div[2]/button"));
            Dropdown.click();
            WebElement Logout = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]"));
            Logout.click();
        } catch (Exception ignored) {

        }
    }
}
