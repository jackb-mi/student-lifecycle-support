package uk.ac.bristol.pageobjects.admissionspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class SelectUploadDocumentTypePage extends BasePage {

    public static final By DOCUMENT_TYPE_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.1.");
    public static final By EXIT_BUTTON_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.2.");
    public static final By NEXT_BUTTON_IDENTIFIER = By.name("NEXT.DUMMY.MENSYS.1");


    public SelectUploadDocumentTypePage(ChromeDriver driver) { super(driver); }

    public UploadSupportingDocumentsPage goToUploadDocumentPage(String doctype) {
        selectFromDropdown(DOCUMENT_TYPE_IDENTIFIER, doctype);
        driver.findElement(NEXT_BUTTON_IDENTIFIER).click();
        UploadSupportingDocumentsPage uploadSupportingDocumentsPage = new UploadSupportingDocumentsPage(driver);
        return uploadSupportingDocumentsPage;
    }
}

