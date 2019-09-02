package uk.ac.bristol.curriculum.createProposal;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.helpers.ProposalInformation;
import uk.ac.bristol.helpers.builders.ProposalInformationBuilder;
import uk.ac.bristol.helpers.navigationHelper.CurriculumManagementAccessFlows;
import uk.ac.bristol.pageobjects.curriculum.ProposalInformationPage;
import uk.ac.bristol.pageobjects.curriculum.ProposalSubmissionConfirmationPage;
import uk.ac.bristol.pageobjects.curriculum.SubmitProposalPage;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.ac.bristol.enums.CurriculumProposalApprovalLevel.*;

public class CreateCurriculumProposalSubmitForApprovalTest extends BaseTest {

    private String username;
    private String password;
    private ProposalInformation ugProposalOtherChangesThatRequireApprovalFaculty;
    private ProposalInformation pgProposalProgrammePathwaySuspensionUniversity;
    private ProposalInformation ugProposalProgrammePathwayWithdrawalUniversity;
    private ProposalInformation pgProposalNewProgrammesHighRiskChangesUniversity;
    private CurriculumManagementAccessFlows commonNavigation = new CurriculumManagementAccessFlows();

    @BeforeClass
    public void dataSetUp() {
        username = "SLSP-CRT02";
        password = "Test@2PassBook_";

        ugProposalOtherChangesThatRequireApprovalFaculty = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.UNDERGRADUATE)
                .withApprovalLevel(OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY)
                .create();

        pgProposalProgrammePathwaySuspensionUniversity = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.POSTGRADUATE)
                .withApprovalLevel(PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY)
                .create();

        ugProposalProgrammePathwayWithdrawalUniversity = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.UNDERGRADUATE)
                .withApprovalLevel(PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY)
                .create();

        pgProposalNewProgrammesHighRiskChangesUniversity = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.POSTGRADUATE)
                .withApprovalLevel(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY)
                .create();
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelOtherChangesThatRequireApprovalFaculty() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, ugProposalOtherChangesThatRequireApprovalFaculty.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(ugProposalOtherChangesThatRequireApprovalFaculty);
        // When
        ProposalSubmissionConfirmationPage proposalSubmissionConfirmationPage = submitProposalPage.submitProposalForApproval();
        // Then
        assertThat(proposalSubmissionConfirmationPage.getPageTitle()).isEqualTo(proposalSubmissionConfirmationPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelProgrammePathwaySuspensionUniversity() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, pgProposalProgrammePathwaySuspensionUniversity.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(pgProposalProgrammePathwaySuspensionUniversity);
        // When
        ProposalSubmissionConfirmationPage proposalSubmissionConfirmationPage = submitProposalPage.submitProposalForApproval();
        // Then
        assertThat(proposalSubmissionConfirmationPage.getPageTitle()).isEqualTo(proposalSubmissionConfirmationPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelProgrammePathwayWithdrawalUniversity() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, ugProposalProgrammePathwayWithdrawalUniversity.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(ugProposalProgrammePathwayWithdrawalUniversity);
        // When
        ProposalSubmissionConfirmationPage proposalSubmissionConfirmationPage = submitProposalPage.submitProposalForApproval();
        // Then
        assertThat(proposalSubmissionConfirmationPage.getPageTitle()).isEqualTo(proposalSubmissionConfirmationPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelNewProgrammeHighRiskChangesUniversity() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, pgProposalNewProgrammesHighRiskChangesUniversity.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(pgProposalNewProgrammesHighRiskChangesUniversity);
        // When
        ProposalSubmissionConfirmationPage proposalSubmissionConfirmationPage = submitProposalPage.submitProposalForApproval();
        // Then
        assertThat(proposalSubmissionConfirmationPage.getPageTitle()).isEqualTo(proposalSubmissionConfirmationPage.PAGE_TITLE);
    }
}