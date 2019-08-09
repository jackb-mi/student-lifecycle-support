package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class SubmitProposalPage extends BasePage {

    public static final By SUBMIT_TO_CATALOGUE_BUTTON_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.7\\.");

    public SubmitProposalPage(ChromeDriver driver) {
        super(driver);
    }

    public ViewProposalsToEditSearchPage submitProposalToCatalogue() {
        clickElement(SUBMIT_TO_CATALOGUE_BUTTON_IDENTIFIER);

        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = new ViewProposalsToEditSearchPage(driver);
        return viewProposalsToEditSearchPage;
    }
}
