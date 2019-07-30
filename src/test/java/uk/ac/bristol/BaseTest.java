package uk.ac.bristol;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.PageObjects.HomePage;
import uk.ac.bristol.PageObjects.LoginPage;

import java.lang.reflect.Method;

public class BaseTest {

    public ChromeDriver driver;

    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.println("Running " + this.getClass().getName() + "#" + method.getName());
        instantiateChromeDriver();
    }

    private void instantiateChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("test-type");
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-extensions");
        //  chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");

        this.driver = new ChromeDriver(chromeOptions);

        org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(1900, 1900);
        driver.manage().window().setSize(d);
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
