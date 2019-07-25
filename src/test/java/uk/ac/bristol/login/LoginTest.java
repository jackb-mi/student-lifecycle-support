package uk.ac.bristol.login;



import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.PageObjects.AdmissionsPage;
import uk.ac.bristol.PageObjects.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest extends BaseTest {

    private String unknownUsername = "hello";
    private String unknownPassword = "password";
    private String superUserUsername = "SLSP-CRT05";
    private String superUserPassword = "Test@2PAssBook_";

    @Test
    public void shouldDisplayLoginPage() {
        // Given / When
        LoginPage loginPage = loadLoginPage(driver);
        // Then
        assertThat(loginPage.isElementDisplayed(loginPage.USERNAME_INPUT_IDENTIFIER)).isTrue();
    }

    @Test
    public void shouldShowErrorForLoginWithUnknownUser() {
        // Given
        LoginPage loginPage = loadLoginPage(driver);
        loginPage.enterUsernameAndPassword(unknownUsername, unknownPassword);
        // When
        loginPage = loginPage.attemptLoginWithInvalidCredentials();
        // Then
        assertThat(loginPage.isElementDisplayed(loginPage.ERROR_MESSAGE_HEADING_IDENTIFIER)).isTrue();
        assertThat(loginPage.getErrorMessage()).isEqualTo(loginPage.INVALID_USERNAME_OR_PASSWORD_MESSAGE_HEADING);
        assertThat(loginPage.getErrorMessageDetail()).isEqualTo(loginPage.INVALID_USERNAME_OR_PASSWORD_MESSAGE_DETAIL);
    }

    @Test
    public void shouldShowErrorForLoginWithoutPassword() {
        // Given
        LoginPage loginPage = loadLoginPage(driver);
        loginPage.enterUsername(superUserUsername);
        // When
        loginPage = loginPage.attemptLoginWithInvalidCredentials();
        // Then
        assertThat(loginPage.isElementDisplayed(loginPage.ERROR_MESSAGE_HEADING_IDENTIFIER)).isTrue();
        assertThat(loginPage.getErrorMessage()).isEqualTo(loginPage.INVALID_PASSWORD_MESSAGE_HEADING);
        assertThat(loginPage.getErrorMessageDetail()).isEqualTo(loginPage.INVALID_PASSWORD_MESSAGE_DETAIL);
    }

    @Test
    public void shouldDisplayAdmissionsPageAfterLoginAsSuperUser() {
        // Given
        LoginPage loginPage = loadLoginPage(driver);
        loginPage.enterUsernameAndPassword(superUserUsername, superUserPassword);
        // When
        AdmissionsPage admissionsPage = loginPage.loginWithValidCredentialsToAdmissionsPage();
        // Then
        assertThat(admissionsPage.getPageTitle()).isEqualTo(admissionsPage.PAGE_TITLE);

    }
}
