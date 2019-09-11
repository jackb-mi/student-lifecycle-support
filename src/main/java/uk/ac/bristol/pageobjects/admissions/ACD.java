package uk.ac.bristol.pageobjects.admissions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class ACD extends BasePage {
    public ACD (WebDriver driver) { super(driver); }

    public static final String PAGE_TITLE = "Adpplicantion Clearance & Decision Entry";

    public static final By PREVIOUS_BUTTON_IDENTIFIER = By.xpath("//div[contains(text(), 'Upload')]");
    public static final By FIRST_MESSAGE_IDENTIFIER = By.xpath("//*[@id='panel-ACD-HEAD']//strong/text()[1]");
    public static final By NEXT_BUTTON_IDENTIFIER = By.xpath("//div[contains(text(), 'alternative')]");
    public static final By SEARCH_BUTTON_IDENTIFIFER = By.xpath("//div[contains(text(), 'Request')]");
    public static final By RELOAD_BUTTON_IDENTIFIER = By.xpath("//div[contains(text(), 'In care')]");
    public static final By SAVE_BUTTON_IDENTIFIER = By.xpath("//div[contains(text(), 'Occupational')]");
    public static final By APPLICANT_DETAILS_TAB_IDENTIFIER = By.xpath("//div[contains(text(), 'Fee')]");
    public static final By SCORING_TAB_IDENTIFIER = By.xpath("//div[contains(text(), 'UCAT')]");
    public static final By DECLARED_QUALS_TAB_IDENTIFIER = By.xpath("//div[contains(text(), 'LNAT')]");
    public static final By CORRESPONDENCE_TAB_IDENTIFIER = By.xpath("//div[contains(text(), 'Provide')]");
    public static final By CLEARANCE_CHECKS_TAB_IDENTIFIER = By.xpath("//div[contains(text(), 'Request')]");
    public static final By DECISION_TAB_IDENTIFIER = By.xpath("//div[contains(text(), 'Request')]");
    public static final By ACTUAL_QUALS_TAB_IDENTIFIER = By.xpath("//div[contains(text(), 'Request')]");
    public static final By APPLICANTION_LOG_TAB_IDENTIFIER = By.xpath("//div[contains(text(), 'Request')]");

    public class SearchPanel {
        //***Need to change selector for these***
        //public static final By SEARCH_CRITERIA_HEADER_IDENTIFIER = By.className("sv-panel-title");
        //public static final By SEARCH_RESULTS_HEADER_IDENTIFIER = By.className("sv-panel-title");
        public static final By STUDENT_CODE_FIELD_IDENTIFIER = By.cssSelector("#CAP_STUC");
        public static final By UCAS_ID_FIELD_IDENTIFIER = By.cssSelector("#CAP_UCI2");
        public static final By FORENAME_FIELD_IDENTIFIER = By.id("STU_FNM1");
        public static final By SURNAME_FIELD_IDENTIFIER = By.id("STU_SURN");
        public static final By RETRIEVE_BUTTON_IDENTIFIER = By.id("FINDAPP");
        public static final By STUCODE_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public static final By CAPSEQN_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public static final By APFSEQN_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public static final By DOB_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public static final By NAME_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public static final By PERSONALID_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public static final By GENDER_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public static final By DECISION_RESPONSE_IDENTIFIER = By.id("FINDAPP");
        public static final By SELECT_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public static final By SELECT_BUTTON_IDENTIFIER = By.id("0_SELECT");
        public static final By CLEAR_BUTTON_IDENTIFIER = By.cssSelector(".ui-helper-clearfix > div > button:nth-child(1)T");
        public static final By CLOSE_BUTTON_IDENTIFIER = By.cssSelector(".ui-helper-clearfix > div > button:nth-child(2)");
    }

    public class ApplicantDetails {
        public static final By PERSONAL_DETAILS_HEADER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1) > div > div > div > div > h3");


    }









}
