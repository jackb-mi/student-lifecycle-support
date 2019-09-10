package uk.ac.bristol.assessmentAndProgression.recordAttendence;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.helpers.navigationHelper.AssessmentAndProgressionAccessFlows;
import uk.ac.bristol.pageobjects.assessmentAndProgression.AssessmentAndProgressionPage;
import uk.ac.bristol.pageobjects.assessmentAndProgression.PersonalTutoringMyTuteesByProgrammePage;
import uk.ac.bristol.pageobjects.assessmentAndProgression.PersonalTutoringMyTuteesPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RecordAttendanceGroupOfTuteesTest extends BaseTest {

    String username = "TRAIN024";
    String password = "Test@1231";
    private AssessmentAndProgressionAccessFlows commonNavigation = new AssessmentAndProgressionAccessFlows();

    @Test
    public void shouldNavigateToPersonalTutoringMyTuteesPage() {
        // Given
        AssessmentAndProgressionPage assessmentAndProgressionPage = commonNavigation.accessAssessmentAndProgressionPage(driver, username, password);
        // When
        PersonalTutoringMyTuteesPage personalTutoringMyTuteesPage = assessmentAndProgressionPage.clickViewAllMyTuteesLink();
        // Then
        assertThat(personalTutoringMyTuteesPage.getPageTitle()).isEqualTo(personalTutoringMyTuteesPage.PAGE_TITLE);
    }

    @Test
    public void shouldNavigateToPersonalTutoringMyTuteesByProgrammePage() {
        // Given
        AssessmentAndProgressionPage assessmentAndProgressionPage = commonNavigation.accessAssessmentAndProgressionPage(driver, username, password);
        // When
        PersonalTutoringMyTuteesByProgrammePage personalTutoringMyTuteesByProgrammePage = assessmentAndProgressionPage.clickViewMyTuteesByProgrammeLink();
        // Then
        assertThat(personalTutoringMyTuteesByProgrammePage.getPageTitle()).isEqualTo(personalTutoringMyTuteesByProgrammePage.PAGE_TITLE);
    }
}
