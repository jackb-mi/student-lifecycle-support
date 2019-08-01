package uk.ac.bristol.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class UploadFilesPage extends BasePage {

    public UploadFilesPage(ChromeDriver driver) {
        super(driver);
    }

    public void selectBrowseForFileButton() throws InterruptedException, AWTException {
        driver.findElement(By.partialLinkText("Browse for file")).click();
    }
}
