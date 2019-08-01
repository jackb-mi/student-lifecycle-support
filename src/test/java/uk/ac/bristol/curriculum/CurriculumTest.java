package uk.ac.bristol.curriculum;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.pageobjects.*;

import java.awt.*;

public class CurriculumTest extends BaseTest {

    private String curriculumUserUsername = "SLSP-CRT02";
    private String curriculumUserPassword = "Test@2PassBook_";

    @Test
    public void shouldPerformUploadDuringCurriculumProposal() throws InterruptedException, AWTException {

        // Given
        HomePage homePage = shouldAccessHomepageForTestEnvironment(curriculumUserUsername, curriculumUserPassword);
        // When
        CurriculumPage curriculumPage = homePage.clickCurriculumLink();
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = curriculumPage.selectCreateEditProposalsLink();
        ProposalLevelDecisionPage proposalLevelDecisionPage = viewProposalsToEditSearchPage.selectNewProposalButton();
        proposalLevelDecisionPage.selectNewProgrammeHighRiskChangesOptionFromDropDown();
        ProposalInformationPage proposalInformationPage = proposalLevelDecisionPage.selectNextButton();

        proposalInformationPage.enterProposalName("Test123");
        proposalInformationPage.enterOwningSchoolDepartment("SART");
        proposalInformationPage.enterAcademicResponsible("XXXTEST3");
        proposalInformationPage.selectPostgraduateOptionFromCommitteeLevelDropDown();

        proposalInformationPage.selectSupportSection();
        UploadFilesPage uploadFilesPage = proposalInformationPage.selectUploadFileForExternalSupport();
        uploadFilesPage.selectBrowseForFileButton();
        //
    }
}
