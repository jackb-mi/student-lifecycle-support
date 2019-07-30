package uk.ac.bristol;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public ChromeDriver driver;
    public By PAGE_TITLE_IDENTIFIER = By.cssSelector("#sitsportalpagetitle");

    public BaseTest() {
    }

    @BeforeTest
    public void dataSetUp() {
        System.out.println("This code is being called as @BeforeTest");
        this.driver = new ChromeDriver();
    }

    @AfterTest
    public void dataTearDown() {
        System.out.println("This code is being called as @AfterTest");
        this.driver.close();
    }

    public LoginPage loadLoginPage(ChromeDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.loadLoginPage();
    }

    public HomePage shouldAccessHomepage(String username, String password) {
        LoginPage loginPage = this.loadLoginPage(this.driver);
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
