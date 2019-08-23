package uk.ac.bristol.pageobjects.curriculum;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

import java.util.concurrent.TimeUnit;

public class ProgrammeCreationProgrammeDetailsPage extends BasePage {

    public static final String PAGE_TITLE = "Programme Creation - Programmme Details";
    private static final By PAGE_TITLE_IDENTIFIER = By.cssSelector(".sv-panel-title");
    private static final By TITLE_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.1.");
    private static final By FULL_NAME_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.3.");
    private static final By SHORT_NAME_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.4.");
    private static final By AWARD_INPUT_IDENTIFIER = By.id("ANSWER.TTQ.MENSYS.5.");
    //todo fix this
    private static final By AWARD_SELECTION_IDENTIFIER = By.xpath("//*[@id=\"ANSWER.TTQ.MENSYS.5.0.\"]");
    private static final By LOCATION_DROP_DOWN_IDENTIFIER = By.id("#ANSWER_TTQ_MENSYS_6__chosen > a > div > b");
    private static final By FIRST_LOCATION_RESULT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.6\\.0");


    public ProgrammeCreationProgrammeDetailsPage(ChromeDriver driver) {
        super(driver);
    }

    public String getPageTitle() {

        try {
            Awaitility.await().atMost(10L, TimeUnit.SECONDS).until(() -> {
                return this.isElementDisplayed(driver, this.PAGE_TITLE_IDENTIFIER);
            });
        } catch (ConditionTimeoutException var2) {
            Assert.fail("Page Title Not Found");
        }

        return this.getTextFromElement(this.PAGE_TITLE_IDENTIFIER);
    }

    public void enterTitle(String textToEnter) {
        enterTextIntoElement(TITLE_INPUT_IDENTIFIER, textToEnter);
    }


    public void enterFullName(String textToEnter) {
        enterTextIntoElement(FULL_NAME_INPUT_IDENTIFIER, textToEnter);
    }

    public void enterShortName(String textToEnter) {
        enterTextIntoElement(SHORT_NAME_INPUT_IDENTIFIER, textToEnter);
    }

    public void enterAward(String textToEnter) {
        enterTextIntoElement(AWARD_INPUT_IDENTIFIER, textToEnter);
        clickElement(AWARD_SELECTION_IDENTIFIER);
    }

    public void selectLocation() {
        clickElement(LOCATION_DROP_DOWN_IDENTIFIER);
        clickElement(FIRST_LOCATION_RESULT_IDENTIFIER);
    }
}
