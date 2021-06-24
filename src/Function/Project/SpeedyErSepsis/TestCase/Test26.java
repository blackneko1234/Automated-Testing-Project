package Function.Project.SpeedyErSepsis.TestCase;

import Function.Project.SpeedyErSepsis.MainSpeedyExecute;
import Function.Project.SpeedyErSepsis.SpeedyShortcut;

public class Test26 extends MainSpeedyExecute {
    public Test26(String browser, String TestCaseName) {
        super(browser, TestCaseName);
        try {
            SpeedyShortcut.getFirstCard(driver, call);

            call.getSepsis(driver).click();
            System.out.println(call.getSepsis(driver).getAttribute("class"));
            System.out.println(call.getSepsisShock(driver).getAttribute("class"));

            if (!call.getSepsis(driver).getAttribute("class").equals(call.getSepsisShock(driver).getAttribute("class"))
                    && !call.getSepsis(driver).getAttribute("class").equals(call.getSepsisInduced(driver).getAttribute("class"))
                    && call.getSepsisShock(driver).getAttribute("class").equals(call.getSepsisInduced(driver).getAttribute("class"))) {
                logger.info("Pass: When click button choice can choose only one");
            } else {
                logger.error("Fail: When click button choice can choose more than one");
            }

            Thread.sleep(2000);

            call.getSepsisShock(driver).click();
            if (!call.getSepsisShock(driver).getAttribute("class").equals(call.getSepsis(driver).getAttribute("class"))
                    && !call.getSepsisShock(driver).getAttribute("class").equals(call.getSepsisInduced(driver).getAttribute("class"))
                    && call.getSepsis(driver).getAttribute("class").equals(call.getSepsisInduced(driver).getAttribute("class"))) {
                logger.info("Pass: When click button choice can choose only one");
            } else {
                logger.error("Fail: When click button choice can choose more than one");
            }

            Thread.sleep(2000);

            call.getSepsisInduced(driver).click();
            if (!call.getSepsisInduced(driver).getAttribute("class").equals(call.getSepsis(driver).getAttribute("class"))
                    && !call.getSepsisInduced(driver).getAttribute("class").equals(call.getSepsisShock(driver).getAttribute("class"))
                    && call.getSepsis(driver).getAttribute("class").equals(call.getSepsisShock(driver).getAttribute("class"))) {
                logger.info("Pass: When click button choice can choose only one");
            } else {
                logger.error("Fail: When click button choice can choose more than one");
            }
        } catch (Exception e) {
            logger.error("Case Fail!!!");
            e.printStackTrace();
        }
        ExitWebDriver(TestCaseName);
    }
}
