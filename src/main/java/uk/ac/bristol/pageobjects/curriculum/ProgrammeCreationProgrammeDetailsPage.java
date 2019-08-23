package uk.ac.bristol.pageobjects.curriculum;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.enums.*;
import uk.ac.bristol.pageobjects.BasePage;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.fail;

public class ProgrammeCreationProgrammeDetailsPage extends BasePage {

    public static final String PAGE_TITLE = "Programme Creation - Programmme Details";
    private static final By PAGE_TITLE_IDENTIFIER = By.cssSelector(".sv-panel-title");
    private static final By TITLE_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.1.");
    private static final By FULL_NAME_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.3.");
    private static final By SHORT_NAME_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.4.");
    private static final By AWARD_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.5.");
    private static final By LOCATION_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_6__chosen > a > div > b");
    private static final By FIRST_LOCATION_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.6.0");
    private static final By DISTANCE_LEARNING_DROPDOWN_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.7.");
    private static final By TYPE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_8__chosen > a > div > b");
    private static final String TYPE_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.8.";
    private static final By SINGLE_HONOUR_RADIO_BUTTON_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.9.1");
    private static final By JOINT_HONOUR_RADIO_BUTTON_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.9.2");
    private static final By SUBJECT_ONE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_10__chosen > a > div > b");
    private static final By FIRST_SUBJECT_ONE_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.10.0");
    private static final By DEPARTMENT_ONE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_12__chosen > a > div > b");
    private static final By FIRST_DEPARTMENT_ONE_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.12.0");
    private static final String ADMISSIONS_ENTRY_LEVEL_RADIO_BUTTON_IDENTIFIER = "ANSWER.TTQ.MENSYS.17.";
    private static final By INTEGRATED_MASTERS_TYPE_DROPDOWN_IDENTIFIER = By.xpath("/html/body/main/div/form/div/div/div/div[2]/div/div/fieldset/div[18]/div/div/a/div/b");
    private static final String INTEGRATED_MASTERS_TYPE_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.18.";
    private static final By REPLACES_COURSES_INPUT_IDENTIFIER = By.id("ANSWER_TTQ_MENSYS_19__chosen");
    private static final By REPLACES_COURSES_FIRST_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.19.0");
    private static final By ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_20__chosen > a:nth-child(1) > div:nth-child(2) > b:nth-child(1)");
    private static final By FIRST_ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.20.0");
    private static final By YEAR_IN_INDUSTRY_STAGE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_21__chosen > a > div > b");
    private static final By YEAR_IN_INDUSTRY_STAGE_FIRST_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.21.0");
    private static final By STUDY_ABROAD_STAGE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_22__chosen > a > div > b");
    private static final By STUDY_ABROAD_STAGE_FIRST_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.22.0");
    private static final By INTERCALATING_STAGE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_23__chosen > a > div > b");
    private static final By INTERCALATING_STAGE_FIRST_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.23.0");
    private static final By TEACHING_INSTITUTION_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_24__chosen > a > div > b");
    private static final By TEACHING_INSTITUTION_FIRST_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.24.0");
    private static final By AWARDING_INSTITUTION_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_25__chosen > a > div > b");
    private static final By AWARDING_INSTITUTION_FIRST_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.25.0");


    public ProgrammeCreationProgrammeDetailsPage(ChromeDriver driver) {
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

    public void enterTitle(String textToEnter) {
        enterTextIntoElement(TITLE_INPUT_IDENTIFIER, textToEnter);
    }


    public void enterFullName(String textToEnter) {
        enterTextIntoElement(FULL_NAME_INPUT_IDENTIFIER, textToEnter);
    }

    public void enterShortName(String textToEnter) {
        enterTextIntoElement(SHORT_NAME_INPUT_IDENTIFIER, textToEnter);
    }

    public void enterAward(String textToEnter) {
        enterTextIntoElement(AWARD_INPUT_IDENTIFIER, textToEnter);
        WebElement webElement = driver.findElement(AWARD_INPUT_IDENTIFIER);
        webElement.sendKeys(Keys.TAB);
    }

    public void selectLocation() {
        clickElement(LOCATION_DROPDOWN_IDENTIFIER);
        clickElement(FIRST_LOCATION_RESULT_IDENTIFIER);
    }

    public void selectDistanceLearningEtc(DistanceLearning distanceLearningSelection) {
        selectDropDownOptionByValue(DISTANCE_LEARNING_DROPDOWN_IDENTIFIER, distanceLearningSelection.getValue());
    }

    public void selectType(ProgrammeType programmeType, HonourLevel honourLevel, IntegratedMastersType integratedMastersType) {

        clickElement(TYPE_DROPDOWN_IDENTIFIER);
        switch (programmeType) {
            case POSTGRADUATE_RESEARCH: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + 0));
                break;
            }
            case POSTGRADUATE_TAUGHT: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + 1));
                break;
            }
            case SUB_DEGREE: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + 2));
                selectSingleOrJoinHonoursRadioButton(honourLevel);
                scrollDown();
                selectIntegratedMastersType(integratedMastersType);
                break;
            }
            case UNDERGRADUATE: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + 3));
                selectSingleOrJoinHonoursRadioButton(honourLevel);
                scrollDown();
                selectIntegratedMastersType(integratedMastersType);
                break;
            }
            default:
                fail("Unknown Programme Type");
        }
    }

    public void selectSingleOrJoinHonoursRadioButton(HonourLevel honourLevel) {
        switch (honourLevel) {
            case JOINT: {
                clickElement(JOINT_HONOUR_RADIO_BUTTON_IDENTIFIER);
                break;
            }
            case SINGLE: {
                clickElement(SINGLE_HONOUR_RADIO_BUTTON_IDENTIFIER);
                break;
            }
            default:
                fail("Unknown Honour Level");
        }
    }

    private void selectIntegratedMastersType(IntegratedMastersType integratedMastersType) {
        switch (integratedMastersType) {
            case INTEGRATED_MASTERS_TYPE_2: {
                clickElement(INTEGRATED_MASTERS_TYPE_DROPDOWN_IDENTIFIER);
                clickElement(By.id(INTEGRATED_MASTERS_TYPE_RESULT_IDENTIFIER+ "0"));
                break;
            }
            case INTEGRATED_MASTERS_TYPE_3: {
                clickElement(SINGLE_HONOUR_RADIO_BUTTON_IDENTIFIER);
                clickElement(By.id(INTEGRATED_MASTERS_TYPE_RESULT_IDENTIFIER+ "1"));
                break;
            }
            default:
                fail("Unknown Honour Level");
        }
    }


    public void selectSubjectOne() {
        clickElement(SUBJECT_ONE_DROPDOWN_IDENTIFIER);
        clickElement(FIRST_SUBJECT_ONE_RESULT_IDENTIFIER);
    }

    public void selectDepartmentOne() {
        clickElement(DEPARTMENT_ONE_DROPDOWN_IDENTIFIER);
        clickElement(FIRST_DEPARTMENT_ONE_RESULT_IDENTIFIER);
    }

    public void selectAdmissionsEntryLevel(AdmissionsEntry directOnly) {
        switch (directOnly) {
            case DIRECT_ONLY: {
                clickElement(By.id(ADMISSIONS_ENTRY_LEVEL_RADIO_BUTTON_IDENTIFIER + "1"));
                break;
            }
            case GTTR_AND_DIRECT: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + "2"));
                break;
            }
            case TRANSFER_ONLY: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + "3"));
                break;
            }
            case UCAS_AND_DIRECT: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + "4"));
                break;
            }
            default:
                fail("Unknown Admissions Entry Type");
        }
    }

    public void selectReplacesCourses() {
        clickElement(REPLACES_COURSES_INPUT_IDENTIFIER);
        clickElement(REPLACES_COURSES_FIRST_RESULT_IDENTIFIER);
    }

    public void selectAcademicYearProgrammeIsGoingLiveIn() {
        scrollDown();
        clickElement(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_DROPDOWN_IDENTIFIER);
        clickElement(FIRST_ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER);
    }

    public void selectYearInIndustryStage() {
        clickElement(YEAR_IN_INDUSTRY_STAGE_DROPDOWN_IDENTIFIER);
        clickElement(YEAR_IN_INDUSTRY_STAGE_FIRST_RESULT_IDENTIFIER);
    }

    public void selectStudyAbroadStage() {
        clickElement(STUDY_ABROAD_STAGE_DROPDOWN_IDENTIFIER);
        clickElement(STUDY_ABROAD_STAGE_FIRST_RESULT_IDENTIFIER);
    }

    public void selectIntercalatingStage() {
        clickElement(INTERCALATING_STAGE_DROPDOWN_IDENTIFIER);
        clickElement(INTERCALATING_STAGE_FIRST_RESULT_IDENTIFIER);
    }

    public void selectTeachingInstitution() {
        clickElement(TEACHING_INSTITUTION_DROPDOWN_IDENTIFIER);
        clickElement(TEACHING_INSTITUTION_FIRST_RESULT_IDENTIFIER);
    }

    public void selectAwardingInstitution() {
        clickElement(AWARDING_INSTITUTION_DROPDOWN_IDENTIFIER);
        clickElement(AWARDING_INSTITUTION_FIRST_RESULT_IDENTIFIER);
    }

    public CreateProgrammeAddPathwaysPage selectNextButton() {
        clickElement(NEXT_BUTTON_IDENTIFIER);

        return new CreateProgrammeAddPathwaysPage(driver);
    }
}
