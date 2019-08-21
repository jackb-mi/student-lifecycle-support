package uk.ac.bristol;

import org.openqa.selenium.chrome.ChromeDriver;

public class BristolUniHomePage {

    public static ChromeDriver driver;
    public static final String PAGE_TITLE =
            "Homepage | University of Bristol";

    public BristolUniHomePage(ChromeDriver driver) {
        this.driver = driver;
    }
}
