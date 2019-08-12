package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.enums.CurriculumProposalApprovalLevels;
import uk.ac.bristol.pageobjects.BasePage;
import uk.ac.bristol.pageobjects.UploadFilesPage;

import static junit.framework.TestCase.fail;
import static uk.ac.bristol.enums.CurriculumProposalApprovalLevels.NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY;
import static uk.ac.bristol.enums.CurriculumProposalApprovalLevels.PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY;

public class ProposalInformationPage extends BasePage {

    private static final By RATIONAL_SECTION_IDENTIFIER = By.cssSelector("#ui-id-3");
    private static final By EQUALITY_ANALYSIS_SECTION_IDENTIFIER = By.cssSelector("#ui-id-5");
    private static final By ORDINANCES_AND_REGULATIONS_SECTION_IDENTIFIER = By.cssSelector("#ui-id-7");
    private static final By SUPPORT_SECTION_IDENTIFIER = By.cssSelector("#ui-id-9");

    public ProposalInformationPage(ChromeDriver driver) {
        super(driver);
    }

    public void completeProposalSection(CommitteeLevel committeeLevel) {

        ProposalSection.enterProposalName("Test123");
        ProposalSection.enterOwningSchoolDepartment("SART");
        ProposalSection.enterAcademicResponsible("XXXTEST3");
        ProposalSection.selectDropDownOption(committeeLevel.getValue());
    }

    public void selectAndCompleteRationalSection(CurriculumProposalApprovalLevels proposalApprovalLevel) throws InterruptedException {
        clickElement(RATIONAL_SECTION_IDENTIFIER);
        RationaleSection.enterAcademicRationale("Test");
        //TODO wait for element to become interactable
        Thread.sleep(1000);

        if (proposalApprovalLevel == CurriculumProposalApprovalLevels.NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY) {
            RationaleSection.enterAssessmentDetails("Test");
        }

        RationaleSection.enterResourceImplications("Test");
        RationaleSection.enterStudentNumbers("10");
        RationaleSection.enterConsultationWithOtherSchoolsDepartment("Test");
        Thread.sleep(1000);
    }

    public void selectAndCompleteEqualityAnalysisSection(CurriculumProposalApprovalLevels proposalApprovalLevel) throws InterruptedException {
        clickElement(EQUALITY_ANALYSIS_SECTION_IDENTIFIER);
        Thread.sleep(1000);
        if (proposalApprovalLevel == CurriculumProposalApprovalLevels.NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY) {
            EqualityAnalysisSection.enterEqualityRiskAssessment("Test");
            //TODO improve wait
            Thread.sleep(1000);
        }

        EqualityAnalysisSection.enterEqualityRiskImpact("Test");
        //TODO improve wait
        Thread.sleep(1000);
    }

    public void selectAndCompleteOrdinancesAndRegulationsSection(CurriculumProposalApprovalLevels proposalApprovalLevel) throws InterruptedException {
        clickElement(ORDINANCES_AND_REGULATIONS_SECTION_IDENTIFIER);
        if (proposalApprovalLevel == NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY || proposalApprovalLevel == PROGRAMME_PATHWAY_WITHDRAWAL_UNIVERSITY) {
            OrdinancesAndRegulationsSection.enterConsequentChangesToTheOrdinances("Test");
            // TODO improve wait
            Thread.sleep(1000);
        }
        OrdinancesAndRegulationsSection.enterConsequentChangesToTheRegulations("Test");
    }

    public void selectAndCompleteSupportSection() throws InterruptedException {
        clickElement(SUPPORT_SECTION_IDENTIFIER);
        //TODO improve wait
        Thread.sleep(1000);
        SupportSection.completeUploadFileForExternalSupportAndReturnToSupportSection();
        SupportSection.completeUploadFileForExternalSupportAndReturnToSupportSection();
        SupportSection.enterExternalAssessors("Test");
        SupportSection.enterResponseToExternalAssessors("Test");
        SupportSection.enterProfessionalBodyScrutiny("Test");
        SupportSection.completeUploadFileForStudentConsultationAndReturnToSupportSection();
    }


    public void selectAndCompleteStudentsAndApplicantsSection(CurriculumProposalApprovalLevels proposalApprovalLevel) throws InterruptedException {

        switch (proposalApprovalLevel) {
            case NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY: {
                Thread.sleep(1000);
                clickElement(By.cssSelector("#ui-id-11"));
                Thread.sleep(1000);
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.25\\."), "Test");
                break;
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
            case OTHER_CHANGES_THAT_REQUIRE_APPROVAL_FACULTY: {
                clickElement(By.cssSelector("#ui-id-9"));
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.23\\."), "Test");
                break;
            }
            case UNIT_UPDATES_THAT_DO_NOT_REQUIRE_APPROVAL: {
                clickElement(By.cssSelector("#ui-id-9"));
                enterTextIntoElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.23\\."), "Test");
                break;
            }
            default:
                fail("Unknown Curriculum Proposal Approval Level");
        }
        // TODO improve wait
        Thread.sleep(1000);

    }

    public SubmitProposalPage selectPrepareToSubmitProposalButton(CurriculumProposalApprovalLevels proposalApprovalLevel) throws InterruptedException {
        Thread.sleep(3000);

        if (proposalApprovalLevel != NEW_PROGRAMMES_HIGH_RISK_CHANGES_UNIVERSITY) {
            clickElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.29\\."));
        }

        else {
            clickElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.31\\."));
        }

        Thread.sleep(3000);

        SubmitProposalPage submitProposalPage = new SubmitProposalPage(driver);
        return submitProposalPage;
    }

    public static class ProposalSection {
        private static final By PROPOSAL_NAME_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.2\\.");
        private static final By OWNING_SCHOOL_DEPARTMENT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.3\\.");
        private static final By ACADEMIC_RESPONSIBLE_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.4\\.");
        private static final By COMMITTEE_LEVEL_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.6\\.");

        private static void enterProposalName(String textToEnter) {
            enterTextIntoElement(PROPOSAL_NAME_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterOwningSchoolDepartment(String textToEnter) {
            enterTextIntoElement(OWNING_SCHOOL_DEPARTMENT_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterAcademicResponsible(String textToEnter) {
            enterTextIntoElement(ACADEMIC_RESPONSIBLE_INPUT_IDENTIFIER, textToEnter);
        }

        private static void selectDropDownOption(String value) {

            Select dropDownValue = new Select(driver.findElement(COMMITTEE_LEVEL_DROPDOWN_IDENTIFIER));
            dropDownValue.selectByValue(value);
        }
    }

    public static class RationaleSection {

        private static final By ACADEMIC_RATIONALE_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.7\\.");
        private static final By ASSESSMENT_DETAILS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.8\\.");
        private static final By RESOURCE_IMPLICATIONS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.9\\.");
        private static final By STUDENT_NUMBERS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.10\\.");
        private static final By CONSULTATION_WITH_OTHER_SCHOOLS_DEPARTMENT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.11\\.");

        private static void enterAcademicRationale(String textToEnter) {
            enterTextIntoElement(ACADEMIC_RATIONALE_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterAssessmentDetails(String textToEnter) {
            enterTextIntoElement(ASSESSMENT_DETAILS_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterResourceImplications(String textToEnter) {
            enterTextIntoElement(RESOURCE_IMPLICATIONS_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterStudentNumbers(String textToEnter) {
            enterTextIntoElement(STUDENT_NUMBERS_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterConsultationWithOtherSchoolsDepartment(String textToEnter) {
            enterTextIntoElement(CONSULTATION_WITH_OTHER_SCHOOLS_DEPARTMENT_INPUT_IDENTIFIER, textToEnter);
        }
    }

    public static class EqualityAnalysisSection {

        private static final By EQUALITY_RISK_ASSESSMENT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.12\\.");
        private static final By EQUALITY_RISK_IMPACT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.13\\.");

        private static void enterEqualityRiskAssessment(String textToEnter) {
            enterTextIntoElement(EQUALITY_RISK_ASSESSMENT_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterEqualityRiskImpact(String textToEnter) {
            enterTextIntoElement(EQUALITY_RISK_IMPACT_INPUT_IDENTIFIER, textToEnter);
        }
    }

    public static class OrdinancesAndRegulationsSection {

        private static final By CONSEQUENT_CHANGES_TO_THE_ORDINANCES_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.14\\.");
        private static final By CONSEQUENT_CHANGES_TO_THE_REGULATIONS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.15\\.");

        private static void enterConsequentChangesToTheOrdinances(String textToEnter) {
            enterTextIntoElement(CONSEQUENT_CHANGES_TO_THE_ORDINANCES_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterConsequentChangesToTheRegulations(String textToEnter) {
            enterTextIntoElement(CONSEQUENT_CHANGES_TO_THE_REGULATIONS_INPUT_IDENTIFIER, textToEnter);
        }
    }

    public static class SupportSection {

        private static final By EXTERNAL_SUPPORT_UPLOAD_BUTTON_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.16\\.");
        private static final By EXTERNAL_ASSESSORS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.18\\.");
        private static final By RESPONSE_TO_EXTERNAL_ASSESSORS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.19\\.");
        private static final By PROFESSIONAL_BODY_SCRUTINY_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.20\\.");
        private static final By STUDENT_CONSULTATION_UPLOAD_BUTTON_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.21\\.");

        private static void enterExternalAssessors(String textToEnter) {
            enterTextIntoElement(EXTERNAL_ASSESSORS_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterResponseToExternalAssessors(String textToEnter) {
            enterTextIntoElement(RESPONSE_TO_EXTERNAL_ASSESSORS_INPUT_IDENTIFIER, textToEnter);
        }

        private static void enterProfessionalBodyScrutiny(String textToEnter) {
            enterTextIntoElement(PROFESSIONAL_BODY_SCRUTINY_INPUT_IDENTIFIER, textToEnter);
        }

        public static void completeUploadFileForExternalSupportAndReturnToSupportSection() throws InterruptedException {
            clickElement(EXTERNAL_SUPPORT_UPLOAD_BUTTON_IDENTIFIER);

            UploadFilesPage uploadFilesPage = new UploadFilesPage(driver);

            uploadFilesPage.uploadCurriculumManagementFile();

            clickElement(SUPPORT_SECTION_IDENTIFIER);
            Thread.sleep(1000);
        }

        public static void completeUploadFileForStudentConsultationAndReturnToSupportSection() {
            clickElement(STUDENT_CONSULTATION_UPLOAD_BUTTON_IDENTIFIER);

            UploadFilesPage uploadFilesPage = new UploadFilesPage(driver);

            uploadFilesPage.uploadCurriculumManagementFile();

            clickElement(SUPPORT_SECTION_IDENTIFIER);
        }

    }
}
