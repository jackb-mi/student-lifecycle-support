package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class ProgrammeCreationValidationPage extends BasePage {

    private static final By CREATE_PROGRAMME_BUTTON = By.cssSelector("body > main > div > form > div > div.sv-panel-footer > div > div:nth-child(3) > input");

    public ProgrammeCreationValidationPage(WebDriver driver) {
        super(driver);
    }

    public ProgrammeCreatedPage selectCreateProgrammeButton() {
        clickElement(CREATE_PROGRAMME_BUTTON);

        return new ProgrammeCreatedPage(driver);
    }

}
