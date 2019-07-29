package uk.ac.bristol.admissions;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.OfferGroups;
import uk.ac.bristol.pageobjects.AdmissionsPage;
import uk.ac.bristol.pageobjects.FolderTreeOfferGroupPage;
import uk.ac.bristol.pageobjects.HomePage;

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
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.POLICY_GUIDANCE_LINK_IDENTIFIER)).isTrue();

        assertThat(admissionsPage.isElementDisplayed(admissionsPage.ATTRIBUTE_MANAGEMENT_TITLE_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.MANAGE_COURSE_ATTRIBUTES_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.MANAGE_ADMISSIONS_THRESHOLDS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.DUPLICATE_MATCHING_LINK_IDENTIFIER)).isTrue();

        assertThat(admissionsPage.isElementDisplayed(admissionsPage.CONFIRMATION_TITLE_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.CONFIRMATION_CALL_CENTRE_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.CONFIRMATION_PROCESSING_GROUP_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.CONFIRMATION_PROCESSING_CHECKING_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.MANAGE_NEAR_MISS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.SEND_CONFIRMATION_LINK_IDENTIFIER)).isTrue();

        assertThat(admissionsPage.isElementDisplayed(admissionsPage.REPORTS_TITLE_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_SCHOOL_BOOKINGS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_DEPARTMENT_BOOKINGS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_ACCESS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_TALK_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_MATURE_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_FULL_TALKS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_PARK_RIDE_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_VET_SCIENCE_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_WP_BOOKERS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.OPEN_DAYS_INTERNATIONAL_BOOKERS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.PG_APPLICATIONS_VISA_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.PG_APPLICATIONS_VISA_REQUEST_VIEWER_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.PG_NEW_STUDENT_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.PG_COMBINED_CAS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.PG_PROGRAMME_FEES_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.PRE_SESSIONAL_APP_SUMMARY_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.APPLICANT_CONTACT_DETAILS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.CLEARANCE_CHECK_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.NEW_DOCUMENT_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.ACCEPTED_APPLICANTS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.REGISTRATION_PACKS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.DECISION_CHECKER_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.WP_PROJECTS_LINK_IDENTIFIER)).isTrue();
        assertThat(admissionsPage.isElementDisplayed(admissionsPage.FOLDEROVERVIEW_LINK_IDENTIFIER)).isTrue();

    }

    @Test
    public void shouldShowCorrectFolderTreeColumns() {
        //Given
        HomePage homePage = shouldAccessHomepage(admissionsUserUsername, admissionsUserPassword);
        AdmissionsPage admissionsPage = homePage.clickAdmissionsLink();
        FolderTreeOfferGroupPage folderTreeOfferGroupPage = admissionsPage.goToFolderTreeOfferGroups();
//        assertThat(folderTreeOfferGroupPage.isElementDisplayed(folderTreeOfferGroupPage.OFFER_GROUP_HEADER_IDENTIFIER)).isTrue();
        folderTreeOfferGroupPage.selectOfferGroup(OfferGroups.AEROSPACE_ENGINEERING.getId());
    }


}
