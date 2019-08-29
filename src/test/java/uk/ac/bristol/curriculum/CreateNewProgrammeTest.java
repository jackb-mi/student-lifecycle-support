package uk.ac.bristol.curriculum;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.*;
import uk.ac.bristol.helpers.ProgrammeDetails;
import uk.ac.bristol.helpers.ProposalInformation;
import uk.ac.bristol.helpers.builders.ProgrammeDetailsBuilder;
import uk.ac.bristol.helpers.builders.ProposalInformationBuilder;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.curriculum.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateNewProgrammeTest extends BaseTest {

    private String curriculumUserUsername = "SLSP-CRT02";
    private String curriculumUserPassword = "Test@2PassBook_";

    @Test
    public void shouldCreateNewProgrammeTypePostgraduateResearch() {
        // Given
        ProposalInformation proposalInformation = new ProposalInformationBuilder().create();
        ProgrammeDetails programmeDetails = new ProgrammeDetailsBuilder().create();
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(curriculumUserUsername, curriculumUserPassword);
        // When
        ProgrammeCreationValidationPage programmeCreationValidationPage = completeCreateProgrammeDataInputs(programmeCreationProposalInformationPage, proposalInformation, programmeDetails);
        ProgrammeCreatedPage programmeCreatedPage = programmeCreationValidationPage.selectCreateProgrammeButton();
        // Then
        assertThat(programmeCreatedPage.getProgrammeCreationSuccessMessage()).isEqualTo(ProgrammeCreatedPage.SUCCESSFUL_PROGRAMME_CREATION_TEXT);
    }

    @Test
    public void shouldCreateNewProgrammeTypePostgraduateTaught() {
        // Given
        ProposalInformation proposalInformation = new ProposalInformationBuilder().create();
        ProgrammeDetails programmeDetails = new ProgrammeDetailsBuilder()
                .withProgrammeType(ProgrammeType.POSTGRADUATE_TAUGHT)
                .create();
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(curriculumUserUsername, curriculumUserPassword);
        // When
        ProgrammeCreationValidationPage programmeCreationValidationPage = completeCreateProgrammeDataInputs(programmeCreationProposalInformationPage, proposalInformation, programmeDetails);
        ProgrammeCreatedPage programmeCreatedPage = programmeCreationValidationPage.selectCreateProgrammeButton();
        // Then
        assertThat(programmeCreatedPage.getProgrammeCreationSuccessMessage()).isEqualTo(ProgrammeCreatedPage.SUCCESSFUL_PROGRAMME_CREATION_TEXT);
    }

    @Test
    public void shouldCreateNewProgrammeTypeUndergraduateWithJointHonourLevelAndIntegratedMastersTypeTwo() {
        // Given
        ProposalInformation proposalInformation = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.UNDERGRADUATE)
                .create();
        ProgrammeDetails programmeDetails = new ProgrammeDetailsBuilder()
                .withProgrammeType(ProgrammeType.UNDERGRADUATE)
                .withHonourLevel(HonourLevel.JOINT)
                .withIntegratedMastersType(IntegratedMastersType.INTEGRATED_MASTERS_TYPE_2)
                .create();
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(curriculumUserUsername, curriculumUserPassword);
        // When
        ProgrammeCreationValidationPage programmeCreationValidationPage = completeCreateProgrammeDataInputs(programmeCreationProposalInformationPage, proposalInformation, programmeDetails);
        ProgrammeCreatedPage programmeCreatedPage = programmeCreationValidationPage.selectCreateProgrammeButton();
        // Then
        assertThat(programmeCreatedPage.getProgrammeCreationSuccessMessage()).isEqualTo(ProgrammeCreatedPage.SUCCESSFUL_PROGRAMME_CREATION_TEXT);
    }

    @Test
    public void shouldCreateNewProgrammeTypeSubDegreeWithSingleHonourLevelAndIntegratedMastersTypeThree() {
        // Given
        ProposalInformation proposalInformation = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.UNDERGRADUATE)
                .create();
        ProgrammeDetails programmeDetails = new ProgrammeDetailsBuilder()
                .withProgrammeType(ProgrammeType.SUB_DEGREE)
                .withHonourLevel(HonourLevel.SINGLE)
                .withIntegratedMastersType(IntegratedMastersType.INTEGRATED_MASTERS_TYPE_3)
                .create();
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(curriculumUserUsername, curriculumUserPassword);
        // When
        ProgrammeCreationValidationPage programmeCreationValidationPage = completeCreateProgrammeDataInputs(programmeCreationProposalInformationPage, proposalInformation, programmeDetails);
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

    private ProgrammeCreationValidationPage completeCreateProgrammeDataInputs(ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage, ProposalInformation proposalInformation, ProgrammeDetails programmeDetails) {

        ProgrammeCreationProgrammeDetailsPage programmeCreationProgrammeDetailsPage = completeProgrammeCreationProposalInformationPage(programmeCreationProposalInformationPage, proposalInformation);
        CreateProgrammeAddPathwaysPage createProgrammeAddPathwaysPage = completeProgrammeCreationProgrammeDetailsPage(programmeCreationProgrammeDetailsPage, programmeDetails);
        AddVariantsPage addVariantsPage = completeCreateProgrammeAddPathwaysPage(createProgrammeAddPathwaysPage, programmeDetails.getUniqueProgrammeIdentifier());
        return completeAddVariantsPage(addVariantsPage);

    }

    private ProgrammeCreationProgrammeDetailsPage completeProgrammeCreationProposalInformationPage(ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage, ProposalInformation proposalInformation) {
        programmeCreationProposalInformationPage.enterProposalTitle(proposalInformation.getProposalTitle());
        programmeCreationProposalInformationPage.enterAcademicResponsible(proposalInformation.getAcademicResponsible());
        programmeCreationProposalInformationPage.selectSchoolProgrammeEditor(proposalInformation.getSchoolProgrammeEditor());
        programmeCreationProposalInformationPage.enterOwningDepartment(proposalInformation.getOwningDepartment());
        programmeCreationProposalInformationPage.selectCommitteeLevel(proposalInformation.getCommitteeLevel());
        return programmeCreationProposalInformationPage.selectNextButton();

    }

    private CreateProgrammeAddPathwaysPage completeProgrammeCreationProgrammeDetailsPage(ProgrammeCreationProgrammeDetailsPage programmeCreationProgrammeDetailsPage, ProgrammeDetails programmeDetails) {

        programmeCreationProgrammeDetailsPage.enterTitle(programmeDetails.getProgrammeTitle());
        programmeCreationProgrammeDetailsPage.enterFullName(programmeDetails.getProgrammeFullName());
        programmeCreationProgrammeDetailsPage.enterShortName(programmeDetails.getProgrammeShortName());
        programmeCreationProgrammeDetailsPage.enterAward(programmeDetails.getAward());
        programmeCreationProgrammeDetailsPage.selectLocation(programmeDetails.getLocation());
        programmeCreationProgrammeDetailsPage.selectDistanceLearningEtc(programmeDetails.getDistanceLearning());
        programmeCreationProgrammeDetailsPage.selectType(programmeDetails.getProgrammeType(), programmeDetails.getHonourLevel(), programmeDetails.getIntegratedMastersType());
        programmeCreationProgrammeDetailsPage.selectSubjectOne();
        programmeCreationProgrammeDetailsPage.selectDepartments(programmeDetails.getHonourLevel());
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
