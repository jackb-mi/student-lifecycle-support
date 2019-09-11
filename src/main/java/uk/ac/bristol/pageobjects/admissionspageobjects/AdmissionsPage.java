package uk.ac.bristol.pageobjects.admissionspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class AdmissionsPage extends BasePage {

    public static final String PAGE_TITLE = "Admissions";

    public static final By APPLICATION_PROCESSING_TITLE_IDENTIFIER = By.cssSelector("div.sv-col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1)");
    public static final By UNDERGRADUATE_LINK_IDENTIFIER = By.linkText("Undergraduate Applications (Folder Tree/Dashboard)");
    public static final By ACD_LINK_IDENTIFIER = By.linkText("Application forms (ACD on the Web)");
    public static final By RCD_LINK_IDENTIFIER = By.linkText("RCD on the Web");
    public static final By ALT_BULK_LINK_IDENTIFIER = By.linkText("Send alternative course offers in bulk");
    public static final By UKCAT_LINK_IDENTIFIER = By.linkText("UCAT scores manager");
    public static final By LNAT_LINK_IDENTIFIER = By.linkText("LNAT scores manager");
    public static final By WORK_EXP_LINK_IDENTIFIER = By.linkText("Work experience update task");

    /*public static final By OPEN_DAYS_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div.sv-panel-heading > div h2");
    public static final By TALK_SEARCH_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div.sv-list-group.sv-portal-2-col > a:nth-child(1)");
    public static final By OPEN_DAY_SUMMARY_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div.sv-list-group.sv-portal-2-col > a:nth-child(2)");
    public static final By ACCESS_REQUIREMENTS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div.sv-list-group.sv-portal-2-col > a:nth-child(3)");

    public static final By HELP_SUPPORT_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(4) > div.sv-panel-heading > div > div > h2");
    public static final By USER_GUIDES_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(4) > div.sv-list-group.sv-portal-2-col > a:nth-child(1)");
    public static final By POLICY_GUIDANCE_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(4) > div.sv-list-group.sv-portal-2-col > a:nth-child(2)");*/

    public static final By ATTRIBUTE_MANAGEMENT_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div.sv-panel-heading > div > div > h2");
    public static final By MANAGE_COURSE_ATTRIBUTES_LINK_IDENTIFIER = By.linkText("Manage Admissions Course Attributes");
    public static final By MANAGE_ADMISSIONS_THRESHOLDS_LINK_IDENTIFIER = By.linkText("Maintain Admissions thresholds");
    public static final By DUPLICATE_MATCHING_LINK_IDENTIFIER = By.linkText("Duplicate Matching");

    public static final By CONFIRMATION_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(3) > div.sv-panel-heading > div > div > h2");
    public static final By CONFIRMATION_CALL_CENTRE_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(5) > div.sv-list-group.sv-portal-2-col > a:nth-child(1)");
    public static final By CONFIRMATION_PROCESSING_GROUP_LINK_IDENTIFIER = By.linkText("Confirmation processing - Group stage");
    public static final By CONFIRMATION_PROCESSING_CHECKING_LINK_IDENTIFIER = By.linkText("Confirmation processing - Checking stage");
    public static final By MANAGE_NEAR_MISS_LINK_IDENTIFIER = By.linkText("Manage near miss applications");
    public static final By SEND_CONFIRMATION_LINK_IDENTIFIER = By.linkText("Send Confirmation decisions to UCAS");

    public static final By REPORTS_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(3) > div.sv-panel-heading > div > div > h2");
    public static final By APPLICATION_DECISIONS_IDENTIFIER = By.linkText("Application decisions");
    public static final By SCORING_RUBRIC_IDENTIFIER = By.linkText("Scoring rubric");
    public static final By FOLDER_OVERVIEW_IDENTIFIER = By.linkText("Folder overview");
    public static final By ACCEPTED_APPLICANTS = By.linkText("Accepted applicants");
    public static final By SCORING_AND_TURNAROUND_TIMES = By.linkText("Scoring and turnaround times");
    public static final By DECISION_CHECKER_IDETIFIER = By.linkText("Decision checker");
    public static final By EXTENUATING_CIRCUMSTANCES_IDENTIFIER = By.linkText("Extenuating circumstances report");
    public static final By APPLICANTION_LOG_IDENTIFIER = By.linkText("Application log report");
    public static final By CLEARANCE_CHECK_IDENTIFIER = By.linkText("Clearance check report");
    public static final By NEW_DOCUMENT_IDENTIFIER = By.linkText("New document report");
    public static final By REGISTRATION_PACKS_IDENTIFIER = By.linkText("Registration packs");
    public static final By WP_PROJECTS_IDENTIFIER = By.linkText("WP projects: UoB UG applications");

    public AdmissionsPage(WebDriver driver) {
        super(driver);
    }

    public FolderTreeOfferGroupPage goToFolderTreeOfferGroups() {
        driver.findElement(UNDERGRADUATE_LINK_IDENTIFIER).click();
        FolderTreeOfferGroupPage folderTreeOfferGroup = new FolderTreeOfferGroupPage(driver);
        return folderTreeOfferGroup;
    }

}
