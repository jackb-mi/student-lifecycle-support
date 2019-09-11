package uk.ac.bristol.pageobjects.admissions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class ACD extends BasePage {
    public ACD (WebDriver driver) { super(driver); }

    public static final String PAGE_TITLE = "Adpplicantion Clearance & Decision Entry";

//  Tab selectors
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
        public final By STUDENT_CODE_FIELD_IDENTIFIER = By.cssSelector("#CAP_STUC");
        public final By UCAS_ID_FIELD_IDENTIFIER = By.cssSelector("#CAP_UCI2");
        public final By FORENAME_FIELD_IDENTIFIER = By.id("STU_FNM1");
        public final By SURNAME_FIELD_IDENTIFIER = By.id("STU_SURN");
        public final By RETRIEVE_BUTTON_IDENTIFIER = By.id("FINDAPP");
        public final By STUCODE_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public final By CAPSEQN_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public final By APFSEQN_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public final By DOB_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public final By NAME_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public final By PERSONALID_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public final By GENDER_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public final By DECISION_RESPONSE_IDENTIFIER = By.id("FINDAPP");
        public final By SELECT_COLUMN_IDENTIFIER = By.id("FINDAPP");
        public final By SELECT_BUTTON_IDENTIFIER = By.id("0_SELECT");
        public final By CLEAR_BUTTON_IDENTIFIER = By.cssSelector(".ui-helper-clearfix > div > button:nth-child(1)T");
        public final By CLOSE_BUTTON_IDENTIFIER = By.cssSelector(".ui-helper-clearfix > div > button:nth-child(2)");
    }

    public class AcdHeaerPanel {
        public final By PREVIOUS_BUTTON_IDENTIFIER = By.id("LEFT");
        public final By FIRST_MESSAGE_IDENTIFIER = By.xpath("//*[@id='panel-ACD-HEAD']//strong/text()[1]");
        public final By NAME_COLUMN_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD thead > tr > th:nth-child(1)");
        public final By UCASID_COLUMN_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD thead > tr > th:nth-child(2)");
        public final By UCASCODE_COLUMN_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD thead > tr > th:nth-child(3)");
        public final By COURSE_TITLE_COLUMN_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD thead > tr > th:nth-child(4)");
        public final By CREATED_DATE_COLUMN_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD thead > tr > th:nth-child(5)");
        public final By CURRENT_FOLDER_COLUMN_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD thead > tr > th:nth-child(6)");
        public final By APP_CATEGORY_COLUMN_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD thead > tr > th:nth-child(7)");
        public final By UCAS_CHOICE_COLUMN_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD thead > tr > th:nth-child(8)");
        public final By NAME_FIELD_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD  tr > td:nth-child(1)");
        public final By UCASID_FIELD_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD  tr > td:nth-child(2)");
        public final By UCASCODE_FIELD_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD  tr > td:nth-child(3)");
        public final By COURSE_TITLE_FIELD_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD  tr > td:nth-child(4)");
        public final By CURRENT_FOLDER_FIELD_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD  tr > td:nth-child(5)");
        public final By APP_CATEGORY_FIELD_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD  tr > td:nth-child(6)");
        public final By UCAS_CHOICE_FIELD_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD  tr > td:nth-child(1)");
        public final By RESCORE_BUTTON_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD tr > td:nth-child(9) > a");
        public final By MOVE_FOLDER_BUTTON_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD tr > td:nth-child(10) > a");
        public final By VIEW_QUALS_BUTTON_IDENTIFIER = By.cssSelector("#panel-ACD-HEAD tr > td:nth-child(11) > a");
        public final By NEXT_BUTTON_IDENTIFIER = By.id("RIGHT");
        public final By SEARCH_BUTTON_IDENTIFIFER = By.id("SEARCH");
        public final By RELOAD_BUTTON_IDENTIFIER = By.id("CANCEL");
        public final By SAVE_BUTTON_IDENTIFIER = By.id("SAVE");
    }

    public class ApplicantDetails {
        public final By PERSONAL_DETAILS_HEADER_IDENTIFIER = By.cssSelector("#ycls-tab-UDT3 > div > div.sv-row > div:nth-child(1) > div > div > div > div > h3");


    }









}
