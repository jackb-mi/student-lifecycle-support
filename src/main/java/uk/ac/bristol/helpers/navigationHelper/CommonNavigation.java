package uk.ac.bristol.helpers.navigationHelper;

import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.LoginPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.AdmissionsApplicantDashboardPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.AdmissionsApplicantLoginPage;

public class CommonNavigation {

    public LoginPage loadLoginPageForSLSTestEnvironment(ChromeDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.loadLoginPageForSLSTestEnvironment();
    }

    public LoginPage loadLoginPageForSiBetaEnvironment(ChromeDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.loadLoginPageForSiBetaEnvironment();
    }

    public AdmissionsApplicantLoginPage applicantLoginPageForSLSTestEnvironment(ChromeDriver driver, String ssolink) {
        AdmissionsApplicantLoginPage admissionsApplicantLoginPage = new AdmissionsApplicantLoginPage(driver);
        return admissionsApplicantLoginPage.applicantLoginPage(ssolink);
    }

    public HomePage shouldAccessHomepageForSLSTestEnvironment(ChromeDriver driver, String username, String password) {
        LoginPage loginPage = loadLoginPageForSLSTestEnvironment(driver);
        loginPage.enterUsernameAndPassword(username, password);
        HomePage homePage = loginPage.loginWithValidCredentials();
        return homePage;
    }

    public HomePage shouldAccessHomepageForSiBetaEnvironment(ChromeDriver driver, String username, String password) {
        LoginPage loginPage = loadLoginPageForSiBetaEnvironment(driver);
        loginPage.enterUsernameAndPassword(username, password);
        HomePage homePage = loginPage.loginWithValidCredentials();
        return homePage;
    }

    public AdmissionsApplicantDashboardPage shouldAccessApplicantDashboardForSLSTestEnvironment(ChromeDriver driver, String Studentno, String Surname, String dob, String ssolink) {
        AdmissionsApplicantLoginPage admissionsApplicantLoginPage = applicantLoginPageForSLSTestEnvironment(driver, ssolink);
        admissionsApplicantLoginPage.enterApplicantDetails(Studentno, Surname, dob);
        AdmissionsApplicantDashboardPage admissionsApplicantDashboardPage = admissionsApplicantLoginPage.loginWithValidCredentials();
        return admissionsApplicantDashboardPage;
    }
}
