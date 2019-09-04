package uk.ac.bristol;

import org.testng.annotations.Test;
import uk.ac.bristol.config.ConfigProperties;
import uk.ac.bristol.pageobjects.LoginPage;

import java.io.IOException;

public class LoginTest extends BaseTest {

    @Test
    public void shouldAccessEVision() throws IOException {
        ConfigProperties configProperties = new ConfigProperties();
        configProperties.init();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.accessLoginPage();
        loginPage.enterUsername("Hello");
    }
}
