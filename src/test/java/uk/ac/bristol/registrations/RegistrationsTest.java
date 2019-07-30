package uk.ac.bristol.registrations;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.RegistrationPage;

import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationsTest extends BaseTest {


    private String admissionsUserUsername = "PERF-1";
    private String admissionsUserPassword = "P1";

    @Test
    public void shouldNavigateToRegistrationsPage() {
        // Given
        HomePage homePage = shouldAccessHomepage(admissionsUserUsername, admissionsUserPassword);
        // When
        RegistrationPage registrationPage = homePage.clickRegistrationsLink();
        // Then
        assertThat(getPageTitle()).isEqualTo(registrationPage.PAGE_TITLE);
    }

}
