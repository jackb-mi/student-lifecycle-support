package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class WithdrawalProposalConfirmationDecisionPage extends BasePage {

    public static final By PAGE_TITLE_IDENTIFIER = By.cssSelector("body > main > div > form > div > div > div > div.sv-panel-heading > h2");
    public static final By NEXT_BUTTON_IDENTIFIER = By.name("NEXT.DUMMY.MENSYS.1");
    public static final By ARE_YOU_SURE_MESSAGE_TEXT_IDENTIFIER = By.cssSelector("body > main > div > form > div > div > div > div.sv-panel-body > div > div > fieldset > p:nth-child(3)");
    public static final String ARE_YOU_SURE_MESSAGE = "Are you sure you want to withdraw proposal";

    public WithdrawalProposalConfirmationDecisionPage(ChromeDriver driver) {
        super(driver);
    }

    public String getAreYouSureMessageText() {
        return getTextFromElement(ARE_YOU_SURE_MESSAGE_TEXT_IDENTIFIER);
    }

    public ViewProposalsToEditSearchPage selectNextButton() {
        clickElement(NEXT_BUTTON_IDENTIFIER);

        return new ViewProposalsToEditSearchPage(driver);
    }
}
