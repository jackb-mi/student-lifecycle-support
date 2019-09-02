package uk.ac.bristol.helpers.navigationHelper;

import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevel;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.curriculum.*;

public class CurriculumManagementAccessFlows extends CommonNavigation {


    public ProgrammeCreationProposalInformationPage accessCreateNewProgrammePage(ChromeDriver driver, String curriculumUserUsername, String curriculumUserPassword) {
        HomePage homePage = shouldAccessHomepageForTestEnvironment(driver, curriculumUserUsername, curriculumUserPassword);
        CurriculumPage curriculumPage = homePage.clickCurriculumLink();
        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage = curriculumPage.selectCreateNewProgrammeLink();
        return programmeCreationProposalInformationPage;
    }

    public ProposalInformationPage accessProposalLevelDecisionPageAndStartNewProposal(ChromeDriver driver, String username, String password, CurriculumProposalApprovalLevel proposalApprovalLevel) {

        HomePage homePage = shouldAccessHomepageForTestEnvironment(driver, username, password);
        CurriculumPage curriculumPage = homePage.clickCurriculumLink();
        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = curriculumPage.selectCreateEditProposalsLink();
        ProposalLevelDecisionPage proposalLevelDecisionPage = viewProposalsToEditSearchPage.selectNewProposalButton();
        ProposalInformationPage proposalInformationPage = proposalLevelDecisionPage.startProposal(proposalApprovalLevel);

        return proposalInformationPage;
    }
}
