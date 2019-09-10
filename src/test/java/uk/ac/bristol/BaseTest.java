package uk.ac.bristol;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static uk.ac.bristol.config.WebDriverConfig.browser;

public class BaseTest {
    protected WebDriver driver;
    private  org.openqa.selenium.Dimension d;

    //public ChromeDriver driver;
    public By PAGE_TITLE_IDENTIFIER = By.cssSelector("#sitsportalpagetitle");

    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.println("Running " + this.getClass().getName() + "#" + method.getName());
        d = new org.openqa.selenium.Dimension(1350, 660);
        if (browser.equals("firefox")) {
            System.out.println("reached FF");
            instantiateFirefoxDriver();
        } else if (browser.equals("chrome")) {
            System.out.println("Reached Chrome");
            instantiateChromeDriver();
        } else if (browser.equals("safari")) {
            System.out.println("Reached Safari");
            instantiateSafariDriver();
        }
    }

    private void instantiateChromeDriver() {
//      System.setProperty("webdriver.chrome.driver", "/usr/local/bin/WebDriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-extensions");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        this.driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(d);
    }

    private void instantiateFirefoxDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("disable-plugins");
        firefoxOptions.addArguments("disable-extensions");
        firefoxOptions.addArguments("--headless");
        firefoxOptions.addArguments("--no-sandbox");
        firefoxOptions.addArguments("--disable-dev-shm-usage");
        this.driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().setSize(d);
    }

    private void instantiateSafariDriver() {
        this.driver = new SafariDriver();
        driver.manage().window().maximize();
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
