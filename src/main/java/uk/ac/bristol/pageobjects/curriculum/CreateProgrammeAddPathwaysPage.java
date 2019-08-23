package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class CreateProgrammeAddPathwaysPage extends BasePage {

    public CreateProgrammeAddPathwaysPage(ChromeDriver driver) {
        super(driver);
    }

    public AddVariantsPage selectNextButton() {

        clickElement(NEXT_BUTTON_IDENTIFIER);

        return new AddVariantsPage(driver);

    }
}
