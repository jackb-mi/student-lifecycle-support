package uk.ac.bristol.curriculum;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevels;
import uk.ac.bristol.pageobjects.*;
import uk.ac.bristol.pageobjects.curriculum.*;

import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateCurriculumProposalTest extends BaseTest {

    private String curriculumUserUsername = "SLSP-CRT02";
    private String curriculumUserPassword = "Test@2PassBook_";

    @Test
    public void shouldCompleteCurriculumProposalWithApprovalLevelUnitUpdatesThatDoNotRequireApproval() {
        // Given
        ProposalLevelDecisionPage proposalLevelDecisionPage = accessProposalLevelDecisionPage(curriculumUserUsername, curriculumUserPassword);

        ProposalInformationPage proposalInformationPage =
                proposalLevelDecisionPage.startProposal(CurriculumProposalApprovalLevels.UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL);

        proposalInformationPage.completeProposalSection(CommitteeLevel.POSTGRADUATE);
        SubmitProposalPage submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton();
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteCurriculumProposalWithApprovalLevelOtherChangesThatRequireApprovalFaculty() throws InterruptedException {
        // Given
        ProposalLevelDecisionPage proposalLevelDecisionPage = accessProposalLevelDecisionPage(curriculumUserUsername, curriculumUserPassword);

        ProposalInformationPage proposalInformationPage =
                proposalLevelDecisionPage.startProposal(CurriculumProposalApprovalLevels.OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);

        proposalInformationPage.completeProposalSection(CommitteeLevel.POSTGRADUATE);
        proposalInformationPage.selectAndCompleteRationalSection();
        proposalInformationPage.selectAndCompleteEqualityAnalysisSection();
        proposalInformationPage.selectAndCompleteOrdinancesAndRegulationsSection();
        proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection();
        SubmitProposalPage submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton();
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }



    @Test
    public void shouldPerformUploadDuringCurriculumProposalCreation() throws InterruptedException, AWTException {
        // Given
        ProposalLevelDecisionPage proposalLevelDecisionPage = accessProposalLevelDecisionPage(curriculumUserUsername, curriculumUserPassword);

        ProposalInformationPage proposalInformationPage =
                proposalLevelDecisionPage.startProposal(CurriculumProposalApprovalLevels.NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);

        proposalInformationPage.completeProposalSection(CommitteeLevel.POSTGRADUATE);

        proposalInformationPage.selectSupportSection();
        // When
        UploadFilesPage uploadFilesPage = proposalInformationPage.selectUploadFileForExternalSupport();
        uploadFilesPage.selectBrowseForFileButton();
        //TODO complete upload action

        // Then
        // TODO assert upload action
    }

    public ProposalLevelDecisionPage accessProposalLevelDecisionPage(String curriculumUserUsername, String curriculumUserPassword) {

        HomePage homePage = shouldAccessHomepageForTestEnvironment(curriculumUserUsername, curriculumUserPassword);

        CurriculumPage curriculumPage = homePage.clickCurriculumLink();

        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = curriculumPage.selectCreateEditProposalsLink();
        return viewProposalsToEditSearchPage.selectNewProposalButton();

    }



}
