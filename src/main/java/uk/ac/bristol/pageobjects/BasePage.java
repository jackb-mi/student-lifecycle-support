package uk.ac.bristol.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevels;

import java.io.File;

public class BasePage {
    public static ChromeDriver driver;
    public By PAGE_TITLE_IDENTIFIER = By.cssSelector("#sitsportalpagetitle");

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String buildUrl(String endPoint) {
        return "https://" + endPoint;
    }

    public static void enterTextIntoElement(By elementId, String textToEnter) {
        driver.findElement(elementId).sendKeys(new CharSequence[]{textToEnter});
    }

    public Boolean isElementDisplayed(By elementId) {
        return driver.findElements(elementId).size() > 0;
    }

    public static void clickElement(By elementId) {
        driver.findElement(elementId).click();
    }


    public String getTextFromElement(By elementId) {
        return driver.findElement(elementId).getText();
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
}
