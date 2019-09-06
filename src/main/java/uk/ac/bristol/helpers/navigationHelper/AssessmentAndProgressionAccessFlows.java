package uk.ac.bristol.helpers.navigationHelper;

import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.assessmentAndProgression.AssessmentAndProgressionPage;

public class AssessmentAndProgressionAccessFlows extends CommonNavigation {

    public AssessmentAndProgressionPage accessAssessmentAndProgressionPage(ChromeDriver driver, String username, String password) {
        HomePage homePage = shouldAccessHomepageForSiBetaEnvironment(driver, username, password);
        AssessmentAndProgressionPage assessmentAndProgressionPage = homePage.clickAssessmentAndProgressionLink();
        return assessmentAndProgressionPage;
    }


}
