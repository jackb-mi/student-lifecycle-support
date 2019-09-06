package uk.ac.bristol.pageobjects.admissionspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class FolderTreeOfferGroupPage extends BasePage {
    public static final String PAGE_TITLE = "Admissions Dashboard";
    public static final String FOLDER_TREE_PANEL_TITLE = "Filter Offer Group by Faculty";
    public static final By OFFER_GROUP_BUTTON_IDENTIFER = By.id("ui-id-1");
    public static final By APPLICANT_SEARCH_BUTTON_IDENTIFER = By.id("ui-id-2");
    public static final By LOAD_APPLICANTS_IDENTIFIER = By.cssSelector("div.sv-col-md-2.sv-col-md-offset-8 > input");

    public FolderTreeOfferGroupPage(WebDriver driver) {
        super(driver);
    }

    public FolderTreeOfferGroupPage goToFolderTree() {
        driver.findElement(AdmissionsPage.UNDERGRADUATE_LINK_IDENTIFIER).click();
        FolderTreeOfferGroupPage folderTreeOfferGroup = new FolderTreeOfferGroupPage(driver);
        return folderTreeOfferGroup;
    }

    public FolderTreePage selectOfferGroup(String OFFER_GROUP) throws InterruptedException {
        driver.findElement(By.id(OFFER_GROUP)).click();
        driver.findElement(LOAD_APPLICANTS_IDENTIFIER).click();
        FolderTreePage folderTreePage = new FolderTreePage(driver);
        this.waitForElementToBeDisplayed(By.id("node000004_anchor"), driver, 10);
        return folderTreePage;
    }
}
