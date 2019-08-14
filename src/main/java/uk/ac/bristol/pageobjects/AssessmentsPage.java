package uk.ac.bristol.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class AssessmentsPage extends BasePage {


    private static final By USER_GUIDE_LINK_IDENTIFIER = By.cssSelector("body > main > div > div.sv-row > div > div:nth-child(2) > div.sv-list-group > a:nth-child(1)");
    public static final String PAGE_TITLE = "Assessment and Progression";

    public AssessmentsPage(ChromeDriver driver) {
        super(driver);
    }

    public EducationAdministrationOfficePage clickUserGuidesLink() {
        try {
            driver.findElement(USER_GUIDE_LINK_IDENTIFIER).click();
        } catch (NoSuchElementException var2) {
            Assert.fail("User Guides Link Not Found");
        }

        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        EducationAdministrationOfficePage educationAdministrationOfficePage = new EducationAdministrationOfficePage(driver);
        return educationAdministrationOfficePage;
    }
}
