package uk.ac.bristol.helpers.navigationHelper;

import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.assessmentAndProgression.AssessmentAndProgressionPage;

public class AssessmentAndProgressionAccessFlows extends CommonNavigation {

    public AssessmentAndProgressionPage accessAssessmentAndProgressionPage(WebDriver driver, String username, String password) {
        HomePage homePage = shouldAccessHomepageForSiBetaEnvironment(driver, username, password);
        AssessmentAndProgressionPage assessmentAndProgressionPage = homePage.clickAssessmentAndProgressionLink();
        return assessmentAndProgressionPage;
    }


}
