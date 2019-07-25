package uk.ac.bristol.admissions;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.PageObjects.AdmissionsPage;
import uk.ac.bristol.PageObjects.FolderTreeOfferGroupPage;
import uk.ac.bristol.PageObjects.HomePage;
import uk.ac.bristol.PageObjects.LoginPage;

import java.security.PrivateKey;

import static org.assertj.core.api.Assertions.assertThat;

public class AdmissionsTest extends BaseTest {


    private String admissionsUserUsername = "PERF-1";
    private String admissionsUserPassword = "P1";

    @Test
    public void shouldShouldAdmissionsDashboardLinks() {
        // Given
        HomePage homePage = shouldAccessHomepage(admissionsUserUsername, admissionsUserPassword);
        // When
        AdmissionsPage admissionsPage = homePage.clickAdmissionsLink();
        // Then
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.APPLICATION_PROCESSING_TITLE_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.UNDERGRADUATE_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.ACD_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.RCD_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.ALT_BULK_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.UKCAT_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.LNAT_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.WORK_EXP_LINK_IDENTIFIER)).isTrue();

        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_TITLE_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.TALK_SEARCH_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAY_SUMMARY_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.ACCESS_REQUIREMENTS_LINK_IDENTIFIER)).isTrue();

        assertThat(admissionsPage.isElementDisplayed(admissionsPage.HELP_SUPPORT_TITLE_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.USER_GUIDES_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.POLICY_GUIDENCE_LINK_IDENTIFIER)).isTrue();

//        assertThat(admissionsPage.isElementDisplayed(admissionsPage.ATTRIBUTE_MANAGEMENT_TITLE_IDENTIFIER)).isTrue();
//        assertThat(admissionsPage.isElementDisplayed(admissionsPage.MANAGE_COURSE_ATTRIBUTES_LINK_IDENTIFIER)).isTrue();
//        assertThat(admissionsPage.isElementDisplayed(admissionsPage.MANAGE_ADMISSIONS_THRESHOLDS_LINK_IDENTIFIER)).isTrue();





    }

    @Test
    public void shouldNavigateToOfferGroups() {
        //Given
        HomePage homePage = shouldAccessHomepage(admissionsUserUsername, admissionsUserPassword);
        AdmissionsPage admissionsPage = homePage.clickAdmissionsLink();
        //When
        FolderTreeOfferGroupPage folderTreeOfferGroupPage = admissionsPage.goToFolderTreeOfferGroups();
        //Then
        assertThat(folderTreeOfferGroupPage.isElementDisplayed(folderTreeOfferGroupPage.OFFER_GROUP_HEADER_IDENTIFIER)).isTrue();
    }


}
