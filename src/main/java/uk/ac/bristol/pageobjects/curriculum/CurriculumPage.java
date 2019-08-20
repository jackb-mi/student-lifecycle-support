package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class CurriculumPage extends BasePage {
    public CurriculumPage(ChromeDriver driver) {
        super(driver);
    }

    public ViewProposalsToEditSearchPage selectCreateEditProposalsLink() {

        driver.findElement(By.cssSelector("div.sv-panel:nth-child(1) > div:nth-child(4) > a:nth-child(1)")).click();

        ViewProposalsToEditSearchPage viewProposalsToEditSearchPage = new ViewProposalsToEditSearchPage(driver);
        return viewProposalsToEditSearchPage;
    }
}
