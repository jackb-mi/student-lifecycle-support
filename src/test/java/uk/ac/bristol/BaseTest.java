package uk.ac.bristol;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.LoginPage;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public ChromeDriver driver;
    public By PAGE_TITLE_IDENTIFIER = By.cssSelector("#sitsportalpagetitle");

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

    public Boolean isElementDisplayed(By elementId) {
        return this.driver.findElements(elementId).size() > 0;
    }

    public String getPageTitle() {
        try {
            Awaitility.await().atMost(10L, TimeUnit.SECONDS).until(() -> {
                return this.isElementDisplayed(this.PAGE_TITLE_IDENTIFIER);
            });
        } catch (ConditionTimeoutException var2) {
            Assert.fail("Page Title Not Found");
        }

        return this.getTextFromElement(this.PAGE_TITLE_IDENTIFIER);
    }

    public String getTextFromElement(By elementId) {
        return this.driver.findElement(elementId).getText();
    }
}
