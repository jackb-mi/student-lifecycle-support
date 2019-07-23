package uk.ac.bristol.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdmissionsPage extends BasePage {

    public static final String PAGE_TITLE = "Admissions";

    public static final By APPLICATION_PROCESSING_TITLE_IDENTIFIER = By.cssSelector("div.sv-col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1)");
    public static final By UNDERGRADUATE_LINK_IDENTIFIER = By.cssSelector("div.sv-col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(1)");
    public static final By ACD_LINK_IDENTIFIER = By.cssSelector("div.sv-col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(2)");
    public static final By RCD_LINK_IDENTIFIER = By.cssSelector("div.sv-col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(3)");



    public AdmissionsPage(ChromeDriver driver) {
        super(driver);
    }

    public FolderTreeOfferGroupPage goToFolderTreeOfferGroups() {
        driver.findElement(UNDERGRADUATE_LINK_IDENTIFIER).click();
        FolderTreeOfferGroupPage folderTreeOfferGroup = new FolderTreeOfferGroupPage(driver);
        return folderTreeOfferGroup;
    }

}
