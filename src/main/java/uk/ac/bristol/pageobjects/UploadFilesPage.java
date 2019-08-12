package uk.ac.bristol.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.curriculum.ProposalInformationPage;

import java.awt.*;

public class UploadFilesPage extends BasePage {

    public UploadFilesPage(ChromeDriver driver) {
        super(driver);
    }

    public static final By FILE_STATUS_PERCENTAGE_IDENTIFIER = By.cssSelector("div > div.sv-col-sm-2 > span");
    public static final By UPLOAD_PANEL_IDENTIFIER = By.xpath("//h2[@class=\"sv-panel-title\"]");
    public static final By FILE_NAME_INPUT_IDENTIFIER = By.xpath("//*[starts-with(@id,'upnameo_')]");
    public static final By UPLOAD_BUTTON_IDENTIFIER = By.cssSelector("a[id*='PLUP_upload']");
    public static final By NEXT_BUTTON_IDENTIFIER = By.cssSelector("body > main > div > form > div > div > div > div.sv-panel-footer > div > input.sv-col-xs-12.sv-col-sm-2.sv-btn.sv-btn-primary");

    public void selectBrowseForFileButton() throws InterruptedException, AWTException {
        driver.findElement(By.partialLinkText("Browse for file")).click();
    }

    public ProposalInformationPage uploadCurriculumManagementFile() {
            uploadFile(By.xpath("//input[@title='Browse for files']"), "/Users/jack/Pictures/", "juninho.jpg");
            waitForElementToBeDisplayed(UPLOAD_PANEL_IDENTIFIER,driver, 10);
            enterTextIntoElement(FILE_NAME_INPUT_IDENTIFIER, "UploadedFile");
            clickElement(UPLOAD_BUTTON_IDENTIFIER);
            waitForElementTextToBeDisplayed(FILE_STATUS_PERCENTAGE_IDENTIFIER, driver, 10, "100%");
            clickElement(NEXT_BUTTON_IDENTIFIER);

        ProposalInformationPage proposalInformationPage = new ProposalInformationPage(driver);
        return proposalInformationPage;
    }

}
