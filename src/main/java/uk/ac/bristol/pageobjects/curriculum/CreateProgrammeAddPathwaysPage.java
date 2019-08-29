package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class CreateProgrammeAddPathwaysPage extends BasePage {

    private static final By FULL_NAME_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.2.");
    private static final By AWARD_PRINT_NAME_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.4.");

    public CreateProgrammeAddPathwaysPage(ChromeDriver driver) {
        super(driver);
    }

    public AddVariantsPage selectNextButton() {

        clickElement(NEXT_BUTTON_IDENTIFIER);

        return new AddVariantsPage(driver);

    }

    public void enterFullName(String textToEnter) {
        enterTextIntoElement(FULL_NAME_INPUT_IDENTIFIER, textToEnter);

    }

    public void enterAwardPrintName(String textToEnter) {
        enterTextIntoElement(AWARD_PRINT_NAME_INPUT_IDENTIFIER, textToEnter);
    }
}
