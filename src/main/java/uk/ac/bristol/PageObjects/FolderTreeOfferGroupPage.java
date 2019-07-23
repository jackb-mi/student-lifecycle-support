package uk.ac.bristol.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FolderTreeOfferGroupPage extends BasePage{
    public static final String PAGE_TITLE = "Admissions Dashboard";
    public static final String OFFER_GROUP_PANEL_TITLE = "Offer Group";

    public static final By OFFER_GROUP_HEADER_IDENTIFIER = By.cssSelector("#FOL_SEL > div:nth-child(2) > div > div > div.sv-panel-heading > h2");
    public FolderTreeOfferGroupPage(ChromeDriver driver) {
        super(driver);
    }
}
