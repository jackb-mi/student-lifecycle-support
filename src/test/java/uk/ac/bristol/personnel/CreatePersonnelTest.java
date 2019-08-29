package uk.ac.bristol.personnel;

import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.enums.Titles;
import uk.ac.bristol.helpers.Personnel;
import uk.ac.bristol.helpers.builders.AppointmentBuilder;
import uk.ac.bristol.helpers.builders.PersonnelBuilder;

import static org.assertj.core.api.Assertions.assertThat;

public class CreatePersonnelTest extends BaseTest {

    @Test
    public void shouldGetMasterStudentCodeFromCreatePersonnelRequest() {
        String mstCode = new PersonnelBuilder().create().getMstCode();

        assertThat(mstCode).contains("00000");
    }

    @Test
    public void shouldReturnMasterStudentCodeForCreatePersonnelRequestWithSpecifiedValues() {
        String emailAddress = "email@address.com";

        String mstCode = new PersonnelBuilder()
                .withEmailAddress(emailAddress)
                .withTitleCode(Titles.FATHER)
                .withERPIntegration(true)
                .create()
                .getMstCode();

        assertThat(mstCode).contains("00000");
    }

    @Test
    public void shouldAddAppointmentToNewlyCreatedUser() {

        String matCode = "ALL_STAFF";

        String mstCode = new PersonnelBuilder().create().getMstCode();

        new AppointmentBuilder(mstCode, matCode).create();
    }

    @Test
    public void shouldAddAppointmentToNewlyCreatedUserAndGetLoginDetails() {

        String matCode = "ALL_STAFF";

        Personnel personnelResponse = new PersonnelBuilder().create();

        new AppointmentBuilder(personnelResponse.getMstCode(), matCode).create();

        System.out.println("And their username is " + personnelResponse.getUserName());
    }
}
