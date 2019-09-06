package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class CurriculumPage extends BasePage {

    private static final By CREATE_EDIT_PROPOSAL_LINK_IDENTIFIER = By.cssSelector("div.sv-panel:nth-child(1) > div:nth-child(4) > a:nth-child(1)");
    private static final By CREATE_NEW_PROGRAMME_LINK_IDENTIFIER = By.cssSelector("body > main > div > div.sv-row > div > div:nth-child(1) > div.sv-list-group > a:nth-child(2)");


    public CurriculumPage(WebDriver driver) {
        super(driver);
    }

    public ViewProposalsToEditSearchPage selectCreateEditProposalsLink() {

        clickElement(CREATE_EDIT_PROPOSAL_LINK_IDENTIFIER);

        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = new ViewProposalsToEditSearchPage(driver);
        return viewProposalsToEditSearchPage;
    }

    public ProgrammeCreationProposalInformationPage selectCreateNewProgrammeLink() {
        clickElement(CREATE_NEW_PROGRAMME_LINK_IDENTIFIER);

        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage = new ProgrammeCreationProposalInformationPage(driver);
        return programmeCreationProposalInformationPage;
    }
}
