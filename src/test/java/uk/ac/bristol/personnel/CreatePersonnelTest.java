package uk.ac.bristol.personnel;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import uk.ac.bristol.BaseTest;
import uk.ac.bristol.helpers.PersonnelXMLBuilder;

import static io.restassured.RestAssured.given;

public class CreatePersonnelTest extends BaseTest {

    private String restAPIUrl = "https://test.sls.bristol.ac.uk/urd/sits.urd/run/SIW_RWS/PERSONNEL/S/PERSONNEL/";
    private String user = "DNS105";
    private String password = "pj43WkhXG4377GUHtEze";

    @Test
    public void shouldReturnSuccessResponseForCreatePersonnelRequest() {
        RequestSpecification requestSpecification = createNewPersonnelRequestData();

        given()
                .auth().preemptive().basic(user, password)
                .spec(requestSpecification)
        .when()
                .post(restAPIUrl)
        .then()
                .statusCode(201);
    }

    @Test
    public void shouldReturnSuccessResponseForCreatePersonnelRequestTwo() {

        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBody(new PersonnelXMLBuilder().withTitleCode("PROFESSOR SIR").create());
        builder.setContentType("text/xml");

        RequestSpecification requestSpecification = builder.build();

        given()
                .auth().preemptive().basic(user, password)
                .spec(requestSpecification)
                .when()
                .post(restAPIUrl)
                .then()
                .statusCode(201);
    }

    private RequestSpecification createNewPersonnelRequestData() {

        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBody(new PersonnelXMLBuilder().create());
        builder.setContentType("text/xml");

        RequestSpecification requestSpecification = builder.build();
        return requestSpecification;
    }

}
