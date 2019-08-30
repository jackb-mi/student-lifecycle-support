package uk.ac.bristol.curriculum;

import org.testng.annotations.BeforeClass;
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

    private String username;
    private String password;
    private ProposalInformation pgProposalInformation;
    private ProposalInformation ugProposalInformation;
    private ProgrammeDetails pgResearchProgramme;
    private ProgrammeDetails pgTaughtProgramme;
    private ProgrammeDetails ugJointHonourIntegratedMastersType2Programme;
    private ProgrammeDetails subDegreeSingleHonourIntegratedMastersType3Programme;

    @BeforeClass
    public void dataSetUp() {
        username = "SLSP-CRT02";
        password = "Test@2PassBook_";

        pgProposalInformation = new ProposalInformationBuilder().withCommitteeLevel(CommitteeLevel.POSTGRADUATE).create();
        ugProposalInformation = new ProposalInformationBuilder().withCommitteeLevel(CommitteeLevel.UNDERGRADUATE).create();

        pgResearchProgramme = new ProgrammeDetailsBuilder().withProgrammeType(ProgrammeType.POSTGRADUATE_RESEARCH).create();
        pgTaughtProgramme = new ProgrammeDetailsBuilder().withProgrammeType(ProgrammeType.POSTGRADUATE_TAUGHT).create();
        ugJointHonourIntegratedMastersType2Programme = new ProgrammeDetailsBuilder()
                .withProgrammeType(ProgrammeType.UNDERGRADUATE)
                .withHonourLevel(HonourLevel.JOINT)
                .withIntegratedMastersType(IntegratedMastersType.INTEGRATED_MASTERS_TYPE_2)
                .create();
        subDegreeSingleHonourIntegratedMastersType3Programme = new ProgrammeDetailsBuilder()
                .withProgrammeType(ProgrammeType.SUB_DEGREE)
                .withHonourLevel(HonourLevel.SINGLE)
                .withIntegratedMastersType(IntegratedMastersType.INTEGRATED_MASTERS_TYPE_3)
                .create();
    }

    @Test
    public void shouldCreateNewProgrammeTypePostgraduateResearch() {
        // Given
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(username, password);
        // When
        ProgrammeCreationValidationPage programmeCreationValidationPage =
                completeCreateProgrammeDataInputs(programmeCreationProposalInformationPage, pgProposalInformation, pgResearchProgramme);

        ProgrammeCreatedPage programmeCreatedPage = programmeCreationValidationPage.selectCreateProgrammeButton();
        // Then
        assertThat(programmeCreatedPage.getProgrammeCreationSuccessMessage()).isEqualTo(ProgrammeCreatedPage.SUCCESSFUL_PROGRAMME_CREATION_TEXT);
    }

    @Test
    public void shouldCreateNewProgrammeTypePostgraduateTaught() {
        // Given
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(username, password);
        // When
        ProgrammeCreationValidationPage programmeCreationValidationPage =
                completeCreateProgrammeDataInputs(programmeCreationProposalInformationPage, pgProposalInformation, pgTaughtProgramme);

        ProgrammeCreatedPage programmeCreatedPage = programmeCreationValidationPage.selectCreateProgrammeButton();
        // Then
        assertThat(programmeCreatedPage.getProgrammeCreationSuccessMessage()).isEqualTo(ProgrammeCreatedPage.SUCCESSFUL_PROGRAMME_CREATION_TEXT);
    }

    @Test
    public void shouldCreateNewProgrammeTypeUndergraduateWithJointHonourLevelAndIntegratedMastersTypeTwo() {
        // Given
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(username, password);
        // When
        ProgrammeCreationValidationPage programmeCreationValidationPage =
                completeCreateProgrammeDataInputs(programmeCreationProposalInformationPage, ugProposalInformation, ugJointHonourIntegratedMastersType2Programme);

        ProgrammeCreatedPage programmeCreatedPage = programmeCreationValidationPage.selectCreateProgrammeButton();
        // Then
        assertThat(programmeCreatedPage.getProgrammeCreationSuccessMessage()).isEqualTo(ProgrammeCreatedPage.SUCCESSFUL_PROGRAMME_CREATION_TEXT);
    }

    @Test
    public void shouldCreateNewProgrammeTypeSubDegreeWithSingleHonourLevelAndIntegratedMastersTypeThree() {
        // Given
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(username, password);
        // When
        ProgrammeCreationValidationPage programmeCreationValidationPage = completeCreateProgrammeDataInputs(programmeCreationProposalInformationPage, ugProposalInformation, subDegreeSingleHonourIntegratedMastersType3Programme);
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

        ProgrammeCreationProgrammeDetailsPage programmeCreationProgrammeDetailsPage =
                programmeCreationProposalInformationPage.completeProgrammeCreationProposalInformationPage(proposalInformation);

        CreateProgrammeAddPathwaysPage createProgrammeAddPathwaysPage =
                programmeCreationProgrammeDetailsPage.completeProgrammeCreationProgrammeDetailsPage(programmeDetails);

        AddVariantsPage addVariantsPage =
                createProgrammeAddPathwaysPage.completeCreateProgrammeAddPathwaysPage(programmeDetails.getUniqueProgrammeIdentifier());

        return addVariantsPage.completeAddVariantsPage(programmeDetails);
    }
}
