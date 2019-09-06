package uk.ac.bristol.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.curriculum.ProposalInformationPage;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UploadFilesPage extends BasePage {

    public UploadFilesPage(WebDriver driver) {
        super(driver);
    }

    public static final By FILE_STATUS_PERCENTAGE_IDENTIFIER = By.cssSelector("div > div.sv-col-sm-2 > span");
    public static final By UPLOAD_PANEL_IDENTIFIER = By.xpath("//h2[@class=\"sv-panel-title\"]");
    public static final By FILE_NAME_INPUT_IDENTIFIER = By.xpath("//*[starts-with(@id,'upnameo_')]");
    public static final By UPLOAD_BUTTON_IDENTIFIER = By.cssSelector("a[id*='PLUP_upload']");
    public static final By NEXT_BUTTON_IDENTIFIER = By.cssSelector("body > main > div > form > div > div > div > div.sv-panel-footer > div > input.sv-col-xs-12.sv-col-sm-2.sv-btn.sv-btn-primary");
    private String User = System.getProperty("user.name");
    private String Path = "/Users/" + User + "/Pictures/";
    private String File = "juninho.jpg";

    public void selectBrowseForFileButton() throws InterruptedException, AWTException {
        driver.findElement(By.partialLinkText("Browse for file")).click();
    }

    public ProposalInformationPage uploadCurriculumManagementFile() throws IOException, InterruptedException {

        waitUntilElementIsVisible(driver, By.xpath("//input[@title='Browse for files']"));

        uploadFile(By.xpath("//input[@title='Browse for files']"), Path, File);
        waitForElementToBeDisplayed(UPLOAD_PANEL_IDENTIFIER,driver, 10);
        enterTextIntoElement(FILE_NAME_INPUT_IDENTIFIER, "UploadedFile");
        clickElement(UPLOAD_BUTTON_IDENTIFIER);
        waitForElementTextToBeDisplayed(FILE_STATUS_PERCENTAGE_IDENTIFIER, driver, 10, "100%");
        clickElement(NEXT_BUTTON_IDENTIFIER);

        ProposalInformationPage proposalInformationPage = new ProposalInformationPage(driver);
        return proposalInformationPage;
    }

    public void uploadFile(By elementId, String pathToFile, String name) {
        File file = new File(name);
        String path = (pathToFile + file);

        driver.findElement(elementId).sendKeys(new CharSequence[]{path});
    }

    public String createTestFile(String fileLocation, String fileName, String fileContent) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation + fileName));
        writer.write(fileContent);
        writer.close();

        return fileLocation + fileName;
    }

}
