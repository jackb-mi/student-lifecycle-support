package uk.ac.bristol.pageobjects.curriculum;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.helpers.ProposalInformation;
import uk.ac.bristol.pageobjects.BasePage;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.fail;

public class ProgrammeCreationProposalInformationPage extends BasePage {

    public static final String PAGE_TITLE = "Programme Creation - Proposal Information";
    private static final By PAGE_TITLE_IDENTIFIER = By.cssSelector(".sv-panel-title");
    private static final By PROPOSAL_TITLE_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.1\\.");
    private static final By ACADEMIC_RESPONSIBLE_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.2\\.");
    private static final By SCHOOL_PROGRAMME_EDITOR_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_3__chosen > a > div > b");
    private static final By SCHOOL_PROGRAMME_EDITOR_DROPDOWN_TEXT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_3__chosen > div > div > input[type=text]");
    private static final By SCHOOL_PROGRAMME_EDITOR_DROPDOWN_FIRST_SEARCH_RESULT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.3\\.0");

    private static final By OWNING_DEPARTMENT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.4\\.");
    private static final By POSTGRADUATE_RADIO_BUTTON_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.5\\.1");
    private static final By UNDERGRADUATE_RADIO_BUTTON_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.5\\.2");
    private static final By NEXT_BUTTON_IDENTIFIER = By.name("NEXT.DUMMY.MENSYS.1");


    public ProgrammeCreationProposalInformationPage(WebDriver driver) {
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

    public ProgrammeCreationProgrammeDetailsPage completeProgrammeCreationProposalInformationPage(ProposalInformation proposalInformation) {
        enterProposalTitle(proposalInformation.getProposalTitle());
        enterAcademicResponsible(proposalInformation.getAcademicResponsible());
        selectSchoolProgrammeEditor(proposalInformation.getSchoolProgrammeEditor());
        enterOwningDepartment(proposalInformation.getOwningDepartment());
        selectCommitteeLevel(proposalInformation.getCommitteeLevel());
        return selectNextButton();
    }


    private void enterProposalTitle(String textToEnter) {
        enterTextIntoElement(PROPOSAL_TITLE_INPUT_IDENTIFIER, textToEnter);
    }

    private void enterAcademicResponsible(String textToEnter) {
        enterTextIntoElement(ACADEMIC_RESPONSIBLE_INPUT_IDENTIFIER, textToEnter);
    }

    private void enterOwningDepartment(String textToEnter) {
        enterTextIntoElement(OWNING_DEPARTMENT_INPUT_IDENTIFIER, textToEnter);
    }

    private void selectCommitteeLevel(CommitteeLevel committeeLevel) {
        switch (committeeLevel) {
            case POSTGRADUATE: {
                clickElement(POSTGRADUATE_RADIO_BUTTON_IDENTIFIER);
                break;
            }
            case UNDERGRADUATE: {
                clickElement(UNDERGRADUATE_RADIO_BUTTON_IDENTIFIER);
                break;
            }
            default :
                fail("Unknown Committee Level");
        }
    }

    private void selectSchoolProgrammeEditor(String value) {
        clickElement(SCHOOL_PROGRAMME_EDITOR_DROPDOWN_IDENTIFIER);
        enterTextIntoElement(SCHOOL_PROGRAMME_EDITOR_DROPDOWN_TEXT_INPUT_IDENTIFIER, value);
        clickElement(SCHOOL_PROGRAMME_EDITOR_DROPDOWN_FIRST_SEARCH_RESULT_IDENTIFIER);
    }

    private ProgrammeCreationProgrammeDetailsPage selectNextButton() {
        clickElement(NEXT_BUTTON_IDENTIFIER);

        ProgrammeCreationProgrammeDetailsPage programmeCreationProgrammeDetailsPage = new ProgrammeCreationProgrammeDetailsPage(driver);
        return programmeCreationProgrammeDetailsPage;
    }
}
