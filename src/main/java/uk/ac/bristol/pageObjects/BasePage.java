package uk.ac.bristol.pageObjects;

import com.jayway.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.jayway.awaitility.Awaitility.await;
import static org.junit.Assert.fail;

public class BasePage {

    public static ChromeDriver driver;
    public By PAGE_TITLE_IDENTIFIER = By.cssSelector("#sitsportalpagetitle");

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String buildUrl(String endPoint) {
        return "https://" + endPoint;
    }

    public String getPageTitle() {

        try {
            await().atMost(10, TimeUnit.SECONDS).until(() -> (isElementDisplayed(PAGE_TITLE_IDENTIFIER)));
        }
        catch(ConditionTimeoutException cte) {
            fail("Page Title Not Found");
        }

        return getTextFromElement(PAGE_TITLE_IDENTIFIER);
    }

    public String getTextFromElement(By elementId) {
        return driver.findElement(elementId).getText();
    }

    public void enterTextIntoElement(By elementId, String textToEnter) {
        driver.findElement(elementId).sendKeys(textToEnter);
    }

    public Boolean isElementDisplayed(By elementId) {
        return driver.findElements(elementId).size() > 0;
    }

//
//    public void closeBetaPopUpWindow() throws InterruptedException {
//        List<WebElement> popUpElement = driver.findElements(CLOSE_BETA_POPUP_ID);
//        if (popUpElement.size() > 0) {
//            driver.findElement(CLOSE_BETA_POPUP_ID).click();
//            Thread.sleep(100);
//        }
//    }
//
//    public void scrollDown() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("scroll(0, 250);");
//    }
//
//
//    public void selectElementWithoutReturn(By elementId) {
//        driver.findElement(elementId).click();
//    }
//
//    public void pressEscapeKey() throws InterruptedException {
//        Actions action = new Actions(driver);
//        action.sendKeys(Keys.ESCAPE).build().perform();
//        Thread.sleep(5000);
//    }
//
//    public void hoverMouseOverElement(By elementId) {
//        WebElement web_Element_To_Be_Hovered = driver.findElement(elementId);
//        Actions builder = new Actions(driver);
//        builder.moveToElement(web_Element_To_Be_Hovered).build().perform();
//    }


}
