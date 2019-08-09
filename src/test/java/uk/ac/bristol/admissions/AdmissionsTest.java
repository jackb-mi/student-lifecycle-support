package uk.ac.bristol.admissions;

import org.junit.ComparisonFailure;
import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.FolderTreeFolders;
import uk.ac.bristol.enums.OfferGroups;
import uk.ac.bristol.pageobjects.admissionspageobjects.AdmissionsPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.FolderTreeOfferGroupPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.FolderTreePage;
import uk.ac.bristol.pageobjects.HomePage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

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
        try {
            confirmAllLinksAreDisplayed(admissionsPage);
        }
        catch(ComparisonFailure f) {
            fail("Expected link on admissions page not displayed");
        }
    }

    @Test
    public void shouldShowCorrectFolderTreeStandardColumns() throws InterruptedException {
        //Given
        HomePage homePage = shouldAccessHomepage(admissionsUserUsername, admissionsUserPassword);
        AdmissionsPage admissionsPage = homePage.clickAdmissionsLink();
        FolderTreeOfferGroupPage folderTreeOfferGroupPage = admissionsPage.goToFolderTreeOfferGroups();
        FolderTreePage folderTreePage = folderTreeOfferGroupPage.selectOfferGroup(OfferGroups.AEROSPACE_ENGINEERING.getId());
        //When
        folderTreePage.goToFolder(FolderTreeFolders.TO_BE_UNSUCCESSFUL.getId());
        //Then
        try{
            confirmCorrectToBeUnsuccessfulColumnHeadersAreDisplayed(folderTreePage);
        }
        catch (ComparisonFailure f) {
            fail("Column headers were not displayed as expected");
        }

        //And When
        folderTreePage.goToFolder(FolderTreeFolders.FURTHER_INFORMATION.getId());
        //Then
        try{
            confirmCorrectFurtherInfoColumnHeadersAreDisplayed(folderTreePage);
        }
        catch (ComparisonFailure f) {
            fail("Column headers were not displayed as expected");
        }

        //And When
        folderTreePage.goToFolder((FolderTreeFolders.CONSIDER_FOR_INTERVIEW.getId()));
        //Then
        try{
            confirmCorrectConsiderInterviewColumnHeadersAreDisplayed(folderTreePage);
        }
        catch (ComparisonFailure f) {
            fail("Column headers were not displayed as expected");
        }

        // And When
        folderTreePage.goToFolder((FolderTreeFolders.INVITED_FOR_INTERVEW.getId()));
        //Then
        try{
            confirmCorrectInvitedInterviewColumnHeadersAreDisplayed(folderTreePage);
        }
        catch (ComparisonFailure f) {
            fail("Column headers were not displayed as expected");
        }

        // And When
        folderTreePage.goToFolder((FolderTreeFolders.CONSIDER_FOR_OFFER.getId()));
        //Then
        try{
            confirmCorrectConsiderOfferColumnHeadersAreDisplayed(folderTreePage);
        }
        catch (ComparisonFailure f) {
            fail("Column headers were not displayed as expected");
        }

        // And When
        folderTreePage.goToFolder((FolderTreeFolders.OFFER_PENDING.getId()));
        //Then
        try{
            confirmCorrectOfferPendingColumnHeadersAreDisplayed(folderTreePage);
        }
        catch (ComparisonFailure f) {
            fail("Column headers were not displayed as expected");
        }

        // And When
        folderTreePage.goToFolder((FolderTreeFolders.CONDITIONAL_FIRM.getId()));
        //Then
        try{
            confirmCorrectConditionalFirmColumnHeadersAreDisplayed(folderTreePage);
        }
        catch (ComparisonFailure f) {
            fail("Column headers were not displayed as expected");
        }
    }

    private void confirmCorrectToBeUnsuccessfulColumnHeadersAreDisplayed(FolderTreePage folderTreePage) {

        assertThat(getTextFromElement(folderTreePage.COLUMN_ONE_IDENTIFIER)).contains("UCAS");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWO_IDENTIFIER)).contains("Name");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THREE_IDENTIFIER)).contains("Course");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOUR_IDENTIFIER)).contains("Date");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIVE_IDENTIFIER)).contains("Applicant");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIX_IDENTIFIER)).contains("Project");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVEN_IDENTIFIER)).contains("Contextual");
        assertThat(getTextFromElement(folderTreePage.COLUMN_EIGHT_IDENTIFIER)).contains("Point");
        assertThat(getTextFromElement(folderTreePage.COLUMN_NINE_IDENTIFIER)).contains("Year");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TEN_IDENTIFIER)).contains("Age");
        assertThat(getTextFromElement(folderTreePage.COLUMN_ELEVEN_IDENTIFIER)).contains("Total");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWELVE_IDENTIFIER)).contains("Folder");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THIRTEEN_IDENTIFIER)).contains("Circs");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOURTEEN_IDENTIFIER)).contains("stage");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIFTEEN_IDENTIFIER)).contains("Care");
    }

    private void confirmCorrectFurtherInfoColumnHeadersAreDisplayed(FolderTreePage folderTreePage) {

        assertThat(getTextFromElement(folderTreePage.COLUMN_ONE_IDENTIFIER)).contains("UCAS");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWO_IDENTIFIER)).contains("Name");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THREE_IDENTIFIER)).contains("Course");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOUR_IDENTIFIER)).contains("received");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIVE_IDENTIFIER)).contains("requested");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIX_IDENTIFIER)).contains("Info");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVEN_IDENTIFIER)).contains("Project");
        assertThat(getTextFromElement(folderTreePage.COLUMN_EIGHT_IDENTIFIER)).contains("Contextual");
        assertThat(getTextFromElement(folderTreePage.COLUMN_NINE_IDENTIFIER)).contains("Point");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TEN_IDENTIFIER)).contains("Year");
        assertThat(getTextFromElement(folderTreePage.COLUMN_ELEVEN_IDENTIFIER)).contains("Age");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWELVE_IDENTIFIER)).contains("Folder");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THIRTEEN_IDENTIFIER)).contains("Total");
    }

    private void confirmCorrectConsiderInterviewColumnHeadersAreDisplayed(FolderTreePage folderTreePage){

        assertThat(getTextFromElement(folderTreePage.COLUMN_ONE_IDENTIFIER)).contains("UCAS");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWO_IDENTIFIER)).contains("Name");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THREE_IDENTIFIER)).contains("Course");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOUR_IDENTIFIER)).contains("received");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIVE_IDENTIFIER)).contains("Applicant");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIX_IDENTIFIER)).contains("Project");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVEN_IDENTIFIER)).contains("Contextual");
        assertThat(getTextFromElement(folderTreePage.COLUMN_EIGHT_IDENTIFIER)).contains("Point");
        assertThat(getTextFromElement(folderTreePage.COLUMN_NINE_IDENTIFIER)).contains("Year");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TEN_IDENTIFIER)).contains("Age");
        assertThat(getTextFromElement(folderTreePage.COLUMN_ELEVEN_IDENTIFIER)).contains("Folder");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWELVE_IDENTIFIER)).contains("quals");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THIRTEEN_IDENTIFIER)).contains("Aspirational");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOURTEEN_IDENTIFIER)).contains("Total");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIFTEEN_IDENTIFIER)).contains("Pre-Interview");
    }

    private void confirmCorrectInvitedInterviewColumnHeadersAreDisplayed(FolderTreePage folderTreePage){

        assertThat(getTextFromElement(folderTreePage.COLUMN_ONE_IDENTIFIER)).contains("UCAS");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWO_IDENTIFIER)).contains("Name");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THREE_IDENTIFIER)).contains("Course");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOUR_IDENTIFIER)).contains("received");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIVE_IDENTIFIER)).contains("Applicant");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIX_IDENTIFIER)).contains("Project");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVEN_IDENTIFIER)).contains("Contextual");
        assertThat(getTextFromElement(folderTreePage.COLUMN_EIGHT_IDENTIFIER)).contains("Point");
        assertThat(getTextFromElement(folderTreePage.COLUMN_NINE_IDENTIFIER)).contains("Year");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TEN_IDENTIFIER)).contains("Age");
        assertThat(getTextFromElement(folderTreePage.COLUMN_ELEVEN_IDENTIFIER)).contains("Folder");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWELVE_IDENTIFIER)).contains("Aspirational");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THIRTEEN_IDENTIFIER)).contains("Total");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOURTEEN_IDENTIFIER)).contains("Pre-Interview");
    }

    private void confirmCorrectConsiderOfferColumnHeadersAreDisplayed(FolderTreePage folderTreePage){

        assertThat(getTextFromElement(folderTreePage.COLUMN_ONE_IDENTIFIER)).contains("UCAS");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWO_IDENTIFIER)).contains("Name");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THREE_IDENTIFIER)).contains("Course");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOUR_IDENTIFIER)).contains("received");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIVE_IDENTIFIER)).contains("Applicant");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIX_IDENTIFIER)).contains("Project");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVEN_IDENTIFIER)).contains("Contextual");
        assertThat(getTextFromElement(folderTreePage.COLUMN_EIGHT_IDENTIFIER)).contains("Point");
        assertThat(getTextFromElement(folderTreePage.COLUMN_NINE_IDENTIFIER)).contains("Year");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TEN_IDENTIFIER)).contains("Age");
        assertThat(getTextFromElement(folderTreePage.COLUMN_ELEVEN_IDENTIFIER)).contains("Folder");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWELVE_IDENTIFIER)).contains("Circs");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THIRTEEN_IDENTIFIER)).contains("stage");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOURTEEN_IDENTIFIER)).contains("quals");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIFTEEN_IDENTIFIER)).contains("Aspirational");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIXTEEN_IDENTIFIER)).contains("Interview");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVENTEEN_IDENTIFIER)).contains("Total");
    }

    private void confirmCorrectOfferPendingColumnHeadersAreDisplayed(FolderTreePage folderTreePage){

        assertThat(getTextFromElement(folderTreePage.COLUMN_ONE_IDENTIFIER)).contains("UCAS");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWO_IDENTIFIER)).contains("Name");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THREE_IDENTIFIER)).contains("Course");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOUR_IDENTIFIER)).contains("received");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIVE_IDENTIFIER)).contains("Applicant");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIX_IDENTIFIER)).contains("Project");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVEN_IDENTIFIER)).contains("Contextual");
        assertThat(getTextFromElement(folderTreePage.COLUMN_EIGHT_IDENTIFIER)).contains("Point");
        assertThat(getTextFromElement(folderTreePage.COLUMN_NINE_IDENTIFIER)).contains("Year");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TEN_IDENTIFIER)).contains("Age");
        assertThat(getTextFromElement(folderTreePage.COLUMN_ELEVEN_IDENTIFIER)).contains("Interview");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWELVE_IDENTIFIER)).contains("quals");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THIRTEEN_IDENTIFIER)).contains("Care");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOURTEEN_IDENTIFIER)).contains("Aspirational");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIFTEEN_IDENTIFIER)).contains("Parental");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIXTEEN_IDENTIFIER)).contains("move");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVENTEEN_IDENTIFIER)).contains("Total");
        assertThat(getTextFromElement(folderTreePage.COLUMN_EIGHTNTEEN_IDENTIFIER)).contains("Pre-offer");
    }

    private void confirmCorrectConditionalFirmColumnHeadersAreDisplayed(FolderTreePage folderTreePage){

        assertThat(getTextFromElement(folderTreePage.COLUMN_ONE_IDENTIFIER)).contains("UCAS");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWO_IDENTIFIER)).contains("Name");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THREE_IDENTIFIER)).contains("Course");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOUR_IDENTIFIER)).contains("received");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIVE_IDENTIFIER)).contains("Applicant");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIX_IDENTIFIER)).contains("Project");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVEN_IDENTIFIER)).contains("Contextual");
        assertThat(getTextFromElement(folderTreePage.COLUMN_EIGHT_IDENTIFIER)).contains("Point");
        assertThat(getTextFromElement(folderTreePage.COLUMN_NINE_IDENTIFIER)).contains("Year");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TEN_IDENTIFIER)).contains("Age");
        assertThat(getTextFromElement(folderTreePage.COLUMN_ELEVEN_IDENTIFIER)).contains("Interview");
        assertThat(getTextFromElement(folderTreePage.COLUMN_TWELVE_IDENTIFIER)).contains("Total");
        assertThat(getTextFromElement(folderTreePage.COLUMN_THIRTEEN_IDENTIFIER)).contains("Decision");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FOURTEEN_IDENTIFIER)).contains("response");
        assertThat(getTextFromElement(folderTreePage.COLUMN_FIFTEEN_IDENTIFIER)).contains("Folder");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SIXTEEN_IDENTIFIER)).contains("Parental");
        assertThat(getTextFromElement(folderTreePage.COLUMN_SEVENTEEN_IDENTIFIER)).contains("Occ");
    }

    private void confirmAllLinksAreDisplayed(AdmissionsPage admissionsPage) {

        assertThat(isElementDisplayed(admissionsPage.APPLICATION_PROCESSING_TITLE_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.UNDERGRADUATE_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.ACD_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.RCD_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.ALT_BULK_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.UKCAT_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.LNAT_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.WORK_EXP_LINK_IDENTIFIER)).isTrue();

        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_TITLE_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.TALK_SEARCH_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAY_SUMMARY_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.ACCESS_REQUIREMENTS_LINK_IDENTIFIER)).isTrue();

        assertThat(isElementDisplayed(admissionsPage.HELP_SUPPORT_TITLE_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.USER_GUIDES_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.POLICY_GUIDANCE_LINK_IDENTIFIER)).isTrue();

        assertThat(isElementDisplayed(admissionsPage.ATTRIBUTE_MANAGEMENT_TITLE_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.MANAGE_COURSE_ATTRIBUTES_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.MANAGE_ADMISSIONS_THRESHOLDS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.DUPLICATE_MATCHING_LINK_IDENTIFIER)).isTrue();

        assertThat(isElementDisplayed(admissionsPage.CONFIRMATION_TITLE_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.CONFIRMATION_CALL_CENTRE_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.CONFIRMATION_PROCESSING_GROUP_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.CONFIRMATION_PROCESSING_CHECKING_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.MANAGE_NEAR_MISS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.SEND_CONFIRMATION_LINK_IDENTIFIER)).isTrue();

        assertThat(isElementDisplayed(admissionsPage.REPORTS_TITLE_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_SCHOOL_BOOKINGS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_DEPARTMENT_BOOKINGS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_ACCESS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_TALK_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_MATURE_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_FULL_TALKS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_PARK_RIDE_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_VET_SCIENCE_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_WP_BOOKERS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.OPEN_DAYS_INTERNATIONAL_BOOKERS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.PG_APPLICATIONS_VISA_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.PG_APPLICATIONS_VISA_REQUEST_VIEWER_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.PG_NEW_STUDENT_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.PG_COMBINED_CAS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.PG_PROGRAMME_FEES_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.PRE_SESSIONAL_APP_SUMMARY_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.APPLICANT_CONTACT_DETAILS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.CLEARANCE_CHECK_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.NEW_DOCUMENT_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.ACCEPTED_APPLICANTS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.REGISTRATION_PACKS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.DECISION_CHECKER_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.WP_PROJECTS_LINK_IDENTIFIER)).isTrue();
        assertThat(isElementDisplayed(admissionsPage.FOLDEROVERVIEW_LINK_IDENTIFIER)).isTrue();
    }
}
