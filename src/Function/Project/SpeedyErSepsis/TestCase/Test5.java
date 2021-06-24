package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test5 extends MainSpeedyExecute {
    public Test5(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.AddCardPage(driver, call);

            String getUrl = driver.getCurrentUrl();
            if (getUrl.equals("https://speedy-er-sepsis-webapp-dev-es7lmrr4aq-as.a.run.app/case/add")) {
                //Add patient detail not all
                call.CallWebElementAddPage(driver);
                //Not enter FullName
                call.getHN().sendKeys("1234");
                call.getGender().click();

                call.getFemaleOrMonth(driver).click();

                call.getAge(driver).sendKeys("999");
                call.getAgeUnit().click();

                call.getMaleOrYear(driver).click();

                call.getTemp(driver).sendKeys("999");
                call.getPR(driver).sendKeys("300");
                call.getRR(driver).sendKeys("100");
                call.getBP1(driver).sendKeys("1");
                call.getBP2(driver).sendKeys("2");
                call.getO2SAT(driver).sendKeys("100");
                call.getO2Th().sendKeys("1");
                call.getFever().click();
                call.getVoice().click();
                call.getSubmit().click();

                WebElement NameNotify = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div/div[3]/div/div[1]/div/p"));
                if (NameNotify.getText().equals("Please enter correct name.")) {
                    logger.info("Pass: If not enter all detail the website will not save the data");
                } else {
                    logger.error("Fail: Not enter all detail but the data was saved");
                }
            } else {
                logger.error("Fail: Cannot access to the add page");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
