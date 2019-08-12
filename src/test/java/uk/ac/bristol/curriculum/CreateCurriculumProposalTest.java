package uk.ac.bristol.curriculum;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevels;
import uk.ac.bristol.pageobjects.*;
import uk.ac.bristol.pageobjects.curriculum.*;

import static junit.framework.TestCase.fail;
import static org.assertj.core.api.Assertions.assertThat;
import static uk.ac.bristol.enums.CurriculumProposalApprovalLevels.*;
import static uk.ac.bristol.enums.CommitteeLevel.*;

public class CreateCurriculumProposalTest extends BaseTest {

    private String curriculumUserUsername = "SLSP-CRT02";
    private String curriculumUserPassword = "Test@2PassBook_";

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelUnitUpdatesThatDoNotRequireApproval() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, POSTGRADUATE, UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelUnitUpdatesThatDoNotRequireApproval() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, UNDERGRADUATE, UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelOtherChangesThatRequireApprovalFaculty() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, POSTGRADUATE, OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelOtherChangesThatRequireApprovalFaculty() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, UNDERGRADUATE, OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelProgrammePathwaySuspensionUniversity() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, POSTGRADUATE, PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelProgrammePathwaySuspensionUniversity() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, UNDERGRADUATE, PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelProgrammePathwayWithdrawalUniversity() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, POSTGRADUATE, PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelProgrammePathwayWithdrawalUniversity() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, UNDERGRADUATE, PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelNewProgrammeHighRiskChangesUniversity() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, POSTGRADUATE, NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelNewProgrammeHighRiskChangesUniversity() throws InterruptedException {
        // Given
        ProposalInformationPage proposalInformationPage = accessProposalLevelDecisionPageAndStartNewProposal(curriculumUserUsername, curriculumUserPassword, NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);

        SubmitProposalPage submitProposalPage = completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, UNDERGRADUATE, NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
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

    public SubmitProposalPage completeProposalSectionsAndPrepareToSubmitToCatalogue(ProposalInformationPage proposalInformationPage, CommitteeLevel committeeLevel, CurriculumProposalApprovalLevels proposalApprovalLevel) throws InterruptedException {

        SubmitProposalPage submitProposalPage = new SubmitProposalPage(driver);

        switch (proposalApprovalLevel) {
            case NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY: {
                proposalInformationPage.completeProposalSection(committeeLevel);
                proposalInformationPage.selectAndCompleteRationalSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteEqualityAnalysisSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteOrdinancesAndRegulationsSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteSupportSection();
                proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection(proposalApprovalLevel);
                submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(proposalApprovalLevel);
                return submitProposalPage;
            }
            case PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY: {
                proposalInformationPage.completeProposalSection(committeeLevel);
                proposalInformationPage.selectAndCompleteRationalSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteEqualityAnalysisSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteOrdinancesAndRegulationsSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection(proposalApprovalLevel);
                submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(proposalApprovalLevel);
                return submitProposalPage;
            }
            case PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY: {
                proposalInformationPage.completeProposalSection(committeeLevel);
                proposalInformationPage.selectAndCompleteRationalSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteEqualityAnalysisSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection(proposalApprovalLevel);
                submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(proposalApprovalLevel);
                return submitProposalPage;
            }
            case OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY: {
                proposalInformationPage.completeProposalSection(committeeLevel);
                proposalInformationPage.selectAndCompleteRationalSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteEqualityAnalysisSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteOrdinancesAndRegulationsSection(proposalApprovalLevel);
                proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection(proposalApprovalLevel);
                submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(proposalApprovalLevel);
                return submitProposalPage;
            }
            case UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL: {
                proposalInformationPage.completeProposalSection(committeeLevel);
                submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(proposalApprovalLevel);
                return submitProposalPage;
            }
            default:
                fail("Unknown Curriculum Proposal Approval Level");
        }
        return submitProposalPage;
    }

}
