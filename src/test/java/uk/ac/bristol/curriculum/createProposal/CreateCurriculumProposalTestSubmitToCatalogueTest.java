package uk.ac.bristol.curriculum.createProposal;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.helpers.ProposalInformation;
import uk.ac.bristol.helpers.builders.ProposalInformationBuilder;
import uk.ac.bristol.helpers.navigationHelper.CurriculumManagementAccessFlows;
import uk.ac.bristol.pageobjects.curriculum.ProposalInformationPage;
import uk.ac.bristol.pageobjects.curriculum.SubmitProposalPage;
import uk.ac.bristol.pageobjects.curriculum.ViewProposalsToEditSearchPage;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.ac.bristol.enums.CurriculumProposalApprovalLevel.*;

public class CreateCurriculumProposalTestSubmitToCatalogueTest extends BaseTest {

    private String username;
    private String password;
    private ProposalInformation ugProposalUnitUpdatesThatDoNotRequireApproval;
    private ProposalInformation pgProposalOtherChangesThatRequireApprovalFaculty;
    private ProposalInformation ugProposalProgrammePathwaySuspensionUniversity;
    private ProposalInformation pgProposalProgrammePathwayWithdrawalUniversity;
    private ProposalInformation ugProposalNewProgrammesHighRiskChangesUniversity;
    private CurriculumManagementAccessFlows commonNavigation = new CurriculumManagementAccessFlows();


    @BeforeClass
    public void dataSetUp() {
        username = "SLSP-CRT02";
        password = "Test@2PassBook_";

        ugProposalUnitUpdatesThatDoNotRequireApproval = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.UNDERGRADUATE)
                .withApprovalLevel(UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL)
                .create();

        pgProposalOtherChangesThatRequireApprovalFaculty = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.POSTGRADUATE)
                .withApprovalLevel(OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY)
                .create();

        ugProposalProgrammePathwaySuspensionUniversity = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.UNDERGRADUATE)
                .withApprovalLevel(PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY)
                .create();

        pgProposalProgrammePathwayWithdrawalUniversity = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.POSTGRADUATE)
                .withApprovalLevel(PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY)
                .create();

        ugProposalNewProgrammesHighRiskChangesUniversity = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.UNDERGRADUATE)
                .withApprovalLevel(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY)
                .create();
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelUnitUpdatesThatDoNotRequireApproval() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, ugProposalUnitUpdatesThatDoNotRequireApproval.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(ugProposalUnitUpdatesThatDoNotRequireApproval);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelOtherChangesThatRequireApprovalFaculty() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, pgProposalOtherChangesThatRequireApprovalFaculty.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(pgProposalOtherChangesThatRequireApprovalFaculty);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelProgrammePathwaySuspensionUniversity() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, ugProposalProgrammePathwaySuspensionUniversity.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(ugProposalProgrammePathwaySuspensionUniversity);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelProgrammePathwayWithdrawalUniversity() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, pgProposalProgrammePathwayWithdrawalUniversity.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(pgProposalProgrammePathwayWithdrawalUniversity);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelNewProgrammeHighRiskChangesUniversity() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, ugProposalNewProgrammesHighRiskChangesUniversity.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(ugProposalNewProgrammesHighRiskChangesUniversity);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

}
