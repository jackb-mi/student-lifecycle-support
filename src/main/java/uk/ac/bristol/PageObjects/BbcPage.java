package uk.ac.bristol.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcPage extends BasePage {

    private static final String BBC_URL = "bbc.co.uk";
    private static final By PAGE_TITLE_IDENTIFIER = By.cssSelector(".hp-banner__text");
    public static final String PAGE_TITLE = "Welcome to the BBC";

    public BbcPage(ChromeDriver driver) {
        super(driver);
    }

    public BbcPage loadBbcPage() {
        driver.get(buildUrl(BBC_URL));
        return new BbcPage(driver);
    }

    public String getPageTitle() {
        return getTextFromElement(PAGE_TITLE_IDENTIFIER);
    }
}
