package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class ProgrammeCreatedPage extends BasePage {

    public static final String SUCCESSFUL_PROGRAMME_CREATION_TEXT = "Programme Created";
    private static final By PROGRAMME_CREATE_SUCCESS_MESSAGE_IDENTIFIER = By.cssSelector("body > main > div > form > div > div > div > div.sv-panel-body > div > div > fieldset > div > div > div > div.sv-panel-heading > h3");

    public ProgrammeCreatedPage(ChromeDriver driver) {
        super(driver);
    }

    public String getProgrammeCreationSuccessMessage() {
        return getTextFromElement(PROGRAMME_CREATE_SUCCESS_MESSAGE_IDENTIFIER);
    }
}
