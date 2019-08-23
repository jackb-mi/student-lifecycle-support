package uk.ac.bristol.curriculum;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.curriculum.CurriculumPage;
import uk.ac.bristol.pageobjects.curriculum.ProgrammeCreationProgrammeDetailsPage;
import uk.ac.bristol.pageobjects.curriculum.ProgrammeCreationProposalInformationPage;

public class CreateNewProgrammeTest extends BaseTest {

    private String curriculumUserUsername = "SLSP-CRT02";
    private String curriculumUserPassword = "Test@2PassBook_";

    @Test
    public void shouldCreateNewProgramme() {

        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage =  accessCreateNewProgrammePage(curriculumUserUsername, curriculumUserPassword);

//        assertThat(programmeCreationProposalInformationPage.getPageTitle()).isEqualTo(programmeCreationProposalInformationPage.PAGE_TITLE);

        programmeCreationProposalInformationPage.enterProposalTitle("Test");
        programmeCreationProposalInformationPage.enterAcademicResponsible("XXXTEST3");
        programmeCreationProposalInformationPage.selectDropDownOption("Crt Slsp-CRT01");
        programmeCreationProposalInformationPage.enterOwningDepartment("SART");
        programmeCreationProposalInformationPage.selectPostgraduateRadioButton();
        ProgrammeCreationProgrammeDetailsPage programmeCreationProgrammeDetailsPage = programmeCreationProposalInformationPage.selectNextButton();

        programmeCreationProgrammeDetailsPage.enterTitle("Test");
        programmeCreationProgrammeDetailsPage.enterFullName("Test");
        programmeCreationProgrammeDetailsPage.enterShortName("Test");
        programmeCreationProgrammeDetailsPage.enterAward("BA 0:1:3");
        programmeCreationProgrammeDetailsPage.selectLocation();
    }

    public ProgrammeCreationProposalInformationPage accessCreateNewProgrammePage(String curriculumUserUsername, String curriculumUserPassword) {

        HomePage homePage = shouldAccessHomepageForTestEnvironment(curriculumUserUsername, curriculumUserPassword);

        CurriculumPage curriculumPage = homePage.clickCurriculumLink();

        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage = curriculumPage.selectCreateNewProgrammeLink();
        return programmeCreationProposalInformationPage;
    }
}
