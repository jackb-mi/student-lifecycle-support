package uk.ac.bristol.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public static ChromeDriver driver;
    public By PAGE_TITLE_IDENTIFIER = By.cssSelector("#sitsportalpagetitle");

    public BasePage(ChromeDriver driver) {
        driver = driver;
    }

    public String buildUrl(String endPoint) {
        return "https://" + endPoint;
    }

    public void enterTextIntoElement(By elementId, String textToEnter) {
        driver.findElement(elementId).sendKeys(new CharSequence[]{textToEnter});
    }

    public Boolean isElementDisplayed(By elementId) {
        return driver.findElements(elementId).size() > 0;
    }

    public void waitForElementToBeDisplayed(By elementId, WebDriver driver, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, (long)timeout);
            wait.until(ExpectedConditions.visibilityOfElementLocated(elementId));
        } catch (TimeoutException var5) {
            Assert.fail("Element was not found before the specified timeout");
        }

    }
}
