package uk.ac.bristol.pageobjects.admissions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class ACD extends BasePage {
    public ACD (WebDriver driver) { super(driver); }

    public static final String PAGE_TITLE = "Adpplicantion Clearance & Decision Entry";

    public static final By PREVIOUS_BUTTON_IDENTIFIER = By.xpath("//div[contains(text(), 'Upload')]");
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

}
