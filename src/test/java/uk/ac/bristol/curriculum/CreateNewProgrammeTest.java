package uk.ac.bristol.curriculum;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.IntakeMonth;
import uk.ac.bristol.enums.ProgrammeIntensity;
import uk.ac.bristol.enums.UnitOfMeasurement;
import uk.ac.bristol.helpers.ProgrammeDetails;
import uk.ac.bristol.helpers.builders.ProgrammeDetailsBuilder;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.curriculum.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateNewProgrammeTest extends BaseTest {

    private String curriculumUserUsername = "SLSP-CRT02";
    private String curriculumUserPassword = "Test@2PassBook_";

    @Test
    public void shouldCreateNewProgramme() {
        // Given
        ProgrammeDetails programmeDetails = new ProgrammeDetailsBuilder().create();
//                //TODO add create(); method
//                .withAward("BA01")
//                .withLocation(Location.BRISTOL_CITY_FOOTBALL_CLUB_ASHTON_GATE)
//                .withDistanceLearning(DistanceLearning.ON_CAMPUS)
//                .withProgrammeType(ProgrammeType.POSTGRADUATE_RESEARCH)
//                .withHonourLevel(HonourLevel.NOT_APPLICABLE)
//                .withIntegratedMastersType(IntegratedMastersType.NOT_APPLICABLE)
//                .withAdmissionsEntry(AdmissionsEntry.DIRECT_ONLY)
//                .withAcademicYear(AcademicYear.ACADEMIC_YEAR_2019_2020)
//                .withYearInIndustryStage(YearInIndustryStage.TWO)
//                .withStudyAbroadStage(StudyAbroadStage.ZERO)
//                .withIntercalatingStage(IntercalatingStage.ZERO)
//                .withTeachingInstitution(TeachingInstitution.UNIVERSITY_OF_BRISTOL)
//                .withAwardingInstitution(AwardingInstitution.UNIVERSITY_OF_BRISTOL);

        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(curriculumUserUsername, curriculumUserPassword);
        // When
        ProgrammeCreationValidationPage programmeCreationValidationPage = completeCreateProgrammeDataInputs(programmeCreationProposalInformationPage, programmeDetails);
        ProgrammeCreatedPage programmeCreatedPage = programmeCreationValidationPage.selectCreateProgrammeButton();
        // Then
        assertThat(programmeCreatedPage.getProgrammeCreationSuccessMessage()).isEqualTo(ProgrammeCreatedPage.SUCCESSFUL_PROGRAMME_CREATION_TEXT);
    }

    private ProgrammeCreationProposalInformationPage accessCreateNewProgrammePage(String curriculumUserUsername, String curriculumUserPassword) {
        HomePage homePage = shouldAccessHomepageForTestEnvironment(curriculumUserUsername, curriculumUserPassword);
        CurriculumPage curriculumPage = homePage.clickCurriculumLink();
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage = curriculumPage.selectCreateNewProgrammeLink();
        return programmeCreationProposalInformationPage;
    }

    private ProgrammeCreationValidationPage completeCreateProgrammeDataInputs(ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage, ProgrammeDetails programmeDetails) {

        ProgrammeCreationProgrammeDetailsPage programmeCreationProgrammeDetailsPage = completeProgrammeCreationProposalInformationPage(programmeCreationProposalInformationPage);
        CreateProgrammeAddPathwaysPage createProgrammeAddPathwaysPage = completeProgrammeCreationProgrammeDetailsPage(programmeCreationProgrammeDetailsPage, programmeDetails);
        AddVariantsPage addVariantsPage = completeCreateProgrammeAddPathwaysPage(createProgrammeAddPathwaysPage, programmeDetails.getUniqueProgrammeIdentifier());
        return completeAddVariantsPage(addVariantsPage);

    }

    private ProgrammeCreationProgrammeDetailsPage completeProgrammeCreationProposalInformationPage(ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage) {
        //TODO create ProposalInfoBuilder
        programmeCreationProposalInformationPage.enterProposalTitle("Test ");
        programmeCreationProposalInformationPage.enterAcademicResponsible("XXXTEST3");
        programmeCreationProposalInformationPage.selectDropDownOption("Crt Slsp-CRT01");
        programmeCreationProposalInformationPage.enterOwningDepartment("SART");
        programmeCreationProposalInformationPage.selectPostgraduateRadioButton();
        return programmeCreationProposalInformationPage.selectNextButton();

    }

    private CreateProgrammeAddPathwaysPage completeProgrammeCreationProgrammeDetailsPage(ProgrammeCreationProgrammeDetailsPage programmeCreationProgrammeDetailsPage, ProgrammeDetails programmeDetails) {

        programmeCreationProgrammeDetailsPage.enterTitle(programmeDetails.getProgrammeTitle());
        programmeCreationProgrammeDetailsPage.enterFullName(programmeDetails.getProgrammeFullName());
        programmeCreationProgrammeDetailsPage.enterShortName(programmeDetails.getProgrammeShortName());
        programmeCreationProgrammeDetailsPage.enterAward(programmeDetails.getAward());
        programmeCreationProgrammeDetailsPage.selectLocation(programmeDetails.getLocation());
        programmeCreationProgrammeDetailsPage.selectDistanceLearningEtc(programmeDetails.getDistanceLearning());
//        programmeCreationProgrammeDetailsPage.selectType(ProgrammeType.UNDERGRADUATE, HonourLevel.SINGLE, IntegratedMastersType.INTEGRATED_MASTERS_TYPE_2);
        programmeCreationProgrammeDetailsPage.selectType(programmeDetails.getProgrammeType(), programmeDetails.getHonourLevel(), programmeDetails.getIntegratedMastersType());
        programmeCreationProgrammeDetailsPage.selectSubjectOne();
        programmeCreationProgrammeDetailsPage.selectDepartmentOne();
        programmeCreationProgrammeDetailsPage.selectAdmissionsEntryLevel(programmeDetails.getAdmissionsEntry());
        programmeCreationProgrammeDetailsPage.selectReplacesCourses();
        programmeCreationProgrammeDetailsPage.selectAcademicYearProgrammeIsGoingLiveIn(programmeDetails.getAcademicYear());
        programmeCreationProgrammeDetailsPage.selectYearInIndustryStage(programmeDetails.getYearInIndustryStage());
        programmeCreationProgrammeDetailsPage.selectStudyAbroadStage(programmeDetails.getStudyAbroadStage());
        programmeCreationProgrammeDetailsPage.selectIntercalatingStage(programmeDetails.getIntercalatingStage());
        programmeCreationProgrammeDetailsPage.selectTeachingInstitution(programmeDetails.getTeachingInstitution());
        programmeCreationProgrammeDetailsPage.selectAwardingInstitution(programmeDetails.getAwardingInstitution());

        return programmeCreationProgrammeDetailsPage.selectNextButton();
    }

    private AddVariantsPage completeCreateProgrammeAddPathwaysPage(CreateProgrammeAddPathwaysPage createProgrammeAddPathwaysPage, String uniqueProgrammeTextIdentifier) {
        createProgrammeAddPathwaysPage.enterFullName("Pathway " + uniqueProgrammeTextIdentifier);
        createProgrammeAddPathwaysPage.enterAwardPrintName("Award " + uniqueProgrammeTextIdentifier);
        return createProgrammeAddPathwaysPage.selectNextButton();
    }

    private ProgrammeCreationValidationPage completeAddVariantsPage(AddVariantsPage addVariantsPage) {
        //TODO add variant build info
        addVariantsPage.selectIntensity(ProgrammeIntensity.FULL_TIME);
        addVariantsPage.selectIntakeMonth(IntakeMonth.OCTOBER_START);
        addVariantsPage.enterLength("3");
        addVariantsPage.selectUnitsOfMeasurement(UnitOfMeasurement.YEARS);
        addVariantsPage.selectAddVariantButton();
        return addVariantsPage.selectCreateProgrammeButton();
    }
}
