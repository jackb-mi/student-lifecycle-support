package uk.ac.bristol;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestDemo {

    String bristolUniHomePageUrl = "https://www.bristol.ac.uk/";
    String bristolUniFindACourseUrl = "http://bristol.ac.uk/study/undergraduate/search/";

    @Test
    public void shouldAccessBristolUniWebsite() {
        // Given
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get(bristolUniHomePageUrl);

        BristolUniHomePage bristolUniHomePage = new BristolUniHomePage(chromeDriver);
        // When
        String pageTitle = chromeDriver.getTitle();
        // Then
        String expectedPageTitle = bristolUniHomePage.PAGE_TITLE;

        assertThat(pageTitle).isEqualTo(expectedPageTitle);

        chromeDriver.close();
    }

    @Test
    public void shouldFailTestDueToIncorrectExpectedResult() {
        // Given
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get(bristolUniHomePageUrl);

        BristolUniHomePage bristolUniHomePage = new BristolUniHomePage(chromeDriver);
        // When
        String pageTitle = chromeDriver.getTitle();
        // Then
        String expectedPageTitle = bristolUniHomePage.PAGE_TITLE + " Text to make test fail";

        assertThat(pageTitle).isEqualTo(expectedPageTitle);

        chromeDriver.close();
    }

    @Test
    public void shouldFailTestDueToIncorrectTestSetUp() {
        // Given
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get(bristolUniFindACourseUrl);

        BristolUniHomePage bristolUniHomePage = new BristolUniHomePage(chromeDriver);
        // When
        String pageTitle = chromeDriver.getTitle();
        // Then
        String expectedPageTitle = bristolUniHomePage.PAGE_TITLE;

        assertThat(pageTitle).isEqualTo(expectedPageTitle);

        chromeDriver.close();
    }
}
