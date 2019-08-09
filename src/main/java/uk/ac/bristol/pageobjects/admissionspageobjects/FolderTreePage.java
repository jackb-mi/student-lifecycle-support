package uk.ac.bristol.pageobjects.admissionspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class FolderTreePage extends BasePage {
    public static final String FOLDER_TREE_PANEL_TITLE = "Filter Offer Group by Faculty";
    public static final By COLUMN_ONE_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(2)");
    public static final By COLUMN_TWO_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(3)");
    public static final By COLUMN_THREE_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(4)");
    public static final By COLUMN_FOUR_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(5)");
    public static final By COLUMN_FIVE_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(6)");
    public static final By COLUMN_SIX_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(7)");
    public static final By COLUMN_SEVEN_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(8)");
    public static final By COLUMN_EIGHT_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(9)");
    public static final By COLUMN_NINE_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(10)");
    public static final By COLUMN_TEN_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(11)");
    public static final By COLUMN_ELEVEN_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(12)");
    public static final By COLUMN_TWELVE_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(13)");
    public static final By COLUMN_THIRTEEN_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(14)");
    public static final By COLUMN_FOURTEEN_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(15)");
    public static final By COLUMN_FIFTEEN_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(16)");
    public static final By COLUMN_SIXTEEN_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(17)");
    public static final By COLUMN_SEVENTEEN_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(18)");
    public static final By COLUMN_EIGHTNTEEN_IDENTIFIER = By.cssSelector("#headrow > th:nth-child(19)");

    public FolderTreePage(ChromeDriver driver) {
        super(driver);
    }

    public void goToFolder(String FolderTreeFolders) {
        this.waitForElementToBeDisplayed(COLUMN_ONE_IDENTIFIER, driver, 10);
        driver.findElement(By.cssSelector(FolderTreeFolders)).click();
        this.waitForElementToBeDisplayed(COLUMN_ONE_IDENTIFIER, driver, 10);
    }
}
