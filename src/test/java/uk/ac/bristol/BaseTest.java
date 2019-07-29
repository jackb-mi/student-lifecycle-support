package uk.ac.bristol;

import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.LoginPage;

public class BaseTest {

    public ChromeDriver driver;
//
    @BeforeTest
    public void dataSetUp() {
        System.out.println("This code is being called as @BeforeTest");
        this.driver = new ChromeDriver();
    }

    @AfterTest
    public void dataTearDown() {
        System.out.println("This code is being called as @AfterTest");
        driver.close();

    }

    public LoginPage loadLoginPage(ChromeDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.loadLoginPage();
    }

    public HomePage shouldAccessHomepage(String username, String password) {
        LoginPage loginPage = loadLoginPage(driver);
        loginPage.enterUsernameAndPassword(username, password);
        HomePage homePage = loginPage.loginWithValidCredentials();
        return homePage;
    }
}
