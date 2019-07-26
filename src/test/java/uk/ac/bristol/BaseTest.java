package uk.ac.bristol;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.PageObjects.HomePage;
import uk.ac.bristol.PageObjects.LoginPage;

import java.lang.reflect.Method;

public class BaseTest {

    public ChromeDriver driver;
//
    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.print("Running " + this.getClass().getName() + "#" + method.getName());
        this.driver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        if(driver != null) {
            try {
                driver.quit();
            } catch (WebDriverException e) {
                System.out.print("***** CAUGHT EXCEPTION IN DRIVER TEARDOWN");
            }
        }
    }

    public LoginPage loadLoginPage(ChromeDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.loadLoginPage();
    }

    public HomePage shouldAccessHomepage(String username, String password) {
        LoginPage loginPage = loadLoginPage(driver);
        loginPage.enterUsernameAndPassword(username, password);
        HomePage homePage = loginPage.loginWithValidCredentials();
        return homePage;
    }
}
