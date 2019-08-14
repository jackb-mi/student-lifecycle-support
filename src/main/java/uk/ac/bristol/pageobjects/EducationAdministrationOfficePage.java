package uk.ac.bristol.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EducationAdministrationOfficePage extends BasePage {

    public static final By PAGE_TITLE_IDENTIFIER = By.cssSelector("#title1 > a");
    public static final String PAGE_TITLE = "Education Administration Office";

    public EducationAdministrationOfficePage(ChromeDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return driver.findElement(PAGE_TITLE_IDENTIFIER).getText();
    }
}
