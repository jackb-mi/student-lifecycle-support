package uk.ac.bristol.curriculum;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.*;
import uk.ac.bristol.pageobjects.HomePage;
import uk.ac.bristol.pageobjects.curriculum.CurriculumPage;
import uk.ac.bristol.pageobjects.curriculum.ProgrammeCreationProgrammeDetailsPage;
import uk.ac.bristol.pageobjects.curriculum.ProgrammeCreationProposalInformationPage;

public class CreateNewProgrammeTest extends BaseTest {

    private String curriculumUserUsername = "SLSP-CRT02";
    private String curriculumUserPassword = "Test@2PassBook_";

    @Test
    public void shouldCreateNewProgrammeWithMandatoryOptionsOnly() {

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
        programmeCreationProgrammeDetailsPage.enterAward("BA01");
        programmeCreationProgrammeDetailsPage.selectLocation();
        programmeCreationProgrammeDetailsPage.selectDistanceLearningEtc(DistanceLearning.ON_CAMPUS);
//        programmeCreationProgrammeDetailsPage.selectType(ProgrammeType.UNDERGRADUATE, HonourLevel.SINGLE, IntegratedMastersType.INTEGRATED_MASTERS_TYPE_2);
        programmeCreationProgrammeDetailsPage.selectType(ProgrammeType.POSTGRADUATE_RESEARCH, HonourLevel.NOT_APPLICABLE, IntegratedMastersType.NOT_APPLICABLE);
        programmeCreationProgrammeDetailsPage.selectSubjectOne();
        programmeCreationProgrammeDetailsPage.selectDepartmentOne();
        programmeCreationProgrammeDetailsPage.selectAdmissionsEntryLevel(AdmissionsEntry.DIRECT_ONLY);
        programmeCreationProgrammeDetailsPage.selectReplacesCourses();
        programmeCreationProgrammeDetailsPage.selectAcademicYearProgrammeIsGoingLiveIn();
        programmeCreationProgrammeDetailsPage.selectYearInIndustryStage();
        programmeCreationProgrammeDetailsPage.selectStudyAbroadStage();
        programmeCreationProgrammeDetailsPage.selectIntercalatingStage();
        programmeCreationProgrammeDetailsPage.selectTeachingInstitution();
        programmeCreationProgrammeDetailsPage.selectAwardingInstitution();
        programmeCreationProgrammeDetailsPage.selectNextButton();


    }

    public ProgrammeCreationProposalInformationPage accessCreateNewProgrammePage(String curriculumUserUsername, String curriculumUserPassword) {

        HomePage homePage = shouldAccessHomepageForTestEnvironment(curriculumUserUsername, curriculumUserPassword);

        CurriculumPage curriculumPage = homePage.clickCurriculumLink();

        ProgrammeCreationProposalInformationPage programmeCreationProposalInformationPage = curriculumPage.selectCreateNewProgrammeLink();
        return programmeCreationProposalInformationPage;
    }
}
