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
    public static final By POLICY_GUIDANCE_LINK_IDENTIFIER = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(4) > div.sv-list-group.sv-portal-2-col > a:nth-child(2)");

    public static final By ATTRIBUTE_MANAGEMENT_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(4) > div.sv-panel-heading > div > div > h2");
    public static final By MANAGE_COURSE_ATTRIBUTES_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(4) > div.sv-list-group.sv-portal-2-col > a:nth-child(1)");
    public static final By MANAGE_ADMISSIONS_THRESHOLDS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(4) > div.sv-list-group.sv-portal-2-col > a:nth-child(2)");
    public static final By DUPLICATE_MATCHING_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(4) > div.sv-list-group.sv-portal-2-col > a:nth-child(3)");

    public static final By CONFIRMATION_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(5) > div.sv-panel-heading > div > div > h2");
    public static final By CONFIRMATION_CALL_CENTRE_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(5) > div.sv-list-group.sv-portal-2-col > a:nth-child(1)");
    public static final By CONFIRMATION_PROCESSING_GROUP_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(5) > div.sv-list-group.sv-portal-2-col > a:nth-child(2)");
    public static final By CONFIRMATION_PROCESSING_CHECKING_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(5) > div.sv-list-group.sv-portal-2-col > a:nth-child(3)");
    public static final By MANAGE_NEAR_MISS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(5) > div.sv-list-group.sv-portal-2-col > a:nth-child(4)");
    public static final By SEND_CONFIRMATION_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(5) > div.sv-list-group.sv-portal-2-col > a:nth-child(5)");

    public static final By REPORTS_TITLE_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-panel-heading > div > div > h2");
    public static final By OPEN_DAYS_SCHOOL_BOOKINGS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(1)");
    public static final By OPEN_DAYS_DEPARTMENT_BOOKINGS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(2)");
    public static final By OPEN_DAYS_ACCESS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(3)");
    public static final By OPEN_DAYS_TALK_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(4)");
    public static final By OPEN_DAYS_MATURE_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(5)");
    public static final By OPEN_DAYS_FULL_TALKS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(6)");
    public static final By OPEN_DAYS_PARK_RIDE_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(7)");
    public static final By OPEN_DAYS_VET_SCIENCE_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(8)");
    public static final By OPEN_DAYS_WP_BOOKERS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(9)");
    public static final By OPEN_DAYS_INTERNATIONAL_BOOKERS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(10)");
    public static final By PG_APPLICATIONS_VISA_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(11)");
    public static final By PG_APPLICATIONS_VISA_REQUEST_VIEWER_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(12)");
    public static final By PG_NEW_STUDENT_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(13)");
    public static final By PG_COMBINED_CAS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(14)");
    public static final By PG_PROGRAMME_FEES_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(15)");
    public static final By PRE_SESSIONAL_APP_SUMMARY_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(16)");
    public static final By APPLICANT_CONTACT_DETAILS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(17)");
    public static final By CLEARANCE_CHECK_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(18)");
    public static final By NEW_DOCUMENT_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(19)");
    public static final By ACCEPTED_APPLICANTS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(20)");
    public static final By REGISTRATION_PACKS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(21)");
    public static final By DECISION_CHECKER_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(22)");
    public static final By WP_PROJECTS_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(23)");
    public static final By FOLDEROVERVIEW_LINK_IDENTIFIER = By.cssSelector("div:nth-child(2) > div > div > div:nth-child(6) > div.sv-list-group.sv-portal-2-col > a:nth-child(24)");


    public AdmissionsPage(ChromeDriver driver) {
        super(driver);
    }

    public FolderTreeOfferGroupPage goToFolderTreeOfferGroups() {
        driver.findElement(UNDERGRADUATE_LINK_IDENTIFIER).click();
        FolderTreeOfferGroupPage folderTreeOfferGroup = new FolderTreeOfferGroupPage(driver);
        return folderTreeOfferGroup;
    }

}
