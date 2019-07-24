package uk.ac.bristol.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdmissionsPage extends BasePage {

    public static final String PAGE_TITLE = "Admissions";

    public static final By APPLICATION_PROCESSING_TITLE_IDENTIFIER = By.cssSelector("div.sv-col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1)");
    public static final By UNDERGRADUATE_LINK_IDENTIFIER = By.cssSelector("div.sv-col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(1)");
    public static final By ACD_LINK_IDENTIFIER = By.cssSelector("div.sv-col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(2)");
    public static final By RCD_LINK_IDENTIFIER = By.cssSelector("div.sv-col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(3)");
    public static final By ALT_BULK_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(1) > div.sv-list-group.sv-portal-2-col > a:nth-child(4)");
    public static final By UKCAT_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(1) > div.sv-list-group.sv-portal-2-col > a:nth-child(5)");
    public static final By LNAT_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(1) > div.sv-list-group.sv-portal-2-col > a:nth-child(6)");
    public static final By WORK_EXP_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(1) > div.sv-list-group.sv-portal-2-col > a:nth-child(7)");

    public static final By OPEN_DAYS_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div.sv-panel-heading > div h2");
    public static final By TALK_SEARCH_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div.sv-list-group.sv-portal-2-col > a:nth-child(1)");
    public static final By OPEN_DAY_SUMMARY_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div.sv-list-group.sv-portal-2-col > a:nth-child(2)");
    public static final By ACCESS_REQUIREMENTS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div.sv-list-group.sv-portal-2-col > a:nth-child(3)");

    public static final By HELP_SUPPORT_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(4) > div.sv-panel-heading > div > div > h2");
    public static final By USER_GUIDES_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(4) > div.sv-list-group.sv-portal-2-col > a:nth-child(1)");
    public static final By POLICY_GUIDENCE_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(4) > div.sv-list-group.sv-portal-2-col > a:nth-child(2)");




    public AdmissionsPage(ChromeDriver driver) {
        super(driver);
    }

    public FolderTreeOfferGroupPage goToFolderTreeOfferGroups() {
        driver.findElement(UNDERGRADUATE_LINK_IDENTIFIER).click();
        FolderTreeOfferGroupPage folderTreeOfferGroup = new FolderTreeOfferGroupPage(driver);
        return folderTreeOfferGroup;
    }

}
