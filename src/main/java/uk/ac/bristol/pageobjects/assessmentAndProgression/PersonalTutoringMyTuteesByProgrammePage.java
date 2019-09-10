package uk.ac.bristol.pageobjects.assessmentAndProgression;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

import java.util.concurrent.TimeUnit;

public class PersonalTutoringMyTuteesByProgrammePage extends BasePage {

    public static final String PAGE_TITLE = "Personal Tutoring: My tutees by programme";
    private static final By PAGE_TITLE_IDENTIFIER = By.cssSelector(".sv-panel-title");

    public PersonalTutoringMyTuteesByProgrammePage(WebDriver driver) {
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
}
