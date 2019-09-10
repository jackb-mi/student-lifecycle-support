package uk.ac.bristol.pageobjects.curriculum;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.enums.CommitteeApprovalLevel;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.enums.Faculty;
import uk.ac.bristol.pageobjects.BasePage;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.fail;

public class ViewCommitteePapersSearchPage extends BasePage {

    public static final String PAGE_TITLE = "View Committee Papers";
    private static final By PAGE_TITLE_IDENTIFIER = By.cssSelector(".sv-panel-title");
    private static final By COMMITTEE_LEVEL_DROPDOWN_IDENTIFIER = By.name("POP_UDEF.POP.MENSYS.1-1");
    private static final By SCHOOL_SEARCH_TEXT_IDENTIFIER = By.name("POP_UDEF.POP.MENSYS.2-1");
    private static final By FACULTY_DROPDOWN_IDENTIFIER = By.name("POP_UDEF.POP.MENSYS.3-1");
    private static final By SEARCH_BUTTON_IDENTIFIER = By.name("BP103.DUMMY_B.MENSYS.1");
    private static final By UG_RADIO_BUTTON_IDENTIFIER = By.xpath("//*[@id=\"POP_UDEF.F3ACB95AD09911E99483D36F7F23575B.POP.MENSYS.4-11\"]");
    private static final By PG_RADIO_BUTTON_IDENTIFIER = By.xpath("//*[@id=\"POP_UDEF.F3ACB95AD09911E99483D36F7F23575B.POP.MENSYS.4-12\"]");
    private static final By BOTH_RADIO_BUTTON_IDENTIFIER = By.xpath("//*[@id=\"POP_UDEF.F3ACB95AD09911E99483D36F7F23575B.POP.MENSYS.4-13\"]");

    public ViewCommitteePapersSearchPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {

        try {
            Awaitility.await().atMost(10L, TimeUnit.SECONDS).until(() -> {
                return this.isElementDisplayed(driver, this.PAGE_TITLE_IDENTIFIER);
            });
        } catch (ConditionTimeoutException var2) {
            Assert.fail("Page Title Not Found");
        }

        return this.getTextFromElement(this.PAGE_TITLE_IDENTIFIER);
    }

    public ViewCommitteePapersSearchResultsPage performSchoolCommitteeSearch(String schoolSearchText, CommitteeLevel committeeLevel) {
        selectCommitteeLevel(CommitteeApprovalLevel.SCHOOL_COMMITTEE);
        clearTextFromElement(SCHOOL_SEARCH_TEXT_IDENTIFIER);
        enterSchool(schoolSearchText);
//        selectUndergraduatePostGraduateRadioButton(committeeLevel);
        return selectSearchButton();
    }

    public ViewCommitteePapersSearchResultsPage performFacultyCommitteeSearch(Faculty faculty, CommitteeLevel committeeLevel) {
        selectCommitteeLevel(CommitteeApprovalLevel.FACULTY_COMMITTEE);
        selectFaculty(faculty);
//        selectUndergraduatePostGraduateRadioButton(committeeLevel);
        return selectSearchButton();
    }

    public ViewCommitteePapersSearchResultsPage performUniversityEducationCommitteeSearch(CommitteeLevel committeeLevel) {
        selectCommitteeLevel(CommitteeApprovalLevel.UNIVERSITY_EDUCATION_COMMITTEE);
//        selectUndergraduatePostGraduateRadioButton(committeeLevel);
        return selectSearchButton();
    }

    private void selectCommitteeLevel(CommitteeApprovalLevel schoolCommittee) {
        selectDropDownOptionByValue(COMMITTEE_LEVEL_DROPDOWN_IDENTIFIER, schoolCommittee.getValue());
    }

    private void enterSchool(String textToEnter) {
        enterTextIntoElement(SCHOOL_SEARCH_TEXT_IDENTIFIER, textToEnter);
    }

    private void selectFaculty(Faculty faculty) {
        selectDropDownOptionByValue(FACULTY_DROPDOWN_IDENTIFIER, faculty.getValue());
    }

    private void selectUndergraduatePostGraduateRadioButton(CommitteeLevel committeeLevel) {
        switch (committeeLevel) {
            case UNDERGRADUATE: {
                clickElement(UG_RADIO_BUTTON_IDENTIFIER);
                break;
            }
            case POSTGRADUATE: {
                clickElement(PG_RADIO_BUTTON_IDENTIFIER);
                break;
            }
            case BOTH: {
                clickElement(BOTH_RADIO_BUTTON_IDENTIFIER);
                break;
            }
            default:
                fail("Unknown Committee Level");
        }
    }

    private ViewCommitteePapersSearchResultsPage selectSearchButton() {
        clickElement(SEARCH_BUTTON_IDENTIFIER);

        ViewCommitteePapersSearchResultsPage viewCommitteePapersSearchResultsPage = new ViewCommitteePapersSearchResultsPage(driver);
        return viewCommitteePapersSearchResultsPage;
    }
}
