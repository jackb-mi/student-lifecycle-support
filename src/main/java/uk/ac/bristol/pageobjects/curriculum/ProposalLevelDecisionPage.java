package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevels;
import uk.ac.bristol.pageobjects.BasePage;

public class ProposalLevelDecisionPage extends BasePage {

    private static final By APPROVAL_LEVEL_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.1\\.");

    private static final By NEXT_BUTTON_IDENTIFIER = By.cssSelector("input.sv-col-xs-12:nth-child(2)");

    public ProposalLevelDecisionPage(ChromeDriver driver) {
        super(driver);
    }


    public ProposalInformationPage startProposal(CurriculumProposalApprovalLevels approvalLevel) {

        selectDropDownOption(approvalLevel.getValue());
        ProposalInformationPage proposalInformationPage = selectNextButton();
        return proposalInformationPage;
    }

    private ProposalInformationPage selectNextButton() {
        driver.findElement(NEXT_BUTTON_IDENTIFIER).click();

        ProposalInformationPage proposalInformationPage = new ProposalInformationPage(driver);

        return proposalInformationPage;
    }

    private void selectDropDownOption(String value) {

        Select dropDownValue = new Select(driver.findElement(APPROVAL_LEVEL_DROPDOWN_IDENTIFIER));
        dropDownValue.selectByValue(value);
    }
}
