package uk.ac.bristol.pageobjects;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionTimeoutException;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;
    public static final By PAGE_TITLE_IDENTIFIER = By.cssSelector("#sitsportalpagetitle");
    public static final By NEXT_BUTTON_IDENTIFIER = By.name("NEXT.DUMMY.MENSYS.1");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String buildUrl(String endPoint) {
        return "https://" + endPoint;
    }


    public String getPageTitle() {

        try {
            Awaitility.await().atMost(10L, TimeUnit.SECONDS).until(() -> {
                return this.isElementDisplayed(driver, this.PAGE_TITLE_IDENTIFIER);
            });
        } catch (ConditionTimeoutException var2) {
            Assert.fail("Page Title Not Found");
        }

        return this.getTextFromElement(this.PAGE_TITLE_IDENTIFIER);

    }

    public void enterTextIntoElement(By elementId, String textToEnter) {
        waitUntilElementIsVisibleAndIsClickable(elementId);
        driver.findElement(elementId).sendKeys(new CharSequence[]{textToEnter});
    }

    public void clickElement(By elementId) {
        waitUntilElementIsVisibleAndIsClickable(elementId);
        driver.findElement(elementId).click();
    }

    public String getTextFromElement(By elementId) {

        try {
            Awaitility.await().atMost(10L, TimeUnit.SECONDS).until(() -> {
                return this.isElementDisplayed(driver, elementId);
            });
        } catch (ConditionTimeoutException var2) {
            Assert.fail("Expected Element Not Found");
        }

        return driver.findElement(elementId).getText();
    }

    public Boolean isElementClickable(WebDriver driver, By elementId) {
        return driver.findElement(elementId).isEnabled();
    }

    public Boolean isElementDisplayed(WebDriver driver, By elementId) {
        return driver.findElements(elementId).size() > 0;
    }

    public void waitUntilElementIsVisibleAndIsClickable(By elementId) {
        waitUntilElementIsVisible(driver, elementId);
        waitUntilElementIsClickable(driver, elementId);
    };

    public void waitUntilElementIsVisible(WebDriver driver, By elementId) {
        try {
            Awaitility.await().atMost(10L, TimeUnit.SECONDS).until(() -> isElementDisplayed(driver, elementId));
        } catch (ConditionTimeoutException cte) {
            Assert.fail("Element not found");
        }
    }

    public void waitUntilElementIsClickable(WebDriver driver, By elementId) {
        try {
            Awaitility.await().atMost(5L, TimeUnit.SECONDS).until(() -> isElementClickable(driver, elementId));
        } catch (ConditionTimeoutException cte) {
            Assert.fail("Element not found");
        }
    }

    public void waitForElementToBeDisplayed(By elementId, WebDriver driver, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, (long) timeout);
            wait.until(ExpectedConditions.visibilityOfElementLocated(elementId));
        } catch (TimeoutException var5) {
            Assert.fail("Element was not found before the specified timeout");
        }
    }

    public void waitForElementTextToBeDisplayed(By elementId, WebDriver driver, int timeout, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, (long) timeout);
            wait.until(waitForTextInElementEquals(elementId, text));
        } catch (TimeoutException var5) {
            Assert.fail("Element was not found before the specified timeout");
        }
    }

    public static ExpectedCondition<Boolean> waitForTextInElementEquals(By elementId, String text) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = driver.findElement(elementId).getText();
                    return elementText.equals(text);
                } catch (StaleElementReferenceException var3) {
                    return null;
                }
            }

            public String toString() {
                return String.format("text ('%s') to be present in element %s", text, elementId);
            }
        };
    }

    public void selectFromDropdown(By elementId, String DropdownText) {
        Select selectList = new Select(driver.findElement(elementId));
        selectList.selectByVisibleText(DropdownText);
    }

    public void selectDropDownOptionByValue(By dropdownIdentifier, String value) {

        Select dropDownValue = new Select(driver.findElement(dropdownIdentifier));
        dropDownValue.selectByValue(value);
    }

    public void switchToIframe(By elementId) {
        driver.switchTo().frame((WebElement) elementId);
    }

    public void switchBackFromIframe(){
        driver.switchTo().defaultContent();
    }

    public void uploadFile(By elementId, String pathtofile, String name) {
        String filename = (name);
        File file = new File(filename);
 //       elem = (elementId);
 //       String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
 //       ((JavascriptExecutor) driver).executeScript(js, elementId);
        String path = (pathtofile + file);
        enterTextIntoElement(elementId, path);
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 450);");
    }
}
