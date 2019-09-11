package uk.ac.bristol.pageobjects.admissions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.ac.bristol.pageobjects.BasePage;

public class AdmissionsApplicantLoginPage extends BasePage {
    public static final By STUDENT_NUMBER_IDENTIFIER = (By.id("ANSWER.TTQ.MENSYS.2."));
    public static final By SURNAME_IDENTIFIER = (By.id("ANSWER.TTQ.MENSYS.3."));
    public static final By DATE_OF_BIRTH_IDENTIFIER = (By.id("ANSWER.TTQ.MENSYS.4."));
    public static final By CONTINUE_BUTTON_IDENTIFIER = (By.name("NEXT.DUMMY.MENSYS.1"));
    public static final By DASHBOARD_GUIDE_BUTTON_IDENTIFIER = (By.cssSelector("div.sv-col-sm-offset-5.sv-col-sm-2 > input"));


    public AdmissionsApplicantLoginPage(WebDriver driver) { super(driver); }

    //Navigate to the Applicant Dashboard Login Page
    public AdmissionsApplicantLoginPage applicantLoginPage(String ssolink){
        driver.get(this.buildUrl("evision-b.apps.bris.ac.uk/urd/sits.urd/run/siw_sso.go?" + ssolink));
        return new AdmissionsApplicantLoginPage(driver);
    }
    //Provide applicant details
    public void enterApplicantDetails(String studentno, String surname, String dob) {
        waitForElementToBeDisplayed(STUDENT_NUMBER_IDENTIFIER, driver, 10);
        this.enterStudentNo(studentno);
        this.enterSurname(surname);
        this.enterDateOfBirth(dob);
    }

    public void enterStudentNo(String username) {
        this.enterTextIntoElement(STUDENT_NUMBER_IDENTIFIER, username);
    }

    public void enterSurname(String password) {
        this.enterTextIntoElement(SURNAME_IDENTIFIER, password);
    }

    public void enterDateOfBirth(String password) {
        this.enterTextIntoElement(DATE_OF_BIRTH_IDENTIFIER, password);
    }

    //Continue to Dashboard with instance of Dashboard homepage returned
    public AdmissionsApplicantDashboardPage loginWithValidCredentials() {
        driver.findElement(CONTINUE_BUTTON_IDENTIFIER).click();
        waitForElementToBeDisplayed(DASHBOARD_GUIDE_BUTTON_IDENTIFIER, driver, 10);
        driver.findElement(DASHBOARD_GUIDE_BUTTON_IDENTIFIER).click();
        AdmissionsApplicantDashboardPage admissionsApplicantDashboardPage = new AdmissionsApplicantDashboardPage(driver);
        return admissionsApplicantDashboardPage;
    }

}
