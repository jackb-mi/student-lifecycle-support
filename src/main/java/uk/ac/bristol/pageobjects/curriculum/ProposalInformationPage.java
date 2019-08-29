package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevel;
import uk.ac.bristol.helpers.ProposalInformation;
import uk.ac.bristol.pageobjects.BasePage;
import uk.ac.bristol.pageobjects.UploadFilesPage;

import java.io.IOException;

import static junit.framework.TestCase.fail;
import static uk.ac.bristol.enums.CurriculumProposalApprovalLevel.NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY;
import static uk.ac.bristol.enums.CurriculumProposalApprovalLevel.PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY;

public class ProposalInformationPage extends BasePage {

    private static final By RATIONAL_SECTION_IDENTIFIER = By.cssSelector("#ui-id-3");
    private static final By EQUALITY_ANALYSIS_SECTION_IDENTIFIER = By.cssSelector("#ui-id-5");
    private static final By ORDINANCES_AND_REGULATIONS_SECTION_IDENTIFIER = By.cssSelector("#ui-id-7");
    private static final By SUPPORT_SECTION_IDENTIFIER = By.cssSelector("#ui-id-9");

    public ProposalInformationPage(ChromeDriver driver) {
        super(driver);
    }

    public void completeProposalSection(ProposalInformation proposalInformation) {

        ProposalSection proposalSection = new ProposalSection();
        proposalSection.enterProposalName(proposalInformation.getProposalTitle());
        proposalSection.enterOwningSchoolDepartment(proposalInformation.getOwningDepartment());
        proposalSection.enterAcademicResponsible(proposalInformation.getAcademicResponsible());
        proposalSection.selectCommitteeLevel(proposalInformation.getCommitteeLevel().getValue());
    }

    public void selectAndCompleteRationalSection(CurriculumProposalApprovalLevel proposalApprovalLevel) throws InterruptedException {
        clickElement(RATIONAL_SECTION_IDENTIFIER);

        RationaleSection rationaleSection = new RationaleSection();
        rationaleSection.enterAcademicRationale("Test");
        rationaleSection.enterResourceImplications("Test");
        rationaleSection.enterStudentNumbers("10");
        rationaleSection.enterConsultationWithOtherSchoolsDepartment("Test");

        if (proposalApprovalLevel == CurriculumProposalApprovalLevel.NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY) {
            rationaleSection.enterAssessmentDetails("Test");
        }
    }

    public void selectAndCompleteEqualityAnalysisSection(CurriculumProposalApprovalLevel proposalApprovalLevel) throws InterruptedException {
        clickElement(EQUALITY_ANALYSIS_SECTION_IDENTIFIER);

        EqualityAnalysisSection equalityAnalysisSection = new EqualityAnalysisSection();
        equalityAnalysisSection.enterEqualityRiskImpact("Test");

        if (proposalApprovalLevel == CurriculumProposalApprovalLevel.NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY) {
            equalityAnalysisSection.enterEqualityRiskAssessment("Test");
        }
    }

    public void selectAndCompleteOrdinancesAndRegulationsSection(CurriculumProposalApprovalLevel proposalApprovalLevel) throws InterruptedException {
        clickElement(ORDINANCES_AND_REGULATIONS_SECTION_IDENTIFIER);

        OrdinancesAndRegulationsSection ordinancesAndRegulationsSection = new OrdinancesAndRegulationsSection();
        ordinancesAndRegulationsSection.enterConsequentChangesToTheRegulations("Test");

        if (proposalApprovalLevel == NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY || proposalApprovalLevel == PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY) {
            ordinancesAndRegulationsSection.enterConsequentChangesToTheOrdinances("Test");
        }
    }

    public void selectAndCompleteSupportSection() throws Exception {

        SupportSection supportSection = openSupportSection();

        supportSection.completeUploadFileForExternalSupportAndReturnToSupportSection();
        openSupportSection();
        supportSection.completeUploadFileForExternalSupportAndReturnToSupportSection();
        openSupportSection();
        supportSection.enterExternalAssessors("Test");
        supportSection.enterResponseToExternalAssessors("Test");
        supportSection.enterProfessionalBodyScrutiny("Test");
        supportSection.completeUploadFileForStudentConsultationAndReturnToSupportSection();
    }

    private SupportSection openSupportSection() {
        clickElement(SUPPORT_SECTION_IDENTIFIER);

        SupportSection supportSection = new SupportSection();
        waitUntilElementIsVisible(driver, supportSection.EXTERNAL_SUPPORT_UPLOAD_BUTTON_IDENTIFIER);

        return supportSection;

    }

    public void selectAndCompleteStudentsAndApplicantsSection(CurriculumProposalApprovalLevel proposalApprovalLevel) throws InterruptedException {

        switch (proposalApprovalLevel) {
            case NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY: {

                while(!isElementClickable(driver, By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.25\\.")));
                {
                    clickElement(By.cssSelector("#ui-id-11"));
                    enterTextWithoutThrowingElementNotInteractableException(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.25\\."), "Test");
                    break;
                }
            }

            case PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY: {
                clickElement(By.cssSelector("#ui-id-9"));
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.21\\."), "Test");
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.22\\."), "Test");
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.23\\."), "Test");
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.24\\."), "Test");
                break;
            }
            case PROGRAMME_PATHWAY_SUSPENSION_UNIVERSITY: {
                clickElement(By.cssSelector("#ui-id-7"));
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.21\\."), "Test");
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.22\\."), "Test");
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.23\\."), "Test");
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.24\\."), "Test");
                break;
            }
            case OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY:
            case UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL: {
                clickElement(By.cssSelector("#ui-id-9"));
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.23\\."), "Test");
                break;
            }
            default:
                fail("Unknown Curriculum Proposal Approval Level");
        }
    }

    public void enterTextWithoutThrowingElementNotInteractableException(By element, String textToEnter) throws InterruptedException {

        int count = 0;
        int maxTries = 3;

        while(true)
            try
            {
                enterTextIntoElement(element, textToEnter);
                break;
            }
            catch (ElementNotInteractableException e ) {
                Thread.sleep(5000);
                if (++count == maxTries) throw e;
            }
    }

    public SubmitProposalPage selectPrepareToSubmitProposalButton(CurriculumProposalApprovalLevel proposalApprovalLevel) throws InterruptedException {

        if (proposalApprovalLevel != NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY) {
            clickElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.29\\."));
        }

        else {
            clickElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.31\\."));
        }

        SubmitProposalPage submitProposalPage = new SubmitProposalPage(driver);
        return submitProposalPage;
    }

    public class ProposalSection {
        private final By PROPOSAL_NAME_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.2\\.");
        private final By OWNING_SCHOOL_DEPARTMENT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.3\\.");
        private final By ACADEMIC_RESPONSIBLE_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.4\\.");
        private final By COMMITTEE_LEVEL_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.6\\.");

        private void enterProposalName(String textToEnter) {
            enterTextIntoElement(PROPOSAL_NAME_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterOwningSchoolDepartment(String textToEnter) {
            enterTextIntoElement(OWNING_SCHOOL_DEPARTMENT_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterAcademicResponsible(String textToEnter) {
            enterTextIntoElement(ACADEMIC_RESPONSIBLE_INPUT_IDENTIFIER, textToEnter);
        }

        private void selectCommitteeLevel(String value) {

            Select dropDownValue = new Select(driver.findElement(COMMITTEE_LEVEL_DROPDOWN_IDENTIFIER));
            dropDownValue.selectByValue(value);
        }
    }

    public class RationaleSection {

        private final By ACADEMIC_RATIONALE_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.7\\.");
        private final By ASSESSMENT_DETAILS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.8\\.");
        private final By RESOURCE_IMPLICATIONS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.9\\.");
        private final By STUDENT_NUMBERS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.10\\.");
        private final By CONSULTATION_WITH_OTHER_SCHOOLS_DEPARTMENT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.11\\.");

        private void enterAcademicRationale(String textToEnter) {
            enterTextIntoElement(ACADEMIC_RATIONALE_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterAssessmentDetails(String textToEnter) {
            enterTextIntoElement(ASSESSMENT_DETAILS_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterResourceImplications(String textToEnter) {
            enterTextIntoElement(RESOURCE_IMPLICATIONS_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterStudentNumbers(String textToEnter) {
            enterTextIntoElement(STUDENT_NUMBERS_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterConsultationWithOtherSchoolsDepartment(String textToEnter) {
            enterTextIntoElement(CONSULTATION_WITH_OTHER_SCHOOLS_DEPARTMENT_INPUT_IDENTIFIER, textToEnter);
        }
    }

    public class EqualityAnalysisSection {

        private final By EQUALITY_RISK_ASSESSMENT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.12\\.");
        private final By EQUALITY_RISK_IMPACT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.13\\.");

        private void enterEqualityRiskAssessment(String textToEnter) {
            enterTextIntoElement(EQUALITY_RISK_ASSESSMENT_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterEqualityRiskImpact(String textToEnter) {
            enterTextIntoElement(EQUALITY_RISK_IMPACT_INPUT_IDENTIFIER, textToEnter);
        }
    }

    public class OrdinancesAndRegulationsSection {

        private final By CONSEQUENT_CHANGES_TO_THE_ORDINANCES_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.14\\.");
        private final By CONSEQUENT_CHANGES_TO_THE_REGULATIONS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.15\\.");

        private void enterConsequentChangesToTheOrdinances(String textToEnter) {
            enterTextIntoElement(CONSEQUENT_CHANGES_TO_THE_ORDINANCES_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterConsequentChangesToTheRegulations(String textToEnter) {
            enterTextIntoElement(CONSEQUENT_CHANGES_TO_THE_REGULATIONS_INPUT_IDENTIFIER, textToEnter);
        }
    }

    public class SupportSection {

        private final By EXTERNAL_SUPPORT_UPLOAD_BUTTON_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.16\\.");
        private final By EXTERNAL_ASSESSORS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.18\\.");
        private final By RESPONSE_TO_EXTERNAL_ASSESSORS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.19\\.");
        private final By PROFESSIONAL_BODY_SCRUTINY_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.20\\.");
        private final By STUDENT_CONSULTATION_UPLOAD_BUTTON_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.21\\.");

        private void enterExternalAssessors(String textToEnter) {
            enterTextIntoElement(EXTERNAL_ASSESSORS_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterResponseToExternalAssessors(String textToEnter) {
            enterTextIntoElement(RESPONSE_TO_EXTERNAL_ASSESSORS_INPUT_IDENTIFIER, textToEnter);
        }

        private void enterProfessionalBodyScrutiny(String textToEnter) {
            enterTextIntoElement(PROFESSIONAL_BODY_SCRUTINY_INPUT_IDENTIFIER, textToEnter);
        }

        public ProposalInformationPage completeUploadFileForExternalSupportAndReturnToSupportSection() throws Exception {

            clickButtonWithoutThrowingElementClickInterceptedException(EXTERNAL_SUPPORT_UPLOAD_BUTTON_IDENTIFIER);

            UploadFilesPage uploadFilesPage = new UploadFilesPage(driver);

            return uploadFilesPage.uploadCurriculumManagementFile();
        }

        public void clickButtonWithoutThrowingElementClickInterceptedException(By element) throws InterruptedException {

            int count = 0;
            int maxTries = 3;

            while(true)
            try
            {
                clickElement(element);
                break;
            }
            catch (ElementClickInterceptedException e ) {
                if (++count == maxTries) throw e;
            }

            if (isElementDisplayed(driver, element) == true) {
                clickElement(element);
            }

        }

        public ProposalInformationPage completeUploadFileForStudentConsultationAndReturnToSupportSection() throws IOException, InterruptedException {

            clickElement(STUDENT_CONSULTATION_UPLOAD_BUTTON_IDENTIFIER);

            UploadFilesPage uploadFilesPage = new UploadFilesPage(driver);

            return uploadFilesPage.uploadCurriculumManagementFile();
        }

    }
}
