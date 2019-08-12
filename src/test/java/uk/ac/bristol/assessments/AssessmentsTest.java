package uk.ac.bristol.assessments;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.pageobjects.AssessmentsPage;
import uk.ac.bristol.pageobjects.HomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class AssessmentsTest extends BaseTest  {

    private String assessmentsUserUsername = "PERF-1";
    private String assessmentsUserPassword = "P1";

    @Test
    public void shouldShowAssessmentsPage() {
        // Given
        HomePage homePage = shouldAccessHomepage(assessmentsUserUsername, assessmentsUserPassword);
        // When
        AssessmentsPage assessmentsPage = homePage.clickAssessmentsLink();
        // Then
        assertThat(getPageTitle()).isEqualTo(assessmentsPage.PAGE_TITLE);
    }
}
