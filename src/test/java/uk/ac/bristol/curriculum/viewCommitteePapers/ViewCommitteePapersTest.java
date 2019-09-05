package uk.ac.bristol.curriculum.viewCommitteePapers;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.helpers.navigationHelper.CurriculumManagementAccessFlows;
import uk.ac.bristol.pageobjects.curriculum.ViewCommitteePapersSearchPage;

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
}
