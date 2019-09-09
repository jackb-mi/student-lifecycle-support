package uk.ac.bristol.admissions;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.helpers.navigationHelper.CommonNavigation;
import uk.ac.bristol.pageobjects.admissionspageobjects.AdmissionsApplicantDashboardPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.SelectUploadDocumentTypePage;
import uk.ac.bristol.pageobjects.admissionspageobjects.UploadSupportingDocumentsPage;
import uk.ac.bristol.pageobjects.admissionspageobjects.UploadedDocumentPage;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicantDashboardTest extends BaseTest {

    private String DocUploadStudentNo = "1988986";
    private String DocUploadSurname = "SAR";
    private String DocUploadDateOfBirth = "03/Jun/1996";
    private String DocUploadSsoLink = "vnpSOgTqstITWzFQgJNsLjkla8VwSGYa2dEfV2PSl9FjsFLc4e";
    private String User = System.getProperty("user.name");
    private String Path = "/Users/" + User + "/Pictures/";
    private String File = "juninho.jpg";

    private CommonNavigation commonNavigation = new CommonNavigation();



    @Test
    public void shouldUploadADocument() throws InterruptedException {
    //Given
        AdmissionsApplicantDashboardPage admissionsApplicantDashboardPage = commonNavigation.shouldAccessApplicantDashboardForSLSTestEnvironment(driver, DocUploadStudentNo, DocUploadSurname, DocUploadDateOfBirth, DocUploadSsoLink);
        SelectUploadDocumentTypePage selectUploadDocumentTypePage = admissionsApplicantDashboardPage.goToSelectUploadDocumentTypePage();
        UploadSupportingDocumentsPage uploadSupportingDocumentsPage = selectUploadDocumentTypePage.goToUploadDocumentPage("Achieved qualifications");
        UploadedDocumentPage uploadedDocumentPage = uploadSupportingDocumentsPage.uploadDocument(Path, File);
        assertThat(isElementDisplayed(uploadedDocumentPage.SUBMIT_IDENTIFIER)).isTrue();
    }

}
