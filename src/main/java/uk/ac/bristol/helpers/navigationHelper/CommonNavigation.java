package uk.ac.bristol.helpers.navigationHelper;

import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.LoginPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.AdmissionsApplicantDashboardPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.AdmissionsApplicantLoginPage;

public class CommonNavigation {

    public LoginPage loadLoginPageForSLSTestEnvironment(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.loadLoginPageForSLSTestEnvironment();
    }

    public LoginPage loadLoginPageForSiBetaEnvironment(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.loadLoginPageForSiBetaEnvironment();
    }

    public AdmissionsApplicantLoginPage applicantLoginPageForSLSTestEnvironment(WebDriver driver, String ssolink) {
        AdmissionsApplicantLoginPage admissionsApplicantLoginPage = new AdmissionsApplicantLoginPage(driver);
        return admissionsApplicantLoginPage.applicantLoginPage(ssolink);
    }

    public HomePage shouldAccessHomepageForSLSTestEnvironment(WebDriver driver, String username, String password) {
        LoginPage loginPage = loadLoginPageForSLSTestEnvironment(driver);
        loginPage.enterUsernameAndPassword(username, password);
        HomePage homePage = loginPage.loginWithValidCredentials();
        return homePage;
    }

    public HomePage shouldAccessHomepageForSiBetaEnvironment(WebDriver driver, String username, String password) {
        LoginPage loginPage = loadLoginPageForSiBetaEnvironment(driver);
        loginPage.enterUsernameAndPassword(username, password);
        HomePage homePage = loginPage.loginWithValidCredentials();
        return homePage;
    }

    public AdmissionsApplicantDashboardPage shouldAccessApplicantDashboardForSLSTestEnvironment(WebDriver driver, String Studentno, String Surname, String dob, String ssolink) {
        AdmissionsApplicantLoginPage admissionsApplicantLoginPage = applicantLoginPageForSLSTestEnvironment(driver, ssolink);
        admissionsApplicantLoginPage.enterApplicantDetails(Studentno, Surname, dob);
        AdmissionsApplicantDashboardPage admissionsApplicantDashboardPage = admissionsApplicantLoginPage.loginWithValidCredentials();
        return admissionsApplicantDashboardPage;
    }
}
