package uk.ac.bristol.PageObjects;


import com.jayway.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.jayway.awaitility.Awaitility.await;
import static org.testng.AssertJUnit.fail;

public class LoginPage extends BasePage {

//    private static final String LOGIN_PAGE_URL = "test.sls.bristol.ac.uk/urd/sits.urd/run/SIW_LGN";
    private static final String LOGIN_PAGE_URL = "evision-b.apps.bris.ac.uk/urd/sits.urd/run/SIW_LGN";

    private static final By PAGE_TITLE_IDENTIFIER = By.cssSelector("body > main > div > form > div:nth-child(2) > div > div > h1");
    private static final By USERNAME_INPUT_IDENTIFIER = By.cssSelector("#MUA_CODE\\.DUMMY\\.MENSYS");
    private static final By PASSWORD_INPUT_IDENTIFIER = By.cssSelector("#PASSWORD\\.DUMMY\\.MENSYS");
    private static final By SIGN_IN_BUTTON_IDENTIFIER = By.cssSelector("input.sv-btn");
    public static final By ERROR_MESSAGE_HEADING_IDENTIFIER = By.cssSelector(".sv-panel-danger > div:nth-child(1)");
    private static final By ERROR_MESSAGE_DETAIL_IDENTIFIER = By.cssSelector(".sv-panel-danger > div:nth-child(2)");

    public static final String PAGE_TITLE = "Student Lifecycle Support";
    public static final String INVALID_USERNAME_OR_PASSWORD_MESSAGE_HEADING = "Username and/or password Invalid";
    public static final String INVALID_USERNAME_OR_PASSWORD_MESSAGE_DETAIL = "  The user name and password you supplied are not authorised to use the system. Please try again. Please contact the SLSP eVision developers.";
    public static final String INVALID_PASSWORD_MESSAGE_HEADING = "Password Invalid";
    public static final String INVALID_PASSWORD_MESSAGE_DETAIL = "  You must enter a valid password to login.";

    public LoginPage(ChromeDriver driver) {
        super(driver);
    }

    public LoginPage loadLoginPage() {
        driver.get(buildUrl(LOGIN_PAGE_URL));
        return new LoginPage(driver);
    }

    public String getPageTitle() {
        try {
           await().atMost(10, TimeUnit.SECONDS).until(() -> (isElementDisplayed(PAGE_TITLE_IDENTIFIER)));
        }
        catch(ConditionTimeoutException cte) {
            fail("Page Title for Log In Page Not Found");
        }

        return getTextFromElement(PAGE_TITLE_IDENTIFIER);
    }

    public void enterUsernameAndPassword(String username, String password) {
        enterUsername(username);
        enterPassword(password);
    }

    public void enterUsername(String username) {
        enterTextIntoElement(USERNAME_INPUT_IDENTIFIER, username);
    }

    public void enterPassword(String password) {
        enterTextIntoElement(PASSWORD_INPUT_IDENTIFIER, password);
    }

    public LoginPage attemptLoginWithInvalidCredentials() {
        driver.findElement(SIGN_IN_BUTTON_IDENTIFIER).click();

        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    public AdmissionsPage loginWithValidCredentialsToAdmissionsPage() {
        driver.findElement(SIGN_IN_BUTTON_IDENTIFIER).click();

        AdmissionsPage admissionsPage = new AdmissionsPage(driver);
        return admissionsPage;
    }

    public HomePage loginWithValidCredentials() {
        driver.findElement(SIGN_IN_BUTTON_IDENTIFIER).click();

        HomePage homePage = new HomePage(driver);
        return homePage;
    }

    public String getErrorMessage() {
        return getTextFromElement(ERROR_MESSAGE_HEADING_IDENTIFIER);
    }

    public String getErrorMessageDetail() {
        return getTextFromElement(ERROR_MESSAGE_DETAIL_IDENTIFIER);
    }

}
