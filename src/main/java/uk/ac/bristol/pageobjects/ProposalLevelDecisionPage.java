package uk.ac.bristol.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProposalLevelDecisionPage extends BasePage {

    public ProposalLevelDecisionPage(ChromeDriver driver) {
        super(driver);
    }


    public void selectNewProgrammeHighRiskChangesOptionFromDropDown() {

        driver.findElement(By.cssSelector(".sv-col-sm-4")).click();
        driver.findElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.1\\. > option:nth-child(2)")).click();
    }

    public ProposalInformationPage selectNextButton() {
        driver.findElement(By.cssSelector("input.sv-col-xs-12:nth-child(2)")).click();

        ProposalInformationPage proposalInformationPage = new ProposalInformationPage(driver);

        return proposalInformationPage;
    }
}
