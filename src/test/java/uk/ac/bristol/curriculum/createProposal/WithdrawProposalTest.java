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
import uk.ac.bristol.pageobjects.curriculum.WithdrawalProposalConfirmationDecisionPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static uk.ac.bristol.enums.CurriculumProposalApprovalLevel.OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY;

public class WithdrawProposalTest extends BaseTest {

    private String username;
    private String password;
    private ProposalInformation ugProposalOtherChangesThatRequireApprovalFaculty;
    private CurriculumManagementAccessFlows commonNavigation = new CurriculumManagementAccessFlows();

    @BeforeClass
    public void dataSetUp() {
        username = "SLSP-CRT02";
        password = "Test@2PassBook_";

        ugProposalOtherChangesThatRequireApprovalFaculty = new ProposalInformationBuilder()
                .withCommitteeLevel(CommitteeLevel.UNDERGRADUATE)
                .withApprovalLevel(OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY)
                .create();
    }

    @Test
    public void shouldDisplayAreYouSureMessageOnWithdrawalProposalConfirmationDecisionPage() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, ugProposalOtherChangesThatRequireApprovalFaculty.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(ugProposalOtherChangesThatRequireApprovalFaculty);
        // When
        WithdrawalProposalConfirmationDecisionPage withdrawalProposalConfirmationDecisionPage = submitProposalPage.selectWithdrawProposalButton();
        // Then
        assertThat(withdrawalProposalConfirmationDecisionPage.getAreYouSureMessageText()).contains(withdrawalProposalConfirmationDecisionPage.ARE_YOU_SURE_MESSAGE);
    }

    @Test
    public void shouldWithdrawalProposalDuringCreateProposalFlow() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                commonNavigation.accessProposalLevelDecisionPageAndStartNewProposal(driver, username, password, ugProposalOtherChangesThatRequireApprovalFaculty.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                proposalInformationPage.completeProposalSectionsAndPrepareToSubmitToCatalogue(ugProposalOtherChangesThatRequireApprovalFaculty);
        // When
        WithdrawalProposalConfirmationDecisionPage withdrawalProposalConfirmationDecisionPage = submitProposalPage.selectWithdrawProposalButton();
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = withdrawalProposalConfirmationDecisionPage.selectNextButton();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }
}
