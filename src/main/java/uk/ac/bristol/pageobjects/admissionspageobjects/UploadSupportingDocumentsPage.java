package uk.ac.bristol.pageobjects.admissionspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class UploadSupportingDocumentsPage extends BasePage {

    public static final By PANEL_TITLE_IDENTIFIER = By.cssSelector("div.sv-panel-heading > h2");
    public static final By UPLOAD_NEW_FILE_IDENTIFIER = By.cssSelector("div:nth-child(11) > div > button");
    public static final By SELECT_FILE_FRAME = By.cssSelector("div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.ui-dialog-buttons.ui-draggable");
    public static final By BROWSE_FOR_FILE_BUTTON_IDENTIFIER = By.linkText("Browse For File");
    public static final By UPLOAD_FILE_IDENTIFIER = By.xpath("//input[@title='Browse for files']");
    public static final By UPLOAD_PANEL_IDENTIFIER = By.xpath("//h2[@class=\"sv-panel-title\"]");
    public static final By FILE_STATUS_PERCENTAGE_IDENTIFIER = By.cssSelector("div > div.sv-col-sm-2 > span");
    public static final By UPLOAD_BUTTON_IDENTIFIER = By.cssSelector("a[id*='PLUP_upload']");
    public static final By CLOSE_UPLOAD_FRAME_IDENTIFIER = By.cssSelector("div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div > button");
    public static final By PREVIEW_IDENTIFIER = By.name("NEXT.DUMMY.MENSYS.1");
    public static final By DOCUMENT_UPLOAD_IDENTIFIER = By.cssSelector("div:nth-child(4) > p");

    public UploadSupportingDocumentsPage(ChromeDriver driver) { super(driver); }

    public UploadedDocumentPage uploadDocument(String filename) throws InterruptedException {
        driver.findElement(UPLOAD_NEW_FILE_IDENTIFIER).click();
        uploadFile(UPLOAD_FILE_IDENTIFIER, filename);
        waitForElementToBeDisplayed(UPLOAD_PANEL_IDENTIFIER,driver, 10);
        driver.findElement(UPLOAD_BUTTON_IDENTIFIER).click();
        waitForElementTextToBeDisplayed(FILE_STATUS_PERCENTAGE_IDENTIFIER, driver, 10, "100%");
        driver.findElement(CLOSE_UPLOAD_FRAME_IDENTIFIER).click();
        driver.findElement(PREVIEW_IDENTIFIER).click();
        waitForElementToBeDisplayed(DOCUMENT_UPLOAD_IDENTIFIER, driver, 10);
        UploadedDocumentPage uploadedDocumentPage = new UploadedDocumentPage(driver);
        return uploadedDocumentPage;
    }
}
