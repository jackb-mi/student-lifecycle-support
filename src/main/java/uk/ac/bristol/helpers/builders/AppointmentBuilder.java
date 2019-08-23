package uk.ac.bristol.helpers.builders;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class AppointmentBuilder {

    private String appointmentApiUrl = "https://test.sls.bristol.ac.uk/urd/sits.urd/run/SIW_RWS/APPOINTMENT/ ";
    private String appointmentApiUser = "DNS106";
    private String appointmentApiPassword = "[.?qKeq&/[sr?:8K9,F";

    private String mstCode;
    private String matCode;
    private String startDate = "16/07/2019";
    private String endDate = "31/12/2099";
    private String description = "Automation test data";

    public AppointmentBuilder(String mstCode, String matCode) {

        this.mstCode = mstCode;
        this.matCode = matCode;
    }

    public void create() {

        String apiBody = "{" +
                "\"MPA_MSTC\":\"" + mstCode + "\"," +
                "\"MPA_MATC\":\"" + matCode + "\"," +
                "\"MPA_ACSD\":\"" + startDate + "\"," +
                "\"MPA_ACED\":\"" + endDate + "\"," +
                "\"MPA_DESC\":\"" + description + "\"," +
                "\"MPA_UDF1\":\"123457\"" +
                "}";

        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBody(apiBody);
        builder.setContentType("text/xml");

        RequestSpecification requestSpecification = builder.build();

        given()
                .auth().preemptive().basic(appointmentApiUser, appointmentApiPassword)
                .spec(requestSpecification)
                .when()
                .post(appointmentApiUrl)
                .then()
                .statusCode(201);

        System.out.println("Appointment create for MST Code " + mstCode + " with MAT Code " + matCode);
    }
}
