package uk.ac.bristol.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProposalInformationPage extends BasePage {

    public ProposalInformationPage(ChromeDriver driver) {
        super(driver);
    }

    public void enterProposalName(String textToEnter) {
        enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.2\\."), textToEnter);
    }

    public void enterOwningSchoolDepartment(String textToEnter) {
        enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.3\\."), textToEnter);
    }

    public void enterAcademicResponsible(String textToEnter) {
        enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.4\\."), textToEnter);
    }

    public void selectPostgraduateOptionFromCommitteeLevelDropDown() {
        driver.findElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.6\\.")).click();
        driver.findElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.6\\. > option:nth-child(2)")).click();
    }


    public void selectSupportSection() {
        driver.findElement(By.cssSelector("#ui-id-9")).click();
    }

    public UploadFilesPage selectUploadFileForExternalSupport() {
        driver.findElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.16\\.")).click();

        UploadFilesPage uploadFilesPage = new UploadFilesPage(driver);
        return uploadFilesPage;
    }
}
