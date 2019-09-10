package uk.ac.bristol.pageobjects.admissionspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class UploadedDocumentPage extends BasePage {

    public static final By SUBMIT_IDENTIFIER = By.name("NEXT.DUMMY.MENSYS.1");

    public UploadedDocumentPage(WebDriver driver) { super(driver); }

}
