package uk.ac.bristol.helpers.builders;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import uk.ac.bristol.enums.Titles;
import uk.ac.bristol.helpers.Personnel;
import uk.ac.bristol.helpers.RandomData;

import static io.restassured.RestAssured.given;

public class PersonnelBuilder {


    private String personalApiUrl = "https://test.sls.bristol.ac.uk/urd/sits.urd/run/SIW_RWS/PERSONNEL/S/PERSONNEL/";
    private String personnelApiUser = "DNS105";
    private String personnelApiPassword = "pj43WkhXG4377GUHtEze";

    private String personnelCode;
    private String titleCode;
    private String forname1;
    private String surname;
    private String fullName;
    private String emailAddress;
    private Boolean withERPIntegration;
    private String prsExternalIdCode20;
    private String forenameUsed;
    private String dateOfBirth;

    public PersonnelBuilder() {

        String randomNumber = RandomData.numericString(4);
        String userReference = "TEST" + randomNumber;

        this.personnelCode = userReference;
        this.titleCode = Titles.MRS.getValue();
        this.forname1 = RandomData.alphaString(6).toUpperCase();
        this.surname = RandomData.alphaString(5).toUpperCase();
        this.fullName = forname1 + " " + surname;
        this.emailAddress = userReference + "@bristol.ac.uk";
        this.withERPIntegration = false;
        this.prsExternalIdCode20 = "TEST" + String.valueOf(randomNumber);
        this.forenameUsed = forname1;
        this.dateOfBirth = "1987-11-19";
    }

    public PersonnelBuilder withTitleCode(Titles titleCode) {
        this.titleCode = titleCode.getValue();
        return this;
    }

    public PersonnelBuilder withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public PersonnelBuilder withERPIntegration(Boolean withERPIntegration) {
        this.withERPIntegration = withERPIntegration;
        return this;
    }

    private String convertErpValue(Boolean withERPIntegration) {

        String erpValue = "";
        if (withERPIntegration == true) {
            erpValue = "ERP";
        }
        return erpValue;
    }

    public Personnel create() {
        String apiBody =
        "<PersonnelList>" +
                "<Personnel>" +
                "<PersonnelCode>" + personnelCode + "</PersonnelCode>" +
                "<TitleCode>" + titleCode + "</TitleCode>" +
                "<Forename1>" + forname1 + "</Forename1>" +
                "<Surname>" + surname + "</Surname>" +
                "<FullName>" + fullName + "</FullName>" +
                "<EmailAddress>" + emailAddress + "</EmailAddress>" +
                "<UserDefinedField01>" + convertErpValue(withERPIntegration) + "</UserDefinedField01>" +
                "<PRSExternalIDCode20>" + prsExternalIdCode20 + "</PRSExternalIDCode20>" +
                "<ForenameUsed>" + forenameUsed + "</ForenameUsed>" +
                "<DateOfBirth>" + dateOfBirth + "</DateOfBirth>" +
                "</Personnel>" +
                "</PersonnelList>";

        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBody(apiBody);
        builder.setContentType("text/xml");

        RequestSpecification requestSpecification = builder.build();

        String responseBody = given()
                .auth().preemptive().basic(personnelApiUser, personnelApiPassword)
                .spec(requestSpecification)
                .when()
                .post(personalApiUrl).getBody().asString();

        String masterStudentCode = responseBody.substring(responseBody.indexOf("<MasterStudentCode>") + 1, responseBody.indexOf("</MasterStudentCode>"));
        masterStudentCode = masterStudentCode.replace("MasterStudentCode>", "");

        Personnel personnel = new Personnel(personnelCode, titleCode, forname1, surname, fullName, emailAddress, withERPIntegration, prsExternalIdCode20, forenameUsed, dateOfBirth, masterStudentCode);

        return personnel;
    }
}
