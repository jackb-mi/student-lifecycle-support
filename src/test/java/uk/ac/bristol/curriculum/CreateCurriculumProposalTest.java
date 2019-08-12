package uk.ac.bristol.curriculum;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevels;
import uk.ac.bristol.pageobjects.*;
import uk.ac.bristol.pageobjects.curriculum.*;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.ac.bristol.enums.CurriculumProposalApprovalLevels.*;

public class CreateCurriculumProposalTest extends BaseTest {

    private String curriculumUserUsername = "SLSP-CRT02";
    private String curriculumUserPassword = "Test@2PassBook_";

    @Test
    public void shouldCompleteCurriculumProposalWithApprovalLevelUnitUpdatesThatDoNotRequireApproval() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL);

        proposalInformationPage.completeProposalSection(CommitteeLevel.POSTGRADUATE);
        SubmitProposalPage submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteCurriculumProposalWithApprovalLevelOtherChangesThatRequireApprovalFaculty() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);

        proposalInformationPage.completeProposalSection(CommitteeLevel.POSTGRADUATE);
        proposalInformationPage.selectAndCompleteRationalSection(OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);
        proposalInformationPage.selectAndCompleteEqualityAnalysisSection(OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);
        proposalInformationPage.selectAndCompleteOrdinancesAndRegulationsSection(OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);
        proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection(OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);
        SubmitProposalPage submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteCurriculumProposalWithApprovalLevelPROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY() {

    }

    @Test
    public void shouldCompleteCurriculumProposalWithApprovalLevelNewProgrammeHighRiskChangesUniversity() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);

        proposalInformationPage.completeProposalSection(CommitteeLevel.POSTGRADUATE);
        proposalInformationPage.selectAndCompleteRationalSection(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
        proposalInformationPage.selectAndCompleteEqualityAnalysisSection(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
        proposalInformationPage.selectAndCompleteOrdinancesAndRegulationsSection(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
        proposalInformationPage.selectAndCompleteSupportSection();
        proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
        SubmitProposalPage submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    public ProposalInformationPage accessProposalLevelDecisionPageAndStartNewProposal(String curriculumUserUsername, String curriculumUserPassword, CurriculumProposalApprovalLevels proposalApprovalLevel) {

        HomePage homePage = shouldAccessHomepageForTestEnvironment(curriculumUserUsername, curriculumUserPassword);

        CurriculumPage curriculumPage = homePage.clickCurriculumLink();

        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = curriculumPage.selectCreateEditProposalsLink();
        ProposalLevelDecisionPage proposalLevelDecisionPage = viewProposalsToEditSearchPage.selectNewProposalButton();
        ProposalInformationPage proposalInformationPage = proposalLevelDecisionPage.startProposal(proposalApprovalLevel);

        return proposalInformationPage;
    }

}
