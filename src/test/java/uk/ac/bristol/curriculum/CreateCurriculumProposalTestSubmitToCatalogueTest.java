package uk.ac.bristol.curriculum;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevel;
import uk.ac.bristol.helpers.ProposalInformation;
import uk.ac.bristol.helpers.builders.ProposalInformationBuilder;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.curriculum.*;

import static junit.framework.TestCase.fail;
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
                accessProposalLevelDecisionPageAndStartNewProposal(ugProposalUnitUpdatesThatDoNotRequireApproval.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, ugProposalUnitUpdatesThatDoNotRequireApproval);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelOtherChangesThatRequireApprovalFaculty() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                accessProposalLevelDecisionPageAndStartNewProposal(pgProposalOtherChangesThatRequireApprovalFaculty.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, pgProposalOtherChangesThatRequireApprovalFaculty);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelProgrammePathwaySuspensionUniversity() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                accessProposalLevelDecisionPageAndStartNewProposal(ugProposalProgrammePathwaySuspensionUniversity.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, ugProposalProgrammePathwaySuspensionUniversity);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompletePostgraduateCurriculumProposalWithApprovalLevelProgrammePathwayWithdrawalUniversity() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                accessProposalLevelDecisionPageAndStartNewProposal(pgProposalProgrammePathwayWithdrawalUniversity.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, pgProposalProgrammePathwayWithdrawalUniversity);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    @Test
    public void shouldCompleteUndergraduateCurriculumProposalWithApprovalLevelNewProgrammeHighRiskChangesUniversity() throws Exception {
        // Given
        ProposalInformationPage proposalInformationPage =
                accessProposalLevelDecisionPageAndStartNewProposal(ugProposalNewProgrammesHighRiskChangesUniversity.getApprovalLevel());

        SubmitProposalPage submitProposalPage =
                completeProposalSectionsAndPrepareToSubmitToCatalogue(proposalInformationPage, ugProposalNewProgrammesHighRiskChangesUniversity);
        // When
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = submitProposalPage.submitProposalToCatalogue();
        // Then
        assertThat(viewProposalsToEditSearchPage.getPageTitle()).isEqualTo(viewProposalsToEditSearchPage.PAGE_TITLE);
    }

    public ProposalInformationPage accessProposalLevelDecisionPageAndStartNewProposal(CurriculumProposalApprovalLevel proposalApprovalLevel) {

        HomePage homePage = shouldAccessHomepageForTestEnvironment(username, password);
        CurriculumPage curriculumPage = homePage.clickCurriculumLink();
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = curriculumPage.selectCreateEditProposalsLink();
        ProposalLevelDecisionPage proposalLevelDecisionPage = viewProposalsToEditSearchPage.selectNewProposalButton();
        ProposalInformationPage proposalInformationPage = proposalLevelDecisionPage.startProposal(proposalApprovalLevel);

        return proposalInformationPage;
    }

    public SubmitProposalPage completeProposalSectionsAndPrepareToSubmitToCatalogue(ProposalInformationPage proposalInformationPage, ProposalInformation proposalInformation) throws Exception {

        SubmitProposalPage submitProposalPage = new SubmitProposalPage(driver);

        switch (proposalInformation.getApprovalLevel()) {
            case NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY: {
                proposalInformationPage.completeProposalSection(proposalInformation);
                proposalInformationPage.selectAndCompleteRationalSection(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
                proposalInformationPage.selectAndCompleteEqualityAnalysisSection(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
                proposalInformationPage.selectAndCompleteOrdinancesAndRegulationsSection(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
                proposalInformationPage.selectAndCompleteSupportSection();
                proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
                submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY);
                return submitProposalPage;
            }
            case PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY:
            case OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY: {
                proposalInformationPage.completeProposalSection(proposalInformation);
                proposalInformationPage.selectAndCompleteRationalSection(proposalInformation.getApprovalLevel());
                proposalInformationPage.selectAndCompleteEqualityAnalysisSection(proposalInformation.getApprovalLevel());
                proposalInformationPage.selectAndCompleteOrdinancesAndRegulationsSection(proposalInformation.getApprovalLevel());
                proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection(proposalInformation.getApprovalLevel());
                submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(proposalInformation.getApprovalLevel());
                return submitProposalPage;
            }
            case PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY: {
                proposalInformationPage.completeProposalSection(proposalInformation);
                proposalInformationPage.selectAndCompleteRationalSection(PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY);
                proposalInformationPage.selectAndCompleteEqualityAnalysisSection(PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY);
                proposalInformationPage.selectAndCompleteStudentsAndApplicantsSection(PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY);
                submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY);
                return submitProposalPage;
            }
            case UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL: {
                proposalInformationPage.completeProposalSection(proposalInformation);
                submitProposalPage = proposalInformationPage.selectPrepareToSubmitProposalButton(UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL);
                return submitProposalPage;
            }
            default:
                fail("Unknown Curriculum Proposal Approval Level");
        }
        return submitProposalPage;
    }

}
