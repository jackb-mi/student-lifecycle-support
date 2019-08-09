package uk.ac.bristol.admissions;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.pageobjects.admissionspageobjects.AdmissionsApplicantDashboardPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.SelectUploadDocumentTypePage;
import uk.ac.bristol.pageobjects.admissionspageobjects.UploadSupportingDocumentsPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.UploadedDocumentPage;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicantDashboardTest extends BaseTest {

    private String DocUploadStudentNo = "1905558";
    private String DocUploadSurname = "USTCP";
    private String DocUploadDateOfBirth = "01/Jun/1987";
    private String DocUploadSsoLink = "ZC5R5P5JLWODbQ6DXrGrXOCTOqNT7mUAscS7MVM8iwTQgD4yH5";

    @Test
    public void shouldUploadADocument() throws InterruptedException {
    //Given
        AdmissionsApplicantDashboardPage admissionsApplicantDashboardPage = shouldAccessApplicantDashboard(DocUploadStudentNo, DocUploadSurname, DocUploadDateOfBirth, DocUploadSsoLink);
        SelectUploadDocumentTypePage selectUploadDocumentTypePage = admissionsApplicantDashboardPage.goToSelectUploadDocumentTypePage();
        UploadSupportingDocumentsPage uploadSupportingDocumentsPage = selectUploadDocumentTypePage.goToUploadDocumentPage("Achieved qualifications");
        UploadedDocumentPage uploadedDocumentPage = uploadSupportingDocumentsPage.uploadDocument("/Users/chrisharris/Pictures/", "juninho.jpg");
        assertThat(isElementDisplayed(uploadedDocumentPage.SUBMIT_IDENTIFIER)).isTrue();
    }

}
