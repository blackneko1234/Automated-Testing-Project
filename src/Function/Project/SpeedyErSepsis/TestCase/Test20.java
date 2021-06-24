package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.MainShortcut;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;
import org.openqa.selenium.interactions.Actions;

public class Test20 extends MainSpeedyExecute {
    public Test20(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {

            SpeedyShortcut.getFirstCard(driver, call);

            logger.debug("========= Add SOFA, Lactate,and MAP, Check the data is negative or not, and Check the data cannot be alphabet =========");
            call.getMapAddButton(driver).click();

            logger.debug("========= MAP =========");

            call.getMapInputPopup1(driver).sendKeys("Test");
            call.getMapInputPopup2(driver).sendKeys("Test");
            if (Integer.parseInt(call.getMapInputPopup1(driver).getAttribute("Value")) == 0 && Integer.parseInt(call.getMapInputPopup2(driver).getAttribute("Value")) == 0) {
                logger.info("Pass: Map input can be number only");
            } else {
                logger.error("Fail: Map input can be alphabet");
            }

            call.getMapInputPopup1(driver).sendKeys("-9");
            call.getMapInputPopup2(driver).sendKeys("-9");
            if (Integer.parseInt(call.getMapInputPopup1(driver).getAttribute("Value")) > 0 && Integer.parseInt(call.getMapInputPopup2(driver).getAttribute("Value")) > 0) {
                logger.info("Pass: Map input is positive");
            } else {
                logger.error("Fail: Map input is negative");
            }
            call.getPopupSubmit().click();
            logger.info("Pass: Add Map successfully");

            call.getSofaAddButton(driver).click();

            logger.debug("========= Sofa =========");
            MainShortcut.DeleteText(call.getSofaAndLactateInputPopup(driver));

            call.getSofaAndLactateInputPopup(driver).sendKeys("Test");
            if (Integer.parseInt(call.getSofaAndLactateInputPopup(driver).getAttribute("Value")) == 0) {
                logger.info("Pass: Sofa input can be number only");
            } else {
                logger.error("Fail: Sofa input can be alphabet");
            }

            call.getSofaAndLactateInputPopup(driver).sendKeys("-20");
            if (Integer.parseInt(call.getSofaAndLactateInputPopup(driver).getAttribute("Value")) > 0) {
                logger.info("Pass: Sofa input is positive");
            } else {
                logger.error("Fail: Sofa input is negative");
            }
            call.getPopupSubmit().click();
            logger.info("Pass: Add Sofa successfully");

            logger.debug("========= Lactate =========");
            call.getLactateAddButton(driver).click();

            MainShortcut.DeleteText(call.getSofaAndLactateInputPopup(driver));

            call.getSofaAndLactateInputPopup(driver).sendKeys("Test");
            if (Integer.parseInt(call.getSofaAndLactateInputPopup(driver).getAttribute("Value")) == 0) {
                logger.info("Pass: Lactate input can be number only");
            } else {
                logger.error("Fail: Lactate input can be alphabet");
            }

            call.getSofaAndLactateInputPopup(driver).sendKeys("-20");
            if (Integer.parseInt(call.getSofaAndLactateInputPopup(driver).getAttribute("Value")) > 0) {
                logger.info("Pass: Lactate input is positive");
            } else {
                logger.error("Fail: Lactate input is negative");
            }
            call.getPopupSubmit().click();
            logger.info("Pass: Add Lactate successfully");

            Thread.sleep(1000);
            logger.debug("========= Show MAP, Lactate, and Sofa value =========");
            try {
                logger.info("Pass: Map data is - " + call.getMapData(driver).getText());
            } catch (Exception e) {
                logger.error("Fail: Map data not found");
            }
            try {
                logger.info("Pass: Sofa data is - " + call.getSofaData(driver).getText());
            } catch (Exception e) {
                logger.error("Fail: Sofa data not found");
            }
            try {
                logger.info("Pass: Lactate data is - " + call.getLactateData(driver).getText());
            } catch (Exception e) {
                logger.error("Fail: Lactate data not found");
            }

            Thread.sleep(1000);
            logger.debug("========= Delete MAP, Lactate, and Sofa =========");
            Actions a = new Actions(driver);
            try {
                a.moveToElement(call.getMapDelete(driver)).click().build().perform();
                logger.info("Pass: Map data deleted");
            } catch (Exception e) {
                logger.error("Fail: Map data not found or cannot delete");
            }

            try {
                a.moveToElement(call.getSofaDelete(driver)).click().build().perform();
                logger.info("Pass: Sofa data deleted");
            } catch (Exception e) {
                logger.error("Fail: Lactate data not found or cannot delete");
            }

            try {
                a.moveToElement(call.getLactateDelete(driver)).click().build().perform();
                logger.info("Pass: Lactate data deleted");
            } catch (Exception e) {
                logger.error("Fail: Lactate data not found or cannot delete");
            }

        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
