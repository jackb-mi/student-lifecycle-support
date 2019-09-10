package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevel;
import uk.ac.bristol.pageobjects.BasePage;

public class ProposalLevelDecisionPage extends BasePage {

    private static final By APPROVAL_LEVEL_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.1\\.");

    private static final By NEXT_BUTTON_IDENTIFIER = By.cssSelector("input.sv-col-xs-12:nth-child(2)");

    public ProposalLevelDecisionPage(WebDriver driver) {
        super(driver);
    }


    public ProposalInformationPage startProposal(CurriculumProposalApprovalLevel approvalLevel) {

        selectDropDownOption(approvalLevel.getValue());
        ProposalInformationPage proposalInformationPage = selectNextButton();
        return proposalInformationPage;
    }

    private ProposalInformationPage selectNextButton() {
        clickElement(NEXT_BUTTON_IDENTIFIER);

        ProposalInformationPage proposalInformationPage = new ProposalInformationPage(driver);

        return proposalInformationPage;
    }

    private void selectDropDownOption(String value) {

        waitUntilElementIsVisibleAndIsClickable(APPROVAL_LEVEL_DROPDOWN_IDENTIFIER);
        Select dropDownValue = new Select(driver.findElement(APPROVAL_LEVEL_DROPDOWN_IDENTIFIER));
        dropDownValue.selectByValue(value);
    }
}
