package uk.ac.bristol.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewProposalsToEditSearchPage extends BasePage {

    public ViewProposalsToEditSearchPage(ChromeDriver driver) {
        super(driver);
    }


    public ProposalLevelDecisionPage selectNewProposalButton() {

        driver.findElement(By.cssSelector("#poddatasection > div.sv-panel.sv-panel-primary > div.sv-panel-body > div > div > fieldset > span > div > div > a")).click();

        ProposalLevelDecisionPage proposalLevelDecisionPage = new ProposalLevelDecisionPage(driver);
        return proposalLevelDecisionPage;
    }
}
