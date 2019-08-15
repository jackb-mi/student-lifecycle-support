package uk.ac.bristol.personnel;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.Titles;
import uk.ac.bristol.helpers.AppointmentBuilder;
import uk.ac.bristol.helpers.PersonnelBuilder;

import static org.assertj.core.api.Assertions.assertThat;

public class CreatePersonnelTest extends BaseTest {

    @Test
    public void shouldReturnMasterStudentCodeForCreatePersonnelRequest() {
        String masterStudentCode = new PersonnelBuilder().create();

        assertThat(masterStudentCode).contains("00000");
    }

    @Test
    public void shouldReturnMasterStudentCodeForCreatePersonnelRequestWithSpecifiedValues() {
        String emailAddress = "email@address.com";

        String masterStudentCode = new PersonnelBuilder()
                .withEmailAddress(emailAddress)
                .withTitleCode(Titles.FATHER)
                .withERPIntegration(true)
                .create();

        assertThat(masterStudentCode).contains("00000");
    }

    @Test
    public void shouldAddAppointmentToNewlyCreatedUser() {

        String matCode = "ALL_STAFF";

        String masterStudentCode = new PersonnelBuilder().create();

        new AppointmentBuilder(masterStudentCode, matCode).create();
    }
}
