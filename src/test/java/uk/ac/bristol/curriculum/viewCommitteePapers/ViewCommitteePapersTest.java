package uk.ac.bristol.curriculum.viewCommitteePapers;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.enums.Faculty;
import uk.ac.bristol.helpers.navigationHelper.CurriculumManagementAccessFlows;
import uk.ac.bristol.pageobjects.curriculum.ViewCommitteePapersSearchPage;
import uk.ac.bristol.pageobjects.curriculum.ViewCommitteePapersSearchResultsPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ViewCommitteePapersTest extends BaseTest {

    private String username = "SLSP-CRT02";
    private String password = "Test@2PassBook_";
    private CurriculumManagementAccessFlows commonNavigation = new CurriculumManagementAccessFlows();

    @Test
    public void shouldAccessViewCommitteePapersSearchPage() {
        // Given / When
        ViewCommitteePapersSearchPage viewCommitteePapersSearchPage = commonNavigation.accessViewCommitteePapersSearchPage(driver, username, password);
        // Then
        assertThat(viewCommitteePapersSearchPage.getPageTitle()).isEqualTo(viewCommitteePapersSearchPage.PAGE_TITLE);
    }
    //TODO fix test so that correct radio button is selected
    @Test
    public void shouldPerformCommitteePapersSearchPageForSchoolCommitteeUndergraduateLevel() {
        // Given
        ViewCommitteePapersSearchPage viewCommitteePapersSearchPage = commonNavigation.accessViewCommitteePapersSearchPage(driver, username, password);
        // When
        ViewCommitteePapersSearchResultsPage viewCommitteePapersSearchResultsPage =  viewCommitteePapersSearchPage.performSchoolCommitteeSearch("SART", CommitteeLevel.UNDERGRADUATE);
        // Then
        assertThat(viewCommitteePapersSearchPage.getPageTitle()).isEqualTo(viewCommitteePapersSearchResultsPage.PAGE_TITLE);
    }
    //TODO fix test so that correct radio button is selected
    @Test
    public void shouldPerformCommitteePapersSearchPageForFacultyCommitteePostgraduateLevel() {
        // Given
        ViewCommitteePapersSearchPage viewCommitteePapersSearchPage = commonNavigation.accessViewCommitteePapersSearchPage(driver, username, password);
        // When
        ViewCommitteePapersSearchResultsPage viewCommitteePapersSearchResultsPage =  viewCommitteePapersSearchPage.performFacultyCommitteeSearch(Faculty.FACULTY_OF_ENGINEERING, CommitteeLevel.POSTGRADUATE);
        // Then
        assertThat(viewCommitteePapersSearchPage.getPageTitle()).isEqualTo(viewCommitteePapersSearchResultsPage.PAGE_TITLE);
    }

    //TODO fix test so that correct radio button is selected
    @Test
    public void shouldPerformCommitteePapersSearchPageForUniversityEducationCommitteeBothUnderAndPostgraduateLevels() {
        // Given
        ViewCommitteePapersSearchPage viewCommitteePapersSearchPage = commonNavigation.accessViewCommitteePapersSearchPage(driver, username, password);
        // When
        ViewCommitteePapersSearchResultsPage viewCommitteePapersSearchResultsPage =  viewCommitteePapersSearchPage.performUniversityEducationCommitteeSearch(CommitteeLevel.BOTH);
        // Then
        assertThat(viewCommitteePapersSearchPage.getPageTitle()).isEqualTo(viewCommitteePapersSearchResultsPage.PAGE_TITLE);
    }
}