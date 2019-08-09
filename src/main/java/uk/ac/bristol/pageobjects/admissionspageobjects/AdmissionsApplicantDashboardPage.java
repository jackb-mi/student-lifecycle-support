package uk.ac.bristol.pageobjects.admissionspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class AdmissionsApplicantDashboardPage extends BasePage {
    public static final String PAGE_TITLE = "Adpplicant Dashboard";

    public static final By UPLOAD_DOCS_IDENTIFIER = By.xpath("//div[contains(text(), 'Upload')]");
    public static final By ALT_COURSE_IDENTIFIER = By.xpath("//div[contains(text(), 'alternative')]");
    public static final By REQUEST_APPLICATION_CHANGE_IDENTIFIFER = By.xpath("//div[contains(text(), 'Request')]");
    public static final By REPLY_INCARE_REQUEST_IDENTIFIER = By.xpath("//div[contains(text(), 'In care')]");
    public static final By OCC_HEALTH_FORM_IDENTIFIER = By.xpath("//div[contains(text(), 'Occupational')]");
    public static final By FEE_STATUS_IDENTIFIER = By.xpath("//div[contains(text(), 'Fee')]");
    public static final By UCAT_FORM_IDENTIFIER = By.xpath("//div[contains(text(), 'UCAT')]");
    public static final By LNAT_FORM_IDENTIFIER = By.xpath("//div[contains(text(), 'LNAT')]");
    public static final By QUALIFICATION_DETAILS_FORM = By.xpath("//div[contains(text(), 'Provide')]");
    public static final By REQUEST_FEEDBACK_FORM = By.xpath("//div[contains(text(), 'Request')]");

    public AdmissionsApplicantDashboardPage(ChromeDriver driver) { super(driver); }

    public SelectUploadDocumentTypePage goToSelectUploadDocumentTypePage() {
        driver.findElement(UPLOAD_DOCS_IDENTIFIER).click();
        SelectUploadDocumentTypePage selectUploadDocumentTypePage = new SelectUploadDocumentTypePage(driver);
        return selectUploadDocumentTypePage;
    }

}
