package uk.ac.bristol.pageobjects.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import uk.ac.bristol.enums.CommitteeLevel;
import uk.ac.bristol.pageobjects.BasePage;
import uk.ac.bristol.pageobjects.UploadFilesPage;

public class ProposalInformationPage extends BasePage {

    private static final By PROPOSAL_NAME_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.2\\.");
    // TODO Move to proposal section of page
    private static final By OWNING_SCHOOL_DEPARTMENT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.3\\.");
    // TODO Move to proposal section of page
    private static final By ACADEMIC_RESPONSIBLE_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.4\\.");
    // TODO Move to proposal section of page
    private static final By COMMITTEE_LEVEL_DROPDOWN_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.6\\.");

    private static final By RATIONAL_SECTION_IDENTIFIER = By.cssSelector("#ui-id-3");
    // TODO Move to rationale section of page
    private static final By ACADEMIC_RATIONALE_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.7\\.");
    // TODO Move to rationale section of page
    private static final By RESOURCE_IMPLICATIONS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.9\\.");
    // TODO Move to rationale section of page
    private static final By STUDENT_NUMBERS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.10\\.");
    // TODO Move to rationale section of page
    private static final By CONSULTATION_WITH_OTHER_SCHOOLS_DEPARTMENT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.11\\.");


    private static final By EQUALITY_ANALYSIS_SECTION_IDENTIFIER = By.cssSelector("#ui-id-5");
    // TODO Move to equality analysis section of page
    private static final By EQUALITY_RISK_IMPACT_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.13\\.");

    private static final By ORDINANCES_AND_REGULATIONS_SECTION_IDENTIFIER = By.cssSelector("#ui-id-7");
    // TODO Move to Ordinances and regulations section of page
    private static final By CONSEQUENT_CHANGES_TO_THE_REGULATIONS_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.15\\.");

    private static final By SUPPORT_SECTION_IDENTIFIER = By.cssSelector("#ui-id-9");

    private static final By STUDENTS_AND_APPLICANTS_SECTION_IDENTIFIER = By.cssSelector("#ui-id-9");
    // TODO Move to Students and applications section of page
    private static final By CONSUMER_PROTECTION_LAW_INPUT_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.23\\.");

    private static final By PREPARE_TO_SUBMIT_PROPOSAL_BUTTON_IDENTIFIER = By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.29\\.");

    public ProposalInformationPage(ChromeDriver driver) {
        super(driver);
    }

    public void completeProposalSection(CommitteeLevel committeeLevel) {

        enterProposalName("Test123");
        enterOwningSchoolDepartment("SART");
        enterAcademicResponsible("XXXTEST3");

        selectDropDownOption(committeeLevel.getValue());
    }

    public void selectAndCompleteRationalSection() throws InterruptedException {
        clickElement(RATIONAL_SECTION_IDENTIFIER);
        enterAcademicRationale("Test");
        //TODO wait for element to become interactable
        Thread.sleep(1000);
        enterResourceImplications("Test");
        enterStudentNumbers("10");
        enterConsultationWithOtherSchoolsDepartment("Test");
    }

    public void selectAndCompleteEqualityAnalysisSection() throws InterruptedException {
        clickElement(EQUALITY_ANALYSIS_SECTION_IDENTIFIER);
        enterEqualityRiskImpact("Test");
        //TODO improve wait
        Thread.sleep(1000);
    }

    public void selectAndCompleteOrdinancesAndRegulationsSection() {
        clickElement(ORDINANCES_AND_REGULATIONS_SECTION_IDENTIFIER);
        enterConsequentChangesToTheRegulations("Test");
    }

    public void selectSupportSection()
    {
        clickElement(SUPPORT_SECTION_IDENTIFIER);
    }

    public void selectAndCompleteStudentsAndApplicantsSection() {
        clickElement(STUDENTS_AND_APPLICANTS_SECTION_IDENTIFIER);
        enterConsumerProtectionLaw("Test");
    }


    public UploadFilesPage selectUploadFileForExternalSupport() {
        driver.findElement(By.cssSelector("#ANSWER\\.TTQ\\.MENSYS\\.16\\.")).click();

        UploadFilesPage uploadFilesPage = new UploadFilesPage(driver);
        return uploadFilesPage;
    }

    public SubmitProposalPage selectPrepareToSubmitProposalButton() {
        clickElement(PREPARE_TO_SUBMIT_PROPOSAL_BUTTON_IDENTIFIER);

        SubmitProposalPage submitProposalPage = new SubmitProposalPage(driver);
        return submitProposalPage;
    }




    // TODO Move to proposal section of page
    private void enterProposalName(String textToEnter) {
        enterTextIntoElement(PROPOSAL_NAME_INPUT_IDENTIFIER, textToEnter);
    }

    // TODO Move to proposal section of page
    private void enterOwningSchoolDepartment(String textToEnter) {
        enterTextIntoElement(OWNING_SCHOOL_DEPARTMENT_INPUT_IDENTIFIER, textToEnter);
    }

    // TODO Move to proposal section of page
    private void enterAcademicResponsible(String textToEnter) {
        enterTextIntoElement(ACADEMIC_RESPONSIBLE_INPUT_IDENTIFIER, textToEnter);
    }

    // TODO Move to proposal section of page
    private void selectDropDownOption(String value) {

        Select dropDownValue = new Select(driver.findElement(COMMITTEE_LEVEL_DROPDOWN_IDENTIFIER));
        dropDownValue.selectByValue(value);
    }


    // TODO Move to rationale section of page
    private void enterAcademicRationale(String textToEnter) {
        enterTextIntoElement(ACADEMIC_RATIONALE_INPUT_IDENTIFIER, textToEnter);
    }

    // TODO Move to rationale section of page
    private void enterResourceImplications(String textToEnter) {
        enterTextIntoElement(RESOURCE_IMPLICATIONS_INPUT_IDENTIFIER, textToEnter);
    }

    // TODO Move to rationale section of page
    private void enterStudentNumbers(String textToEnter) {
        enterTextIntoElement(STUDENT_NUMBERS_INPUT_IDENTIFIER, textToEnter);
    }

    // TODO Move to rationale section of page
    private void enterConsultationWithOtherSchoolsDepartment(String textToEnter) {
        enterTextIntoElement(CONSULTATION_WITH_OTHER_SCHOOLS_DEPARTMENT_INPUT_IDENTIFIER, textToEnter);
    }

    // TODO Move to Equality Analysis section of page
    private void enterEqualityRiskImpact(String textToEnter) {
        enterTextIntoElement(EQUALITY_RISK_IMPACT_INPUT_IDENTIFIER, textToEnter);
    }

    // TODO Move to Ordinances and regulations section of page
    private void enterConsequentChangesToTheRegulations(String textToEnter) {
        enterTextIntoElement(CONSEQUENT_CHANGES_TO_THE_REGULATIONS_INPUT_IDENTIFIER, textToEnter);
    }

    // TODO Move to Students and Applicastions section of page
    private void enterConsumerProtectionLaw(String textToEnter) {
        enterTextIntoElement(CONSUMER_PROTECTION_LAW_INPUT_IDENTIFIER, textToEnter);
    }

}
