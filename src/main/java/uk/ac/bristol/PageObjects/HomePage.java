package uk.ac.bristol.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {

    private static final By ADMISSIONS_LINK_IDENTIFIER = By.cssSelector("body > main > div > div.sv-row > div > div > div.sv-list-group > div:nth-child(1) > a");

    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    public AdmissionsPage clickAdmissionsLink() {
        driver.findElement(ADMISSIONS_LINK_IDENTIFIER).click();

        AdmissionsPage admissionsPage = new AdmissionsPage(driver);
        return admissionsPage;
    }
}
