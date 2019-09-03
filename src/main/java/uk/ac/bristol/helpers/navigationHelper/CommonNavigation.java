package uk.ac.bristol.helpers.navigationHelper;

import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.LoginPage;

public class CommonNavigation {

    public LoginPage loadLoginPageForTestEnvironment(ChromeDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.loadLoginPageForTestEnvironment();
    }

    public HomePage shouldAccessHomepageForTestEnvironment(ChromeDriver driver, String username, String password) {
        LoginPage loginPage = loadLoginPageForTestEnvironment(driver);
        loginPage.enterUsernameAndPassword(username, password);
        HomePage homePage = loginPage.loginWithValidCredentials();
        return homePage;
    }
}
