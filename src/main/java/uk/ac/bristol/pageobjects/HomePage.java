package uk.ac.bristol.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.admissionspageobjects.AdmissionsPage;
import uk.ac.bristol.pageobjects.assessmentAndProgression.AssessmentAndProgressionPage;
import uk.ac.bristol.pageobjects.curriculum.CurriculumPage;

public class HomePage extends BasePage {
    private static final By ADMISSIONS_LINK_IDENTIFIER = By.linkText("Admissions");
    private static final By CURRICULUM_LINK_IDENTIFIER = By.id("CRT001");
    private static final By REGISTRATIONS_LINK_IDENTIFIER = By.cssSelector("#REG001");
    private static final By ASSESSMENT_AND_PROGRESSION_LINK_IDENTIFIER = By.cssSelector("#EXA001");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AdmissionsPage clickAdmissionsLink() {
        try {
            waitForElementToBeDisplayed(ADMISSIONS_LINK_IDENTIFIER, driver, 10);
            driver.findElement(ADMISSIONS_LINK_IDENTIFIER).click();
        } catch (NoSuchElementException var2) {
            Assert.fail("Admissions Link Not Found");
        }

        AdmissionsPage admissionsPage = new AdmissionsPage(driver);
        return admissionsPage;
    }

    public CurriculumPage clickCurriculumLink() {
        try {
            clickElement(CURRICULUM_LINK_IDENTIFIER);
        } catch (NoSuchElementException var2) {
            Assert.fail("Curriculum Link Not Found");
        }

        CurriculumPage curriculumPage = new CurriculumPage(driver);
        return curriculumPage;
    }

    public AssessmentAndProgressionPage clickAssessmentAndProgressionLink() {
        try {
            clickElement(ASSESSMENT_AND_PROGRESSION_LINK_IDENTIFIER);
        } catch (NoSuchElementException var2) {
            Assert.fail("Curriculum Link Not Found");
        }

        AssessmentAndProgressionPage assessmentAndProgressionPage = new AssessmentAndProgressionPage(driver);
        return assessmentAndProgressionPage;
    }
}
