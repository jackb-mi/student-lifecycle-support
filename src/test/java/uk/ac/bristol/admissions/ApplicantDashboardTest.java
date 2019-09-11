package uk.ac.bristol.admissions;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.helpers.navigationHelper.CommonNavigation;
import uk.ac.bristol.pageobjects.admissions.AdmissionsApplicantDashboardPage;
import uk.ac.bristol.pageobjects.admissions.SelectUploadDocumentTypePage;
import uk.ac.bristol.pageobjects.admissions.UploadSupportingDocumentsPage;
import uk.ac.bristol.pageobjects.admissions.UploadedDocumentPage;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicantDashboardTest extends BaseTest {

    private String DocUploadStudentNo = "1905558";
    private String DocUploadSurname = "USTCP";
    private String DocUploadDateOfBirth = "01/Jun/1987";
    private String DocUploadSsoLink = "ZC5R5P5JLWODbQ6DXrGrXOCTOqNT7mUAscS7MVM8iwTQgD4yH5";
    private String File = "juninho.jpg";

    private CommonNavigation commonNavigation = new CommonNavigation();



    @Test
    public void shouldUploadADocument() throws InterruptedException {
    //Given
        AdmissionsApplicantDashboardPage admissionsApplicantDashboardPage = commonNavigation.shouldAccessApplicantDashboardForSiBetaEnvironment(driver, DocUploadStudentNo, DocUploadSurname, DocUploadDateOfBirth, DocUploadSsoLink);
        SelectUploadDocumentTypePage selectUploadDocumentTypePage = admissionsApplicantDashboardPage.goToSelectUploadDocumentTypePage();
        UploadSupportingDocumentsPage uploadSupportingDocumentsPage = selectUploadDocumentTypePage.goToUploadDocumentPage("Achieved qualifications");
        UploadedDocumentPage uploadedDocumentPage = uploadSupportingDocumentsPage.uploadDocument(File);
        assertThat(isElementDisplayed(uploadedDocumentPage.SUBMIT_IDENTIFIER)).isTrue();
    }

}
