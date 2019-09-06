package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class SubmitProposalPage extends BasePage {

    public static final By SUBMIT_TO_CATALOGUE_BUTTON_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.7\\.");
    private static final By SUBMIT_FOR_APPROVAL_BUTTON_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.6.");
    private static final By WITHDRAW_PROPOSAL_BUTTON_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.5.");

    public SubmitProposalPage(WebDriver driver) {
        super(driver);
    }

    public ProposalSubmissionConfirmationPage submitProposalForApproval() {
        clickElement(SUBMIT_FOR_APPROVAL_BUTTON_IDENTIFIER);
        return new ProposalSubmissionConfirmationPage(driver);
    }

    public ViewProposalsToEditSearchPage submitProposalToCatalogue() {
        clickElement(SUBMIT_TO_CATALOGUE_BUTTON_IDENTIFIER);
        return new ViewProposalsToEditSearchPage(driver);
    }

    public WithdrawalProposalConfirmationDecisionPage selectWithdrawProposalButton() {
        clickElement(WITHDRAW_PROPOSAL_BUTTON_IDENTIFIER);
        return new WithdrawalProposalConfirmationDecisionPage(driver);
    }
}
