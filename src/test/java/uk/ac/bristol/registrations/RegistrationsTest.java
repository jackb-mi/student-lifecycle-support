package uk.ac.bristol.registrations;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.PageObjects.HomePage;
import uk.ac.bristol.PageObjects.RegistrationsPage;

import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationsTest extends BaseTest {

    private String admissionsUserUsername = "PERF-1";
    private String admissionsUserPassword = "P1";

    @Test
    public void shouldShouldRegistrationDashboardLinks() {
        // Given
        HomePage homePage = shouldAccessHomepage(admissionsUserUsername, admissionsUserPassword);
        // When
        RegistrationsPage registrationsPage = homePage.clickRegistrationsLink();
        // Then
        assertThat(registrationsPage.getTextFromElement(registrationsPage.PAGE_TITLE_IDENTIFIER)).isEqualTo("Registration");
    }

}
