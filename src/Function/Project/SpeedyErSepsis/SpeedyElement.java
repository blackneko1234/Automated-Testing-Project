package Function.Project.SpeedyErSepsis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpeedyElement {
    private static WebElement Time;
    private static WebElement HN;
    private static WebElement Gender;
    private static WebElement AgeUnit;
    private static WebElement BP1;
    private static WebElement BP2;
    private static WebElement O2Th;
    private static WebElement Submit;
    private static WebElement Fever;
    private static WebElement Suspected;
    private static WebElement History;
    private static WebElement Alert;
    private static WebElement Voice;
    private static WebElement Pain;
    private static WebElement Unresponsive;
    private static WebElement MPEWorNEWS;
    private static WebElement Infection;
    private static WebElement NotInfection;
    private static WebElement PopupSubmit;
    private static WebElement PopupCancel;

    public void CallWebElementAddPage(WebDriver driver) {
        Time = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div/div[2]/div/div/div/p"));
        HN = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
        Gender = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div/div[3]/div/div[3]/div/div/div"));
        AgeUnit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div/div[3]/div/div[5]/div/div/div"));
        O2Th = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div[2]/div/div/div[1]/div[6]/div/div[2]/div/div/input"));
        Fever = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/span/span[1]/input"));
        Suspected = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/span/span[1]/input"));
        History = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/span/span[1]/input"));
        Alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div[2]/div/div/div[2]/div[2]/fieldset/div/div/div[1]/label/span[1]/span[1]/input"));
        Voice = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div[2]/div/div/div[2]/div[2]/fieldset/div/div/div[2]/label/span[1]/span[1]/input"));
        Pain = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div[2]/div/div/div[2]/div[2]/fieldset/div/div/div[3]/label/span[1]/span[1]/input"));
        Unresponsive = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div[2]/div/div/div[2]/div[2]/fieldset/div/div/div[4]/label/span[1]/span[1]/input"));
        Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[3]/button"));
    }

    public void CallWebElementEditPage(WebDriver driver) {
        Time = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/div/p"));
        HN = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div/div/input"));
        Gender = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div/div/div"));
        AgeUnit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[1]/div[2]/div/div[5]/div/div/div"));
    }

    public void CallWebElementDispositionPage(WebDriver driver) {
        HN = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div[2]/div/div[2]/div/div/input"));
        Gender = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div[2]/div/div[3]/div/div/div"));
        AgeUnit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div[2]/div/div[5]/div/div/div"));
    }

    public void CallWebElementAssessPage(WebDriver driver) {
        MPEWorNEWS = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[3]/p"));
        O2Th = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div[6]/div/div[2]/div/div/input"));
        Fever = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/span/span[1]/input"));
        Suspected = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/span/span[1]/input"));
        History = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/span/span[1]/input"));
        Alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/fieldset/div/div/div[1]/label/span[1]/span[1]/input"));
        Voice = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/fieldset/div/div/div[2]/label/span[1]/span[1]/input"));
        Pain = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/fieldset/div/div/div[3]/label/span[1]/span[1]/input"));
        Unresponsive = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/fieldset/div/div/div[4]/label/span[1]/span[1]/input"));
        Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[2]/button"));
    }

    public void CallWebElementDiagnosisPage(WebDriver driver) {
        BP1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/input"));
        BP2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/div/div[3]/div/div/input"));
        MPEWorNEWS = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div/input"));
        Infection = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/button"));
        NotInfection = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button"));
        Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[2]/button"));
    }

    public void CallWebElementTreatmentPage(WebDriver driver) {
        Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[2]/button"));
        Infection = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div[1]/button"));
        NotInfection = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/button"));
    }

    public void PopupSubmitAndCancel(WebDriver driver) {
        PopupSubmit = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[2]/div/button[2]"));
        PopupCancel = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[2]/div/button[1]"));
    }

    public WebElement getTime() {
        return Time;
    }

    public WebElement getFullName(WebDriver driver) {
        return driver.findElement(By.name("name"));
    }

    public WebElement getHN() {
        return HN;
    }

    public WebElement getGender() {
        return Gender;
    }

    public WebElement getAge(WebDriver driver) {
        return driver.findElement(By.name("age"));
    }

    public WebElement getAgeUnit() {
        return AgeUnit;
    }

    public WebElement getTemp(WebDriver driver) {
        return driver.findElement(By.name("temp"));
    }

    public WebElement getPR(WebDriver driver) {
        return driver.findElement(By.name("hr"));
    }

    public WebElement getRR(WebDriver driver) {
        return driver.findElement(By.name("rr"));
    }

    public WebElement getBP1(WebDriver driver) {
        return driver.findElement(By.name("bp1"));
    }

    public WebElement getBP2(WebDriver driver) {
        return driver.findElement(By.name("bp2"));
    }

    public WebElement getO2SAT(WebDriver driver) {
        return driver.findElement(By.name("o2Sat"));
    }

    public WebElement getO2Th() {
        return O2Th;
    }

    public WebElement getFever() {
        return Fever;
    }

    public WebElement getSuspected() {
        return Suspected;
    }

    public WebElement getHistory() {
        return History;
    }

    public WebElement getAlert() {
        return Alert;
    }

    public WebElement getVoice() {
        return Voice;
    }

    public WebElement getPain() {
        return Pain;
    }

    public WebElement getUnresponsive() {
        return Unresponsive;
    }

    public WebElement getMPEWorNEWS() {
        return MPEWorNEWS;
    }

    public WebElement getInfection() {
        return Infection;
    }

    public WebElement getNotInfection() {
        return NotInfection;
    }

    public WebElement getPopupSubmit() {
        return PopupSubmit;
    }

    public WebElement getPopupCancel() {
        return PopupCancel;
    }

    public WebElement getSubmit() {
        return Submit;
    }

    public WebElement getMapAddButton(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/p[2]/button"));
    }

    public WebElement getSofaAddButton(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div/div/p[2]/button"));
    }

    public WebElement getLactateAddButton(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[4]/div/div/div/p[2]/button"));
    }

    public WebElement getpMap(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]/div[2]/div/div/input"));
    }

    public WebElement getSelectFirstCard(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div/div[2]/div[2]/div/div/div/div[1]/div"));
    }

    public WebElement getMaleOrYear(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]"));
    }

    public WebElement getFemaleOrMonth(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]"));
    }

    public WebElement getAddButton(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/button"));
    }

    public WebElement getPatientStatus(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[7]/p"));
    }

    public WebElement getAssessIcon(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[1]/div[1]/span/span[1]"));
    }

    public WebElement getDiagnoseIcon(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[1]/div[2]/span/span[1]"));
    }

    public WebElement getTreatmentIcon(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[1]/div[3]/span/span[1]"));
    }

    public WebElement getFastTrack(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/span/span[1]/span/input"));
    }

    public WebElement getPatientStatusBar(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[7]/div/div[1]/div/div"));
    }

    public WebElement getMapInputPopup1(WebDriver driver) {
        PopupSubmitAndCancel(driver);
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[1]/div/div/div[1]/div/input"));
    }

    public WebElement getMapInputPopup2(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[1]/div/div/div[2]/div/input"));
    }

    public WebElement getSofaAndLactateInputPopup(WebDriver driver) {
        PopupSubmitAndCancel(driver);
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[1]/div/div/div/input"));
    }

    public WebElement getMapData(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/p"));
    }

    public WebElement getMapDelete(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/*[name()=\"svg\"]"));
    }

    public WebElement getSofaData(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div[2]/p"));
    }

    public WebElement getSofaDelete(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div[2]/*[name()=\"svg\"]"));
    }

    public WebElement getLactateData(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[4]/div/div[2]/p"));
    }

    public WebElement getLactateDelete(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[4]/div/div[2]/*[name()=\"svg\"]"));
    }

    public WebElement getTreatTime(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/p"));
    }

    public WebElement getNote(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[7]/div/div/div/textarea[1]"));
    }

    public WebElement getSepsis(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div[3]/button"));
    }

    public WebElement getSepsisShock(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div[4]/button"));
    }

    public WebElement getSepsisInduced(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div[5]/button"));
    }

    public WebElement getCriticalCareNotification(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div[6]/button"));
    }

    public WebElement getAntibiotic(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[1]/p[2]/span/span[1]/input"));
    }

    public WebElement getIVFluid(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/p[2]/span/span[1]/input"));
    }

    public WebElement getLoadAdequateFluid(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/p[2]/span/span[1]/input"));
    }

    public WebElement getVasopressor(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[4]/p[2]/span/span[1]/input"));
    }

    public WebElement getHydrocortisone(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[5]/p[2]/span/span[1]/input"));
    }

    public WebElement getEpinephrine(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[6]/p[2]/span/span[1]/input"));
    }

    public WebElement getMecritShow(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[6]/div"));
    }

    public WebElement getAdmitTimeDisposition(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[1]/div/div[1]/span/span[1]/input"));
    }

    public WebElement getAdmitTimeChangeDisposition(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[2]/div/div/div/div/input"));
    }

    public WebElement getReferDisposition(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[3]/div/div[1]/span/span[1]/input"));
    }

    public WebElement getReferChangeDisposition(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[4]/div/div/div/div/input"));
    }

    public WebElement getDischargeDisposition(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[5]/div/div[1]/span/span[1]/input"));
    }

    public WebElement getAgainstDisposition(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[7]/div/div[1]/span/span[1]/input"));
    }

    public WebElement getDeathDisposition(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[9]/div/div[1]/span/span[1]/input"));
    }

    public WebElement getSummaryPopup(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/*[name()=\"svg\"]"));
    }

    public WebElement getDispositionPage(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/a/button"));
    }

    public WebElement getDischargeFollowUp(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[6]/div/div/div[1]/div[1]/span/span[1]/input"));
    }

    public WebElement getDischargeNotFollowUp(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[6]/div/div/div[2]/div[1]/span/span[1]/input"));
    }

    public WebElement getAgainstAdviceFollowUp(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[8]/div/div[1]/div[1]/span/span[1]/input"));
    }

    public WebElement getAgainstAdviceNotFollowUp(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[2]/div/div/div/div[8]/div/div[2]/div[1]/span/span[1]/input"));
    }

    public WebElement getDispositionInfoIcon(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/form/div[1]/div[1]/div[2]/*[name()=\"svg\"]"));
    }

    public WebElement getCancelDisposition(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[3]/div[1]/button"));
    }

    public WebElement getSaveDisposition(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[3]/div[2]/button"));
    }

    public WebElement getDispositionSubmitPopup(WebDriver driver) {
        PopupSubmitAndCancel(driver);
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]"));
    }

    public WebElement getAllowFastTrack(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/button"));
    }

    public WebElement getStatusAssess(WebDriver driver) {
        return driver.findElement(By.xpath("//*[text()='Waiting for assess']"));
    }

    public WebElement getStatusDiagnose(WebDriver driver) {
        return driver.findElement(By.xpath("//*[text()='Waiting for diagnose']"));
    }

    public WebElement getStatusTreatment(WebDriver driver) {
        return driver.findElement(By.xpath("//*[text()='Waiting for treatment']"));
    }

    public WebElement getStatusTreating(WebDriver driver) {
        return driver.findElement(By.xpath("//*[text()='Treating']"));
    }

    public WebElement getStatusArchived(WebDriver driver) {
        return driver.findElement(By.xpath("//*[text()='Archived']"));
    }

    public WebElement getFilterStatus(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div/div"));
    }

    public WebElement getChooseStatusAll(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]"));
    }

    public WebElement getChooseStatusAssess(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]"));
    }

    public WebElement getChooseStatusDiagnose(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]"));
    }

    public WebElement getChooseStatusTreatment(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]"));
    }

    public WebElement getChooseStatusTreating(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[5]"));
    }

    public WebElement getChooseStatusArchived(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[7]"));
    }

    public WebElement getBP1() {
        return BP1;
    }

    public WebElement getBP2() {
        return BP2;
    }
}
