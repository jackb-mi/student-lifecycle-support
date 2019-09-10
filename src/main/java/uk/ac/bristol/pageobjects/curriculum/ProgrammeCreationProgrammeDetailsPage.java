package uk.ac.bristol.pageobjects.curriculum;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import uk.ac.bristol.enums.*;
import uk.ac.bristol.helpers.ProgrammeDetails;
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
    private static final String LOCATION_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.6.";
    private static final By DISTANCE_LEARNING_DROPDOWN_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.7.");
    private static final By TYPE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_8__chosen > a > div > b");
    private static final String TYPE_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.8.";
    private static final By SINGLE_HONOUR_RADIO_BUTTON_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.9.1");
    private static final By JOINT_HONOUR_RADIO_BUTTON_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.9.2");
    private static final By SUBJECT_ONE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_10__chosen > a > div > b");
    private static final By FIRST_SUBJECT_ONE_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.10.0");
    private static final By DEPARTMENT_ONE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_12__chosen > a > div > b");
    private static final By FIRST_DEPARTMENT_ONE_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.12.0");
    private static final By DEPARTMENT_TWO_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_14__chosen > a > div > b");
    private static final By SECOND_DEPARTMENT_TWO_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.14.1");
    private static final String ADMISSIONS_ENTRY_LEVEL_RADIO_BUTTON_IDENTIFIER = "ANSWER.TTQ.MENSYS.17.";
    private static final By INTEGRATED_MASTERS_TYPE_DROPDOWN_IDENTIFIER = By.xpath("/html/body/main/div/form/div/div/div/div[2]/div/div/fieldset/div[18]/div/div/a/div/b");
    private static final String INTEGRATED_MASTERS_TYPE_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.18.";
    private static final By REPLACES_COURSES_INPUT_IDENTIFIER = By.id("ANSWER_TTQ_MENSYS_19__chosen");
    private static final By REPLACES_COURSES_FIRST_RESULT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.19.0");
    private static final By ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_20__chosen > a:nth-child(1) > div:nth-child(2) > b:nth-child(1)");
    private static final String ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.20.";
    private static final By YEAR_IN_INDUSTRY_STAGE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_21__chosen > a > div > b");
    private static final String YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.21.";
    private static final By STUDY_ABROAD_STAGE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_22__chosen > a > div > b");
    private static final String STUDY_ABROAD_STAGE_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.22.";
    private static final By INTERCALATING_STAGE_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_23__chosen > a > div > b");
    private static final String INTERCALATING_STAGE_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.23.";
    private static final By TEACHING_INSTITUTION_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_24__chosen > a > div > b");
    private static final String TEACHING_INSTITUTION_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.24.";
    private static final By AWARDING_INSTITUTION_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER_TTQ_MENSYS_25__chosen > a > div > b");
    private static final String AWARDING_INSTITUTION_RESULT_IDENTIFIER = "ANSWER.TTQ.MENSYS.25.";

    public ProgrammeCreationProgrammeDetailsPage(WebDriver driver) {
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


    public CreateProgrammeAddPathwaysPage completeProgrammeCreationProgrammeDetailsPage(ProgrammeDetails programmeDetails) {

        enterTitle(programmeDetails.getProgrammeTitle());
        enterFullName(programmeDetails.getProgrammeFullName());
        enterShortName(programmeDetails.getProgrammeShortName());
        enterAward(programmeDetails.getAward());
        selectLocation(programmeDetails.getLocation());
        selectDistanceLearningEtc(programmeDetails.getDistanceLearning());
        selectType(programmeDetails.getProgrammeType(), programmeDetails.getHonourLevel(), programmeDetails.getIntegratedMastersType());
        selectSubjectOne();
        selectDepartments(programmeDetails.getHonourLevel());
        selectAdmissionsEntryLevel(programmeDetails.getAdmissionsEntry());
        selectReplacesCourses();
        selectAcademicYearProgrammeIsGoingLiveIn(programmeDetails.getAcademicYear());
        selectYearInIndustryStage(programmeDetails.getYearInIndustryStage());
        selectStudyAbroadStage(programmeDetails.getStudyAbroadStage());
        selectIntercalatingStage(programmeDetails.getIntercalatingStage());
        selectTeachingInstitution(programmeDetails.getTeachingInstitution());
        selectAwardingInstitution(programmeDetails.getAwardingInstitution());

        return selectNextButton();
    }

    private void enterTitle(String textToEnter) {
        enterTextIntoElement(TITLE_INPUT_IDENTIFIER, textToEnter);
    }


    private void enterFullName(String textToEnter) {
        enterTextIntoElement(FULL_NAME_INPUT_IDENTIFIER, textToEnter);
    }

    private void enterShortName(String textToEnter) {
        enterTextIntoElement(SHORT_NAME_INPUT_IDENTIFIER, textToEnter);
    }

    private void enterAward(String textToEnter) {
        enterTextIntoElement(AWARD_INPUT_IDENTIFIER, textToEnter);
        WebElement webElement = driver.findElement(AWARD_INPUT_IDENTIFIER);
        webElement.sendKeys(Keys.TAB);
    }

    private void selectLocation(Location location) {
        clickElement(LOCATION_DROPDOWN_IDENTIFIER);
        switch (location) {
            case BRISTOL_CITY_FOOTBALL_CLUB_ASHTON_GATE: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "0"));
                break;
            }
            case COOMBE_DINGLE_SPORTS_CENTRE: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "1"));
                break;
            }
            case EXTERNAL: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "2"));
                break;
            }
            case LAW_DEPARTMENT: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "3"));
                break;
            }
            case LANGFORD: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "4"));
                break;
            }
            case LONG_ASHTON: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "5"));
                break;
            }
            case MAIN_PRECINCT: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "6"));
                break;
            }
            case PASSENGER_SHED_TEMPLE_MEADS_FORMER_COMMONWEALTH: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "8"));
                break;
            }
            case PITHAY_CITY_CENTRE: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "9"));
                break;
            }
            case UNIVERSTIY_OF_BRISTOL: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "10"));
                break;
            }
            case UNIVERSITY_OF_THE_WEST_OF_ENGLAND: {
                clickElement(By.id(LOCATION_RESULT_IDENTIFIER + "11"));
                break;
            }
            default:
                fail("Unknown Location");
        }
    }

    private void selectDistanceLearningEtc(DistanceLearning distanceLearningSelection) {
        selectDropDownOptionByValue(DISTANCE_LEARNING_DROPDOWN_IDENTIFIER, distanceLearningSelection.getValue());
    }

    private void selectType(ProgrammeType programmeType, HonourLevel honourLevel, IntegratedMastersType integratedMastersType) {
        scrollDown();
        clickElement(TYPE_DROPDOWN_IDENTIFIER);
        switch (programmeType) {
            case POSTGRADUATE_RESEARCH: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + "0"));
                break;
            }
            case POSTGRADUATE_TAUGHT: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + "1"));
                break;
            }
            case SUB_DEGREE: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + "2"));
                selectSingleOrJoinHonoursRadioButton(honourLevel);
                scrollDownTwo();
                selectIntegratedMastersType(integratedMastersType);
                break;
            }
            case UNDERGRADUATE: {
                clickElement(By.id(TYPE_RESULT_IDENTIFIER + "3"));
                selectSingleOrJoinHonoursRadioButton(honourLevel);
                scrollDownTwo();
                selectIntegratedMastersType(integratedMastersType);
                break;
            }
            default:
                fail("Unknown Programme Type");
        }
    }

    private void selectSingleOrJoinHonoursRadioButton(HonourLevel honourLevel) {
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
                clickElement(INTEGRATED_MASTERS_TYPE_DROPDOWN_IDENTIFIER);
                clickElement(By.id(INTEGRATED_MASTERS_TYPE_RESULT_IDENTIFIER+ "1"));
                break;
            }
            default:
                fail("Unknown Integrated Masters Type");
        }
    }


    private void selectSubjectOne() {
        clickElement(SUBJECT_ONE_DROPDOWN_IDENTIFIER);
        clickElement(FIRST_SUBJECT_ONE_RESULT_IDENTIFIER);
    }

    private void selectDepartments(HonourLevel honourLevel) {
        clickElement(DEPARTMENT_ONE_DROPDOWN_IDENTIFIER);
        clickElement(FIRST_DEPARTMENT_ONE_RESULT_IDENTIFIER);

        if (honourLevel == HonourLevel.JOINT) {
        clickElement(DEPARTMENT_TWO_DROPDOWN_IDENTIFIER);
        clickElement(SECOND_DEPARTMENT_TWO_RESULT_IDENTIFIER);
        }
    }

    private void selectAdmissionsEntryLevel(AdmissionsEntry directOnly) {
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

    private void selectReplacesCourses() {
        clickElement(REPLACES_COURSES_INPUT_IDENTIFIER);
        clickElement(REPLACES_COURSES_FIRST_RESULT_IDENTIFIER);
    }

    private void selectAcademicYearProgrammeIsGoingLiveIn(AcademicYear academicYear) {
        scrollDown();
        clickElement(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_DROPDOWN_IDENTIFIER);

        switch (academicYear) {
            case ACADEMIC_YEAR_2019_2020: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "0"));
                break;
            }
            case ACADEMIC_YEAR_2020_2021: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "1"));
                break;
            }
            case ACADEMIC_YEAR_2021_2022: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "2"));
                break;
            }
            case ACADEMIC_YEAR_2022_2023: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "3"));
                break;
            }
            case ACADEMIC_YEAR_2023_2024: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "4"));
                break;
            }
            case ACADEMIC_YEAR_2024_2025: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "5"));
                break;
            }
            case ACADEMIC_YEAR_2025_2026: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "6"));
                break;
            }
            case ACADEMIC_YEAR_2026_2027: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "7"));
                break;
            }
            case ACADEMIC_YEAR_2027_2028: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "8"));
                break;
            }
            case ACADEMIC_YEAR_2028_2029: {
                clickElement(By.id(ACADEMIC_YEAR_PROGRAMME_IS_GOING_LIVE_IN_RESULT_IDENTIFIER + "9"));
                break;
            }
            default:
                fail("Unknown Academic Year");
        }
    }

    private void selectYearInIndustryStage(YearInIndustryStage yearInIndustryStage) {
        clickElement(YEAR_IN_INDUSTRY_STAGE_DROPDOWN_IDENTIFIER);

        switch (yearInIndustryStage) {
            case ZERO: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "0"));
                break;
            }
            case ONE: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "1"));
                break;
            }
            case TWO: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "2"));
                break;
            }
            case THREE: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "3"));
                break;
            }
            case FOUR: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "4"));
                break;
            }
            case FIVE: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "5"));
                break;
            }
            case SIX: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "6"));
                break;
            }
            case SEVEN: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "7"));
                break;
            }
            case EIGHT: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "8"));
                break;
            }
            case NINE: {
                clickElement(By.id(YEAR_IN_INDUSTRY_STAGE_RESULT_IDENTIFIER + "9"));
                break;
            }
            default:
                fail("Unknown Year In Industry Stage");
        }
    }

    private void selectStudyAbroadStage(StudyAbroadStage studyAbroadStage) {
        clickElement(STUDY_ABROAD_STAGE_DROPDOWN_IDENTIFIER);
        switch (studyAbroadStage) {
            case ZERO: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "0"));
                break;
            }
            case ONE: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "1"));
                break;
            }
            case TWO: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "2"));
                break;
            }
            case THREE: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "3"));
                break;
            }
            case FOUR: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "4"));
                break;
            }
            case FIVE: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "5"));
                break;
            }
            case SIX: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "6"));
                break;
            }
            case SEVEN: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "7"));
                break;
            }
            case EIGHT: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "8"));
                break;
            }
            case NINE: {
                clickElement(By.id(STUDY_ABROAD_STAGE_RESULT_IDENTIFIER + "9"));
                break;
            }
            default:
                fail("Unknown Study Abroad Stage");
        }
    }

    private void selectIntercalatingStage(IntercalatingStage intercalatingStage) {
        clickElement(INTERCALATING_STAGE_DROPDOWN_IDENTIFIER);

        switch (intercalatingStage) {
            case ZERO: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "0"));
                break;
            }
            case ONE: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "1"));
                break;
            }
            case TWO: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "2"));
                break;
            }
            case THREE: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "3"));
                break;
            }
            case FOUR: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "4"));
                break;
            }
            case FIVE: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "5"));
                break;
            }
            case SIX: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "6"));
                break;
            }
            case SEVEN: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "7"));
                break;
            }
            case EIGHT: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "8"));
                break;
            }
            case NINE: {
                clickElement(By.id(INTERCALATING_STAGE_RESULT_IDENTIFIER + "9"));
                break;
            }
            default:
                fail("Unknown Intercalating Stage");
        }
    }

    private void selectTeachingInstitution(TeachingInstitution teachingInstitution) {
        clickElement(TEACHING_INSTITUTION_DROPDOWN_IDENTIFIER);

        switch (teachingInstitution) {
            case UNIVERSITY_OF_BRISTOL: {
                clickElement(By.id(TEACHING_INSTITUTION_RESULT_IDENTIFIER + "0"));
                break;
            }
            case UNIVERSITY_OF_BRISTOL_AND_THE_WEST_OF_ENGLAND: {
                clickElement(By.id(TEACHING_INSTITUTION_RESULT_IDENTIFIER + "1"));
                break;
            }
            default:
                fail("Unknown Teaching Institution");
        }
    }

    private void selectAwardingInstitution(AwardingInstitution awardingInstitution) {
        clickElement(AWARDING_INSTITUTION_DROPDOWN_IDENTIFIER);

        switch (awardingInstitution) {
            case UNIVERSITY_OF_BRISTOL: {
                clickElement(By.id(AWARDING_INSTITUTION_RESULT_IDENTIFIER + "0"));
                break;
            }
            case UNIVERSITY_OF_BRISTOL_AND_THE_WEST_OF_ENGLAND: {
                clickElement(By.id(AWARDING_INSTITUTION_RESULT_IDENTIFIER + "1"));
                break;
            }
            default:
                fail("Unknown Awarding Institution");
        }
    }

    private CreateProgrammeAddPathwaysPage selectNextButton() {
        clickElement(NEXT_BUTTON_IDENTIFIER);

        CreateProgrammeAddPathwaysPage createProgrammeAddPathwaysPage = new CreateProgrammeAddPathwaysPage(driver);
        return createProgrammeAddPathwaysPage;
    }
}
