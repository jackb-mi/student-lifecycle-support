package uk.ac.bristol.pageobjects.admissionspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class UploadSupportingDocumentsPage extends BasePage {

    public static final By PANEL_TITLE_IDENTIFIER = By.cssSelector("div.sv-panel-heading > h2");

    public UploadSupportingDocumentsPage(ChromeDriver driver) { super(driver); }
}
