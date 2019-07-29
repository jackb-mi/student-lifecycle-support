package uk.ac.bristol.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;


public class HomePage extends BasePage {

    private static final By ADMISSIONS_LINK_IDENTIFIER = By.cssSelector("body > main > div > div.sv-row > div > div > div.sv-list-group > div:nth-child(1) > a");
    private static final By REGISTRATIONS_LINK_IDENTIFIER = By.cssSelector("#REG001");

    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    public AdmissionsPage clickAdmissionsLink() {

        try {
            driver.findElement(ADMISSIONS_LINK_IDENTIFIER).click();
        } catch (NoSuchElementException e) {
            fail("Admissions Link Not Found");
        }

        AdmissionsPage admissionsPage = new AdmissionsPage(driver);
        return admissionsPage;
    }
}
