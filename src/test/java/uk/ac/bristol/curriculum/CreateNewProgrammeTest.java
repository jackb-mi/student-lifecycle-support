package uk.ac.bristol.curriculum;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.*;
import uk.ac.bristol.helpers.RandomData;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.curriculum.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateNewProgrammeTest extends BaseTest {

    private String curriculumUserUsername = "SLSP-CRT02";
    private String curriculumUserPassword = "Test@2PassBook_";

    @Test
    public void shouldCreateNewProgrammeWithMandatoryOptionsOnly() {

        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(curriculumUserUsername, curriculumUserPassword);

//        assertThat(programmeCreationProposalInformationPage.getPageTitle()).isEqualTo(programmeCreationProposalInformationPage.PAGE_TITLE);

        programmeCreationProposalInformationPage.enterProposalTitle("Test");
        programmeCreationProposalInformationPage.enterAcademicResponsible("XXXTEST3");
        programmeCreationProposalInformationPage.selectDropDownOption("Crt Slsp-CRT01");
        programmeCreationProposalInformationPage.enterOwningDepartment("SART");
        programmeCreationProposalInformationPage.selectPostgraduateRadioButton();
        ProgrammeCreationProgrammeDetailsPage programmeCreationProgrammeDetailsPage = programmeCreationProposalInformationPage.selectNextButton();

        String randomText = RandomData.alphaNumericString(4);
        programmeCreationProgrammeDetailsPage.enterTitle("Test Title " + randomText);
        programmeCreationProgrammeDetailsPage.enterFullName("Test Full Name " + randomText);
        programmeCreationProgrammeDetailsPage.enterShortName("Test" + randomText);
        programmeCreationProgrammeDetailsPage.enterAward("BA01");
        programmeCreationProgrammeDetailsPage.selectLocation();
        programmeCreationProgrammeDetailsPage.selectDistanceLearningEtc(DistanceLearning.ON_CAMPUS);
//        programmeCreationProgrammeDetailsPage.selectType(ProgrammeType.UNDERGRADUATE, HonourLevel.SINGLE, IntegratedMastersType.INTEGRATED_MASTERS_TYPE_2);
        programmeCreationProgrammeDetailsPage.selectType(ProgrammeType.POSTGRADUATE_RESEARCH, HonourLevel.NOT_APPLICABLE, IntegratedMastersType.NOT_APPLICABLE);
        programmeCreationProgrammeDetailsPage.selectSubjectOne();
        programmeCreationProgrammeDetailsPage.selectDepartmentOne();
        programmeCreationProgrammeDetailsPage.selectAdmissionsEntryLevel(AdmissionsEntry.DIRECT_ONLY);
        programmeCreationProgrammeDetailsPage.selectReplacesCourses();
        programmeCreationProgrammeDetailsPage.selectAcademicYearProgrammeIsGoingLiveIn();
        programmeCreationProgrammeDetailsPage.selectYearInIndustryStage();
        programmeCreationProgrammeDetailsPage.selectStudyAbroadStage();
        programmeCreationProgrammeDetailsPage.selectIntercalatingStage();
        programmeCreationProgrammeDetailsPage.selectTeachingInstitution();
        programmeCreationProgrammeDetailsPage.selectAwardingInstitution();
        CreateProgrammeAddPathwaysPage createProgrammeAddPathwaysPage = programmeCreationProgrammeDetailsPage.selectNextButton();

//        createProgrammeAddPathwaysPage.enterFullName();
//        createProgrammeAddPathwaysPage.enterAwardPrintName();
//        createProgrammeAddPathwaysPage.enterShortName();

        AddVariantsPage addVariantsPage = createProgrammeAddPathwaysPage.selectNextButton();
        addVariantsPage.selectIntensity(ProgrammeIntensity.FULL_TIME);
        addVariantsPage.selectIntakeMonth(IntakeMonth.OCTOBER_START);
        addVariantsPage.enterLength("3");
        addVariantsPage.selectUnitsOfMeasurement(UnitOfMeasurement.YEARS);
        addVariantsPage.selectAddVariantButton();
        ProgrammeCreationValidationPage programmeCreationValidationPage = addVariantsPage.selectCreateProgrammeButton();

        ProgrammeCreatedPage programmeCreatedPage = programmeCreationValidationPage.selectCreateProgrammeButton();
        assertThat(programmeCreatedPage.getProgrammeCreationSuccessMessage()).isEqualTo(ProgrammeCreatedPage.SUCCESSFUL_PROGRAMME_CREATION_TEXT);
    }

    public ProgrammeCreationProposalInformationPage accessCreateNewProgrammePage(String curriculumUserUsername, String curriculumUserPassword) {

        HomePage homePage = shouldAccessHomepageForTestEnvironment(curriculumUserUsername, curriculumUserPassword);

        CurriculumPage curriculumPage = homePage.clickCurriculumLink();

        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage = curriculumPage.selectCreateNewProgrammeLink();
        return programmeCreationProposalInformationPage;
    }
}
