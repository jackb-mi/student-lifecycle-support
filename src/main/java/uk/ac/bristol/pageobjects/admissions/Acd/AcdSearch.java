package uk.ac.bristol.pageobjects.admissions.Acd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class AcdSearch extends BasePage {
    public AcdSearch(WebDriver driver) { super(driver);}

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
